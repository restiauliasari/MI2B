/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing2;

/**
 *
 * @author USER
 */
public class Transfer1 extends javax.swing.JFrame {

    /**
     * Creates new form TRANSFER1
     */
    public Transfer1() {
        initComponents();
        sisa.setVisible(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        sisa = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        Tf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1020, 600));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ATM  TRANSFER");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(360, 70, 290, 40);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MASUKKAN  JUMLAH  NOMINAL");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(320, 120, 370, 50);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TEKAN  CANCEL  UNTUK  PEMBATAL");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(580, 510, 430, 30);

        jButton2.setBackground(new java.awt.Color(0, 102, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SALAH  =>");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(810, 420, 190, 50);

        sisa.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        sisa.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(sisa);
        sisa.setBounds(20, 400, 410, 30);

        jButton4.setBackground(new java.awt.Color(0, 102, 255));
        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("BENAR  =>");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(810, 330, 190, 50);

        Tf.setBackground(new java.awt.Color(0, 102, 255));
        Tf.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Tf.setForeground(new java.awt.Color(255, 255, 255));
        Tf.setText(" ");
        Tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfActionPerformed(evt);
            }
        });
        jPanel1.add(Tf);
        Tf.setBounds(390, 210, 220, 40);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("YANG  AKAN  DITRANSFER");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(350, 170, 310, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1020, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        TransferModel tf = new TransferModel();
        InformasiSaldoModel saldo = new InformasiSaldoModel();
        String jmlh = Tf.getText();
        double jmlh2 = Double.parseDouble(jmlh);
        tf.transfer = jmlh2;
        double s = Double.parseDouble(saldo.getSaldo());
        double hasil = s- tf.transfer;
        if(Tf != null){
            sisa.setVisible(true);
            sisa.setText("SISA SALDO ANDA : Rp "+hasil);
        }else{
            sisa.setVisible(false);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new Transfer().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Transfer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transfer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transfer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transfer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transfer1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Tf;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel sisa;
    // End of variables declaration//GEN-END:variables

  
}
