/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AYM.view;

import AYM.dao.UserDAO;
import AYM.model.AYmember;
import javax.swing.JOptionPane;


/**
 *
 * @author USER1
 */
public class AYMLOGIN extends javax.swing.JFrame {

    /**
     * Creates new form AYMLOGIN
     */
    public AYMLOGIN() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usernamefield = new javax.swing.JTextField();
        submitbtn = new javax.swing.JButton();
        signupbtn = new javax.swing.JButton();
        recoverybtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        passwordfield = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        backgroundlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1390, 850));
        setResizable(false);

        loginpanel.setBackground(new java.awt.Color(255, 255, 255));
        loginpanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginpanel.setForeground(new java.awt.Color(255, 255, 255));
        loginpanel.setMinimumSize(new java.awt.Dimension(1390, 850));
        loginpanel.setPreferredSize(new java.awt.Dimension(1390, 850));
        loginpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");
        loginpanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 195, 75));

        jLabel2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("UserName:");
        loginpanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 170, 65));

        jLabel3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Password:");
        loginpanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 150, 66));

        usernamefield.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        usernamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernamefieldActionPerformed(evt);
            }
        });
        loginpanel.add(usernamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 220, 40));

        submitbtn.setBackground(new java.awt.Color(255, 255, 102));
        submitbtn.setFont(new java.awt.Font("Microsoft Tai Le", 1, 28)); // NOI18N
        submitbtn.setText("SUBMIT");
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });
        loginpanel.add(submitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 150, 40));

        signupbtn.setBackground(new java.awt.Color(255, 255, 255));
        signupbtn.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 22)); // NOI18N
        signupbtn.setText("Sign Up");
        signupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbtnActionPerformed(evt);
            }
        });
        loginpanel.add(signupbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 520, 120, -1));

        recoverybtn.setBackground(new java.awt.Color(51, 51, 51));
        recoverybtn.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 22)); // NOI18N
        recoverybtn.setForeground(new java.awt.Color(255, 255, 102));
        recoverybtn.setText("Forgot Password");
        recoverybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recoverybtnActionPerformed(evt);
            }
        });
        loginpanel.add(recoverybtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 210, 40));

        jLabel4.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 255));
        jLabel4.setText("Don't have an account?");
        loginpanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, 260, 30));

        passwordfield.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        loginpanel.add(passwordfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, 220, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 51));
        jButton1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 20)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AYM/view/image/Customer Registration & Check IN.png"))); // NOI18N
        jButton1.setText("Home Page");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        loginpanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 600, -1, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 20)); // NOI18N
        jLabel5.setText("Designed By");
        loginpanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 700, -1, -1));

        jLabel6.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 20)); // NOI18N
        jLabel6.setText("Ashimwe Rushinga Cedrick");
        loginpanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 730, -1, -1));

        backgroundlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AYM/view/image/loginfinal1.png"))); // NOI18N
        loginpanel.add(backgroundlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1340, 810));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1349, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernamefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernamefieldActionPerformed

    private void recoverybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recoverybtnActionPerformed
        AYMRecovery recovery = new AYMRecovery();
        recovery.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_recoverybtnActionPerformed

    private void signupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbtnActionPerformed
        AYM_SIGNUP signup = new AYM_SIGNUP();
        signup.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signupbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AYMaWELCOME welcome = new AYMaWELCOME();
        welcome.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed

try {
   
    if (usernamefield.getText().trim().isEmpty() || passwordfield.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter both username and password");
    } else {
        String username = usernamefield.getText();
        String password = passwordfield.getText();

        // Create an AYmember object with the entered username and password
        AYmember member = new AYmember();
        member.setUserName(username);
        member.setPassword(password);

        // Call DAO to authenticate the user
        UserDAO userdao = new UserDAO();
        String role = userdao.authenticateUser(member);

        if (role != null) {
    // Navigate user to respective dashboard based on role
    if (role.equals("ADMIN")) {
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.setVisible(true);
        this.dispose();
    } else if (role.equals("RegularUser")) {
//        RegularUserDashboard userDashboard = new RegularUserDashboard();
//        userDashboard.setVisible(true);
//        this.dispose();
    } else if (role.equals("Club leader")) {
        Clubleaderdashboard1 clubLeaderDashboard = new Clubleaderdashboard1();
         
        clubLeaderDashboard.setVisible(true);
        this.dispose();
    } else {
     JOptionPane.showMessageDialog(this,"unauthorized access \n Please consult your club leader \n or consult the AY leader ");
    }


            // Close the current login window
            this.dispose();
            usernamefield.setText("");
            passwordfield.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password");
        }
    }
} catch (Exception ex) {
    ex.printStackTrace();
}


    }//GEN-LAST:event_submitbtnActionPerformed

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
            java.util.logging.Logger.getLogger(AYMLOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AYMLOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AYMLOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AYMLOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AYMLOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundlabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel loginpanel;
    private javax.swing.JPasswordField passwordfield;
    private javax.swing.JButton recoverybtn;
    private javax.swing.JButton signupbtn;
    private javax.swing.JButton submitbtn;
    private javax.swing.JTextField usernamefield;
    // End of variables declaration//GEN-END:variables
}
