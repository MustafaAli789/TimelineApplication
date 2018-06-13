/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TimelineApplication;

import static TimelineApplication.ChangeColour.Event1;
import static TimelineApplication.ChangeColour.Event2;
import static TimelineApplication.ChangeColour.checkBoxList;
import static TimelineApplication.ChangeColour.clickcounter1;
import static TimelineApplication.ChangeColour.clickcounter10;
import static TimelineApplication.ChangeColour.clickcounter11;
import static TimelineApplication.ChangeColour.clickcounter12;
import static TimelineApplication.ChangeColour.clickcounter13;
import static TimelineApplication.ChangeColour.clickcounter14;
import static TimelineApplication.ChangeColour.clickcounter15;
import static TimelineApplication.ChangeColour.clickcounter16;
import static TimelineApplication.ChangeColour.clickcounter17;
import static TimelineApplication.ChangeColour.clickcounter18;
import static TimelineApplication.ChangeColour.clickcounter19;
import static TimelineApplication.ChangeColour.clickcounter2;
import static TimelineApplication.ChangeColour.clickcounter20;
import static TimelineApplication.ChangeColour.clickcounter3;
import static TimelineApplication.ChangeColour.clickcounter4;
import static TimelineApplication.ChangeColour.clickcounter5;
import static TimelineApplication.ChangeColour.clickcounter6;
import static TimelineApplication.ChangeColour.clickcounter7;
import static TimelineApplication.ChangeColour.clickcounter8;
import static TimelineApplication.ChangeColour.clickcounter9;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import static TimelineApplication.TitleEditForm.title;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JColorChooser;


public class Maintimeline extends javax.swing.JFrame {

    public static boolean addBtnClicked = false;
    public static boolean deleteBtnClicked = false;
    public static boolean editBtnClicked = false;
    public static boolean colorBtnClicked = false;
    public static boolean EditTitleBtnClicked = false;
    public static String Title;
    public static int numOfEvents;
    public static ArrayList<ArrayList<JLabel>> eventTitleDateImageNames = new ArrayList<ArrayList<JLabel>>();
    public static ArrayList<JTextPane> eventDescriptionNames = new ArrayList<JTextPane>();
    public static ArrayList<JPanel> eventPaneNames = new ArrayList<JPanel>();
    public static ArrayList<JLabel> arrowNames = new ArrayList<JLabel>();
    public static ArrayList<JPanel> eventTitlePanelNames = new ArrayList<JPanel>();
    public static File eventInformationFile = new File("src/TimelineApplication/eventsInformation.txt"); 
    public static ArrayList<ArrayList<String>> eventInformationList = new ArrayList<>(); //2d list of all event info
    
     
    
    public Maintimeline() {
        initComponents();  
                
        //The array below will store all event title variable names and event date variable names as well as event image variable names for later use
        JLabel array1[][]={{EventTitleLabelOne, DateTextLabelOne, EventImage1},{EventTitleLabelTwo, DateTextLabelTwo, EventImage2},{EventTitleLabelThree, DateTextLabelThree, EventImage3}, 
        {EventTitleLabelFour, DateTextLabelFour, EventImage4}, {EventTitleLabelFive, DateTextLabelFive, EventImage5}, {EventTitleLabelSix, DateTextLabelSix, EventImage6}, {EventTitleLabelSeven, DateTextLabelSeven, EventImage7}, 
        {EventTitleLabelEight, DateTextLabelEight, EventImage8}, {EventTitleLabelNine, DateTextLabelNine, EventImage9},{EventTitleLabelTen, DateTextLabelTen, EventImage10}, {EventTitleLabelEleven, DateTextLabelEleven, EventImage11}, 
        {EventTitleLabelTwelve, DateTextLabelTwelve, EventImage12}, {EventTitleLabelThirteen, DateTextLabelThirteen, EventImage13}, {EventTitleLabelFourteen, DateTextLabelFourteen, EventImage14}, 
        {EventTitleLabelFifteen, DateTextLabelFifteen, EventImage15},{EventTitleLabelSixteen, DateTextLabelSixteen, EventImage16},{EventTitleLabelSeventeen, DateTextLabelSeventeen, EventImage17},{EventTitleLabelEighteen, DateTextLabelEighteen, EventImage18},
        {EventTitleLabelNinteen, DateTextLabelNinteen, EventImage19},{EventTitleLabelTwenty, DateTextLabelTwenty, EventImage20}};

       
        //The array below will store all event description variable names for later use
        JTextPane array2[]={DescriptionTextPanelOne,DescriptionTextPanelTwo, DescriptionTextPanelThree, DescriptionTextPanelFour, DescriptionTextPanelFive,
        DescriptionTextPanelSix, DescriptionTextPanelSeven, DescriptionTextPanelEight, DescriptionTextPanelNine, DescriptionTextPanelTen, DescriptionTextPanelEleven, 
        DescriptionTextPanelTwelve, DescriptionTextPanelThirteen, DescriptionTextPanelFourteen, DescriptionTextPanelFifteen, DescriptionTextPanelSixteen,DescriptionTextPanelSeventeen,
        DescriptionTextPanelEighteen,DescriptionTextPanelNinteen,DescriptionTextPanelTwenty};
        
        //The array below will store all event pane variable names for later use
        JPanel array3[]={EventPane1, EventPane2, EventPane3, EventPane4, EventPane5, EventPane6, EventPane7, EventPane8, EventPane9, EventPane10, EventPane11, EventPane12,
        EventPane13, EventPane14, EventPane15, EventPane16, EventPane17,EventPane18,EventPane19,EventPane20};
        
        //The array below will store all arrow variable names for later use
        JLabel array4[]={Arrow1, Arrow2, Arrow3, Arrow4, Arrow5, Arrow6, Arrow7, Arrow8, Arrow9, Arrow10, Arrow11, Arrow12, Arrow13, Arrow14, Arrow15,Arrow16,Arrow17,Arrow18,Arrow19};
        
        //The array below will store all event title panel variable names for later use
        JPanel array5[]={EventTitlePanelOne, EventTitlePanelTwo,EventTitlePanelThree,EventTitlePanelFour,EventTitlePanelFive,EventTitlePanelSix,EventTitlePanelSeven,EventTitlePanelEight,EventTitlePanelNine,EventTitlePanelTen,EventTitlePanelEleven,EventTitlePanelTwelve,EventTitlePanelThirteen,EventTitlePanelFourteen,EventTitlePanelFifteen,EventTitlePanelSixteen,EventTitlePanelSeventeen,EventTitlePanelEighteen,EventTitlePanelNinteen,EventTitlePanelTwenty};
        
        putVariableNamesIntoList(array1, array2, array3, array4, array5); 
        setNumOfEvents(); //Initally gets number of events when screen loads
        readFileContentsToList(); //Reads file and puts info into eventInfo list
        title = eventInformationList.get(0).get(0);
        
        //Initializing screen
        updateScreen(numOfEvents);

    }
   
    
    public static void putVariableNamesIntoList(JLabel[][] array1, JTextPane[] array2, JPanel[] array3, JLabel[] array4, JPanel[] array5){
        
        //The code below puts the var names in the first array defined above (array1) into an arraylist --> this is necessary b/c the arrays defined above cannot be accessed anywhere
        //else but the "copies" of them made here can be accessed elsewhere
        
        for(JLabel[] event : array1){
            ArrayList<JLabel> currentSubList = new ArrayList<>();
            Collections.addAll(currentSubList, event);
            eventTitleDateImageNames.add(currentSubList);
        }
        
        //Putting array2 information into eventDescriptionNames list
        Collections.addAll(eventDescriptionNames, array2);
        
        //Putting array3 information into eventPaneNames list
        Collections.addAll(eventPaneNames, array3);
               
        
        //Putting array4 information into arrowNames list
        Collections.addAll(arrowNames, array4);  
        
        //Putting array5 information into arrowNames list
        Collections.addAll(eventTitlePanelNames, array5);
        
    }
          
    public static void setEventPaneVisibility(JPanel eventPaneName, boolean visibilityState){
        eventPaneName.setVisible(visibilityState);
    }
    
    public static void setArrowVisibility (JLabel arrowName, boolean visibilityState){
        arrowName.setVisible(visibilityState);
    }
    
    public static void setImage(JLabel eventImage, String link, int eventNum){
        Image originalImage = null;
        try{
            URL url = new URL(link);
            try {
                originalImage = ImageIO.read(url);
                Image scaledImage = originalImage.getScaledInstance(172, 150, Image.SCALE_DEFAULT); //this scaled the image to fit into container
                eventImage.setIcon(new ImageIcon(scaledImage)); //eventImage refers to the jLabel being  referenced
            } catch (IOException ex) {
                String error = "The URL for the " + eventInformationList.get(eventNum).get(0) + " image is wrong.";
                JOptionPane.showMessageDialog(null, error);
            }
        }
        catch(MalformedURLException e){
            String error = "The URL for " + eventInformationList.get(eventNum).get(0) + " does not exist.";
            JOptionPane.showMessageDialog(null, error);
        }
    }
    
    //This method can be called any time an event is added, deleted or edited (unless no shift required, then simply call setEventInfo) to 
    //put the text and image into the event screen as well as update which events are visible and which arrows are visible
    public static void updateScreen (int numOfEvents){
                       
        //The function below multiples the width of one row of events by the number of rows
        //and sets that as the width of the scrollable area
        int dynamicHeight = 425*((numOfEvents + 3)/4);        
        mainPanel.setPreferredSize(new Dimension(1048, dynamicHeight));

        
        //Setting title 
        timelineTitleLabel.setText(title);
                
        //Putting text and image into each visible event
        for(int i = 0; i< numOfEvents; i++){ 
            
            setEventInfo(eventTitleDateImageNames.get(i).get(0), eventTitleDateImageNames.get(i).get(1), eventDescriptionNames.get(i), eventTitleDateImageNames.get(i).get(2), i, eventTitlePanelNames.get(i),eventPaneNames.get(i));
            
        }
        
        //Setting all events to non visible
        for(JPanel eventName : eventPaneNames){
            setEventPaneVisibility(eventName, false);
 
        }  
        
        //Setting all arrows to non visible 
        for (JLabel arrowName : arrowNames){
            setArrowVisibility(arrowName, false);
        }
        
        //Setting appropriate events and arrows back to visible
        for (int i = 0; i <numOfEvents; i++){
            setEventPaneVisibility(eventPaneNames.get(i), true);
            
            if(i>0){
                setArrowVisibility(arrowNames.get(i-1), true);
            }
            

        } 
    }
        
    public static void setEventInfo(JLabel title, JLabel date, JTextPane description, JLabel eventImage, int eventNum, JPanel coloured1, JPanel coloured2){

        eventNum+=1; //add 1 to take into account that title is first sublist
        
        title.setText(eventInformationList.get(eventNum).get(0)); //0th index is title
        date.setText(eventInformationList.get(eventNum).get(1)); //1sr index is date
        description.setText(eventInformationList.get(eventNum).get(2)); //2nd index is description
        
        if(!eventInformationList.get(eventNum).get(3).isEmpty()){ //3rd index is URL
            setImage(eventImage, eventInformationList.get(eventNum).get(3), eventNum);
        }
        else{ //if no URL provided, just put white box instead
            setImage(eventImage, "https://vignette.wikia.nocookie.net/uncyclopedia/images/4/44/White_square.png/revision/latest?cb=20061003200043", eventNum);
        }
        int index1 = Integer.parseInt(eventInformationList.get(eventNum).get(4));
        int index2 = Integer.parseInt(eventInformationList.get(eventNum).get(5));
        int index3 = Integer.parseInt(eventInformationList.get(eventNum).get(6));        
        Color color = new Color (index1, index2,index3);
        coloured2.setBackground(color);
        coloured1.setBackground(color);
    }
    
    public static void setNumOfEvents(){
        if(eventInformationFile.exists()){
            Scanner sc1;
            try {
                sc1 = new Scanner(eventInformationFile);
                numOfEvents = Integer.parseInt(sc1.nextLine());
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Maintimeline.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void readFileContentsToList(){        
        //Add 17 sublists to main list, 1 for title and 16 for events
        for(int i = 0; i<21; i++){
            eventInformationList.add(new ArrayList<String>());
        }
        
        if(eventInformationFile.exists()){
            try {   
                Scanner sc2 = new Scanner(eventInformationFile);
                sc2.nextLine(); //skipping first line as its number of events
                eventInformationList.get(0).add(sc2.nextLine()); //adding title to first index
                
                //Put even information into the 2d list (i starts at 1 b/c index 0 is title)
                for(int i = 0; i <numOfEvents; i++){ 
                    for (int j = 0; j<7; j++){;
                        eventInformationList.get(i+1).add(sc2.nextLine()); //i + 1 to take into account title being first sublist
                        
                    }
                }
                
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error for some reason!");
            }
        }
        else{
            try {
                eventInformationFile.createNewFile();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Attemped to create new database but path to file could not be found.");
            }
        }
        
    }
      
    public static void SaveToFile(){
        try{
            Writer fileWriter;
            fileWriter = new BufferedWriter(new FileWriter(eventInformationFile, false));
            fileWriter.write(Integer.toString(numOfEvents)); //Writing the num of events as first line
            fileWriter.write("\n");  
            fileWriter.write(eventInformationList.get(0).get(0)); //writing title name as second line
            fileWriter.write("\n");            
            for(int i = 0; i <numOfEvents; i++){ //writing event information starting on third line
                for (int j = 0; j<7; j++){
                    fileWriter.write(eventInformationList.get(i+1).get(j));
                    fileWriter.write("\n");
                }
            }
            JOptionPane.showMessageDialog(null, "Timeline has been saved!");
            fileWriter.close();
            updateScreen(numOfEvents);
        }
        catch (FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Cannot find the file.");
            }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error when trying to extract file.");
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
        titlePanel = new javax.swing.JPanel();
        timelineTitleLabel = new javax.swing.JLabel();
        EditTitleBtn = new javax.swing.JButton();
        ScrollableAreaPane = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();
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
        EventPane17 = new javax.swing.JPanel();
        EventTitlePanelSeventeen = new javax.swing.JPanel();
        EventTitleLabelSeventeen = new javax.swing.JLabel();
        DateTextLabelSeventeen = new javax.swing.JLabel();
        SeperatorPaneSeventeen = new javax.swing.JPanel();
        jScrollPaneSeventeen = new javax.swing.JScrollPane();
        DescriptionTextPanelSeventeen = new javax.swing.JTextPane();
        EventImage17 = new javax.swing.JLabel();
        EventPane18 = new javax.swing.JPanel();
        EventTitlePanelEighteen = new javax.swing.JPanel();
        EventTitleLabelEighteen = new javax.swing.JLabel();
        DateTextLabelEighteen = new javax.swing.JLabel();
        SeperatorPaneEighteen = new javax.swing.JPanel();
        jScrollPaneEighteen = new javax.swing.JScrollPane();
        DescriptionTextPanelEighteen = new javax.swing.JTextPane();
        EventImage18 = new javax.swing.JLabel();
        EventPane19 = new javax.swing.JPanel();
        EventTitlePanelNinteen = new javax.swing.JPanel();
        EventTitleLabelNinteen = new javax.swing.JLabel();
        DateTextLabelNinteen = new javax.swing.JLabel();
        SeperatorPaneNinteen = new javax.swing.JPanel();
        jScrollPaneNinteen = new javax.swing.JScrollPane();
        DescriptionTextPanelNinteen = new javax.swing.JTextPane();
        EventImage19 = new javax.swing.JLabel();
        EventPane20 = new javax.swing.JPanel();
        EventTitlePanelTwenty = new javax.swing.JPanel();
        EventTitleLabelTwenty = new javax.swing.JLabel();
        DateTextLabelTwenty = new javax.swing.JLabel();
        SeperatorPaneTwenty = new javax.swing.JPanel();
        jScrollPaneTwenty = new javax.swing.JScrollPane();
        DescriptionTextPanelTwenty = new javax.swing.JTextPane();
        EventImage20 = new javax.swing.JLabel();
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
        Arrow12 = new javax.swing.JLabel();
        Arrow13 = new javax.swing.JLabel();
        Arrow14 = new javax.swing.JLabel();
        Arrow15 = new javax.swing.JLabel();
        Arrow16 = new javax.swing.JLabel();
        Arrow17 = new javax.swing.JLabel();
        Arrow18 = new javax.swing.JLabel();
        Arrow19 = new javax.swing.JLabel();
        DeleteBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        ChangeColourBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 204));
        setMinimumSize(new java.awt.Dimension(1176, 720));
        setPreferredSize(new java.awt.Dimension(1176, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titlePanel.setBackground(new java.awt.Color(153, 204, 255));
        titlePanel.setOpaque(false);

        timelineTitleLabel.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 36)); // NOI18N
        timelineTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timelineTitleLabel.setText("TIMELINE TITLE HERE");
        timelineTitleLabel.setAutoscrolls(true);
        timelineTitleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        timelineTitleLabel.setIconTextGap(0);
        timelineTitleLabel.setMaximumSize(new java.awt.Dimension(1000, 41));
        timelineTitleLabel.setMinimumSize(new java.awt.Dimension(0, 41));
        timelineTitleLabel.setRequestFocusEnabled(false);
        titlePanel.add(timelineTitleLabel);

        EditTitleBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/titleEditBtnNonHover.png"))); // NOI18N
        EditTitleBtn.setBorderPainted(false);
        EditTitleBtn.setContentAreaFilled(false);
        EditTitleBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EditTitleBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/titleEditBtnHover.png"))); // NOI18N
        EditTitleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditTitleBtnActionPerformed(evt);
            }
        });
        titlePanel.add(EditTitleBtn);

        getContentPane().add(titlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1130, 50));

        ScrollableAreaPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollableAreaPane.setMinimumSize(new java.awt.Dimension(27, 425));
        ScrollableAreaPane.setPreferredSize(new java.awt.Dimension(1086, 425));

        mainPanel.setBackground(new java.awt.Color(255, 210, 104));
        mainPanel.setToolTipText("");
        mainPanel.setInheritsPopupMenu(true);
        mainPanel.setMinimumSize(new java.awt.Dimension(1084, 425));
        mainPanel.setPreferredSize(new java.awt.Dimension(1084, 425));
        mainPanel.setRequestFocusEnabled(false);
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EventPane1.setBackground(new java.awt.Color(153, 153, 153));
        EventPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        EventPane1.setForeground(new java.awt.Color(255, 0, 0));
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

        mainPanel.add(EventPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 40, 191, 375));

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

        mainPanel.add(EventPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 41, 191, 375));

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

        EventImage3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EventImage3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EventPane3.add(EventImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 172, 150));

        mainPanel.add(EventPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 41, 193, 377));

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

        EventImage4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EventImage4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EventPane4.add(EventImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 172, 150));

        mainPanel.add(EventPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 41, 190, 375));

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
                        .addGap(0, 2, Short.MAX_VALUE)))
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

        EventImage5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EventImage5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EventPane5.add(EventImage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 172, 160));

        mainPanel.add(EventPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 456, 191, 375));

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
                        .addGap(0, 2, Short.MAX_VALUE)))
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

        EventImage6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EventImage6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EventPane6.add(EventImage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 172, 160));

        mainPanel.add(EventPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 456, 191, 375));

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
                        .addGap(0, 2, Short.MAX_VALUE)))
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

        EventImage7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EventImage7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EventPane7.add(EventImage7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 172, 160));

        mainPanel.add(EventPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 460, 191, 375));

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
                        .addGap(0, 2, Short.MAX_VALUE)))
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

        EventImage8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EventImage8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EventPane8.add(EventImage8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 80, 170, 160));

        mainPanel.add(EventPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(893, 456, 191, 375));

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
                        .addGap(0, 2, Short.MAX_VALUE)))
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

        EventImage9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EventImage9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EventPane9.add(EventImage9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 172, 160));

        mainPanel.add(EventPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(893, 871, 191, 375));

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
                        .addGap(0, 2, Short.MAX_VALUE)))
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

        EventImage10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EventImage10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EventPane10.add(EventImage10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 172, 160));

        mainPanel.add(EventPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 871, 191, 375));

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
                        .addGap(0, 2, Short.MAX_VALUE)))
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

        EventImage11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EventImage11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EventPane11.add(EventImage11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 172, 160));

        mainPanel.add(EventPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 871, 191, 375));

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
                        .addGap(0, 2, Short.MAX_VALUE)))
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

        EventImage12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EventImage12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EventPane12.add(EventImage12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 172, 160));

        mainPanel.add(EventPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 871, 191, 375));

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
                        .addGap(0, 2, Short.MAX_VALUE)))
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

        EventImage13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EventImage13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EventPane13.add(EventImage13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 172, 160));

        mainPanel.add(EventPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 1290, 191, 375));

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
                        .addGap(0, 2, Short.MAX_VALUE)))
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

        EventImage14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EventImage14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EventPane14.add(EventImage14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 172, 160));

        mainPanel.add(EventPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 1286, 191, 375));

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
                        .addGap(0, 2, Short.MAX_VALUE)))
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

        EventImage15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EventImage15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EventPane15.add(EventImage15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 172, 160));

        mainPanel.add(EventPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 1290, 191, 375));

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
                        .addGap(0, 2, Short.MAX_VALUE)))
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

        EventPane16.add(jScrollPaneSixteen, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 249, 180, 120));

        EventImage16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EventImage16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EventPane16.add(EventImage16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 172, 160));

        mainPanel.add(EventPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 1290, 191, 375));

        EventPane17.setBackground(new java.awt.Color(153, 153, 153));
        EventPane17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        EventPane17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EventTitlePanelSeventeen.setBackground(new java.awt.Color(0, 0, 0));

        EventTitleLabelSeventeen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EventTitleLabelSeventeen.setForeground(new java.awt.Color(255, 255, 255));
        EventTitleLabelSeventeen.setText("jLabel1");

        DateTextLabelSeventeen.setForeground(new java.awt.Color(255, 255, 255));
        DateTextLabelSeventeen.setText("jLabel1");

        javax.swing.GroupLayout EventTitlePanelSeventeenLayout = new javax.swing.GroupLayout(EventTitlePanelSeventeen);
        EventTitlePanelSeventeen.setLayout(EventTitlePanelSeventeenLayout);
        EventTitlePanelSeventeenLayout.setHorizontalGroup(
            EventTitlePanelSeventeenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelSeventeenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventTitlePanelSeventeenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EventTitleLabelSeventeen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(EventTitlePanelSeventeenLayout.createSequentialGroup()
                        .addComponent(DateTextLabelSeventeen, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );
        EventTitlePanelSeventeenLayout.setVerticalGroup(
            EventTitlePanelSeventeenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelSeventeenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EventTitleLabelSeventeen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateTextLabelSeventeen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EventPane17.add(EventTitlePanelSeventeen, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 1, 279, 60));

        SeperatorPaneSeventeen.setLayout(null);
        EventPane17.add(SeperatorPaneSeventeen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 280, 12));

        DescriptionTextPanelSeventeen.setEditable(false);
        jScrollPaneSeventeen.setViewportView(DescriptionTextPanelSeventeen);

        EventPane17.add(jScrollPaneSeventeen, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 249, 180, 120));

        EventImage17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EventImage17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EventPane17.add(EventImage17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 172, 160));

        mainPanel.add(EventPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 1720, 191, 375));

        EventPane18.setBackground(new java.awt.Color(153, 153, 153));
        EventPane18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        EventPane18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EventTitlePanelEighteen.setBackground(new java.awt.Color(0, 0, 0));

        EventTitleLabelEighteen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EventTitleLabelEighteen.setForeground(new java.awt.Color(255, 255, 255));
        EventTitleLabelEighteen.setText("jLabel1");

        DateTextLabelEighteen.setForeground(new java.awt.Color(255, 255, 255));
        DateTextLabelEighteen.setText("jLabel1");

        javax.swing.GroupLayout EventTitlePanelEighteenLayout = new javax.swing.GroupLayout(EventTitlePanelEighteen);
        EventTitlePanelEighteen.setLayout(EventTitlePanelEighteenLayout);
        EventTitlePanelEighteenLayout.setHorizontalGroup(
            EventTitlePanelEighteenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelEighteenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventTitlePanelEighteenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EventTitleLabelEighteen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(EventTitlePanelEighteenLayout.createSequentialGroup()
                        .addComponent(DateTextLabelEighteen, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );
        EventTitlePanelEighteenLayout.setVerticalGroup(
            EventTitlePanelEighteenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelEighteenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EventTitleLabelEighteen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateTextLabelEighteen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EventPane18.add(EventTitlePanelEighteen, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 1, 279, 60));

        SeperatorPaneEighteen.setLayout(null);
        EventPane18.add(SeperatorPaneEighteen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 280, 12));

        DescriptionTextPanelEighteen.setEditable(false);
        jScrollPaneEighteen.setViewportView(DescriptionTextPanelEighteen);

        EventPane18.add(jScrollPaneEighteen, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 249, 180, 120));

        EventImage18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EventImage18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EventPane18.add(EventImage18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 172, 160));

        mainPanel.add(EventPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 1720, 191, 375));

        EventPane19.setBackground(new java.awt.Color(153, 153, 153));
        EventPane19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        EventPane19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EventTitlePanelNinteen.setBackground(new java.awt.Color(0, 0, 0));

        EventTitleLabelNinteen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EventTitleLabelNinteen.setForeground(new java.awt.Color(255, 255, 255));
        EventTitleLabelNinteen.setText("jLabel1");

        DateTextLabelNinteen.setForeground(new java.awt.Color(255, 255, 255));
        DateTextLabelNinteen.setText("jLabel1");

        javax.swing.GroupLayout EventTitlePanelNinteenLayout = new javax.swing.GroupLayout(EventTitlePanelNinteen);
        EventTitlePanelNinteen.setLayout(EventTitlePanelNinteenLayout);
        EventTitlePanelNinteenLayout.setHorizontalGroup(
            EventTitlePanelNinteenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelNinteenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventTitlePanelNinteenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EventTitleLabelNinteen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(EventTitlePanelNinteenLayout.createSequentialGroup()
                        .addComponent(DateTextLabelNinteen, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );
        EventTitlePanelNinteenLayout.setVerticalGroup(
            EventTitlePanelNinteenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelNinteenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EventTitleLabelNinteen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateTextLabelNinteen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EventPane19.add(EventTitlePanelNinteen, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 1, 279, 60));

        SeperatorPaneNinteen.setLayout(null);
        EventPane19.add(SeperatorPaneNinteen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 280, 12));

        DescriptionTextPanelNinteen.setEditable(false);
        jScrollPaneNinteen.setViewportView(DescriptionTextPanelNinteen);

        EventPane19.add(jScrollPaneNinteen, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 249, 180, 120));

        EventImage19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EventImage19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EventPane19.add(EventImage19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 172, 160));

        mainPanel.add(EventPane19, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 1720, 191, 375));

        EventPane20.setBackground(new java.awt.Color(153, 153, 153));
        EventPane20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        EventPane20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EventTitlePanelTwenty.setBackground(new java.awt.Color(0, 0, 0));

        EventTitleLabelTwenty.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EventTitleLabelTwenty.setForeground(new java.awt.Color(255, 255, 255));
        EventTitleLabelTwenty.setText("jLabel1");

        DateTextLabelTwenty.setForeground(new java.awt.Color(255, 255, 255));
        DateTextLabelTwenty.setText("jLabel1");

        javax.swing.GroupLayout EventTitlePanelTwentyLayout = new javax.swing.GroupLayout(EventTitlePanelTwenty);
        EventTitlePanelTwenty.setLayout(EventTitlePanelTwentyLayout);
        EventTitlePanelTwentyLayout.setHorizontalGroup(
            EventTitlePanelTwentyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelTwentyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventTitlePanelTwentyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EventTitleLabelTwenty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(EventTitlePanelTwentyLayout.createSequentialGroup()
                        .addComponent(DateTextLabelTwenty, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );
        EventTitlePanelTwentyLayout.setVerticalGroup(
            EventTitlePanelTwentyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelTwentyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EventTitleLabelTwenty)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateTextLabelTwenty)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EventPane20.add(EventTitlePanelTwenty, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 1, 279, 60));

        SeperatorPaneTwenty.setLayout(null);
        EventPane20.add(SeperatorPaneTwenty, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 280, 12));

        DescriptionTextPanelTwenty.setEditable(false);
        jScrollPaneTwenty.setViewportView(DescriptionTextPanelTwenty);

        EventPane20.add(jScrollPaneTwenty, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 249, 180, 120));

        EventImage20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EventImage20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EventPane20.add(EventImage20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 172, 160));

        mainPanel.add(EventPane20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 1720, 191, 375));

        Arrow1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/arrow.png"))); // NOI18N
        mainPanel.add(Arrow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 220, -1, -1));

        Arrow2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/arrow.png"))); // NOI18N
        mainPanel.add(Arrow2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, -1, -1));

        Arrow3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/arrow.png"))); // NOI18N
        mainPanel.add(Arrow3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 192, 40, 60));

        Arrow4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/down arrow.png"))); // NOI18N
        mainPanel.add(Arrow4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, -1, -1));

        Arrow5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/arrow to right.png"))); // NOI18N
        mainPanel.add(Arrow5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 630, -1, -1));

        Arrow6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/arrow to right.png"))); // NOI18N
        mainPanel.add(Arrow6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 630, -1, -1));

        Arrow7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/arrow to right.png"))); // NOI18N
        mainPanel.add(Arrow7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 630, -1, -1));

        Arrow8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/down arrow.png"))); // NOI18N
        mainPanel.add(Arrow8, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 840, -1, -1));

        Arrow9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/arrow.png"))); // NOI18N
        mainPanel.add(Arrow9, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 1040, -1, -1));

        Arrow10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/arrow.png"))); // NOI18N
        mainPanel.add(Arrow10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 1040, -1, -1));

        Arrow11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/arrow.png"))); // NOI18N
        mainPanel.add(Arrow11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 1040, -1, -1));

        Arrow12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/down arrow.png"))); // NOI18N
        mainPanel.add(Arrow12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 1250, -1, -1));

        Arrow13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/arrow to right.png"))); // NOI18N
        mainPanel.add(Arrow13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 1470, -1, -1));

        Arrow14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/arrow to right.png"))); // NOI18N
        mainPanel.add(Arrow14, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 1470, -1, -1));

        Arrow15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/arrow to right.png"))); // NOI18N
        mainPanel.add(Arrow15, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 1470, -1, -1));

        Arrow16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/down arrow.png"))); // NOI18N
        mainPanel.add(Arrow16, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 1680, -1, -1));

        Arrow17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/arrow.png"))); // NOI18N
        mainPanel.add(Arrow17, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 1900, -1, -1));

        Arrow18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/arrow.png"))); // NOI18N
        mainPanel.add(Arrow18, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 1900, -1, -1));

        Arrow19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/arrow.png"))); // NOI18N
        mainPanel.add(Arrow19, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 1900, -1, -1));

        ScrollableAreaPane.setViewportView(mainPanel);

        getContentPane().add(ScrollableAreaPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 96, 1146, 486));

        DeleteBtn.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        DeleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/DeleteIconNonHover.png"))); // NOI18N
        DeleteBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DeleteBtn.setBorderPainted(false);
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
        getContentPane().add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 600, -1, -1));

        SaveBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SaveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/SaveIconNonHover.png"))); // NOI18N
        SaveBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SaveBtn.setBorderPainted(false);
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
        getContentPane().add(SaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 600, -1, -1));

        EditBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EditBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/EditIconNonHover.png"))); // NOI18N
        EditBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EditBtn.setBorderPainted(false);
        EditBtn.setContentAreaFilled(false);
        EditBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EditBtn.setMaximumSize(new java.awt.Dimension(73, 73));
        EditBtn.setMinimumSize(new java.awt.Dimension(73, 73));
        EditBtn.setPreferredSize(new java.awt.Dimension(73, 73));
        EditBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/EditIconHover.png"))); // NOI18N
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });
        getContentPane().add(EditBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 600, -1, -1));

        AddBtn.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        AddBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/AddIconNonHover.png"))); // NOI18N
        AddBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AddBtn.setBorderPainted(false);
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
        getContentPane().add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 600, -1, -1));

        ChangeColourBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/Change Colour Button Non Hover.png"))); // NOI18N
        ChangeColourBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChangeColourBtn.setBorderPainted(false);
        ChangeColourBtn.setContentAreaFilled(false);
        ChangeColourBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ChangeColourBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/Change Colour Button Hoverr.png"))); // NOI18N
        ChangeColourBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeColourBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ChangeColourBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 74, 73));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/Background.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1208, 705));
        jLabel1.setPreferredSize(new java.awt.Dimension(1208, 705));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 1210, 690));

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
        if(!deleteBtnClicked){
            DeleteEvent del_event = new DeleteEvent();
            del_event.setVisible(true);
        } 
        
        deleteBtnClicked = true;
        
        
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        SaveToFile();
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        
        if(!addBtnClicked){
            Addevent addEvent = new Addevent();
            addEvent.setVisible(true);
        }
                
        addBtnClicked = true;
        
    }//GEN-LAST:event_AddBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        if(!editBtnClicked){
            EditEventNum editEventNum = new EditEventNum();
            editEventNum.setVisible(true);
        }
        
        editBtnClicked = true;
        
    }//GEN-LAST:event_EditBtnActionPerformed

    private void EditTitleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditTitleBtnActionPerformed
        if(!EditTitleBtnClicked){           
            TitleEditForm editTimeline = new TitleEditForm();
            editTimeline.setVisible(true);
        }
        EditTitleBtnClicked = true; 
    }//GEN-LAST:event_EditTitleBtnActionPerformed

    private void ChangeColourBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeColourBtnActionPerformed
        if (!colorBtnClicked){
            ChangeColour colour = new ChangeColour();
            colour.setVisible(true);
            clickcounter1=0;
            clickcounter2=0;                    
            clickcounter3=0;
            clickcounter4=0;
            clickcounter5=0;
            clickcounter6=0;
            clickcounter7=0;
            clickcounter8=0;
            clickcounter9=0;
            clickcounter10=0;
            clickcounter11=0;
            clickcounter12=0;
            clickcounter13=0;
            clickcounter14=0;
            clickcounter15=0;
            clickcounter16=0;
            clickcounter17=0;
            clickcounter18=0;
            clickcounter19=0;
            clickcounter20=0;
        for (int i=0;i<numOfEvents;i++)    
            checkBoxList.get(i).setSelected(false);
        }
        
        colorBtnClicked=true; 
    }//GEN-LAST:event_ChangeColourBtnActionPerformed

    public static void setTheTitle (String a){
        timelineTitleLabel.setText(a);
    }
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
    public static javax.swing.JButton AddBtn;
    public static javax.swing.JLabel Arrow1;
    public static javax.swing.JLabel Arrow10;
    public static javax.swing.JLabel Arrow11;
    private javax.swing.JLabel Arrow12;
    public static javax.swing.JLabel Arrow13;
    public static javax.swing.JLabel Arrow14;
    public static javax.swing.JLabel Arrow15;
    private javax.swing.JLabel Arrow16;
    public static javax.swing.JLabel Arrow17;
    public static javax.swing.JLabel Arrow18;
    public static javax.swing.JLabel Arrow19;
    public static javax.swing.JLabel Arrow2;
    public static javax.swing.JLabel Arrow3;
    private javax.swing.JLabel Arrow4;
    public static javax.swing.JLabel Arrow5;
    public static javax.swing.JLabel Arrow6;
    public static javax.swing.JLabel Arrow7;
    private javax.swing.JLabel Arrow8;
    public static javax.swing.JLabel Arrow9;
    private javax.swing.JButton ChangeColourBtn;
    public static javax.swing.JLabel DateTextLabelEight;
    public static javax.swing.JLabel DateTextLabelEighteen;
    public static javax.swing.JLabel DateTextLabelEleven;
    public static javax.swing.JLabel DateTextLabelFifteen;
    public static javax.swing.JLabel DateTextLabelFive;
    private javax.swing.JLabel DateTextLabelFour;
    public static javax.swing.JLabel DateTextLabelFourteen;
    public static javax.swing.JLabel DateTextLabelNine;
    public static javax.swing.JLabel DateTextLabelNinteen;
    public static javax.swing.JLabel DateTextLabelOne;
    public static javax.swing.JLabel DateTextLabelSeven;
    public static javax.swing.JLabel DateTextLabelSeventeen;
    public static javax.swing.JLabel DateTextLabelSix;
    public static javax.swing.JLabel DateTextLabelSixteen;
    public static javax.swing.JLabel DateTextLabelTen;
    public static javax.swing.JLabel DateTextLabelThirteen;
    public static javax.swing.JLabel DateTextLabelThree;
    public static javax.swing.JLabel DateTextLabelTwelve;
    public static javax.swing.JLabel DateTextLabelTwenty;
    public static javax.swing.JLabel DateTextLabelTwo;
    public static javax.swing.JButton DeleteBtn;
    public static javax.swing.JTextPane DescriptionTextPanelEight;
    public static javax.swing.JTextPane DescriptionTextPanelEighteen;
    public static javax.swing.JTextPane DescriptionTextPanelEleven;
    public static javax.swing.JTextPane DescriptionTextPanelFifteen;
    public static javax.swing.JTextPane DescriptionTextPanelFive;
    public static javax.swing.JTextPane DescriptionTextPanelFour;
    public static javax.swing.JTextPane DescriptionTextPanelFourteen;
    public static javax.swing.JTextPane DescriptionTextPanelNine;
    public static javax.swing.JTextPane DescriptionTextPanelNinteen;
    public static javax.swing.JTextPane DescriptionTextPanelOne;
    public static javax.swing.JTextPane DescriptionTextPanelSeven;
    public static javax.swing.JTextPane DescriptionTextPanelSeventeen;
    public static javax.swing.JTextPane DescriptionTextPanelSix;
    public static javax.swing.JTextPane DescriptionTextPanelSixteen;
    public static javax.swing.JTextPane DescriptionTextPanelTen;
    public static javax.swing.JTextPane DescriptionTextPanelThirteen;
    public static javax.swing.JTextPane DescriptionTextPanelThree;
    public static javax.swing.JTextPane DescriptionTextPanelTwelve;
    public static javax.swing.JTextPane DescriptionTextPanelTwenty;
    public static javax.swing.JTextPane DescriptionTextPanelTwo;
    public static javax.swing.JButton EditBtn;
    private javax.swing.JButton EditTitleBtn;
    public static javax.swing.JLabel EventImage1;
    public static javax.swing.JLabel EventImage10;
    public static javax.swing.JLabel EventImage11;
    public static javax.swing.JLabel EventImage12;
    public static javax.swing.JLabel EventImage13;
    public static javax.swing.JLabel EventImage14;
    public static javax.swing.JLabel EventImage15;
    public static javax.swing.JLabel EventImage16;
    public static javax.swing.JLabel EventImage17;
    public static javax.swing.JLabel EventImage18;
    public static javax.swing.JLabel EventImage19;
    public static javax.swing.JLabel EventImage2;
    public static javax.swing.JLabel EventImage20;
    public static javax.swing.JLabel EventImage3;
    private javax.swing.JLabel EventImage4;
    public static javax.swing.JLabel EventImage5;
    public static javax.swing.JLabel EventImage6;
    public static javax.swing.JLabel EventImage7;
    public static javax.swing.JLabel EventImage8;
    public static javax.swing.JLabel EventImage9;
    public static javax.swing.JPanel EventPane1;
    public static javax.swing.JPanel EventPane10;
    public static javax.swing.JPanel EventPane11;
    public static javax.swing.JPanel EventPane12;
    public static javax.swing.JPanel EventPane13;
    public static javax.swing.JPanel EventPane14;
    public static javax.swing.JPanel EventPane15;
    public static javax.swing.JPanel EventPane16;
    public static javax.swing.JPanel EventPane17;
    public static javax.swing.JPanel EventPane18;
    public static javax.swing.JPanel EventPane19;
    public static javax.swing.JPanel EventPane2;
    public static javax.swing.JPanel EventPane20;
    public static javax.swing.JPanel EventPane3;
    public static javax.swing.JPanel EventPane4;
    public static javax.swing.JPanel EventPane5;
    public static javax.swing.JPanel EventPane6;
    public static javax.swing.JPanel EventPane7;
    public static javax.swing.JPanel EventPane8;
    public static javax.swing.JPanel EventPane9;
    public static javax.swing.JLabel EventTitleLabelEight;
    public static javax.swing.JLabel EventTitleLabelEighteen;
    public static javax.swing.JLabel EventTitleLabelEleven;
    public static javax.swing.JLabel EventTitleLabelFifteen;
    public static javax.swing.JLabel EventTitleLabelFive;
    private javax.swing.JLabel EventTitleLabelFour;
    public static javax.swing.JLabel EventTitleLabelFourteen;
    public static javax.swing.JLabel EventTitleLabelNine;
    public static javax.swing.JLabel EventTitleLabelNinteen;
    public static javax.swing.JLabel EventTitleLabelOne;
    public static javax.swing.JLabel EventTitleLabelSeven;
    public static javax.swing.JLabel EventTitleLabelSeventeen;
    public static javax.swing.JLabel EventTitleLabelSix;
    public static javax.swing.JLabel EventTitleLabelSixteen;
    public static javax.swing.JLabel EventTitleLabelTen;
    public static javax.swing.JLabel EventTitleLabelThirteen;
    public static javax.swing.JLabel EventTitleLabelThree;
    public static javax.swing.JLabel EventTitleLabelTwelve;
    public static javax.swing.JLabel EventTitleLabelTwenty;
    public static javax.swing.JLabel EventTitleLabelTwo;
    public static javax.swing.JPanel EventTitlePanelEight;
    public static javax.swing.JPanel EventTitlePanelEighteen;
    public static javax.swing.JPanel EventTitlePanelEleven;
    public static javax.swing.JPanel EventTitlePanelFifteen;
    public static javax.swing.JPanel EventTitlePanelFive;
    public static javax.swing.JPanel EventTitlePanelFour;
    public static javax.swing.JPanel EventTitlePanelFourteen;
    public static javax.swing.JPanel EventTitlePanelNine;
    public static javax.swing.JPanel EventTitlePanelNinteen;
    public static javax.swing.JPanel EventTitlePanelOne;
    public static javax.swing.JPanel EventTitlePanelSeven;
    public static javax.swing.JPanel EventTitlePanelSeventeen;
    public static javax.swing.JPanel EventTitlePanelSix;
    public static javax.swing.JPanel EventTitlePanelSixteen;
    public static javax.swing.JPanel EventTitlePanelTen;
    public static javax.swing.JPanel EventTitlePanelThirteen;
    public static javax.swing.JPanel EventTitlePanelThree;
    public static javax.swing.JPanel EventTitlePanelTwelve;
    public static javax.swing.JPanel EventTitlePanelTwenty;
    public static javax.swing.JPanel EventTitlePanelTwo;
    public static javax.swing.JButton SaveBtn;
    public static javax.swing.JScrollPane ScrollableAreaPane;
    private javax.swing.JPanel SeperatorPaneEight;
    private javax.swing.JPanel SeperatorPaneEighteen;
    private javax.swing.JPanel SeperatorPaneEleven;
    private javax.swing.JPanel SeperatorPaneFifteen;
    private javax.swing.JPanel SeperatorPaneFive;
    private javax.swing.JPanel SeperatorPaneFour;
    private javax.swing.JPanel SeperatorPaneFourteen;
    private javax.swing.JPanel SeperatorPaneNine;
    private javax.swing.JPanel SeperatorPaneNinteen;
    private javax.swing.JPanel SeperatorPaneOne;
    private javax.swing.JPanel SeperatorPaneSeven;
    private javax.swing.JPanel SeperatorPaneSeventeen;
    private javax.swing.JPanel SeperatorPaneSix;
    private javax.swing.JPanel SeperatorPaneSixteen;
    private javax.swing.JPanel SeperatorPaneTen;
    private javax.swing.JPanel SeperatorPaneThirteen;
    private javax.swing.JPanel SeperatorPaneThree;
    private javax.swing.JPanel SeperatorPaneTwelve;
    private javax.swing.JPanel SeperatorPaneTwenty;
    private javax.swing.JPanel SeperatorPaneTwo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPaneEight;
    private javax.swing.JScrollPane jScrollPaneEighteen;
    private javax.swing.JScrollPane jScrollPaneEleven;
    private javax.swing.JScrollPane jScrollPaneFifteen;
    private javax.swing.JScrollPane jScrollPaneFive;
    private javax.swing.JScrollPane jScrollPaneFour;
    private javax.swing.JScrollPane jScrollPaneFourteen;
    private javax.swing.JScrollPane jScrollPaneNine;
    private javax.swing.JScrollPane jScrollPaneNinteen;
    private javax.swing.JScrollPane jScrollPaneOne;
    private javax.swing.JScrollPane jScrollPaneSeven;
    private javax.swing.JScrollPane jScrollPaneSeventeen;
    private javax.swing.JScrollPane jScrollPaneSix;
    private javax.swing.JScrollPane jScrollPaneSixteen;
    private javax.swing.JScrollPane jScrollPaneTen;
    private javax.swing.JScrollPane jScrollPaneThirteen;
    private javax.swing.JScrollPane jScrollPaneThree;
    private javax.swing.JScrollPane jScrollPaneTwelve;
    private javax.swing.JScrollPane jScrollPaneTwenty;
    private javax.swing.JScrollPane jScrollPaneTwo;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JPanel mainPanel;
    public static javax.swing.JLabel timelineTitleLabel;
    public static javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}
