package GUIProgram;

public class HomePage extends javax.swing.JFrame{
    public static StudentSignIn stdSignIn=new StudentSignIn();
    public static StudentSignUp stdSignUp=new StudentSignUp();
    public static LecturerSignUp lecSignUp=new LecturerSignUp();
    public static LecturerSignIn lecSignIn=new LecturerSignIn();


    public HomePage() {
        initComponents();
    }



    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnSTDSignUp = new javax.swing.JButton();
        btnLECSignUp = new javax.swing.JButton();
        btnSTDSignIn = new javax.swing.JButton();
        btnLECSignIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel1.setText("Welcome To University Management System");

        btnSTDSignUp.setFont(new java.awt.Font("Tahoma", 0, 18));
        btnSTDSignUp.setText("Sign Up As Student");
        btnSTDSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSTDSignUpActionPerformed(evt);
            }
        });

        btnLECSignUp.setFont(new java.awt.Font("Tahoma", 0, 18));
        btnLECSignUp.setText("Sign Up As Lecturer");
        btnLECSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLECSignUpActionPerformed(evt);
            }
        });

        btnSTDSignIn.setFont(new java.awt.Font("Tahoma", 0, 18));
        btnSTDSignIn.setText("Sign In As Student");
        btnSTDSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSTDSignInActionPerformed(evt);
            }
        });

        btnLECSignIn.setFont(new java.awt.Font("Tahoma", 0, 18));
        btnLECSignIn.setText("Sign In As Lecturer");
        btnLECSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLECSignInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jLabel1)
                                .addContainerGap(107, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnLECSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSTDSignUp)
                                        .addComponent(btnSTDSignIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnLECSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(268, 268, 268))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel1)
                                .addGap(69, 69, 69)
                                .addComponent(btnSTDSignUp)
                                .addGap(18, 18, 18)
                                .addComponent(btnLECSignUp)
                                .addGap(18, 18, 18)
                                .addComponent(btnSTDSignIn)
                                .addGap(18, 18, 18)
                                .addComponent(btnLECSignIn)
                                .addContainerGap(195, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void btnSTDSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSTDSignUpActionPerformed
        // TODO add your handling code here:

        stdSignUp.setVisible(true);
        this.setVisible(false);
        this.dispose();



    }//GEN-LAST:event_btnSTDSignUpActionPerformed

    private void btnLECSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLECSignUpActionPerformed
        // TODO add your handling code here:

        lecSignUp.setVisible(true);
        this.setVisible(false);
        this.dispose();




    }//GEN-LAST:event_btnLECSignUpActionPerformed

    private void btnSTDSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSTDSignInActionPerformed
        // TODO add your handling code here:

        stdSignIn.setVisible(true);
        this.setVisible(false);
        this.dispose();

    }//GEN-LAST:event_btnSTDSignInActionPerformed

    private void btnLECSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLECSignInActionPerformed
        // TODO add your handling code here:

        lecSignIn.setVisible(true);
        this.setVisible(false);
        this.dispose();

    }//GEN-LAST:event_btnLECSignInActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new HomePage().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLECSignIn;
    private javax.swing.JButton btnLECSignUp;
    private javax.swing.JButton btnSTDSignIn;
    private javax.swing.JButton btnSTDSignUp;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
