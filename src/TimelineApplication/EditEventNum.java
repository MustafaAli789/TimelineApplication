package TimelineApplication;

import static TimelineApplication.Maintimeline.editBtnClicked;
import static TimelineApplication.Maintimeline.eventInformationList;
import static TimelineApplication.Maintimeline.numOfEvents;
import static TimelineApplication.Maintimeline.updateScreen;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

public class EditEventNum extends javax.swing.JFrame {
    public EditEventNum() {
        initComponents();
        
        //Code below simply gets each event name and appends it to the list GUI list
        for (int i = 0; i < numOfEvents ; i++){
            String event = eventInformationList.get(i+1).get(0).toString();
            EditEventList.append(i+1 + " (Event Position)" + ": " + event + "\n");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        InstructionLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EditEventList = new javax.swing.JTextArea();
        EditEventField = new javax.swing.JTextField();
        ContinueBtn = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(412, 494));

        InstructionLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        InstructionLabel.setText("Enter the position # of the event you want to edit:");

        EditEventList.setEditable(false);
        EditEventList.setColumns(20);
        EditEventList.setRows(5);
        jScrollPane1.setViewportView(EditEventList);

        EditEventField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditEventFieldActionPerformed(evt);
            }
        });

        ContinueBtn.setText("CONTINUE");
        ContinueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueBtnActionPerformed(evt);
            }
        });

        CancelBtn.setText("CANCEL");
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ContinueBtn)
                .addGap(86, 86, 86)
                .addComponent(CancelBtn)
                .addGap(89, 89, 89))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(InstructionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EditEventField, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditEventField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InstructionLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContinueBtn)
                    .addComponent(CancelBtn))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditEventFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditEventFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditEventFieldActionPerformed

    private void ContinueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueBtnActionPerformed
        String edit_pos = EditEventField.getText();
        int edit_pos_num = parseInt(edit_pos);
        if (edit_pos_num <= numOfEvents && edit_pos_num > 0){
            Editevent editevent = new Editevent();
            editevent.setVisible(true);
        } else{
            JOptionPane.showMessageDialog(null, "No event at that position");
        }
        
        editBtnClicked = false;
        this.dispose();

    }//GEN-LAST:event_ContinueBtnActionPerformed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        editBtnClicked = false;
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
            java.util.logging.Logger.getLogger(EditEventNum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditEventNum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditEventNum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditEventNum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditEventNum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelBtn;
    public static javax.swing.JButton ContinueBtn;
    public static javax.swing.JTextField EditEventField;
    private javax.swing.JTextArea EditEventList;
    private javax.swing.JLabel InstructionLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
