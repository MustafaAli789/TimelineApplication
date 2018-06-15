package TimelineApplication;

import static TimelineApplication.Maintimeline.deleteBtnClicked;
import static TimelineApplication.Maintimeline.editBtnClicked;
import static TimelineApplication.Maintimeline.eventInformationList;
import static TimelineApplication.Maintimeline.numOfEvents;
import static TimelineApplication.Maintimeline.updateScreen;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

public class DeleteEvent extends javax.swing.JFrame {

    public static int deletePosNum;
    
    public DeleteEvent() {
        initComponents();
        
        //Code below simply gets each event name and appends it to the list GUI list
        for (int i = 0; i < numOfEvents ; i++){
            String eventInfo = eventInformationList.get(i+1).get(0).toString();
            listOfEvents.addItem((i+1) + ": " + eventInfo);
        }
        
        listOfEvents.setSelectedIndex(0);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        InstructionLabel = new javax.swing.JLabel();
        ContinueBtn = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();
        listOfEvents = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(330, 250));
        setMinimumSize(new java.awt.Dimension(330, 250));
        setPreferredSize(new java.awt.Dimension(330, 250));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(412, 494));

        InstructionLabel.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 32)); // NOI18N
        InstructionLabel.setText("Select Event to Delete");

        ContinueBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/nextBtnNonHover.png"))); // NOI18N
        ContinueBtn.setContentAreaFilled(false);
        ContinueBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ContinueBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/nextBtnHover.png"))); // NOI18N
        ContinueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueBtnActionPerformed(evt);
            }
        });

        CancelBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/cancelBtnNonHover.png"))); // NOI18N
        CancelBtn.setContentAreaFilled(false);
        CancelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CancelBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/cancelBtnHover.png"))); // NOI18N
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });

        listOfEvents.setBackground(new java.awt.Color(204, 51, 0));
        listOfEvents.setMaximumRowCount(4);
        listOfEvents.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(InstructionLabel))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(ContinueBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                            .addComponent(CancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(listOfEvents, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(InstructionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listOfEvents, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ContinueBtn)
                    .addComponent(CancelBtn))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContinueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueBtnActionPerformed
        
        deletePosNum = listOfEvents.getSelectedIndex() + 1;
        eventInformationList.remove(deletePosNum); 
        numOfEvents -=1;
        updateScreen(numOfEvents); 
        deleteBtnClicked = false;
        this.dispose();

    }//GEN-LAST:event_ContinueBtnActionPerformed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        deleteBtnClicked = false;
        this.dispose();
    }//GEN-LAST:event_CancelBtnActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteEvent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelBtn;
    public static javax.swing.JButton ContinueBtn;
    private javax.swing.JLabel InstructionLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> listOfEvents;
    // End of variables declaration//GEN-END:variables
}
