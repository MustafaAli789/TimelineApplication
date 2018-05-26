/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TimelineApplication;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JPanel;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;


/**
 *
 * @author S199841769
 */
public class Maintimeline extends javax.swing.JFrame {

    /**
     * Creates new form Maintimeline
     */
    public Maintimeline() {
        initComponents();       
        
        //The array below will store all event title variable names and event date variable names as well as event image variable names for later use
        JLabel eventTitleDateImageNames[][]={{EventTitleLabelOne, DateTextLabelOne, EventImage1},{EventTitleLabelTwo, DateTextLabelTwo, EventImage2},{EventTitleLabelThree, DateTextLabelThree, EventImage3}, 
        {EventTitleLabelFour, DateTextLabelFour, EventImage4}, {EventTitleLabelFive, DateTextLabelFive, EventImage5}, {EventTitleLabelSix, DateTextLabelSix, EventImage6}, {EventTitleLabelSeven, DateTextLabelSeven, EventImage7}, 
        {EventTitleLabelEight, DateTextLabelEight, EventImage8}, {EventTitleLabelNine, DateTextLabelNine, EventImage9},{EventTitleLabelTen, DateTextLabelTen, EventImage10}, {EventTitleLabelEleven, DateTextLabelEleven, EventImage11}, 
        {EventTitleLabelTwelve, DateTextLabelTwelve, EventImage12}, {EventTitleLabelThirteen, DateTextLabelThirteen, EventImage13}, {EventTitleLabelFourteen, DateTextLabelFourteen, EventImage14}, 
        {EventTitleLabelFifteen, DateTextLabelFifteen, EventImage15},{EventTitleLabelSixteen, DateTextLabelSixteen, EventImage16}};

        //The array below will store all event description variable names for later use
        JTextPane eventDescriptionNames[]={DescriptionTextPanelOne,DescriptionTextPanelTwo, DescriptionTextPanelThree, DescriptionTextPanelFour, DescriptionTextPanelFive,
        DescriptionTextPanelSix, DescriptionTextPanelSeven, DescriptionTextPanelEight, DescriptionTextPanelNine, DescriptionTextPanelTen, DescriptionTextPanelEleven, 
        DescriptionTextPanelTwelve, DescriptionTextPanelThirteen, DescriptionTextPanelFourteen, DescriptionTextPanelFifteen, DescriptionTextPanelSixteen};
        
        //The array below will store all event pane variable names for later use
        JPanel eventPaneNames[]={EventPane1, EventPane2, EventPane3, EventPane4, EventPane5, EventPane6, EventPane7, EventPane8, EventPane9, EventPane10, EventPane11, EventPane12,
        EventPane13, EventPane14, EventPane15, EventPane16};
        
        //The array below will store all arrow variable names for later use
        JLabel eventArrowNames[]={Arrow1, Arrow2, Arrow3, Arrow4, Arrow5, Arrow6, Arrow7, Arrow8, Arrow9, Arrow10, Arrow11, Arrow12};
        
        //Initially setting all events to non visible
        for(JPanel eventName : eventPaneNames){
            setEventPaneVisibility(eventName, false);
            
        }  
        
        //Setting all arrows to non visible 
        for (JLabel arrowName : eventArrowNames){
            setArrowVisibility(arrowName, false);
        }
        
        readEventsInformation();
               
        //Initializing Events
        int numOfEvents = getNumOfEvents();
        System.out.println(numOfEvents);
        for (int i = 0; i< numOfEvents; i++){
            //passing names of variables and current event num from previously defined lists with all var names
            editEvent(eventTitleDateImageNames[i][0], eventTitleDateImageNames[i][1], eventDescriptionNames[i], eventTitleDateImageNames[i][2], i); 
            setEventPaneVisibility(eventPaneNames[i], true); //setting events to visible
            
            //This is to take into account the presence of rows and therefore change in num of arrows each time row changes
            if(numOfEvents <=4 && i<numOfEvents-1){
                setArrowVisibility(eventArrowNames[i], true);
            }   
            else if(numOfEvents > 4 && numOfEvents <= 8 && i<numOfEvents-2){ //Ex: on row 2, 2 less arrows than the num of events will be shown
                setArrowVisibility(eventArrowNames[i], true);
            }
            else if(numOfEvents > 8 && numOfEvents <= 12 && i<numOfEvents-3){
                setArrowVisibility(eventArrowNames[i], true);
            }
            else if (numOfEvents > 12 && i<numOfEvents-4){
                setArrowVisibility(eventArrowNames[i], true);
            }
           
        
        }
        
    }
    
    public static File eventInformationFile = new File("src/TimelineApplication/eventsInformation.txt");
    public static ArrayList<ArrayList<String>> eventInformationList = new ArrayList<>();
    
    public static void setEventPaneVisibility(JPanel eventPaneName, boolean visibilityState){
        eventPaneName.setVisible(visibilityState);
    }
    
    public static void setArrowVisibility (JLabel arrowName, boolean visibilityState){
        arrowName.setVisible(visibilityState);
    }
    
    //This method can be called any time an event is added or edited to put the text and image into the event screen
    public static void editEvent(JLabel title, JLabel date, JTextPane description, JLabel eventImage, int eventNum){
        
        
        title.setText(eventInformationList.get(eventNum).get(1)); //1st index is title
        date.setText(eventInformationList.get(eventNum).get(2)); //2nd index is date
        description.setText(eventInformationList.get(eventNum).get(3)); //3rd index is description
        
        Image image = null;
        try{
            URL url = new URL(eventInformationList.get(eventNum).get(4));
            try {
                image = ImageIO.read(url);
                eventImage.setIcon(new ImageIcon(image));
            } catch (IOException ex) {
                String error = "The URL for the " + eventInformationList.get(eventNum).get(1) + " image is wrong.";
                JOptionPane.showMessageDialog(null, error);
            }
        }
        catch(MalformedURLException e){
            String error = "The URL for " + eventInformationList.get(eventNum).get(1) + " does not exist.";
            JOptionPane.showMessageDialog(null, error);
        }
        
    }
    
    public static int getNumOfEvents(){
        if(eventInformationFile.exists()){
            Scanner sc1;
            try {
                sc1 = new Scanner(eventInformationFile);
                int lines = 0; //number of lines in text file
                while(sc1.hasNextLine()){
                    lines+=1;
                    sc1.nextLine();
                }
                return lines/5;
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Maintimeline.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }
    
    public static void readEventsInformation(){
        
        //Add 16 sublists to main list
        for(int i = 0; i<16; i++){
            eventInformationList.add(new ArrayList<String>());
        }
        
        if(eventInformationFile.exists()){
            try {
                
                Scanner sc2 = new Scanner(eventInformationFile);
                
                //Put even information into the 2d list
                for(int i = 0; i <getNumOfEvents(); i++){ //number of 2d lists
                    for (int j = 0; j<5; j++){;
                        eventInformationList.get(i).add(sc2.nextLine());
                    }
                }
                
            } catch (FileNotFoundException ex) {
                System.out.println("Error for some reason!");
            }
        }
        else{
            try {
                eventInformationFile.createNewFile();
            } catch (IOException ex) {
                System.out.println("Attemped to create new database but path to file coult not be found.");
            }
        }
        
    }
  
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        TimelineTitleLabel = new javax.swing.JLabel();
        ScrollableAreaPane = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        EventPane1 = new javax.swing.JPanel();
        EventTitlePanelOne = new javax.swing.JPanel();
        EventTitleLabelOne = new javax.swing.JLabel();
        DateTextLabelOne = new javax.swing.JLabel();
        SeperatorPaneOne = new javax.swing.JPanel();
        jScrollPaneOne = new javax.swing.JScrollPane();
        DescriptionTextPanelOne = new javax.swing.JTextPane();
        EventImage1 = new javax.swing.JLabel();
        EventPane2 = new javax.swing.JPanel();
        EventTitlePanelTwo = new javax.swing.JPanel();
        EventTitleLabelTwo = new javax.swing.JLabel();
        DateTextLabelTwo = new javax.swing.JLabel();
        SeperatorPaneTwo = new javax.swing.JPanel();
        jScrollPaneTwo = new javax.swing.JScrollPane();
        DescriptionTextPanelTwo = new javax.swing.JTextPane();
        EventImage2 = new javax.swing.JLabel();
        EventPane3 = new javax.swing.JPanel();
        EventTitlePanelThree = new javax.swing.JPanel();
        EventTitleLabelThree = new javax.swing.JLabel();
        DateTextLabelThree = new javax.swing.JLabel();
        SeperatorPaneThree = new javax.swing.JPanel();
        jScrollPaneThree = new javax.swing.JScrollPane();
        DescriptionTextPanelThree = new javax.swing.JTextPane();
        EventImage3 = new javax.swing.JLabel();
        EventPane4 = new javax.swing.JPanel();
        EventTitlePanelFour = new javax.swing.JPanel();
        EventTitleLabelFour = new javax.swing.JLabel();
        DateTextLabelFour = new javax.swing.JLabel();
        SeperatorPaneFour = new javax.swing.JPanel();
        jScrollPaneFour = new javax.swing.JScrollPane();
        DescriptionTextPanelFour = new javax.swing.JTextPane();
        EventImage4 = new javax.swing.JLabel();
        EventPane5 = new javax.swing.JPanel();
        EventTitlePanelFive = new javax.swing.JPanel();
        EventTitleLabelFive = new javax.swing.JLabel();
        DateTextLabelFive = new javax.swing.JLabel();
        SeperatorPaneFive = new javax.swing.JPanel();
        jScrollPaneFive = new javax.swing.JScrollPane();
        DescriptionTextPanelFive = new javax.swing.JTextPane();
        EventImage5 = new javax.swing.JLabel();
        EventPane6 = new javax.swing.JPanel();
        EventTitlePanelSix = new javax.swing.JPanel();
        EventTitleLabelSix = new javax.swing.JLabel();
        DateTextLabelSix = new javax.swing.JLabel();
        SeperatorPaneSix = new javax.swing.JPanel();
        jScrollPaneSix = new javax.swing.JScrollPane();
        DescriptionTextPanelSix = new javax.swing.JTextPane();
        EventImage6 = new javax.swing.JLabel();
        EventPane7 = new javax.swing.JPanel();
        EventTitlePanelSeven = new javax.swing.JPanel();
        EventTitleLabelSeven = new javax.swing.JLabel();
        DateTextLabelSeven = new javax.swing.JLabel();
        SeperatorPaneSeven = new javax.swing.JPanel();
        jScrollPaneSeven = new javax.swing.JScrollPane();
        DescriptionTextPanelSeven = new javax.swing.JTextPane();
        EventImage7 = new javax.swing.JLabel();
        EventPane8 = new javax.swing.JPanel();
        EventTitlePanelEight = new javax.swing.JPanel();
        EventTitleLabelEight = new javax.swing.JLabel();
        DateTextLabelEight = new javax.swing.JLabel();
        SeperatorPaneEight = new javax.swing.JPanel();
        jScrollPaneEight = new javax.swing.JScrollPane();
        DescriptionTextPanelEight = new javax.swing.JTextPane();
        EventImage8 = new javax.swing.JLabel();
        EventPane9 = new javax.swing.JPanel();
        EventTitlePanelNine = new javax.swing.JPanel();
        EventTitleLabelNine = new javax.swing.JLabel();
        DateTextLabelNine = new javax.swing.JLabel();
        SeperatorPaneNine = new javax.swing.JPanel();
        jScrollPaneNine = new javax.swing.JScrollPane();
        DescriptionTextPanelNine = new javax.swing.JTextPane();
        EventImage9 = new javax.swing.JLabel();
        EventPane10 = new javax.swing.JPanel();
        EventTitlePanelTen = new javax.swing.JPanel();
        EventTitleLabelTen = new javax.swing.JLabel();
        DateTextLabelTen = new javax.swing.JLabel();
        SeperatorPaneTen = new javax.swing.JPanel();
        jScrollPaneTen = new javax.swing.JScrollPane();
        DescriptionTextPanelTen = new javax.swing.JTextPane();
        EventImage10 = new javax.swing.JLabel();
        EventPane11 = new javax.swing.JPanel();
        EventTitlePanelEleven = new javax.swing.JPanel();
        EventTitleLabelEleven = new javax.swing.JLabel();
        DateTextLabelEleven = new javax.swing.JLabel();
        SeperatorPaneEleven = new javax.swing.JPanel();
        jScrollPaneEleven = new javax.swing.JScrollPane();
        DescriptionTextPanelEleven = new javax.swing.JTextPane();
        EventImage11 = new javax.swing.JLabel();
        EventPane12 = new javax.swing.JPanel();
        EventTitlePanelTwelve = new javax.swing.JPanel();
        EventTitleLabelTwelve = new javax.swing.JLabel();
        DateTextLabelTwelve = new javax.swing.JLabel();
        SeperatorPaneTwelve = new javax.swing.JPanel();
        jScrollPaneTwelve = new javax.swing.JScrollPane();
        DescriptionTextPanelTwelve = new javax.swing.JTextPane();
        EventImage12 = new javax.swing.JLabel();
        EventPane13 = new javax.swing.JPanel();
        EventTitlePanelThirteen = new javax.swing.JPanel();
        EventTitleLabelThirteen = new javax.swing.JLabel();
        DateTextLabelThirteen = new javax.swing.JLabel();
        SeperatorPaneThirteen = new javax.swing.JPanel();
        jScrollPaneThirteen = new javax.swing.JScrollPane();
        DescriptionTextPanelThirteen = new javax.swing.JTextPane();
        EventImage13 = new javax.swing.JLabel();
        EventPane14 = new javax.swing.JPanel();
        EventTitlePanelFourteen = new javax.swing.JPanel();
        EventTitleLabelFourteen = new javax.swing.JLabel();
        DateTextLabelFourteen = new javax.swing.JLabel();
        SeperatorPaneFourteen = new javax.swing.JPanel();
        jScrollPaneFourteen = new javax.swing.JScrollPane();
        DescriptionTextPanelFourteen = new javax.swing.JTextPane();
        EventImage14 = new javax.swing.JLabel();
        EventPane15 = new javax.swing.JPanel();
        EventTitlePanelFifteen = new javax.swing.JPanel();
        EventTitleLabelFifteen = new javax.swing.JLabel();
        DateTextLabelFifteen = new javax.swing.JLabel();
        SeperatorPaneFifteen = new javax.swing.JPanel();
        jScrollPaneFifteen = new javax.swing.JScrollPane();
        DescriptionTextPanelFifteen = new javax.swing.JTextPane();
        EventImage15 = new javax.swing.JLabel();
        EventPane16 = new javax.swing.JPanel();
        EventTitlePanelSixteen = new javax.swing.JPanel();
        EventTitleLabelSixteen = new javax.swing.JLabel();
        DateTextLabelSixteen = new javax.swing.JLabel();
        SeperatorPaneSixteen = new javax.swing.JPanel();
        jScrollPaneSixteen = new javax.swing.JScrollPane();
        DescriptionTextPanelSixteen = new javax.swing.JTextPane();
        EventImage16 = new javax.swing.JLabel();
        Arrow12 = new javax.swing.JLabel();
        Arrow1 = new javax.swing.JLabel();
        Arrow2 = new javax.swing.JLabel();
        Arrow3 = new javax.swing.JLabel();
        Arrow4 = new javax.swing.JLabel();
        Arrow5 = new javax.swing.JLabel();
        Arrow6 = new javax.swing.JLabel();
        Arrow7 = new javax.swing.JLabel();
        Arrow8 = new javax.swing.JLabel();
        Arrow9 = new javax.swing.JLabel();
        Arrow10 = new javax.swing.JLabel();
        Arrow11 = new javax.swing.JLabel();
        DeleteBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        TimelineTitleLabel.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        TimelineTitleLabel.setText("TIMELINE TITLE HERE");

        ScrollableAreaPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EventPane1.setBackground(new java.awt.Color(153, 153, 153));
        EventPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        EventPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EventTitlePanelOne.setBackground(new java.awt.Color(0, 0, 0));

        EventTitleLabelOne.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EventTitleLabelOne.setForeground(new java.awt.Color(255, 255, 255));
        EventTitleLabelOne.setText("jLabel1");

        DateTextLabelOne.setForeground(new java.awt.Color(255, 255, 255));
        DateTextLabelOne.setText("jLabel1");

        SeperatorPaneOne.setLayout(null);

        javax.swing.GroupLayout EventTitlePanelOneLayout = new javax.swing.GroupLayout(EventTitlePanelOne);
        EventTitlePanelOne.setLayout(EventTitlePanelOneLayout);
        EventTitlePanelOneLayout.setHorizontalGroup(
            EventTitlePanelOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelOneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventTitlePanelOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EventTitleLabelOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(EventTitlePanelOneLayout.createSequentialGroup()
                        .addComponent(DateTextLabelOne, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EventTitlePanelOneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SeperatorPaneOne, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        EventTitlePanelOneLayout.setVerticalGroup(
            EventTitlePanelOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelOneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EventTitleLabelOne)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateTextLabelOne)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SeperatorPaneOne, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        EventPane1.add(EventTitlePanelOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 1, 279, -1));

        DescriptionTextPanelOne.setEditable(false);
        jScrollPaneOne.setViewportView(DescriptionTextPanelOne);

        EventPane1.add(jScrollPaneOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 240, 180, 130));

        EventImage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EventImage1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EventPane1.add(EventImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 172, 150));

        jPanel1.add(EventPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 40, 191, 375));

        EventPane2.setBackground(new java.awt.Color(153, 153, 153));
        EventPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        EventPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EventTitlePanelTwo.setBackground(new java.awt.Color(0, 0, 0));

        EventTitleLabelTwo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EventTitleLabelTwo.setForeground(new java.awt.Color(255, 255, 255));
        EventTitleLabelTwo.setText("jLabel1");

        DateTextLabelTwo.setForeground(new java.awt.Color(255, 255, 255));
        DateTextLabelTwo.setText("jLabel1");

        SeperatorPaneTwo.setLayout(null);

        javax.swing.GroupLayout EventTitlePanelTwoLayout = new javax.swing.GroupLayout(EventTitlePanelTwo);
        EventTitlePanelTwo.setLayout(EventTitlePanelTwoLayout);
        EventTitlePanelTwoLayout.setHorizontalGroup(
            EventTitlePanelTwoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelTwoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventTitlePanelTwoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EventTitleLabelTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(EventTitlePanelTwoLayout.createSequentialGroup()
                        .addComponent(DateTextLabelTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EventTitlePanelTwoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SeperatorPaneTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        EventTitlePanelTwoLayout.setVerticalGroup(
            EventTitlePanelTwoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelTwoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EventTitleLabelTwo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateTextLabelTwo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SeperatorPaneTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        EventPane2.add(EventTitlePanelTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 1, 279, -1));

        DescriptionTextPanelTwo.setEditable(false);
        jScrollPaneTwo.setViewportView(DescriptionTextPanelTwo);

        EventPane2.add(jScrollPaneTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 240, 180, 130));

        EventImage2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EventImage2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EventPane2.add(EventImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 172, 150));

        jPanel1.add(EventPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 41, 191, 375));

        EventPane3.setBackground(new java.awt.Color(153, 153, 153));
        EventPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        EventPane3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EventTitlePanelThree.setBackground(new java.awt.Color(0, 0, 0));

        EventTitleLabelThree.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EventTitleLabelThree.setForeground(new java.awt.Color(255, 255, 255));
        EventTitleLabelThree.setText("jLabel1");

        DateTextLabelThree.setForeground(new java.awt.Color(255, 255, 255));
        DateTextLabelThree.setText("jLabel1");

        SeperatorPaneThree.setLayout(null);

        javax.swing.GroupLayout EventTitlePanelThreeLayout = new javax.swing.GroupLayout(EventTitlePanelThree);
        EventTitlePanelThree.setLayout(EventTitlePanelThreeLayout);
        EventTitlePanelThreeLayout.setHorizontalGroup(
            EventTitlePanelThreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelThreeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventTitlePanelThreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EventTitleLabelThree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(EventTitlePanelThreeLayout.createSequentialGroup()
                        .addComponent(DateTextLabelThree, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EventTitlePanelThreeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SeperatorPaneThree, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        EventTitlePanelThreeLayout.setVerticalGroup(
            EventTitlePanelThreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelThreeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EventTitleLabelThree)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateTextLabelThree)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SeperatorPaneThree, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        EventPane3.add(EventTitlePanelThree, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 1, 279, -1));

        DescriptionTextPanelThree.setEditable(false);
        jScrollPaneThree.setViewportView(DescriptionTextPanelThree);

        EventPane3.add(jScrollPaneThree, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 240, 180, 130));

        EventImage3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EventPane3.add(EventImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 172, 150));

        jPanel1.add(EventPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 41, 193, 377));

        EventPane4.setBackground(new java.awt.Color(153, 153, 153));
        EventPane4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        EventPane4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EventTitlePanelFour.setBackground(new java.awt.Color(0, 0, 0));

        EventTitleLabelFour.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EventTitleLabelFour.setForeground(new java.awt.Color(255, 255, 255));
        EventTitleLabelFour.setText("jLabel1");

        DateTextLabelFour.setForeground(new java.awt.Color(255, 255, 255));
        DateTextLabelFour.setText("jLabel1");

        SeperatorPaneFour.setLayout(null);

        javax.swing.GroupLayout EventTitlePanelFourLayout = new javax.swing.GroupLayout(EventTitlePanelFour);
        EventTitlePanelFour.setLayout(EventTitlePanelFourLayout);
        EventTitlePanelFourLayout.setHorizontalGroup(
            EventTitlePanelFourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelFourLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventTitlePanelFourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EventTitleLabelFour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(EventTitlePanelFourLayout.createSequentialGroup()
                        .addComponent(DateTextLabelFour, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EventTitlePanelFourLayout.createSequentialGroup()
                .addComponent(SeperatorPaneFour, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        EventTitlePanelFourLayout.setVerticalGroup(
            EventTitlePanelFourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelFourLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EventTitleLabelFour)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateTextLabelFour)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SeperatorPaneFour, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        EventPane4.add(EventTitlePanelFour, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 1, 279, -1));

        DescriptionTextPanelFour.setEditable(false);
        jScrollPaneFour.setViewportView(DescriptionTextPanelFour);

        EventPane4.add(jScrollPaneFour, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 240, 180, 130));

        EventImage4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EventPane4.add(EventImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 172, 150));

        jPanel1.add(EventPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 41, 190, 375));

        EventPane5.setBackground(new java.awt.Color(153, 153, 153));
        EventPane5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        EventPane5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EventTitlePanelFive.setBackground(new java.awt.Color(0, 0, 0));

        EventTitleLabelFive.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EventTitleLabelFive.setForeground(new java.awt.Color(255, 255, 255));
        EventTitleLabelFive.setText("jLabel1");

        DateTextLabelFive.setForeground(new java.awt.Color(255, 255, 255));
        DateTextLabelFive.setText("jLabel1");

        javax.swing.GroupLayout EventTitlePanelFiveLayout = new javax.swing.GroupLayout(EventTitlePanelFive);
        EventTitlePanelFive.setLayout(EventTitlePanelFiveLayout);
        EventTitlePanelFiveLayout.setHorizontalGroup(
            EventTitlePanelFiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelFiveLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventTitlePanelFiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EventTitleLabelFive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(EventTitlePanelFiveLayout.createSequentialGroup()
                        .addComponent(DateTextLabelFive, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        EventTitlePanelFiveLayout.setVerticalGroup(
            EventTitlePanelFiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelFiveLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EventTitleLabelFive)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateTextLabelFive)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EventPane5.add(EventTitlePanelFive, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 1, 279, 60));

        SeperatorPaneFive.setLayout(null);
        EventPane5.add(SeperatorPaneFive, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 280, 12));

        DescriptionTextPanelFive.setEditable(false);
        jScrollPaneFive.setViewportView(DescriptionTextPanelFive);

        EventPane5.add(jScrollPaneFive, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 249, 180, 120));

        EventImage5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EventPane5.add(EventImage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 80, 170, 160));

        jPanel1.add(EventPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(893, 456, 191, 375));

        EventPane6.setBackground(new java.awt.Color(153, 153, 153));
        EventPane6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        EventPane6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EventTitlePanelSix.setBackground(new java.awt.Color(0, 0, 0));

        EventTitleLabelSix.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EventTitleLabelSix.setForeground(new java.awt.Color(255, 255, 255));
        EventTitleLabelSix.setText("jLabel1");

        DateTextLabelSix.setForeground(new java.awt.Color(255, 255, 255));
        DateTextLabelSix.setText("jLabel1");

        javax.swing.GroupLayout EventTitlePanelSixLayout = new javax.swing.GroupLayout(EventTitlePanelSix);
        EventTitlePanelSix.setLayout(EventTitlePanelSixLayout);
        EventTitlePanelSixLayout.setHorizontalGroup(
            EventTitlePanelSixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelSixLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventTitlePanelSixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EventTitleLabelSix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(EventTitlePanelSixLayout.createSequentialGroup()
                        .addComponent(DateTextLabelSix, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        EventTitlePanelSixLayout.setVerticalGroup(
            EventTitlePanelSixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelSixLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EventTitleLabelSix)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateTextLabelSix)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EventPane6.add(EventTitlePanelSix, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 1, 279, 60));

        SeperatorPaneSix.setLayout(null);
        EventPane6.add(SeperatorPaneSix, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 280, 12));

        DescriptionTextPanelSix.setEditable(false);
        jScrollPaneSix.setViewportView(DescriptionTextPanelSix);

        EventPane6.add(jScrollPaneSix, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 249, 180, 120));

        EventImage6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EventPane6.add(EventImage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 172, 160));

        jPanel1.add(EventPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 456, 191, 375));

        EventPane7.setBackground(new java.awt.Color(153, 153, 153));
        EventPane7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        EventPane7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EventTitlePanelSeven.setBackground(new java.awt.Color(0, 0, 0));

        EventTitleLabelSeven.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EventTitleLabelSeven.setForeground(new java.awt.Color(255, 255, 255));
        EventTitleLabelSeven.setText("jLabel1");

        DateTextLabelSeven.setForeground(new java.awt.Color(255, 255, 255));
        DateTextLabelSeven.setText("jLabel1");

        javax.swing.GroupLayout EventTitlePanelSevenLayout = new javax.swing.GroupLayout(EventTitlePanelSeven);
        EventTitlePanelSeven.setLayout(EventTitlePanelSevenLayout);
        EventTitlePanelSevenLayout.setHorizontalGroup(
            EventTitlePanelSevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelSevenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventTitlePanelSevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EventTitleLabelSeven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(EventTitlePanelSevenLayout.createSequentialGroup()
                        .addComponent(DateTextLabelSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        EventTitlePanelSevenLayout.setVerticalGroup(
            EventTitlePanelSevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelSevenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EventTitleLabelSeven)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateTextLabelSeven)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EventPane7.add(EventTitlePanelSeven, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 1, 279, 60));

        SeperatorPaneSeven.setLayout(null);
        EventPane7.add(SeperatorPaneSeven, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 280, 12));

        DescriptionTextPanelSeven.setEditable(false);
        jScrollPaneSeven.setViewportView(DescriptionTextPanelSeven);

        EventPane7.add(jScrollPaneSeven, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 249, 180, 120));

        EventImage7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EventPane7.add(EventImage7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 172, 160));

        jPanel1.add(EventPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 456, 191, 375));

        EventPane8.setBackground(new java.awt.Color(153, 153, 153));
        EventPane8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        EventPane8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EventTitlePanelEight.setBackground(new java.awt.Color(0, 0, 0));

        EventTitleLabelEight.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EventTitleLabelEight.setForeground(new java.awt.Color(255, 255, 255));
        EventTitleLabelEight.setText("jLabel1");

        DateTextLabelEight.setForeground(new java.awt.Color(255, 255, 255));
        DateTextLabelEight.setText("jLabel1");

        javax.swing.GroupLayout EventTitlePanelEightLayout = new javax.swing.GroupLayout(EventTitlePanelEight);
        EventTitlePanelEight.setLayout(EventTitlePanelEightLayout);
        EventTitlePanelEightLayout.setHorizontalGroup(
            EventTitlePanelEightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelEightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventTitlePanelEightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EventTitleLabelEight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(EventTitlePanelEightLayout.createSequentialGroup()
                        .addComponent(DateTextLabelEight, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        EventTitlePanelEightLayout.setVerticalGroup(
            EventTitlePanelEightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelEightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EventTitleLabelEight)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateTextLabelEight)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EventPane8.add(EventTitlePanelEight, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 1, 279, 60));

        SeperatorPaneEight.setLayout(null);
        EventPane8.add(SeperatorPaneEight, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 280, 12));

        DescriptionTextPanelEight.setEditable(false);
        jScrollPaneEight.setViewportView(DescriptionTextPanelEight);

        EventPane8.add(jScrollPaneEight, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 249, 180, 120));

        EventImage8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EventPane8.add(EventImage8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 172, 160));

        jPanel1.add(EventPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 456, 191, 375));

        EventPane9.setBackground(new java.awt.Color(153, 153, 153));
        EventPane9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        EventPane9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EventTitlePanelNine.setBackground(new java.awt.Color(0, 0, 0));

        EventTitleLabelNine.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EventTitleLabelNine.setForeground(new java.awt.Color(255, 255, 255));
        EventTitleLabelNine.setText("jLabel1");

        DateTextLabelNine.setForeground(new java.awt.Color(255, 255, 255));
        DateTextLabelNine.setText("jLabel1");

        javax.swing.GroupLayout EventTitlePanelNineLayout = new javax.swing.GroupLayout(EventTitlePanelNine);
        EventTitlePanelNine.setLayout(EventTitlePanelNineLayout);
        EventTitlePanelNineLayout.setHorizontalGroup(
            EventTitlePanelNineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelNineLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventTitlePanelNineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EventTitleLabelNine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(EventTitlePanelNineLayout.createSequentialGroup()
                        .addComponent(DateTextLabelNine, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        EventTitlePanelNineLayout.setVerticalGroup(
            EventTitlePanelNineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelNineLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EventTitleLabelNine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateTextLabelNine)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EventPane9.add(EventTitlePanelNine, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 1, 279, 60));

        SeperatorPaneNine.setLayout(null);
        EventPane9.add(SeperatorPaneNine, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 280, 12));

        DescriptionTextPanelNine.setEditable(false);
        jScrollPaneNine.setViewportView(DescriptionTextPanelNine);

        EventPane9.add(jScrollPaneNine, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 249, 180, 120));

        EventImage9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EventPane9.add(EventImage9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 172, 160));

        jPanel1.add(EventPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(893, 871, 191, 375));

        EventPane10.setBackground(new java.awt.Color(153, 153, 153));
        EventPane10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        EventPane10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EventTitlePanelTen.setBackground(new java.awt.Color(0, 0, 0));

        EventTitleLabelTen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EventTitleLabelTen.setForeground(new java.awt.Color(255, 255, 255));
        EventTitleLabelTen.setText("jLabel1");

        DateTextLabelTen.setForeground(new java.awt.Color(255, 255, 255));
        DateTextLabelTen.setText("jLabel1");

        javax.swing.GroupLayout EventTitlePanelTenLayout = new javax.swing.GroupLayout(EventTitlePanelTen);
        EventTitlePanelTen.setLayout(EventTitlePanelTenLayout);
        EventTitlePanelTenLayout.setHorizontalGroup(
            EventTitlePanelTenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelTenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventTitlePanelTenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EventTitleLabelTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(EventTitlePanelTenLayout.createSequentialGroup()
                        .addComponent(DateTextLabelTen, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        EventTitlePanelTenLayout.setVerticalGroup(
            EventTitlePanelTenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelTenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EventTitleLabelTen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateTextLabelTen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EventPane10.add(EventTitlePanelTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 1, 279, 60));

        SeperatorPaneTen.setLayout(null);
        EventPane10.add(SeperatorPaneTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 280, 12));

        DescriptionTextPanelTen.setEditable(false);
        jScrollPaneTen.setViewportView(DescriptionTextPanelTen);

        EventPane10.add(jScrollPaneTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 249, 180, 120));

        EventImage10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EventPane10.add(EventImage10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 172, 160));

        jPanel1.add(EventPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 871, 191, 375));

        EventPane11.setBackground(new java.awt.Color(153, 153, 153));
        EventPane11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        EventPane11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EventTitlePanelEleven.setBackground(new java.awt.Color(0, 0, 0));

        EventTitleLabelEleven.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EventTitleLabelEleven.setForeground(new java.awt.Color(255, 255, 255));
        EventTitleLabelEleven.setText("jLabel1");

        DateTextLabelEleven.setForeground(new java.awt.Color(255, 255, 255));
        DateTextLabelEleven.setText("jLabel1");

        javax.swing.GroupLayout EventTitlePanelElevenLayout = new javax.swing.GroupLayout(EventTitlePanelEleven);
        EventTitlePanelEleven.setLayout(EventTitlePanelElevenLayout);
        EventTitlePanelElevenLayout.setHorizontalGroup(
            EventTitlePanelElevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelElevenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventTitlePanelElevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EventTitleLabelEleven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(EventTitlePanelElevenLayout.createSequentialGroup()
                        .addComponent(DateTextLabelEleven, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        EventTitlePanelElevenLayout.setVerticalGroup(
            EventTitlePanelElevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelElevenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EventTitleLabelEleven)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateTextLabelEleven)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EventPane11.add(EventTitlePanelEleven, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 1, 279, 60));

        SeperatorPaneEleven.setLayout(null);
        EventPane11.add(SeperatorPaneEleven, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 280, 12));

        DescriptionTextPanelEleven.setEditable(false);
        jScrollPaneEleven.setViewportView(DescriptionTextPanelEleven);

        EventPane11.add(jScrollPaneEleven, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 249, 180, 120));

        EventImage11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EventPane11.add(EventImage11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 172, 160));

        jPanel1.add(EventPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 871, 191, 375));

        EventPane12.setBackground(new java.awt.Color(153, 153, 153));
        EventPane12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        EventPane12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EventTitlePanelTwelve.setBackground(new java.awt.Color(0, 0, 0));

        EventTitleLabelTwelve.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EventTitleLabelTwelve.setForeground(new java.awt.Color(255, 255, 255));
        EventTitleLabelTwelve.setText("jLabel1");

        DateTextLabelTwelve.setForeground(new java.awt.Color(255, 255, 255));
        DateTextLabelTwelve.setText("jLabel1");

        javax.swing.GroupLayout EventTitlePanelTwelveLayout = new javax.swing.GroupLayout(EventTitlePanelTwelve);
        EventTitlePanelTwelve.setLayout(EventTitlePanelTwelveLayout);
        EventTitlePanelTwelveLayout.setHorizontalGroup(
            EventTitlePanelTwelveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelTwelveLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventTitlePanelTwelveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EventTitleLabelTwelve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(EventTitlePanelTwelveLayout.createSequentialGroup()
                        .addComponent(DateTextLabelTwelve, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        EventTitlePanelTwelveLayout.setVerticalGroup(
            EventTitlePanelTwelveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelTwelveLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EventTitleLabelTwelve)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateTextLabelTwelve)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EventPane12.add(EventTitlePanelTwelve, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 1, 279, 60));

        SeperatorPaneTwelve.setLayout(null);
        EventPane12.add(SeperatorPaneTwelve, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 280, 12));

        DescriptionTextPanelTwelve.setEditable(false);
        jScrollPaneTwelve.setViewportView(DescriptionTextPanelTwelve);

        EventPane12.add(jScrollPaneTwelve, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 249, 180, 120));

        EventImage12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EventPane12.add(EventImage12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 172, 160));

        jPanel1.add(EventPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 871, 191, 375));

        EventPane13.setBackground(new java.awt.Color(153, 153, 153));
        EventPane13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        EventPane13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EventTitlePanelThirteen.setBackground(new java.awt.Color(0, 0, 0));

        EventTitleLabelThirteen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EventTitleLabelThirteen.setForeground(new java.awt.Color(255, 255, 255));
        EventTitleLabelThirteen.setText("jLabel1");

        DateTextLabelThirteen.setForeground(new java.awt.Color(255, 255, 255));
        DateTextLabelThirteen.setText("jLabel1");

        javax.swing.GroupLayout EventTitlePanelThirteenLayout = new javax.swing.GroupLayout(EventTitlePanelThirteen);
        EventTitlePanelThirteen.setLayout(EventTitlePanelThirteenLayout);
        EventTitlePanelThirteenLayout.setHorizontalGroup(
            EventTitlePanelThirteenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelThirteenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventTitlePanelThirteenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EventTitleLabelThirteen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(EventTitlePanelThirteenLayout.createSequentialGroup()
                        .addComponent(DateTextLabelThirteen, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        EventTitlePanelThirteenLayout.setVerticalGroup(
            EventTitlePanelThirteenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelThirteenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EventTitleLabelThirteen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateTextLabelThirteen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EventPane13.add(EventTitlePanelThirteen, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 1, 279, 60));

        SeperatorPaneThirteen.setLayout(null);
        EventPane13.add(SeperatorPaneThirteen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 280, 12));

        DescriptionTextPanelThirteen.setEditable(false);
        jScrollPaneThirteen.setViewportView(DescriptionTextPanelThirteen);

        EventPane13.add(jScrollPaneThirteen, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 249, 180, 120));

        EventImage13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EventPane13.add(EventImage13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 172, 160));

        jPanel1.add(EventPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(893, 1286, 191, 375));

        EventPane14.setBackground(new java.awt.Color(153, 153, 153));
        EventPane14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        EventPane14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EventTitlePanelFourteen.setBackground(new java.awt.Color(0, 0, 0));

        EventTitleLabelFourteen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EventTitleLabelFourteen.setForeground(new java.awt.Color(255, 255, 255));
        EventTitleLabelFourteen.setText("jLabel1");

        DateTextLabelFourteen.setForeground(new java.awt.Color(255, 255, 255));
        DateTextLabelFourteen.setText("jLabel1");

        javax.swing.GroupLayout EventTitlePanelFourteenLayout = new javax.swing.GroupLayout(EventTitlePanelFourteen);
        EventTitlePanelFourteen.setLayout(EventTitlePanelFourteenLayout);
        EventTitlePanelFourteenLayout.setHorizontalGroup(
            EventTitlePanelFourteenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelFourteenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventTitlePanelFourteenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EventTitleLabelFourteen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(EventTitlePanelFourteenLayout.createSequentialGroup()
                        .addComponent(DateTextLabelFourteen, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        EventTitlePanelFourteenLayout.setVerticalGroup(
            EventTitlePanelFourteenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelFourteenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EventTitleLabelFourteen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateTextLabelFourteen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EventPane14.add(EventTitlePanelFourteen, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 1, 279, 60));

        SeperatorPaneFourteen.setLayout(null);
        EventPane14.add(SeperatorPaneFourteen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 280, 12));

        DescriptionTextPanelFourteen.setEditable(false);
        jScrollPaneFourteen.setViewportView(DescriptionTextPanelFourteen);

        EventPane14.add(jScrollPaneFourteen, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 249, 180, 120));

        EventImage14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EventPane14.add(EventImage14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 172, 160));

        jPanel1.add(EventPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 1286, 191, 375));

        EventPane15.setBackground(new java.awt.Color(153, 153, 153));
        EventPane15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        EventPane15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EventTitlePanelFifteen.setBackground(new java.awt.Color(0, 0, 0));

        EventTitleLabelFifteen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EventTitleLabelFifteen.setForeground(new java.awt.Color(255, 255, 255));
        EventTitleLabelFifteen.setText("jLabel1");

        DateTextLabelFifteen.setForeground(new java.awt.Color(255, 255, 255));
        DateTextLabelFifteen.setText("jLabel1");

        javax.swing.GroupLayout EventTitlePanelFifteenLayout = new javax.swing.GroupLayout(EventTitlePanelFifteen);
        EventTitlePanelFifteen.setLayout(EventTitlePanelFifteenLayout);
        EventTitlePanelFifteenLayout.setHorizontalGroup(
            EventTitlePanelFifteenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelFifteenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventTitlePanelFifteenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EventTitleLabelFifteen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(EventTitlePanelFifteenLayout.createSequentialGroup()
                        .addComponent(DateTextLabelFifteen, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        EventTitlePanelFifteenLayout.setVerticalGroup(
            EventTitlePanelFifteenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelFifteenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EventTitleLabelFifteen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateTextLabelFifteen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EventPane15.add(EventTitlePanelFifteen, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 1, 279, 60));

        SeperatorPaneFifteen.setLayout(null);
        EventPane15.add(SeperatorPaneFifteen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 280, 12));

        DescriptionTextPanelFifteen.setEditable(false);
        jScrollPaneFifteen.setViewportView(DescriptionTextPanelFifteen);

        EventPane15.add(jScrollPaneFifteen, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 249, 180, 120));

        EventImage15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EventPane15.add(EventImage15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 172, 160));

        jPanel1.add(EventPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 1286, 191, 375));

        EventPane16.setBackground(new java.awt.Color(153, 153, 153));
        EventPane16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        EventPane16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EventTitlePanelSixteen.setBackground(new java.awt.Color(0, 0, 0));

        EventTitleLabelSixteen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EventTitleLabelSixteen.setForeground(new java.awt.Color(255, 255, 255));
        EventTitleLabelSixteen.setText("jLabel1");

        DateTextLabelSixteen.setForeground(new java.awt.Color(255, 255, 255));
        DateTextLabelSixteen.setText("jLabel1");

        javax.swing.GroupLayout EventTitlePanelSixteenLayout = new javax.swing.GroupLayout(EventTitlePanelSixteen);
        EventTitlePanelSixteen.setLayout(EventTitlePanelSixteenLayout);
        EventTitlePanelSixteenLayout.setHorizontalGroup(
            EventTitlePanelSixteenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelSixteenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventTitlePanelSixteenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EventTitleLabelSixteen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(EventTitlePanelSixteenLayout.createSequentialGroup()
                        .addComponent(DateTextLabelSixteen, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        EventTitlePanelSixteenLayout.setVerticalGroup(
            EventTitlePanelSixteenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelSixteenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EventTitleLabelSixteen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateTextLabelSixteen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EventPane16.add(EventTitlePanelSixteen, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 1, 279, 60));

        SeperatorPaneSixteen.setLayout(null);
        EventPane16.add(SeperatorPaneSixteen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 280, 12));

        DescriptionTextPanelSixteen.setEditable(false);
        jScrollPaneSixteen.setViewportView(DescriptionTextPanelSixteen);

        EventPane16.add(jScrollPaneSixteen, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 249, 180, 117));

        EventImage16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EventPane16.add(EventImage16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 172, 160));

        jPanel1.add(EventPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 1286, 191, 375));

        Arrow12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/arrow.png"))); // NOI18N
        jPanel1.add(Arrow12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 1460, -1, -1));

        Arrow1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/arrow.png"))); // NOI18N
        jPanel1.add(Arrow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 220, -1, -1));

        Arrow2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/arrow.png"))); // NOI18N
        jPanel1.add(Arrow2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, -1, -1));

        Arrow3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/arrow.png"))); // NOI18N
        jPanel1.add(Arrow3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        Arrow4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/arrow.png"))); // NOI18N
        jPanel1.add(Arrow4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 640, -1, -1));

        Arrow5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/arrow.png"))); // NOI18N
        jPanel1.add(Arrow5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 640, -1, -1));

        Arrow6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/arrow.png"))); // NOI18N
        jPanel1.add(Arrow6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 640, -1, -1));

        Arrow7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/arrow.png"))); // NOI18N
        jPanel1.add(Arrow7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 1040, -1, -1));

        Arrow8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/arrow.png"))); // NOI18N
        jPanel1.add(Arrow8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 1040, -1, -1));

        Arrow9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/arrow.png"))); // NOI18N
        jPanel1.add(Arrow9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 1040, -1, -1));

        Arrow10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/arrow.png"))); // NOI18N
        jPanel1.add(Arrow10, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 1460, -1, -1));

        Arrow11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/arrow.png"))); // NOI18N
        jPanel1.add(Arrow11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 1460, -1, -1));

        ScrollableAreaPane.setViewportView(jPanel1);

        DeleteBtn.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        DeleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/DeleteIconNonHover.png"))); // NOI18N
        DeleteBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DeleteBtn.setContentAreaFilled(false);
        DeleteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteBtn.setMaximumSize(new java.awt.Dimension(73, 73));
        DeleteBtn.setMinimumSize(new java.awt.Dimension(73, 73));
        DeleteBtn.setPreferredSize(new java.awt.Dimension(73, 73));
        DeleteBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/DeleteIconHover.png"))); // NOI18N
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        SaveBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SaveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/SaveIconNonHover.png"))); // NOI18N
        SaveBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SaveBtn.setContentAreaFilled(false);
        SaveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SaveBtn.setMaximumSize(new java.awt.Dimension(73, 73));
        SaveBtn.setMinimumSize(new java.awt.Dimension(73, 73));
        SaveBtn.setPreferredSize(new java.awt.Dimension(73, 73));
        SaveBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/SaveIconHover.png"))); // NOI18N
        SaveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SaveBtnMouseEntered(evt);
            }
        });
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        EditBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EditBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/EditIconNonHover.png"))); // NOI18N
        EditBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EditBtn.setContentAreaFilled(false);
        EditBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EditBtn.setMaximumSize(new java.awt.Dimension(73, 73));
        EditBtn.setMinimumSize(new java.awt.Dimension(73, 73));
        EditBtn.setPreferredSize(new java.awt.Dimension(73, 73));
        EditBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/EditIconHover.png"))); // NOI18N

        AddBtn.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        AddBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/AddIconNonHover.png"))); // NOI18N
        AddBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AddBtn.setContentAreaFilled(false);
        AddBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddBtn.setMaximumSize(new java.awt.Dimension(73, 73));
        AddBtn.setMinimumSize(new java.awt.Dimension(73, 73));
        AddBtn.setPreferredSize(new java.awt.Dimension(73, 73));
        AddBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/AddIconHover.png"))); // NOI18N
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddBtnMouseEntered(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(457, 457, 457)
                .addComponent(TimelineTitleLabel)
                .addGap(0, 443, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ScrollableAreaPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(815, 815, 815)
                        .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(TimelineTitleLabel)
                .addGap(39, 39, 39)
                .addComponent(ScrollableAreaPane, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseEntered
   
        
    }//GEN-LAST:event_DeleteBtnMouseEntered

    private void DeleteBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseExited

    }//GEN-LAST:event_DeleteBtnMouseExited

    private void SaveBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtnMouseEntered
 
    }//GEN-LAST:event_SaveBtnMouseEntered

    private void SaveBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtnMouseExited
 
    }//GEN-LAST:event_SaveBtnMouseExited

    private void EditBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseEntered

    }//GEN-LAST:event_EditBtnMouseEntered

    private void EditBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseExited

    }//GEN-LAST:event_EditBtnMouseExited

    private void AddBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseEntered

    }//GEN-LAST:event_AddBtnMouseEntered

    private void AddBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseExited
 
    }//GEN-LAST:event_AddBtnMouseExited

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        DeleteEvent del_event = new DeleteEvent();
        del_event.setVisible(true);
        super.dispose();
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        Addevent event = new Addevent();
        event.setVisible(true);
        super.dispose();
    }//GEN-LAST:event_AddBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Maintimeline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Maintimeline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Maintimeline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Maintimeline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Maintimeline().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JLabel Arrow1;
    private javax.swing.JLabel Arrow10;
    private javax.swing.JLabel Arrow11;
    private javax.swing.JLabel Arrow12;
    private javax.swing.JLabel Arrow2;
    private javax.swing.JLabel Arrow3;
    private javax.swing.JLabel Arrow4;
    private javax.swing.JLabel Arrow5;
    private javax.swing.JLabel Arrow6;
    private javax.swing.JLabel Arrow7;
    private javax.swing.JLabel Arrow8;
    private javax.swing.JLabel Arrow9;
    private javax.swing.JLabel DateTextLabelEight;
    private javax.swing.JLabel DateTextLabelEleven;
    private javax.swing.JLabel DateTextLabelFifteen;
    private javax.swing.JLabel DateTextLabelFive;
    private javax.swing.JLabel DateTextLabelFour;
    private javax.swing.JLabel DateTextLabelFourteen;
    private javax.swing.JLabel DateTextLabelNine;
    private javax.swing.JLabel DateTextLabelOne;
    private javax.swing.JLabel DateTextLabelSeven;
    private javax.swing.JLabel DateTextLabelSix;
    private javax.swing.JLabel DateTextLabelSixteen;
    private javax.swing.JLabel DateTextLabelTen;
    private javax.swing.JLabel DateTextLabelThirteen;
    private javax.swing.JLabel DateTextLabelThree;
    private javax.swing.JLabel DateTextLabelTwelve;
    private javax.swing.JLabel DateTextLabelTwo;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JTextPane DescriptionTextPanelEight;
    private javax.swing.JTextPane DescriptionTextPanelEleven;
    private javax.swing.JTextPane DescriptionTextPanelFifteen;
    private javax.swing.JTextPane DescriptionTextPanelFive;
    private javax.swing.JTextPane DescriptionTextPanelFour;
    private javax.swing.JTextPane DescriptionTextPanelFourteen;
    private javax.swing.JTextPane DescriptionTextPanelNine;
    private javax.swing.JTextPane DescriptionTextPanelOne;
    private javax.swing.JTextPane DescriptionTextPanelSeven;
    private javax.swing.JTextPane DescriptionTextPanelSix;
    private javax.swing.JTextPane DescriptionTextPanelSixteen;
    private javax.swing.JTextPane DescriptionTextPanelTen;
    private javax.swing.JTextPane DescriptionTextPanelThirteen;
    private javax.swing.JTextPane DescriptionTextPanelThree;
    private javax.swing.JTextPane DescriptionTextPanelTwelve;
    private javax.swing.JTextPane DescriptionTextPanelTwo;
    private javax.swing.JButton EditBtn;
    private javax.swing.JLabel EventImage1;
    private javax.swing.JLabel EventImage10;
    private javax.swing.JLabel EventImage11;
    private javax.swing.JLabel EventImage12;
    private javax.swing.JLabel EventImage13;
    private javax.swing.JLabel EventImage14;
    private javax.swing.JLabel EventImage15;
    private javax.swing.JLabel EventImage16;
    private javax.swing.JLabel EventImage2;
    private javax.swing.JLabel EventImage3;
    private javax.swing.JLabel EventImage4;
    private javax.swing.JLabel EventImage5;
    private javax.swing.JLabel EventImage6;
    private javax.swing.JLabel EventImage7;
    private javax.swing.JLabel EventImage8;
    private javax.swing.JLabel EventImage9;
    private javax.swing.JPanel EventPane1;
    private javax.swing.JPanel EventPane10;
    private javax.swing.JPanel EventPane11;
    private javax.swing.JPanel EventPane12;
    private javax.swing.JPanel EventPane13;
    private javax.swing.JPanel EventPane14;
    private javax.swing.JPanel EventPane15;
    private javax.swing.JPanel EventPane16;
    private javax.swing.JPanel EventPane2;
    private javax.swing.JPanel EventPane3;
    private javax.swing.JPanel EventPane4;
    private javax.swing.JPanel EventPane5;
    private javax.swing.JPanel EventPane6;
    private javax.swing.JPanel EventPane7;
    private javax.swing.JPanel EventPane8;
    private javax.swing.JPanel EventPane9;
    private javax.swing.JLabel EventTitleLabelEight;
    private javax.swing.JLabel EventTitleLabelEleven;
    private javax.swing.JLabel EventTitleLabelFifteen;
    private javax.swing.JLabel EventTitleLabelFive;
    private javax.swing.JLabel EventTitleLabelFour;
    private javax.swing.JLabel EventTitleLabelFourteen;
    private javax.swing.JLabel EventTitleLabelNine;
    private javax.swing.JLabel EventTitleLabelOne;
    private javax.swing.JLabel EventTitleLabelSeven;
    private javax.swing.JLabel EventTitleLabelSix;
    private javax.swing.JLabel EventTitleLabelSixteen;
    private javax.swing.JLabel EventTitleLabelTen;
    private javax.swing.JLabel EventTitleLabelThirteen;
    private javax.swing.JLabel EventTitleLabelThree;
    private javax.swing.JLabel EventTitleLabelTwelve;
    private javax.swing.JLabel EventTitleLabelTwo;
    private javax.swing.JPanel EventTitlePanelEight;
    private javax.swing.JPanel EventTitlePanelEleven;
    private javax.swing.JPanel EventTitlePanelFifteen;
    private javax.swing.JPanel EventTitlePanelFive;
    private javax.swing.JPanel EventTitlePanelFour;
    private javax.swing.JPanel EventTitlePanelFourteen;
    private javax.swing.JPanel EventTitlePanelNine;
    private javax.swing.JPanel EventTitlePanelOne;
    private javax.swing.JPanel EventTitlePanelSeven;
    private javax.swing.JPanel EventTitlePanelSix;
    private javax.swing.JPanel EventTitlePanelSixteen;
    private javax.swing.JPanel EventTitlePanelTen;
    private javax.swing.JPanel EventTitlePanelThirteen;
    private javax.swing.JPanel EventTitlePanelThree;
    private javax.swing.JPanel EventTitlePanelTwelve;
    private javax.swing.JPanel EventTitlePanelTwo;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JScrollPane ScrollableAreaPane;
    private javax.swing.JPanel SeperatorPaneEight;
    private javax.swing.JPanel SeperatorPaneEleven;
    private javax.swing.JPanel SeperatorPaneFifteen;
    private javax.swing.JPanel SeperatorPaneFive;
    private javax.swing.JPanel SeperatorPaneFour;
    private javax.swing.JPanel SeperatorPaneFourteen;
    private javax.swing.JPanel SeperatorPaneNine;
    private javax.swing.JPanel SeperatorPaneOne;
    private javax.swing.JPanel SeperatorPaneSeven;
    private javax.swing.JPanel SeperatorPaneSix;
    private javax.swing.JPanel SeperatorPaneSixteen;
    private javax.swing.JPanel SeperatorPaneTen;
    private javax.swing.JPanel SeperatorPaneThirteen;
    private javax.swing.JPanel SeperatorPaneThree;
    private javax.swing.JPanel SeperatorPaneTwelve;
    private javax.swing.JPanel SeperatorPaneTwo;
    private javax.swing.JLabel TimelineTitleLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPaneEight;
    private javax.swing.JScrollPane jScrollPaneEleven;
    private javax.swing.JScrollPane jScrollPaneFifteen;
    private javax.swing.JScrollPane jScrollPaneFive;
    private javax.swing.JScrollPane jScrollPaneFour;
    private javax.swing.JScrollPane jScrollPaneFourteen;
    private javax.swing.JScrollPane jScrollPaneNine;
    private javax.swing.JScrollPane jScrollPaneOne;
    private javax.swing.JScrollPane jScrollPaneSeven;
    private javax.swing.JScrollPane jScrollPaneSix;
    private javax.swing.JScrollPane jScrollPaneSixteen;
    private javax.swing.JScrollPane jScrollPaneTen;
    private javax.swing.JScrollPane jScrollPaneThirteen;
    private javax.swing.JScrollPane jScrollPaneThree;
    private javax.swing.JScrollPane jScrollPaneTwelve;
    private javax.swing.JScrollPane jScrollPaneTwo;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
