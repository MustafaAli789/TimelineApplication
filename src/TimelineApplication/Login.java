/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TimelineApplication;
import static TimelineApplication.Maintimeline.eventInformationFile;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author S199841769
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form lOGIN
    
    */
    
    public Login() {
        initComponents();
        PasswordField.setText("");
          
    }    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        LoginRegisterBtn = new javax.swing.JButton();
        LoginPanel = new javax.swing.JPanel();
        UsernameTextField = new javax.swing.JTextField();
        UsernameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        LoginLabel = new javax.swing.JLabel();
        AnnouceLabel = new javax.swing.JLabel();
        SigninButton = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login System");
        setBounds(new java.awt.Rectangle(0, 1, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(350, 300));
        setResizable(false);
        getContentPane().setLayout(null);

        LoginRegisterBtn.setText("Login");
        LoginRegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginRegisterBtnActionPerformed(evt);
            }
        });
        getContentPane().add(LoginRegisterBtn);
        LoginRegisterBtn.setBounds(155, 220, 140, 25);

        LoginPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        UsernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTextFieldActionPerformed(evt);
            }
        });

        UsernameLabel.setText("Username:");

        PasswordLabel.setText("Password:");

        PasswordField.setText("jPasswordField1");
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(UsernameTextField)
                    .addComponent(UsernameLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PasswordLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UsernameLabel)
                .addGap(10, 10, 10)
                .addComponent(UsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(LoginPanel);
        LoginPanel.setBounds(12, 49, 290, 150);

        LoginLabel.setText("Login/Sign up");
        getContentPane().add(LoginLabel);
        LoginLabel.setBounds(10, 30, 190, 16);

        AnnouceLabel.setForeground(new java.awt.Color(255, 0, 51));
        AnnouceLabel.setToolTipText("");
        getContentPane().add(AnnouceLabel);
        AnnouceLabel.setBounds(60, 10, 240, 16);

        SigninButton.setText("Sign Up");
        SigninButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SigninButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SigninButton);
        SigninButton.setBounds(20, 220, 130, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginRegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginRegisterBtnActionPerformed
        AnnouceLabel.setText("");
        String Uname = UsernameTextField.getText();
        String pw = PasswordField.getText();
        if(UPverify(readUP(),pw, Uname)==true){
            Start startscreen = new Start();
            startscreen.setVisible(true);
            super.dispose();
        }
    }//GEN-LAST:event_LoginRegisterBtnActionPerformed

    private void UsernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTextFieldActionPerformed
        
// TODO add your handling code here:
    }//GEN-LAST:event_UsernameTextFieldActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
       
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void SigninButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SigninButtonActionPerformed
        AnnouceLabel.setText("");
        String RecUname = UsernameTextField.getText();
        String RecPw = PasswordField.getText();
        if(Register(RecUname,RecPw)==true){
            Start startscreen = new Start();
            startscreen.setVisible(true);
            super.dispose();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_SigninButtonActionPerformed
    public static File UnamePW = new File("UnamePW.txt"); 
    
    public static ArrayList<String> readUP(){
        String line = null;
        ArrayList<String> UPlist = new ArrayList<String>();
        
        if(UnamePW.exists()){
            try{
                FileReader fileReader = new FileReader(UnamePW);
                BufferedReader bufferedReader = new BufferedReader(fileReader); 
                while (true){
                    try {
                        line = bufferedReader.readLine();
                    } catch (IOException ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                        if (line == null){
                            break;
                        }
                        else {
                            UPlist.add(line);
                        }
                }
            }
            catch (FileNotFoundException ex){
                JOptionPane.showMessageDialog(null, "Cannot find file: " + UnamePW);
            }
        }
        else{
            try {
                UnamePW.createNewFile();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Attemped to create new database but path to file could not be found.");
            }
        }
        
        

        
        return (UPlist);
    }
    
    public boolean Register (String a, String b){
        ArrayList<String> UPlist = readUP();
        boolean DecideWrite = true;
        for (int x=0; x<UPlist.size(); x++){
            if (UPlist.get(x).equals(a)){
               AnnouceLabel.setText("The username entered has been used.");
               DecideWrite = false;
               break;               
            }
        }
        if (DecideWrite==true){
            try{
                Writer fileWriter;
                fileWriter = new BufferedWriter(new FileWriter(UnamePW, true));             
                fileWriter.append(a);
                fileWriter.append("\n");                
                fileWriter.append(b); 
                fileWriter.append("\n");
                fileWriter.close();
                } 
            catch (FileNotFoundException ex){
                System.out.println("Cannot find the file "+UnamePW);
            }
            catch (IOException e) {
                e.printStackTrace();
            }        
        }
        return (DecideWrite);
    }
    public boolean UPverify(ArrayList<String> a, String pw, String Uname){
        boolean verified = false;
        for (int x=0; x<a.size(); x++){
            if (a.get(x).equals(Uname) && a.get(x+1).equals(pw)){
                verified = true;
                break;
            }
        }
        if (verified == false){
            AnnouceLabel.setText("Invalid Username or Password.");
        }
        return (verified);
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnnouceLabel;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JButton LoginRegisterBtn;
    public javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JButton SigninButton;
    private javax.swing.JLabel UsernameLabel;
    public javax.swing.JTextField UsernameTextField;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
