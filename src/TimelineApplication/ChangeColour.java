package TimelineApplication;


import static TimelineApplication.Maintimeline.eventInformationList;
import static TimelineApplication.Maintimeline.eventPaneNames;
import static TimelineApplication.Maintimeline.eventTitlePanelNames;
import static TimelineApplication.Maintimeline.numOfEvents;
import static TimelineApplication.Maintimeline.colorBtnClicked;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;

public class ChangeColour extends javax.swing.JFrame {

    public static ArrayList<JCheckBox> checkBoxList = new ArrayList<JCheckBox>();
    public static int clickcounter1 = 0;
    public static int clickcounter2 = 0;
    public static int clickcounter3 = 0;
    public static int clickcounter4 = 0;
    public static int clickcounter5 = 0;
    public static int clickcounter6 = 0;
    public static int clickcounter7 = 0;
    public static int clickcounter8 = 0;
    public static int clickcounter9 = 0;
    public static int clickcounter10 = 0;
    public static int clickcounter11 = 0;
    public static int clickcounter12 = 0;
    public static int clickcounter13 = 0;
    public static int clickcounter14 = 0;
    public static int clickcounter15 = 0;
    public static int clickcounter16 = 0;
    public static int clickcounter17 = 0;
    public static int clickcounter18 = 0;
    public static int clickcounter19 = 0;
    public static int clickcounter20 = 0;
    
    
    public ChangeColour() {
        initComponents();
        JCheckBox array6[]={jCheckBox1, Event2,Event3, Event4, Event5, Event6, Event7, Event8, Event9, Event10, Event11, Event12, Event13, Event14, Event15, Event16, Event17, Event18, Event19, Event20};
        int array7[]={clickcounter1, clickcounter2, clickcounter3, clickcounter4, clickcounter5, clickcounter6, clickcounter7, clickcounter8, clickcounter9, clickcounter10, clickcounter11, clickcounter12, clickcounter13, clickcounter14, clickcounter15, clickcounter16, clickcounter17, clickcounter18, clickcounter19, clickcounter20};
        for (int i =0; i<20;i++){
            array7[i]=0;    
        }
        for (int i =1; i<=numOfEvents;i++){
            array6[i-1].setText(eventInformationList.get(i).get(0));
            array6[i-1].setEnabled(true);
        }
         Collections.addAll(checkBoxList, array6);

        
    }
        
    public void updateColourToScreen(java.awt.Color selectedColor, String ColorR, String ColorG, String ColorB) {
        for (int j=1;j<=numOfEvents;j++){
            if(checkBoxList.get(j-1).isSelected()){
                eventPaneNames.get(j-1).setBackground(selectedColor);
                eventTitlePanelNames.get(j-1).setBackground(selectedColor);
                eventInformationList.get(j).remove(6);
                eventInformationList.get(j).remove(5);
                eventInformationList.get(j).remove(4);
                eventInformationList.get(j).add(4, ColorR);
                eventInformationList.get(j).add(5, ColorG);
                eventInformationList.get(j).add(6, ColorB);                
            } 
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Event2 = new javax.swing.JCheckBox();
        Event3 = new javax.swing.JCheckBox();
        Event4 = new javax.swing.JCheckBox();
        Event5 = new javax.swing.JCheckBox();
        Event6 = new javax.swing.JCheckBox();
        Event7 = new javax.swing.JCheckBox();
        Event8 = new javax.swing.JCheckBox();
        Event9 = new javax.swing.JCheckBox();
        Event10 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        Event11 = new javax.swing.JCheckBox();
        Event12 = new javax.swing.JCheckBox();
        Event13 = new javax.swing.JCheckBox();
        Event14 = new javax.swing.JCheckBox();
        Event15 = new javax.swing.JCheckBox();
        Event17 = new javax.swing.JCheckBox();
        Event18 = new javax.swing.JCheckBox();
        Event19 = new javax.swing.JCheckBox();
        Event20 = new javax.swing.JCheckBox();
        Event16 = new javax.swing.JCheckBox();
        setColourBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jLabel2.setText("Select Events To Change Colour");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Events", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Franklin Gothic Medium Cond", 0, 15))); // NOI18N
        jPanel2.setOpaque(false);

        Event2.setBackground(new java.awt.Color(0, 223, 223));
        Event2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 13)); // NOI18N
        Event2.setForeground(new java.awt.Color(0, 223, 223));
        Event2.setEnabled(false);
        Event2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Event2MouseReleased(evt);
            }
        });
        Event2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event2ActionPerformed(evt);
            }
        });

        Event3.setBackground(new java.awt.Color(0, 223, 223));
        Event3.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 13)); // NOI18N
        Event3.setForeground(new java.awt.Color(0, 223, 223));
        Event3.setEnabled(false);
        Event3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Event3MouseReleased(evt);
            }
        });
        Event3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event3ActionPerformed(evt);
            }
        });

        Event4.setBackground(new java.awt.Color(0, 223, 223));
        Event4.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 13)); // NOI18N
        Event4.setForeground(new java.awt.Color(0, 223, 223));
        Event4.setEnabled(false);
        Event4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Event4MouseReleased(evt);
            }
        });
        Event4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event4ActionPerformed(evt);
            }
        });

        Event5.setBackground(new java.awt.Color(0, 223, 223));
        Event5.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 13)); // NOI18N
        Event5.setForeground(new java.awt.Color(0, 223, 223));
        Event5.setEnabled(false);
        Event5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Event5MouseReleased(evt);
            }
        });
        Event5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event5ActionPerformed(evt);
            }
        });

        Event6.setBackground(new java.awt.Color(0, 223, 223));
        Event6.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 13)); // NOI18N
        Event6.setForeground(new java.awt.Color(0, 223, 223));
        Event6.setEnabled(false);
        Event6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Event6MouseReleased(evt);
            }
        });
        Event6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event6ActionPerformed(evt);
            }
        });

        Event7.setBackground(new java.awt.Color(0, 223, 223));
        Event7.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 13)); // NOI18N
        Event7.setForeground(new java.awt.Color(0, 223, 223));
        Event7.setEnabled(false);
        Event7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Event7MouseReleased(evt);
            }
        });
        Event7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event7ActionPerformed(evt);
            }
        });

        Event8.setBackground(new java.awt.Color(0, 223, 223));
        Event8.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 13)); // NOI18N
        Event8.setForeground(new java.awt.Color(0, 223, 223));
        Event8.setEnabled(false);
        Event8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Event8MouseReleased(evt);
            }
        });
        Event8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event8ActionPerformed(evt);
            }
        });

        Event9.setBackground(new java.awt.Color(0, 223, 223));
        Event9.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 13)); // NOI18N
        Event9.setForeground(new java.awt.Color(0, 223, 223));
        Event9.setEnabled(false);
        Event9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Event9MouseReleased(evt);
            }
        });
        Event9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event9ActionPerformed(evt);
            }
        });

        Event10.setBackground(new java.awt.Color(0, 223, 223));
        Event10.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 13)); // NOI18N
        Event10.setForeground(new java.awt.Color(0, 223, 223));
        Event10.setEnabled(false);
        Event10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Event10MouseReleased(evt);
            }
        });
        Event10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event10ActionPerformed(evt);
            }
        });

        jCheckBox1.setBackground(new java.awt.Color(0, 223, 223));
        jCheckBox1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 13)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(0, 223, 223));
        jCheckBox1.setEnabled(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Event10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Event9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Event8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Event7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Event6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Event5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Event4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Event2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Event3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Event2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Event3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Event4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Event5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Event6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Event7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Event8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Event9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Event10)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Events", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Franklin Gothic Medium Cond", 0, 15))); // NOI18N
        jPanel3.setOpaque(false);

        Event11.setBackground(new java.awt.Color(159, 243, 243));
        Event11.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 13)); // NOI18N
        Event11.setEnabled(false);
        Event11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Event11MouseReleased(evt);
            }
        });
        Event11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event11ActionPerformed(evt);
            }
        });

        Event12.setBackground(new java.awt.Color(159, 243, 243));
        Event12.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 13)); // NOI18N
        Event12.setEnabled(false);
        Event12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Event12MouseReleased(evt);
            }
        });
        Event12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event12ActionPerformed(evt);
            }
        });

        Event13.setBackground(new java.awt.Color(159, 243, 243));
        Event13.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 13)); // NOI18N
        Event13.setEnabled(false);
        Event13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Event13MouseReleased(evt);
            }
        });
        Event13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event13ActionPerformed(evt);
            }
        });

        Event14.setBackground(new java.awt.Color(159, 243, 243));
        Event14.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 13)); // NOI18N
        Event14.setEnabled(false);
        Event14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Event14MouseReleased(evt);
            }
        });
        Event14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event14ActionPerformed(evt);
            }
        });

        Event15.setBackground(new java.awt.Color(159, 243, 243));
        Event15.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 13)); // NOI18N
        Event15.setEnabled(false);
        Event15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Event15MouseReleased(evt);
            }
        });
        Event15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event15ActionPerformed(evt);
            }
        });

        Event17.setBackground(new java.awt.Color(159, 243, 243));
        Event17.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 13)); // NOI18N
        Event17.setEnabled(false);
        Event17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Event17MouseReleased(evt);
            }
        });
        Event17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event17ActionPerformed(evt);
            }
        });

        Event18.setBackground(new java.awt.Color(159, 243, 243));
        Event18.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 13)); // NOI18N
        Event18.setEnabled(false);
        Event18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Event18MouseReleased(evt);
            }
        });
        Event18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event18ActionPerformed(evt);
            }
        });

        Event19.setBackground(new java.awt.Color(159, 243, 243));
        Event19.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 13)); // NOI18N
        Event19.setEnabled(false);
        Event19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Event19MouseReleased(evt);
            }
        });
        Event19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event19ActionPerformed(evt);
            }
        });

        Event20.setBackground(new java.awt.Color(159, 243, 243));
        Event20.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 13)); // NOI18N
        Event20.setEnabled(false);
        Event20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Event20MouseReleased(evt);
            }
        });
        Event20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event20ActionPerformed(evt);
            }
        });

        Event16.setBackground(new java.awt.Color(159, 243, 243));
        Event16.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 13)); // NOI18N
        Event16.setEnabled(false);
        Event16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Event16MouseReleased(evt);
            }
        });
        Event16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Event16, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(Event11, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(Event12, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(Event13, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(Event14, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(Event15, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(Event17, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(Event18, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(Event19, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(Event20, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Event11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Event12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Event13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Event14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Event15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Event16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Event17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Event18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(Event19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Event20)
                .addGap(15, 15, 15))
        );

        setColourBtn.setBackground(new java.awt.Color(255, 153, 0));
        setColourBtn.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        setColourBtn.setForeground(new java.awt.Color(0, 158, 158));
        setColourBtn.setText("Set Colour");
        setColourBtn.setBorderPainted(false);
        setColourBtn.setContentAreaFilled(false);
        setColourBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setColourBtn.setOpaque(true);
        setColourBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setColourBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                setColourBtnMouseExited(evt);
            }
        });
        setColourBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setColourBtnActionPerformed(evt);
            }
        });

        cancelBtn.setBackground(new java.awt.Color(255, 153, 0));
        cancelBtn.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(0, 158, 158));
        cancelBtn.setText("Cancel");
        cancelBtn.setContentAreaFilled(false);
        cancelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelBtn.setOpaque(true);
        cancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelBtnMouseExited(evt);
            }
        });
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(setColourBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel2)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel2, jPanel3});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelBtn, setColourBtn});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setColourBtn)
                    .addComponent(cancelBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cancelBtn, setColourBtn});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Event2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event2ActionPerformed
        clickcounter2 +=1;
        if (clickcounter2%2==1){
            checkBoxList.get(1).setSelected(true);
        }
        else {
            checkBoxList.get(1).setSelected(false);
        }
    }//GEN-LAST:event_Event2ActionPerformed

    private void Event3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event3ActionPerformed
        clickcounter3 +=1;
        if (clickcounter3%2==1){
            checkBoxList.get(2).setSelected(true);
        }
        else {
            checkBoxList.get(2).setSelected(false);
        }
    }//GEN-LAST:event_Event3ActionPerformed

    private void Event4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event4ActionPerformed
        clickcounter4 +=1;
        if (clickcounter4%2==1){
            checkBoxList.get(3).setSelected(true);
        }
        else {
            checkBoxList.get(3).setSelected(false);
        }    }//GEN-LAST:event_Event4ActionPerformed

    private void Event5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event5ActionPerformed
        clickcounter5 +=1;
        if (clickcounter5%2==1){
            checkBoxList.get(4).setSelected(true);
        }
        else {
            checkBoxList.get(4).setSelected(false);
        }
    }//GEN-LAST:event_Event5ActionPerformed

    private void Event6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event6ActionPerformed
        clickcounter6 +=1;
        if (clickcounter6%2==1){
            checkBoxList.get(5).setSelected(true);
        }
        else {
            checkBoxList.get(5).setSelected(false);
        }
    }//GEN-LAST:event_Event6ActionPerformed

    private void Event7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event7ActionPerformed
        clickcounter7 +=1;
        if (clickcounter7%2==1){
            checkBoxList.get(6).setSelected(true);
        }
        else {
            checkBoxList.get(6).setSelected(false);
        }
    }//GEN-LAST:event_Event7ActionPerformed

    private void Event8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event8ActionPerformed
        clickcounter8 +=1;
        if (clickcounter8%2==1){
            checkBoxList.get(7).setSelected(true);
        }
        else {
            checkBoxList.get(7).setSelected(false);
        }
    }//GEN-LAST:event_Event8ActionPerformed

    private void Event9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event9ActionPerformed
        clickcounter9 +=1;
        if (clickcounter9==1){
            checkBoxList.get(8).setSelected(true);
        }
        else {
            checkBoxList.get(8).setSelected(false);
        }
    }//GEN-LAST:event_Event9ActionPerformed

    private void Event10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event10ActionPerformed
        clickcounter10 +=1;
        if (clickcounter10%2==1){
            checkBoxList.get(9).setSelected(true);
        }
        else {
            checkBoxList.get(9).setSelected(false);
        }
    }//GEN-LAST:event_Event10ActionPerformed

    private void Event19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event19ActionPerformed
        clickcounter19 +=1;
        if (clickcounter19%2==1){
            checkBoxList.get(18).setSelected(true);
        }
        else {
            checkBoxList.get(18).setSelected(false);
        }
    }//GEN-LAST:event_Event19ActionPerformed

    private void Event20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event20ActionPerformed
        clickcounter20 +=1;
        if (clickcounter20%2==1){
            checkBoxList.get(19).setSelected(true);
        }
        else {
            checkBoxList.get(19).setSelected(false);
        }
    }//GEN-LAST:event_Event20ActionPerformed

    private void Event12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event12ActionPerformed
        clickcounter12 +=1;
        if (clickcounter12%2==1){
            checkBoxList.get(11).setSelected(true);
        }
        else {
            checkBoxList.get(11).setSelected(false);
        }
    }//GEN-LAST:event_Event12ActionPerformed

    private void Event11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event11ActionPerformed
        clickcounter11 +=1;
        if (clickcounter11%2==1){
            checkBoxList.get(10).setSelected(true);
        }
        else {
            checkBoxList.get(10).setSelected(false);
        }
    }//GEN-LAST:event_Event11ActionPerformed

    private void Event13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event13ActionPerformed
        clickcounter13 +=1;
        if (clickcounter13%2==1){
            checkBoxList.get(12).setSelected(true);
        }
        else {
            checkBoxList.get(12).setSelected(false);
        }
    }//GEN-LAST:event_Event13ActionPerformed

    private void Event14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event14ActionPerformed
        clickcounter14 +=1;
        if (clickcounter14%2==1){
            checkBoxList.get(13).setSelected(true);
        }
        else {
            checkBoxList.get(13).setSelected(false);
        }
    }//GEN-LAST:event_Event14ActionPerformed

    private void Event15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event15ActionPerformed
        clickcounter15 +=1;
        if (clickcounter15==1){
            checkBoxList.get(14).setSelected(true);
        }
        else {
            checkBoxList.get(14).setSelected(false);
        }
    }//GEN-LAST:event_Event15ActionPerformed

    private void Event16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event16ActionPerformed
        clickcounter16 +=1;
        if (clickcounter16%2==1){
            checkBoxList.get(15).setSelected(true);
        }
        else {
            checkBoxList.get(15).setSelected(false);
        }
    }//GEN-LAST:event_Event16ActionPerformed

    private void Event17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event17ActionPerformed
        clickcounter17 +=1;
        if (clickcounter17%2==1){
            checkBoxList.get(16).setSelected(true);
        }
        else {
            checkBoxList.get(16).setSelected(false);
        }
    }//GEN-LAST:event_Event17ActionPerformed

    private void Event18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event18ActionPerformed
        clickcounter18 +=1;
        if (clickcounter18%2==1){
            checkBoxList.get(17).setSelected(true);
        }
        else {
            checkBoxList.get(17).setSelected(false);
        }
    }//GEN-LAST:event_Event18ActionPerformed

    private void Event2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Event2MouseReleased
    }//GEN-LAST:event_Event2MouseReleased

    private void Event3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Event3MouseReleased
    }//GEN-LAST:event_Event3MouseReleased

    private void Event4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Event4MouseReleased
    }//GEN-LAST:event_Event4MouseReleased

    private void Event5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Event5MouseReleased
    }//GEN-LAST:event_Event5MouseReleased

    private void Event6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Event6MouseReleased
    }//GEN-LAST:event_Event6MouseReleased

    private void Event7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Event7MouseReleased
    }//GEN-LAST:event_Event7MouseReleased

    private void Event8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Event8MouseReleased
    }//GEN-LAST:event_Event8MouseReleased

    private void Event9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Event9MouseReleased
    }//GEN-LAST:event_Event9MouseReleased

    private void Event10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Event10MouseReleased
    }//GEN-LAST:event_Event10MouseReleased

    private void Event11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Event11MouseReleased
    }//GEN-LAST:event_Event11MouseReleased

    private void Event12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Event12MouseReleased
    }//GEN-LAST:event_Event12MouseReleased

    private void Event13MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Event13MouseReleased
    }//GEN-LAST:event_Event13MouseReleased

    private void Event14MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Event14MouseReleased
    }//GEN-LAST:event_Event14MouseReleased

    private void Event15MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Event15MouseReleased
    }//GEN-LAST:event_Event15MouseReleased

    private void Event16MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Event16MouseReleased
    }//GEN-LAST:event_Event16MouseReleased

    private void Event17MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Event17MouseReleased
    }//GEN-LAST:event_Event17MouseReleased

    private void Event18MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Event18MouseReleased
    }//GEN-LAST:event_Event18MouseReleased

    private void Event19MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Event19MouseReleased
    }//GEN-LAST:event_Event19MouseReleased

    private void Event20MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Event20MouseReleased
    }//GEN-LAST:event_Event20MouseReleased

    private void setColourBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setColourBtnActionPerformed
        Color newColor = JColorChooser.showDialog(null, "Choose a color", Color.WHITE);
        int firstIndex = newColor.getRed();
        String ColorR = Integer.toString(firstIndex);
        int secIndex = newColor.getGreen();
        String ColorG = Integer.toString(secIndex);
        int thirdIndex = newColor.getBlue();
        String ColorB = Integer.toString(thirdIndex);
        updateColourToScreen(newColor, ColorR, ColorG, ColorB);
        colorBtnClicked = false;
        for (int i=0; i<numOfEvents;i++){
            checkBoxList.get(i).setSelected(false);
        }
        this.dispose();
    }//GEN-LAST:event_setColourBtnActionPerformed

    private void setColourBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setColourBtnMouseEntered
        Color setColourBtnHover = new Color(255,228,188);
        setColourBtn.setBackground(setColourBtnHover);
    }//GEN-LAST:event_setColourBtnMouseEntered

    private void setColourBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setColourBtnMouseExited
        Color setColourBtnNonHover = new Color(255,153,0);
        setColourBtn.setBackground(setColourBtnNonHover);
    }//GEN-LAST:event_setColourBtnMouseExited

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        colorBtnClicked = false;
        this.dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void cancelBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseEntered
        Color cancelBtnHover = new Color(255,228,188);
        cancelBtn.setBackground(cancelBtnHover);
    }//GEN-LAST:event_cancelBtnMouseEntered

    private void cancelBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseExited
        Color cancelBtnNonHover = new Color(255,153,0);
        cancelBtn.setBackground(cancelBtnNonHover);
    }//GEN-LAST:event_cancelBtnMouseExited

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        clickcounter1 +=1;
        if (clickcounter1%2==1){
            checkBoxList.get(0).setSelected(true);
        }
        else {
            checkBoxList.get(0).setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(ChangeColour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeColour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeColour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeColour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeColour().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JCheckBox Event10;
    public static javax.swing.JCheckBox Event11;
    public static javax.swing.JCheckBox Event12;
    public static javax.swing.JCheckBox Event13;
    public static javax.swing.JCheckBox Event14;
    public static javax.swing.JCheckBox Event15;
    public static javax.swing.JCheckBox Event16;
    public static javax.swing.JCheckBox Event17;
    public static javax.swing.JCheckBox Event18;
    public static javax.swing.JCheckBox Event19;
    public static javax.swing.JCheckBox Event2;
    public static javax.swing.JCheckBox Event20;
    public static javax.swing.JCheckBox Event3;
    public static javax.swing.JCheckBox Event4;
    public static javax.swing.JCheckBox Event5;
    public static javax.swing.JCheckBox Event6;
    public static javax.swing.JCheckBox Event7;
    public static javax.swing.JCheckBox Event8;
    public static javax.swing.JCheckBox Event9;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton setColourBtn;
    // End of variables declaration//GEN-END:variables
}
