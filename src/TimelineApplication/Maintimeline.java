/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TimelineApplication;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import java.io.*;
import javax.swing.JPanel;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
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
        //The array below will store all event title variable names and event date variable names for later use
        JLabel eventTitleDateNames[][]={{EventTitleLabelOne, DateTextLabelOne},{EventTitleLabelTwo, DateTextLabelTwo},{EventTitleLabelThree, DateTextLabelThree}, 
        {EventTitleLabelFour, DateTextLabelFour}, {EventTitleLabelFive, DateTextLabelFive}, {EventTitleLabelSix, DateTextLabelSix}, {EventTitleLabelSeven, DateTextLabelSeven}, 
        {EventTitleLabelEight, DateTextLabelEight}, {EventTitleLabelNine, DateTextLabelNine},{EventTitleLabelTen, DateTextLabelTen}, {EventTitleLabelEleven, DateTextLabelEleven}, 
        {EventTitleLabelTwelve, DateTextLabelTwelve}, {EventTitleLabelThirteen, DateTextLabelThirteen}, {EventTitleLabelFourteen, DateTextLabelFourteen}, 
        {EventTitleLabelFifteen, DateTextLabelFifteen},{EventTitleLabelSixteen, DateTextLabelSixteen}};

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
            editEvent(eventTitleDateNames[i][0], eventTitleDateNames[i][1], eventDescriptionNames[i], i); 
            setEventPaneVisibility(eventPaneNames[i], true); //setting events to visible
            setArrowVisibility(eventArrowNames[i], true);
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
    
    public static void editEvent(JLabel title, JLabel date, JTextPane description, int eventNum){
        
        
        title.setText(eventInformationList.get(eventNum).get(1)); //1st index is title
        date.setText(eventInformationList.get(eventNum).get(2)); //2nd index is date
        description.setText(eventInformationList.get(eventNum).get(3)); //3rd index is description
        
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
        ImageFrameOne = new javax.swing.JPanel();
        SeperatorPaneOne = new javax.swing.JPanel();
        jScrollPaneOne = new javax.swing.JScrollPane();
        DescriptionTextPanelOne = new javax.swing.JTextPane();
        EventPane3 = new javax.swing.JPanel();
        EventTitlePanelThree = new javax.swing.JPanel();
        EventTitleLabelThree = new javax.swing.JLabel();
        DateTextLabelThree = new javax.swing.JLabel();
        ImageFrameThree = new javax.swing.JPanel();
        SeperatorPaneThree = new javax.swing.JPanel();
        jScrollPaneThree = new javax.swing.JScrollPane();
        DescriptionTextPanelThree = new javax.swing.JTextPane();
        EventPane2 = new javax.swing.JPanel();
        EventTitlePanelTwo = new javax.swing.JPanel();
        EventTitleLabelTwo = new javax.swing.JLabel();
        DateTextLabelTwo = new javax.swing.JLabel();
        ImageFrameTwo = new javax.swing.JPanel();
        SeperatorPaneTwo = new javax.swing.JPanel();
        jScrollPaneTwo = new javax.swing.JScrollPane();
        DescriptionTextPanelTwo = new javax.swing.JTextPane();
        EventPane4 = new javax.swing.JPanel();
        EventTitlePanelFour = new javax.swing.JPanel();
        EventTitleLabelFour = new javax.swing.JLabel();
        DateTextLabelFour = new javax.swing.JLabel();
        ImageFrameFour = new javax.swing.JPanel();
        SeperatorPaneFour = new javax.swing.JPanel();
        jScrollPaneFour = new javax.swing.JScrollPane();
        DescriptionTextPanelFour = new javax.swing.JTextPane();
        EventPane5 = new javax.swing.JPanel();
        EventTitlePanelFive = new javax.swing.JPanel();
        EventTitleLabelFive = new javax.swing.JLabel();
        DateTextLabelFive = new javax.swing.JLabel();
        ImageFrameFive = new javax.swing.JPanel();
        SeperatorPaneFive = new javax.swing.JPanel();
        jScrollPaneFive = new javax.swing.JScrollPane();
        DescriptionTextPanelFive = new javax.swing.JTextPane();
        EventPane6 = new javax.swing.JPanel();
        EventTitlePanelSix = new javax.swing.JPanel();
        EventTitleLabelSix = new javax.swing.JLabel();
        DateTextLabelSix = new javax.swing.JLabel();
        ImageFrameSix = new javax.swing.JPanel();
        SeperatorPaneSix = new javax.swing.JPanel();
        jScrollPaneSix = new javax.swing.JScrollPane();
        DescriptionTextPanelSix = new javax.swing.JTextPane();
        EventPane7 = new javax.swing.JPanel();
        EventTitlePanelSeven = new javax.swing.JPanel();
        EventTitleLabelSeven = new javax.swing.JLabel();
        DateTextLabelSeven = new javax.swing.JLabel();
        ImageFrameSeven = new javax.swing.JPanel();
        SeperatorPaneSeven = new javax.swing.JPanel();
        jScrollPaneSeven = new javax.swing.JScrollPane();
        DescriptionTextPanelSeven = new javax.swing.JTextPane();
        EventPane8 = new javax.swing.JPanel();
        EventTitlePanelEight = new javax.swing.JPanel();
        EventTitleLabelEight = new javax.swing.JLabel();
        DateTextLabelEight = new javax.swing.JLabel();
        ImageFrameEight = new javax.swing.JPanel();
        SeperatorPaneEight = new javax.swing.JPanel();
        jScrollPaneEight = new javax.swing.JScrollPane();
        DescriptionTextPanelEight = new javax.swing.JTextPane();
        EventPane9 = new javax.swing.JPanel();
        EventTitlePanelNine = new javax.swing.JPanel();
        EventTitleLabelNine = new javax.swing.JLabel();
        DateTextLabelNine = new javax.swing.JLabel();
        ImageFrameNine = new javax.swing.JPanel();
        SeperatorPaneNine = new javax.swing.JPanel();
        jScrollPaneNine = new javax.swing.JScrollPane();
        DescriptionTextPanelNine = new javax.swing.JTextPane();
        EventPane10 = new javax.swing.JPanel();
        EventTitlePanelTen = new javax.swing.JPanel();
        EventTitleLabelTen = new javax.swing.JLabel();
        DateTextLabelTen = new javax.swing.JLabel();
        ImageFrameTen = new javax.swing.JPanel();
        SeperatorPaneTen = new javax.swing.JPanel();
        jScrollPaneTen = new javax.swing.JScrollPane();
        DescriptionTextPanelTen = new javax.swing.JTextPane();
        EventPane11 = new javax.swing.JPanel();
        EventTitlePanelEleven = new javax.swing.JPanel();
        EventTitleLabelEleven = new javax.swing.JLabel();
        DateTextLabelEleven = new javax.swing.JLabel();
        ImageFrameEleven = new javax.swing.JPanel();
        SeperatorPaneEleven = new javax.swing.JPanel();
        jScrollPaneEleven = new javax.swing.JScrollPane();
        DescriptionTextPanelEleven = new javax.swing.JTextPane();
        EventPane12 = new javax.swing.JPanel();
        EventTitlePanelTwelve = new javax.swing.JPanel();
        EventTitleLabelTwelve = new javax.swing.JLabel();
        DateTextLabelTwelve = new javax.swing.JLabel();
        ImageFrameTwelve = new javax.swing.JPanel();
        SeperatorPaneTwelve = new javax.swing.JPanel();
        jScrollPaneTwelve = new javax.swing.JScrollPane();
        DescriptionTextPanelTwelve = new javax.swing.JTextPane();
        EventPane13 = new javax.swing.JPanel();
        EventTitlePanelThirteen = new javax.swing.JPanel();
        EventTitleLabelThirteen = new javax.swing.JLabel();
        DateTextLabelThirteen = new javax.swing.JLabel();
        ImageFrameThirteen = new javax.swing.JPanel();
        SeperatorPaneThirteen = new javax.swing.JPanel();
        jScrollPaneThirteen = new javax.swing.JScrollPane();
        DescriptionTextPanelThirteen = new javax.swing.JTextPane();
        EventPane14 = new javax.swing.JPanel();
        EventTitlePanelFourteen = new javax.swing.JPanel();
        EventTitleLabelFourteen = new javax.swing.JLabel();
        DateTextLabelFourteen = new javax.swing.JLabel();
        ImageFrameFourteen = new javax.swing.JPanel();
        SeperatorPaneFourteen = new javax.swing.JPanel();
        jScrollPaneFourteen = new javax.swing.JScrollPane();
        DescriptionTextPanelFourteen = new javax.swing.JTextPane();
        EventPane15 = new javax.swing.JPanel();
        EventTitlePanelFifteen = new javax.swing.JPanel();
        EventTitleLabelFifteen = new javax.swing.JLabel();
        DateTextLabelFifteen = new javax.swing.JLabel();
        ImageFrameFifteen = new javax.swing.JPanel();
        SeperatorPaneFifteen = new javax.swing.JPanel();
        jScrollPaneFifteen = new javax.swing.JScrollPane();
        DescriptionTextPanelFifteen = new javax.swing.JTextPane();
        EventPane16 = new javax.swing.JPanel();
        EventTitlePanelSixteen = new javax.swing.JPanel();
        EventTitleLabelSixteen = new javax.swing.JLabel();
        DateTextLabelSixteen = new javax.swing.JLabel();
        ImageFrameSixteen = new javax.swing.JPanel();
        SeperatorPaneSixteen = new javax.swing.JPanel();
        jScrollPaneSixteen = new javax.swing.JScrollPane();
        DescriptionTextPanelSixteen = new javax.swing.JTextPane();
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

        EventTitlePanelOne.setBackground(new java.awt.Color(0, 0, 0));

        EventTitleLabelOne.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EventTitleLabelOne.setForeground(new java.awt.Color(255, 255, 255));
        EventTitleLabelOne.setText("jLabel1");

        DateTextLabelOne.setForeground(new java.awt.Color(255, 255, 255));
        DateTextLabelOne.setText("jLabel1");

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
        );
        EventTitlePanelOneLayout.setVerticalGroup(
            EventTitlePanelOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelOneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EventTitleLabelOne)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateTextLabelOne)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ImageFrameOne.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ImageFrameOne.setOpaque(false);

        javax.swing.GroupLayout ImageFrameOneLayout = new javax.swing.GroupLayout(ImageFrameOne);
        ImageFrameOne.setLayout(ImageFrameOneLayout);
        ImageFrameOneLayout.setHorizontalGroup(
            ImageFrameOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ImageFrameOneLayout.setVerticalGroup(
            ImageFrameOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );

        SeperatorPaneOne.setLayout(null);

        DescriptionTextPanelOne.setEditable(false);
        jScrollPaneOne.setViewportView(DescriptionTextPanelOne);

        javax.swing.GroupLayout EventPane1Layout = new javax.swing.GroupLayout(EventPane1);
        EventPane1.setLayout(EventPane1Layout);
        EventPane1Layout.setHorizontalGroup(
            EventPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPane1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(EventTitlePanelOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(EventPane1Layout.createSequentialGroup()
                .addComponent(SeperatorPaneOne, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(EventPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneOne, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(ImageFrameOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EventPane1Layout.setVerticalGroup(
            EventPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPane1Layout.createSequentialGroup()
                .addComponent(EventTitlePanelOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(SeperatorPaneOne, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ImageFrameOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneOne, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(EventPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(893, 41, 191, 375));

        EventPane3.setBackground(new java.awt.Color(153, 153, 153));
        EventPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        EventTitlePanelThree.setBackground(new java.awt.Color(0, 0, 0));

        EventTitleLabelThree.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EventTitleLabelThree.setForeground(new java.awt.Color(255, 255, 255));
        EventTitleLabelThree.setText("jLabel1");

        DateTextLabelThree.setForeground(new java.awt.Color(255, 255, 255));
        DateTextLabelThree.setText("jLabel1");

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
        );
        EventTitlePanelThreeLayout.setVerticalGroup(
            EventTitlePanelThreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelThreeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EventTitleLabelThree)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateTextLabelThree)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ImageFrameThree.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ImageFrameThree.setOpaque(false);

        javax.swing.GroupLayout ImageFrameThreeLayout = new javax.swing.GroupLayout(ImageFrameThree);
        ImageFrameThree.setLayout(ImageFrameThreeLayout);
        ImageFrameThreeLayout.setHorizontalGroup(
            ImageFrameThreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ImageFrameThreeLayout.setVerticalGroup(
            ImageFrameThreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );

        SeperatorPaneThree.setLayout(null);

        DescriptionTextPanelThree.setEditable(false);
        jScrollPaneThree.setViewportView(DescriptionTextPanelThree);

        javax.swing.GroupLayout EventPane3Layout = new javax.swing.GroupLayout(EventPane3);
        EventPane3.setLayout(EventPane3Layout);
        EventPane3Layout.setHorizontalGroup(
            EventPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPane3Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(EventTitlePanelThree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(EventPane3Layout.createSequentialGroup()
                .addComponent(SeperatorPaneThree, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(EventPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneThree, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(ImageFrameThree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EventPane3Layout.setVerticalGroup(
            EventPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPane3Layout.createSequentialGroup()
                .addComponent(EventTitlePanelThree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(SeperatorPaneThree, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ImageFrameThree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneThree, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(EventPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 41, 193, -1));

        EventPane2.setBackground(new java.awt.Color(153, 153, 153));
        EventPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        EventTitlePanelTwo.setBackground(new java.awt.Color(0, 0, 0));

        EventTitleLabelTwo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EventTitleLabelTwo.setForeground(new java.awt.Color(255, 255, 255));
        EventTitleLabelTwo.setText("jLabel1");

        DateTextLabelTwo.setForeground(new java.awt.Color(255, 255, 255));
        DateTextLabelTwo.setText("jLabel1");

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
        );
        EventTitlePanelTwoLayout.setVerticalGroup(
            EventTitlePanelTwoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelTwoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EventTitleLabelTwo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateTextLabelTwo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ImageFrameTwo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ImageFrameTwo.setOpaque(false);

        javax.swing.GroupLayout ImageFrameTwoLayout = new javax.swing.GroupLayout(ImageFrameTwo);
        ImageFrameTwo.setLayout(ImageFrameTwoLayout);
        ImageFrameTwoLayout.setHorizontalGroup(
            ImageFrameTwoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ImageFrameTwoLayout.setVerticalGroup(
            ImageFrameTwoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );

        SeperatorPaneTwo.setLayout(null);

        DescriptionTextPanelTwo.setEditable(false);
        jScrollPaneTwo.setViewportView(DescriptionTextPanelTwo);

        javax.swing.GroupLayout EventPane2Layout = new javax.swing.GroupLayout(EventPane2);
        EventPane2.setLayout(EventPane2Layout);
        EventPane2Layout.setHorizontalGroup(
            EventPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPane2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(EventTitlePanelTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(EventPane2Layout.createSequentialGroup()
                .addComponent(SeperatorPaneTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(EventPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneTwo, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(ImageFrameTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EventPane2Layout.setVerticalGroup(
            EventPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPane2Layout.createSequentialGroup()
                .addComponent(EventTitlePanelTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(SeperatorPaneTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ImageFrameTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneTwo, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(EventPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 41, 191, 375));

        EventPane4.setBackground(new java.awt.Color(153, 153, 153));
        EventPane4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        EventTitlePanelFour.setBackground(new java.awt.Color(0, 0, 0));

        EventTitleLabelFour.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EventTitleLabelFour.setForeground(new java.awt.Color(255, 255, 255));
        EventTitleLabelFour.setText("jLabel1");

        DateTextLabelFour.setForeground(new java.awt.Color(255, 255, 255));
        DateTextLabelFour.setText("jLabel1");

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
        );
        EventTitlePanelFourLayout.setVerticalGroup(
            EventTitlePanelFourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelFourLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EventTitleLabelFour)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateTextLabelFour)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ImageFrameFour.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ImageFrameFour.setOpaque(false);

        javax.swing.GroupLayout ImageFrameFourLayout = new javax.swing.GroupLayout(ImageFrameFour);
        ImageFrameFour.setLayout(ImageFrameFourLayout);
        ImageFrameFourLayout.setHorizontalGroup(
            ImageFrameFourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ImageFrameFourLayout.setVerticalGroup(
            ImageFrameFourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );

        SeperatorPaneFour.setLayout(null);

        DescriptionTextPanelFour.setEditable(false);
        jScrollPaneFour.setViewportView(DescriptionTextPanelFour);

        javax.swing.GroupLayout EventPane4Layout = new javax.swing.GroupLayout(EventPane4);
        EventPane4.setLayout(EventPane4Layout);
        EventPane4Layout.setHorizontalGroup(
            EventPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPane4Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(EventTitlePanelFour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(EventPane4Layout.createSequentialGroup()
                .addComponent(SeperatorPaneFour, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(EventPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneFour, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(ImageFrameFour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EventPane4Layout.setVerticalGroup(
            EventPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPane4Layout.createSequentialGroup()
                .addComponent(EventTitlePanelFour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(SeperatorPaneFour, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ImageFrameFour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneFour, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(EventPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 41, 190, 375));

        EventPane5.setBackground(new java.awt.Color(153, 153, 153));
        EventPane5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

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

        ImageFrameFive.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ImageFrameFive.setOpaque(false);

        javax.swing.GroupLayout ImageFrameFiveLayout = new javax.swing.GroupLayout(ImageFrameFive);
        ImageFrameFive.setLayout(ImageFrameFiveLayout);
        ImageFrameFiveLayout.setHorizontalGroup(
            ImageFrameFiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ImageFrameFiveLayout.setVerticalGroup(
            ImageFrameFiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );

        SeperatorPaneFive.setLayout(null);

        DescriptionTextPanelFive.setEditable(false);
        jScrollPaneFive.setViewportView(DescriptionTextPanelFive);

        javax.swing.GroupLayout EventPane5Layout = new javax.swing.GroupLayout(EventPane5);
        EventPane5.setLayout(EventPane5Layout);
        EventPane5Layout.setHorizontalGroup(
            EventPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPane5Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(EventTitlePanelFive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(EventPane5Layout.createSequentialGroup()
                .addComponent(SeperatorPaneFive, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(EventPane5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneFive, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(ImageFrameFive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EventPane5Layout.setVerticalGroup(
            EventPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPane5Layout.createSequentialGroup()
                .addComponent(EventTitlePanelFive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(SeperatorPaneFive, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ImageFrameFive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneFive, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(EventPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(893, 456, 191, -1));

        EventPane6.setBackground(new java.awt.Color(153, 153, 153));
        EventPane6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

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

        ImageFrameSix.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ImageFrameSix.setOpaque(false);

        javax.swing.GroupLayout ImageFrameSixLayout = new javax.swing.GroupLayout(ImageFrameSix);
        ImageFrameSix.setLayout(ImageFrameSixLayout);
        ImageFrameSixLayout.setHorizontalGroup(
            ImageFrameSixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ImageFrameSixLayout.setVerticalGroup(
            ImageFrameSixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );

        SeperatorPaneSix.setLayout(null);

        DescriptionTextPanelSix.setEditable(false);
        jScrollPaneSix.setViewportView(DescriptionTextPanelSix);

        javax.swing.GroupLayout EventPane6Layout = new javax.swing.GroupLayout(EventPane6);
        EventPane6.setLayout(EventPane6Layout);
        EventPane6Layout.setHorizontalGroup(
            EventPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPane6Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(EventTitlePanelSix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(EventPane6Layout.createSequentialGroup()
                .addComponent(SeperatorPaneSix, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(EventPane6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneSix, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(ImageFrameSix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EventPane6Layout.setVerticalGroup(
            EventPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPane6Layout.createSequentialGroup()
                .addComponent(EventTitlePanelSix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(SeperatorPaneSix, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ImageFrameSix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneSix, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(EventPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 456, 191, -1));

        EventPane7.setBackground(new java.awt.Color(153, 153, 153));
        EventPane7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

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

        ImageFrameSeven.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ImageFrameSeven.setOpaque(false);

        javax.swing.GroupLayout ImageFrameSevenLayout = new javax.swing.GroupLayout(ImageFrameSeven);
        ImageFrameSeven.setLayout(ImageFrameSevenLayout);
        ImageFrameSevenLayout.setHorizontalGroup(
            ImageFrameSevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ImageFrameSevenLayout.setVerticalGroup(
            ImageFrameSevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );

        SeperatorPaneSeven.setLayout(null);

        DescriptionTextPanelSeven.setEditable(false);
        jScrollPaneSeven.setViewportView(DescriptionTextPanelSeven);

        javax.swing.GroupLayout EventPane7Layout = new javax.swing.GroupLayout(EventPane7);
        EventPane7.setLayout(EventPane7Layout);
        EventPane7Layout.setHorizontalGroup(
            EventPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPane7Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(EventTitlePanelSeven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(EventPane7Layout.createSequentialGroup()
                .addComponent(SeperatorPaneSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(EventPane7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneSeven, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(ImageFrameSeven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EventPane7Layout.setVerticalGroup(
            EventPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPane7Layout.createSequentialGroup()
                .addComponent(EventTitlePanelSeven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(SeperatorPaneSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ImageFrameSeven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneSeven, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(EventPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 456, 191, -1));

        EventPane8.setBackground(new java.awt.Color(153, 153, 153));
        EventPane8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

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

        ImageFrameEight.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ImageFrameEight.setOpaque(false);

        javax.swing.GroupLayout ImageFrameEightLayout = new javax.swing.GroupLayout(ImageFrameEight);
        ImageFrameEight.setLayout(ImageFrameEightLayout);
        ImageFrameEightLayout.setHorizontalGroup(
            ImageFrameEightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ImageFrameEightLayout.setVerticalGroup(
            ImageFrameEightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );

        SeperatorPaneEight.setLayout(null);

        DescriptionTextPanelEight.setEditable(false);
        jScrollPaneEight.setViewportView(DescriptionTextPanelEight);

        javax.swing.GroupLayout EventPane8Layout = new javax.swing.GroupLayout(EventPane8);
        EventPane8.setLayout(EventPane8Layout);
        EventPane8Layout.setHorizontalGroup(
            EventPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPane8Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(EventTitlePanelEight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(EventPane8Layout.createSequentialGroup()
                .addComponent(SeperatorPaneEight, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(EventPane8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneEight, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(ImageFrameEight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EventPane8Layout.setVerticalGroup(
            EventPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPane8Layout.createSequentialGroup()
                .addComponent(EventTitlePanelEight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(SeperatorPaneEight, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ImageFrameEight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneEight, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(EventPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 456, 191, -1));

        EventPane9.setBackground(new java.awt.Color(153, 153, 153));
        EventPane9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

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

        ImageFrameNine.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ImageFrameNine.setOpaque(false);

        javax.swing.GroupLayout ImageFrameNineLayout = new javax.swing.GroupLayout(ImageFrameNine);
        ImageFrameNine.setLayout(ImageFrameNineLayout);
        ImageFrameNineLayout.setHorizontalGroup(
            ImageFrameNineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ImageFrameNineLayout.setVerticalGroup(
            ImageFrameNineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );

        SeperatorPaneNine.setLayout(null);

        DescriptionTextPanelNine.setEditable(false);
        jScrollPaneNine.setViewportView(DescriptionTextPanelNine);

        javax.swing.GroupLayout EventPane9Layout = new javax.swing.GroupLayout(EventPane9);
        EventPane9.setLayout(EventPane9Layout);
        EventPane9Layout.setHorizontalGroup(
            EventPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPane9Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(EventTitlePanelNine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(EventPane9Layout.createSequentialGroup()
                .addComponent(SeperatorPaneNine, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(EventPane9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneNine, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(ImageFrameNine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EventPane9Layout.setVerticalGroup(
            EventPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPane9Layout.createSequentialGroup()
                .addComponent(EventTitlePanelNine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(SeperatorPaneNine, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ImageFrameNine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneNine, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(EventPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(893, 871, 191, -1));

        EventPane10.setBackground(new java.awt.Color(153, 153, 153));
        EventPane10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

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

        ImageFrameTen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ImageFrameTen.setOpaque(false);

        javax.swing.GroupLayout ImageFrameTenLayout = new javax.swing.GroupLayout(ImageFrameTen);
        ImageFrameTen.setLayout(ImageFrameTenLayout);
        ImageFrameTenLayout.setHorizontalGroup(
            ImageFrameTenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ImageFrameTenLayout.setVerticalGroup(
            ImageFrameTenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );

        SeperatorPaneTen.setLayout(null);

        DescriptionTextPanelTen.setEditable(false);
        jScrollPaneTen.setViewportView(DescriptionTextPanelTen);

        javax.swing.GroupLayout EventPane10Layout = new javax.swing.GroupLayout(EventPane10);
        EventPane10.setLayout(EventPane10Layout);
        EventPane10Layout.setHorizontalGroup(
            EventPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPane10Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(EventTitlePanelTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(EventPane10Layout.createSequentialGroup()
                .addComponent(SeperatorPaneTen, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(EventPane10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneTen, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(ImageFrameTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EventPane10Layout.setVerticalGroup(
            EventPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPane10Layout.createSequentialGroup()
                .addComponent(EventTitlePanelTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(SeperatorPaneTen, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ImageFrameTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneTen, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(EventPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 871, 191, -1));

        EventPane11.setBackground(new java.awt.Color(153, 153, 153));
        EventPane11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

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

        ImageFrameEleven.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ImageFrameEleven.setOpaque(false);

        javax.swing.GroupLayout ImageFrameElevenLayout = new javax.swing.GroupLayout(ImageFrameEleven);
        ImageFrameEleven.setLayout(ImageFrameElevenLayout);
        ImageFrameElevenLayout.setHorizontalGroup(
            ImageFrameElevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ImageFrameElevenLayout.setVerticalGroup(
            ImageFrameElevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );

        SeperatorPaneEleven.setLayout(null);

        DescriptionTextPanelEleven.setEditable(false);
        jScrollPaneEleven.setViewportView(DescriptionTextPanelEleven);

        javax.swing.GroupLayout EventPane11Layout = new javax.swing.GroupLayout(EventPane11);
        EventPane11.setLayout(EventPane11Layout);
        EventPane11Layout.setHorizontalGroup(
            EventPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPane11Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(EventTitlePanelEleven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(EventPane11Layout.createSequentialGroup()
                .addComponent(SeperatorPaneEleven, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(EventPane11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneEleven, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(ImageFrameEleven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EventPane11Layout.setVerticalGroup(
            EventPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPane11Layout.createSequentialGroup()
                .addComponent(EventTitlePanelEleven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(SeperatorPaneEleven, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ImageFrameEleven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneEleven, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(EventPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 871, 191, -1));

        EventPane12.setBackground(new java.awt.Color(153, 153, 153));
        EventPane12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

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

        ImageFrameTwelve.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ImageFrameTwelve.setOpaque(false);

        javax.swing.GroupLayout ImageFrameTwelveLayout = new javax.swing.GroupLayout(ImageFrameTwelve);
        ImageFrameTwelve.setLayout(ImageFrameTwelveLayout);
        ImageFrameTwelveLayout.setHorizontalGroup(
            ImageFrameTwelveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ImageFrameTwelveLayout.setVerticalGroup(
            ImageFrameTwelveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );

        SeperatorPaneTwelve.setLayout(null);

        DescriptionTextPanelTwelve.setEditable(false);
        jScrollPaneTwelve.setViewportView(DescriptionTextPanelTwelve);

        javax.swing.GroupLayout EventPane12Layout = new javax.swing.GroupLayout(EventPane12);
        EventPane12.setLayout(EventPane12Layout);
        EventPane12Layout.setHorizontalGroup(
            EventPane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPane12Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(EventTitlePanelTwelve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(EventPane12Layout.createSequentialGroup()
                .addComponent(SeperatorPaneTwelve, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(EventPane12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventPane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneTwelve, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(ImageFrameTwelve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EventPane12Layout.setVerticalGroup(
            EventPane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPane12Layout.createSequentialGroup()
                .addComponent(EventTitlePanelTwelve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(SeperatorPaneTwelve, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ImageFrameTwelve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneTwelve, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(EventPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 871, 191, -1));

        EventPane13.setBackground(new java.awt.Color(153, 153, 153));
        EventPane13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

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

        ImageFrameThirteen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ImageFrameThirteen.setOpaque(false);

        javax.swing.GroupLayout ImageFrameThirteenLayout = new javax.swing.GroupLayout(ImageFrameThirteen);
        ImageFrameThirteen.setLayout(ImageFrameThirteenLayout);
        ImageFrameThirteenLayout.setHorizontalGroup(
            ImageFrameThirteenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ImageFrameThirteenLayout.setVerticalGroup(
            ImageFrameThirteenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );

        SeperatorPaneThirteen.setLayout(null);

        DescriptionTextPanelThirteen.setEditable(false);
        jScrollPaneThirteen.setViewportView(DescriptionTextPanelThirteen);

        javax.swing.GroupLayout EventPane13Layout = new javax.swing.GroupLayout(EventPane13);
        EventPane13.setLayout(EventPane13Layout);
        EventPane13Layout.setHorizontalGroup(
            EventPane13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPane13Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(EventTitlePanelThirteen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(EventPane13Layout.createSequentialGroup()
                .addComponent(SeperatorPaneThirteen, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(EventPane13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventPane13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneThirteen, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(ImageFrameThirteen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EventPane13Layout.setVerticalGroup(
            EventPane13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPane13Layout.createSequentialGroup()
                .addComponent(EventTitlePanelThirteen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(SeperatorPaneThirteen, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ImageFrameThirteen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneThirteen, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(EventPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(893, 1286, 191, -1));

        EventPane14.setBackground(new java.awt.Color(153, 153, 153));
        EventPane14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

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

        ImageFrameFourteen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ImageFrameFourteen.setOpaque(false);

        javax.swing.GroupLayout ImageFrameFourteenLayout = new javax.swing.GroupLayout(ImageFrameFourteen);
        ImageFrameFourteen.setLayout(ImageFrameFourteenLayout);
        ImageFrameFourteenLayout.setHorizontalGroup(
            ImageFrameFourteenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ImageFrameFourteenLayout.setVerticalGroup(
            ImageFrameFourteenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );

        SeperatorPaneFourteen.setLayout(null);

        DescriptionTextPanelFourteen.setEditable(false);
        jScrollPaneFourteen.setViewportView(DescriptionTextPanelFourteen);

        javax.swing.GroupLayout EventPane14Layout = new javax.swing.GroupLayout(EventPane14);
        EventPane14.setLayout(EventPane14Layout);
        EventPane14Layout.setHorizontalGroup(
            EventPane14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPane14Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(EventTitlePanelFourteen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(EventPane14Layout.createSequentialGroup()
                .addComponent(SeperatorPaneFourteen, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(EventPane14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventPane14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneFourteen, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(ImageFrameFourteen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EventPane14Layout.setVerticalGroup(
            EventPane14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPane14Layout.createSequentialGroup()
                .addComponent(EventTitlePanelFourteen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(SeperatorPaneFourteen, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ImageFrameFourteen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneFourteen, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(EventPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 1286, 191, -1));

        EventPane15.setBackground(new java.awt.Color(153, 153, 153));
        EventPane15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

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

        ImageFrameFifteen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ImageFrameFifteen.setOpaque(false);

        javax.swing.GroupLayout ImageFrameFifteenLayout = new javax.swing.GroupLayout(ImageFrameFifteen);
        ImageFrameFifteen.setLayout(ImageFrameFifteenLayout);
        ImageFrameFifteenLayout.setHorizontalGroup(
            ImageFrameFifteenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ImageFrameFifteenLayout.setVerticalGroup(
            ImageFrameFifteenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );

        SeperatorPaneFifteen.setLayout(null);

        DescriptionTextPanelFifteen.setEditable(false);
        jScrollPaneFifteen.setViewportView(DescriptionTextPanelFifteen);

        javax.swing.GroupLayout EventPane15Layout = new javax.swing.GroupLayout(EventPane15);
        EventPane15.setLayout(EventPane15Layout);
        EventPane15Layout.setHorizontalGroup(
            EventPane15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPane15Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(EventTitlePanelFifteen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(EventPane15Layout.createSequentialGroup()
                .addComponent(SeperatorPaneFifteen, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(EventPane15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventPane15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneFifteen, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(ImageFrameFifteen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EventPane15Layout.setVerticalGroup(
            EventPane15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPane15Layout.createSequentialGroup()
                .addComponent(EventTitlePanelFifteen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(SeperatorPaneFifteen, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ImageFrameFifteen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneFifteen, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(EventPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 1286, 191, -1));

        EventPane16.setBackground(new java.awt.Color(153, 153, 153));
        EventPane16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

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

        ImageFrameSixteen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ImageFrameSixteen.setOpaque(false);

        javax.swing.GroupLayout ImageFrameSixteenLayout = new javax.swing.GroupLayout(ImageFrameSixteen);
        ImageFrameSixteen.setLayout(ImageFrameSixteenLayout);
        ImageFrameSixteenLayout.setHorizontalGroup(
            ImageFrameSixteenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ImageFrameSixteenLayout.setVerticalGroup(
            ImageFrameSixteenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );

        SeperatorPaneSixteen.setLayout(null);

        DescriptionTextPanelSixteen.setEditable(false);
        jScrollPaneSixteen.setViewportView(DescriptionTextPanelSixteen);

        javax.swing.GroupLayout EventPane16Layout = new javax.swing.GroupLayout(EventPane16);
        EventPane16.setLayout(EventPane16Layout);
        EventPane16Layout.setHorizontalGroup(
            EventPane16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPane16Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(EventTitlePanelSixteen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(EventPane16Layout.createSequentialGroup()
                .addComponent(SeperatorPaneSixteen, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(EventPane16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventPane16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneSixteen, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(ImageFrameSixteen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EventPane16Layout.setVerticalGroup(
            EventPane16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPane16Layout.createSequentialGroup()
                .addComponent(EventTitlePanelSixteen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(SeperatorPaneSixteen, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ImageFrameSixteen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneSixteen, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(EventPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 1286, 191, -1));

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
    private javax.swing.JPanel ImageFrameEight;
    private javax.swing.JPanel ImageFrameEleven;
    private javax.swing.JPanel ImageFrameFifteen;
    private javax.swing.JPanel ImageFrameFive;
    private javax.swing.JPanel ImageFrameFour;
    private javax.swing.JPanel ImageFrameFourteen;
    private javax.swing.JPanel ImageFrameNine;
    private javax.swing.JPanel ImageFrameOne;
    private javax.swing.JPanel ImageFrameSeven;
    private javax.swing.JPanel ImageFrameSix;
    private javax.swing.JPanel ImageFrameSixteen;
    private javax.swing.JPanel ImageFrameTen;
    private javax.swing.JPanel ImageFrameThirteen;
    private javax.swing.JPanel ImageFrameThree;
    private javax.swing.JPanel ImageFrameTwelve;
    private javax.swing.JPanel ImageFrameTwo;
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
