/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AYM.view;

/**
 *
 * @author USER1
 */
public class AdminDashboard extends javax.swing.JFrame {
      
    /**
     * Creates new form AdminDashboard
     */
    public AdminDashboard() {
    initComponents();}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        userbtn = new javax.swing.JButton();
        clubbtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        logoutbtn = new javax.swing.JButton();
        eventbtn = new javax.swing.JButton();
        homebtn = new javax.swing.JButton();
        backgound = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 740));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(250, 250, 250));
        jLabel2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ADVENTIST YOUTH ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, -1, 40));

        jLabel3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MANAGEMENT SYSTEM");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, -1, -1));

        jLabel1.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Menu");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        userbtn.setBackground(new java.awt.Color(153, 153, 153));
        userbtn.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 28)); // NOI18N
        userbtn.setForeground(new java.awt.Color(0, 153, 255));
        userbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AYM/view/image/pngwing.com (9).png"))); // NOI18N
        userbtn.setText("USER");
        userbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userbtnMouseClicked(evt);
            }
        });
        userbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userbtnActionPerformed(evt);
            }
        });
        jPanel2.add(userbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 193, 55));

        clubbtn.setBackground(new java.awt.Color(153, 153, 153));
        clubbtn.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 27)); // NOI18N
        clubbtn.setForeground(new java.awt.Color(0, 153, 255));
        clubbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AYM/view/image/pngwing.com (8).png"))); // NOI18N
        clubbtn.setText("CLUB");
        clubbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clubbtnMouseClicked(evt);
            }
        });
        clubbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clubbtnActionPerformed(evt);
            }
        });
        jPanel2.add(clubbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 193, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Developed by");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 730, -1, -1));

        jLabel6.setBackground(new java.awt.Color(0, 153, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setText("ASHIMWE Rushinga Cedrick");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 760, -1, -1));

        logoutbtn.setBackground(new java.awt.Color(153, 153, 153));
        logoutbtn.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 24)); // NOI18N
        logoutbtn.setForeground(new java.awt.Color(51, 255, 102));
        logoutbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AYM/view/image/logout.png"))); // NOI18N
        logoutbtn.setText("LOG OUT");
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });
        jPanel2.add(logoutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 200, 60));

        eventbtn.setBackground(new java.awt.Color(153, 153, 153));
        eventbtn.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 27)); // NOI18N
        eventbtn.setForeground(new java.awt.Color(0, 153, 255));
        eventbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AYM/view/image/pngwing.com (2).png"))); // NOI18N
        eventbtn.setText("EVENTS");
        eventbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventbtnActionPerformed(evt);
            }
        });
        jPanel2.add(eventbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 190, 50));

        homebtn.setBackground(new java.awt.Color(153, 153, 153));
        homebtn.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 24)); // NOI18N
        homebtn.setForeground(new java.awt.Color(51, 255, 51));
        homebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AYM/view/image/Customer Registration & Check IN.png"))); // NOI18N
        homebtn.setText("HOME");
        homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtnActionPerformed(evt);
            }
        });
        jPanel2.add(homebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 40, -1, -1));

        backgound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AYM/view/image/backgroundfnaloriginal.png"))); // NOI18N
        backgound.setAutoscrolls(true);
        backgound.setFocusable(false);
        backgound.setPreferredSize(new java.awt.Dimension(1000, 740));
        backgound.setRequestFocusEnabled(false);
        jPanel2.add(backgound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 810));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clubbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clubbtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_clubbtnMouseClicked

    private void clubbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clubbtnActionPerformed
        Clubmanagementpageadmin cmpa = new Clubmanagementpageadmin();
        cmpa.setVisible(true);
    }//GEN-LAST:event_clubbtnActionPerformed

    private void userbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userbtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_userbtnMouseClicked

    private void userbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userbtnActionPerformed
     Usermanagementpageadmin umpa = new Usermanagementpageadmin();
     umpa.setVisible(true);
    }//GEN-LAST:event_userbtnActionPerformed

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        AYMLOGIN login = new AYMLOGIN();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutbtnActionPerformed

    private void eventbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventbtnActionPerformed
          eventsmanagementpageadmin empa = new eventsmanagementpageadmin();
        empa.setVisible(true);
    }//GEN-LAST:event_eventbtnActionPerformed

    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed
        AYMaWELCOME welcome = new AYMaWELCOME();
        welcome.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homebtnActionPerformed
    


    
    
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
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgound;
    private javax.swing.JButton clubbtn;
    private javax.swing.JButton eventbtn;
    private javax.swing.JButton homebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JButton userbtn;
    // End of variables declaration//GEN-END:variables
}
