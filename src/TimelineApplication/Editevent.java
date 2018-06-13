package TimelineApplication;
import static TimelineApplication.EditEventNum.EditEventField;
import static TimelineApplication.Maintimeline.editBtnClicked;
import static TimelineApplication.Maintimeline.eventInformationList;
import static TimelineApplication.Maintimeline.numOfEvents;
import static TimelineApplication.Maintimeline.updateScreen;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;

public class Editevent extends javax.swing.JFrame {

    public static String oldColorR;
    public static String oldColorG;
    public static String oldColorB;
    public Editevent() {
        initComponents();
        String edit_pos = EditEventField.getText();
        int edit_pos_num = parseInt(edit_pos);
        EditEventPositionTextField.setText(edit_pos);
        EditEventNameTextField.setText(eventInformationList.get(edit_pos_num).get(0).toString());
        EditTimeTextField.setText(eventInformationList.get(edit_pos_num).get(1).toString());
        EditDescriptionTextField.setText(eventInformationList.get(edit_pos_num).get(2).toString());
        EditImageUrlTextField.setText(eventInformationList.get(edit_pos_num).get(3).toString());
        oldColorR = eventInformationList.get(edit_pos_num).get(4);
        oldColorG = eventInformationList.get(edit_pos_num).get(5);
        oldColorB = eventInformationList.get(edit_pos_num).get(6);
        int position = parseInt(EditEventPositionTextField.getText());  
        System.out.println(eventInformationList);
        eventInformationList.remove(position);
        System.out.println(eventInformationList);
        
          
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        EventPositionLabel = new javax.swing.JLabel();
        EditEventPositionTextField = new javax.swing.JTextField();
        EventNameLabel = new javax.swing.JLabel();
        EditEventNameTextField = new javax.swing.JTextField();
        TimeLabel = new javax.swing.JLabel();
        EditTimeTextField = new javax.swing.JTextField();
        DescriptionLabel = new javax.swing.JLabel();
        EditDescriptionTextField = new javax.swing.JTextField();
        ImageUrlLabel = new javax.swing.JLabel();
        EditImageUrlTextField = new javax.swing.JTextField();
        EditBtn = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(102, 204, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        EventPositionLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        EventPositionLabel.setText("Event Positon (Specify the Position, a Numerical Value):");

        EditEventPositionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditEventPositionTextFieldActionPerformed(evt);
            }
        });

        EventNameLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        EventNameLabel.setText("Edit Event Name:");

        EditEventNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditEventNameTextFieldActionPerformed(evt);
            }
        });

        TimeLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        TimeLabel.setText("Time:");

        DescriptionLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        DescriptionLabel.setText("Description:");

        EditDescriptionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditDescriptionTextFieldActionPerformed(evt);
            }
        });

        ImageUrlLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        ImageUrlLabel.setText("Image URL:");

        EditImageUrlTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditImageUrlTextFieldActionPerformed(evt);
            }
        });

        EditBtn.setText("EDIT");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EventPositionLabel)
                            .addComponent(EditEventPositionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EventNameLabel)
                            .addComponent(EditEventNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TimeLabel)
                            .addComponent(DescriptionLabel)
                            .addComponent(EditDescriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ImageUrlLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EditTimeTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditImageUrlTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EditBtn)
                .addGap(90, 90, 90)
                .addComponent(CancelBtn)
                .addGap(87, 87, 87))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EventPositionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EditEventPositionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EventNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EditEventNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TimeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EditTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DescriptionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EditDescriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ImageUrlLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EditImageUrlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditBtn)
                    .addComponent(CancelBtn))
                .addGap(27, 27, 27))
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

    private void EditEventNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditEventNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditEventNameTextFieldActionPerformed

    private void EditDescriptionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditDescriptionTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditDescriptionTextFieldActionPerformed

    private void EditImageUrlTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditImageUrlTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditImageUrlTextFieldActionPerformed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        editBtnClicked = false;
        this.dispose();
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        System.out.println(eventInformationList);
        int position_new = parseInt(EditEventPositionTextField.getText()); 
        eventInformationList.add(position_new, new ArrayList<String>());
       
        String name = EditEventNameTextField.getText();
        String time = EditTimeTextField.getText();
        String desc = EditDescriptionTextField.getText();
        String URL = EditImageUrlTextField.getText();
        eventInformationList.get(position_new).add(name);
        eventInformationList.get(position_new).add(time);
        eventInformationList.get(position_new).add(desc);
        eventInformationList.get(position_new).add(URL);
        eventInformationList.get(position_new).add(oldColorR);
        eventInformationList.get(position_new).add(oldColorG);
        eventInformationList.get(position_new).add(oldColorB); 
        System.out.println(eventInformationList);
        updateScreen(numOfEvents);
        editBtnClicked = false;
        this.dispose();
    }//GEN-LAST:event_EditBtnActionPerformed

    private void EditEventPositionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditEventPositionTextFieldActionPerformed

    }//GEN-LAST:event_EditEventPositionTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Editevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editevent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelBtn;
    private javax.swing.JLabel DescriptionLabel;
    public static javax.swing.JButton EditBtn;
    private javax.swing.JTextField EditDescriptionTextField;
    private javax.swing.JTextField EditEventNameTextField;
    private javax.swing.JTextField EditEventPositionTextField;
    private javax.swing.JTextField EditImageUrlTextField;
    private javax.swing.JTextField EditTimeTextField;
    private javax.swing.JLabel EventNameLabel;
    private javax.swing.JLabel EventPositionLabel;
    private javax.swing.JLabel ImageUrlLabel;
    private javax.swing.JLabel TimeLabel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
