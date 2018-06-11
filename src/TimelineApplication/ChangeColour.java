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
    public ChangeColour() {
        initComponents();
        JCheckBox array6[]={Event1, Event2,Event3, Event4, Event5, Event6, Event7, Event8, Event9, Event10, Event11, Event12, Event13, Event14, Event15, Event16, Event17, Event18, Event19, Event20};
        for (int i =1; i<=numOfEvents;i++){
            array6[i-1].setText(eventInformationList.get(i).get(0));
            array6[i-1].setEnabled(true);
        }
         Collections.addAll(checkBoxList, array6);
        
    }
        
    public void updateColourToScreen(java.awt.Color selectedColor, String ColorR, String ColorG, String ColorB) {
        System.out.println(selectedColor);
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

        SetColour = new javax.swing.JButton();
        Event1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Event2 = new javax.swing.JCheckBox();
        Event3 = new javax.swing.JCheckBox();
        Event4 = new javax.swing.JCheckBox();
        Event5 = new javax.swing.JCheckBox();
        Event6 = new javax.swing.JCheckBox();
        Event7 = new javax.swing.JCheckBox();
        Event8 = new javax.swing.JCheckBox();
        Event9 = new javax.swing.JCheckBox();
        Event10 = new javax.swing.JCheckBox();
        Event19 = new javax.swing.JCheckBox();
        Event20 = new javax.swing.JCheckBox();
        Event12 = new javax.swing.JCheckBox();
        Event11 = new javax.swing.JCheckBox();
        Event13 = new javax.swing.JCheckBox();
        Event14 = new javax.swing.JCheckBox();
        Event15 = new javax.swing.JCheckBox();
        Event16 = new javax.swing.JCheckBox();
        Event17 = new javax.swing.JCheckBox();
        Event18 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        SetColour.setFont(new java.awt.Font(".SF NS Text", 1, 24)); // NOI18N
        SetColour.setText("Set Colour");
        SetColour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetColourActionPerformed(evt);
            }
        });

        Event1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Event1.setEnabled(false);
        Event1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel1.setText("Tick the boxes for the corresponding events ");

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel2.setText("that you want to change the colours for");

        Event2.setEnabled(false);
        Event2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event2ActionPerformed(evt);
            }
        });

        Event3.setEnabled(false);
        Event3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event3ActionPerformed(evt);
            }
        });

        Event4.setEnabled(false);
        Event4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event4ActionPerformed(evt);
            }
        });

        Event5.setEnabled(false);
        Event5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event5ActionPerformed(evt);
            }
        });

        Event6.setEnabled(false);
        Event6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event6ActionPerformed(evt);
            }
        });

        Event7.setEnabled(false);
        Event7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event7ActionPerformed(evt);
            }
        });

        Event8.setEnabled(false);
        Event8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event8ActionPerformed(evt);
            }
        });

        Event9.setEnabled(false);
        Event9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event9ActionPerformed(evt);
            }
        });

        Event10.setEnabled(false);
        Event10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event10ActionPerformed(evt);
            }
        });

        Event19.setEnabled(false);
        Event19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event19ActionPerformed(evt);
            }
        });

        Event20.setEnabled(false);
        Event20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event20ActionPerformed(evt);
            }
        });

        Event12.setEnabled(false);
        Event12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event12ActionPerformed(evt);
            }
        });

        Event11.setEnabled(false);
        Event11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event11ActionPerformed(evt);
            }
        });

        Event13.setEnabled(false);
        Event13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event13ActionPerformed(evt);
            }
        });

        Event14.setEnabled(false);
        Event14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event14ActionPerformed(evt);
            }
        });

        Event15.setEnabled(false);
        Event15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event15ActionPerformed(evt);
            }
        });

        Event16.setEnabled(false);
        Event16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event16ActionPerformed(evt);
            }
        });

        Event17.setEnabled(false);
        Event17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event17ActionPerformed(evt);
            }
        });

        Event18.setEnabled(false);
        Event18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event18ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font(".SF NS Text", 1, 24)); // NOI18N
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Event1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Event2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Event3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Event4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Event5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Event6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Event7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Event8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Event9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Event10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Event11)
                    .addComponent(Event12)
                    .addComponent(Event13)
                    .addComponent(Event14)
                    .addComponent(Event15)
                    .addComponent(Event16)
                    .addComponent(Event17)
                    .addComponent(Event18)
                    .addComponent(Event19)
                    .addComponent(Event20))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(SetColour)
                            .addGap(33, 33, 33)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addComponent(jLabel2))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Event1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Event2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Event3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Event4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Event5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Event6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Event7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Event8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Event9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Event10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Event11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Event12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Event13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Event14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Event15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Event16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Event17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Event18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Event19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Event20)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SetColour)
                    .addComponent(jButton1))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SetColourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetColourActionPerformed
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
    }//GEN-LAST:event_SetColourActionPerformed

    private void Event1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event1ActionPerformed

    }//GEN-LAST:event_Event1ActionPerformed

    private void Event2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Event2ActionPerformed

    private void Event3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Event3ActionPerformed

    private void Event4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Event4ActionPerformed

    private void Event5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Event5ActionPerformed

    private void Event6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Event6ActionPerformed

    private void Event7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Event7ActionPerformed

    private void Event8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Event8ActionPerformed

    private void Event9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Event9ActionPerformed

    private void Event10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Event10ActionPerformed

    private void Event19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Event19ActionPerformed

    private void Event20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Event20ActionPerformed

    private void Event12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Event12ActionPerformed

    private void Event11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Event11ActionPerformed

    private void Event13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Event13ActionPerformed

    private void Event14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Event14ActionPerformed

    private void Event15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Event15ActionPerformed

    private void Event16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Event16ActionPerformed

    private void Event17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Event17ActionPerformed

    private void Event18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Event18ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        colorBtnClicked = false;
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
    public static javax.swing.JCheckBox Event1;
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
    private javax.swing.JButton SetColour;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
