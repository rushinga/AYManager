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
public class materialpage extends javax.swing.JFrame {

    /**
     * Creates new form materialpage
     */
    public materialpage() {
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

        materialpanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        closebtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(280, 200));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(984, 566));

        materialpanel.setBackground(new java.awt.Color(204, 204, 204));
        materialpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 255));
        jLabel5.setText("AY Materials Tab");
        materialpanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));

        closebtn.setBackground(new java.awt.Color(255, 204, 51));
        closebtn.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        closebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AYM/view/image/close.png"))); // NOI18N
        closebtn.setText("Close");
        closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebtnActionPerformed(evt);
            }
        });
        materialpanel.add(closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, -1, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(materialpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(materialpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtnActionPerformed
        setVisible(false);
    }//GEN-LAST:event_closebtnActionPerformed

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
            java.util.logging.Logger.getLogger(materialpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(materialpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(materialpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(materialpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new materialpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closebtn;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel materialpanel;
    // End of variables declaration//GEN-END:variables
}
