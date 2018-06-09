package TimelineApplication;

import static TimelineApplication.Maintimeline.EventPane1;
import static TimelineApplication.Maintimeline.EventPane2;
import static TimelineApplication.Maintimeline.EventPane3;
import static TimelineApplication.Maintimeline.EventPane4;
import static TimelineApplication.Maintimeline.EventPane5;
import static TimelineApplication.Maintimeline.EventPane6;
import static TimelineApplication.Maintimeline.EventPane7;
import static TimelineApplication.Maintimeline.EventPane8;
import static TimelineApplication.Maintimeline.EventPane9;
import static TimelineApplication.Maintimeline.EventPane10;
import static TimelineApplication.Maintimeline.EventPane11;
import static TimelineApplication.Maintimeline.EventPane12;
import static TimelineApplication.Maintimeline.EventPane13;
import static TimelineApplication.Maintimeline.EventPane14;
import static TimelineApplication.Maintimeline.EventPane15;
import static TimelineApplication.Maintimeline.EventPane16;
import static TimelineApplication.Maintimeline.EventPane17;
import static TimelineApplication.Maintimeline.EventPane18;
import static TimelineApplication.Maintimeline.EventPane19;
import static TimelineApplication.Maintimeline.EventPane20;
import static TimelineApplication.Maintimeline.eventInformationList;
import java.awt.Color;
import javax.swing.JColorChooser;

public class ChangeColour extends javax.swing.JFrame {
    public ChangeColour() {
        initComponents();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        SetColour.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        SetColour.setText("Set Colour");
        SetColour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetColourActionPerformed(evt);
            }
        });

        Event1.setText(eventInformationList.get(1).get(0));
        Event1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Event1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel1.setText("Tick the boxes for the corresponding events ");

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel2.setText("that you want to change the colours for");

        Event2.setText(eventInformationList.get(2).get(0));
        Event2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event2ActionPerformed(evt);
            }
        });

        Event3.setText(eventInformationList.get(3).get(0));
        Event3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event3ActionPerformed(evt);
            }
        });

        Event4.setText(eventInformationList.get(4).get(0));
        Event4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event4ActionPerformed(evt);
            }
        });

        Event5.setText(eventInformationList.get(5).get(0));
        Event5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event5ActionPerformed(evt);
            }
        });

        Event6.setText(eventInformationList.get(6).get(0));
        Event6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event6ActionPerformed(evt);
            }
        });

        Event7.setText(eventInformationList.get(7).get(0));
        Event7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event7ActionPerformed(evt);
            }
        });

        Event8.setText(eventInformationList.get(8).get(0));
        Event8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event8ActionPerformed(evt);
            }
        });

        Event9.setText(eventInformationList.get(9).get(0));
        Event9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event9ActionPerformed(evt);
            }
        });

        Event10.setText(eventInformationList.get(10).get(0));
        Event10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event10ActionPerformed(evt);
            }
        });

        Event19.setText(eventInformationList.get(19).get(0));
        Event19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event19ActionPerformed(evt);
            }
        });

        Event20.setText(eventInformationList.get(20).get(0));
        Event20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event20ActionPerformed(evt);
            }
        });

        Event12.setText(eventInformationList.get(12).get(0));
        Event12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event12ActionPerformed(evt);
            }
        });

        Event11.setText(eventInformationList.get(11).get(0));
        Event11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event11ActionPerformed(evt);
            }
        });

        Event13.setText(eventInformationList.get(13).get(0));
        Event13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event13ActionPerformed(evt);
            }
        });

        Event14.setText(eventInformationList.get(14).get(0));
        Event14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event14ActionPerformed(evt);
            }
        });

        Event15.setText(eventInformationList.get(15).get(0));
        Event15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event15ActionPerformed(evt);
            }
        });

        Event16.setText(eventInformationList.get(16).get(0));
        Event16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event16ActionPerformed(evt);
            }
        });

        Event17.setText(eventInformationList.get(17).get(0));
        Event17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event17ActionPerformed(evt);
            }
        });

        Event18.setText(eventInformationList.get(18).get(0));
        Event18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Event1)
                                            .addComponent(Event2)
                                            .addComponent(Event3)
                                            .addComponent(Event4)
                                            .addComponent(Event5)
                                            .addComponent(Event6)
                                            .addComponent(Event7)
                                            .addComponent(Event8)
                                            .addComponent(Event9)
                                            .addComponent(Event10))
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
                                            .addComponent(Event20)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(SetColour)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(SetColour)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SetColourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetColourActionPerformed
        Color newColor = JColorChooser.showDialog(null, "Choose a color", Color.WHITE);
        if (Event1.isSelected()){
            EventPane1.setBackground(newColor);
        } 
        if (Event2.isSelected()){
            EventPane2.setBackground(newColor);
        }
        if (Event3.isSelected()){
            EventPane3.setBackground(newColor);
        }
        if (Event4.isSelected()){
            EventPane4.setBackground(newColor);
        }
        if (Event5.isSelected()){
            EventPane5.setBackground(newColor);
        }
        if (Event6.isSelected()){
            EventPane6.setBackground(newColor);
        }
        if (Event7.isSelected()){
            EventPane7.setBackground(newColor);
        }
        if (Event8.isSelected()){
            EventPane8.setBackground(newColor);
        }
        if (Event9.isSelected()){
            EventPane9.setBackground(newColor);
        }
        if (Event10.isSelected()){
            EventPane10.setBackground(newColor);
        }
        if (Event11.isSelected()){
            EventPane11.setBackground(newColor);
        }
        if (Event12.isSelected()){
            EventPane12.setBackground(newColor);
        }
        if (Event13.isSelected()){
            EventPane13.setBackground(newColor);
        }
        if (Event14.isSelected()){
            EventPane14.setBackground(newColor);
        }
        if (Event15.isSelected()){
            EventPane15.setBackground(newColor);
        }
        if (Event16.isSelected()){
            EventPane16.setBackground(newColor);
        }
        if (Event17.isSelected()){
            EventPane17.setBackground(newColor);
        }
        if (Event18.isSelected()){
            EventPane18.setBackground(newColor);
        }
        if (Event19.isSelected()){
            EventPane19.setBackground(newColor);
        }
        if (Event20.isSelected()){
            EventPane20.setBackground(newColor);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
