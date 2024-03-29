/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Operation;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Administrator
 */
public class Record extends javax.swing.JFrame {
    String id;
    /**
     * Creates new form Record
     */
    public Record() {
        initComponents();
    }

    Record(String user) {
        initComponents();
        id=user;
        setTitle("Record");
        setResizable(false);
        setLocationRelativeTo(null);
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
        e_score = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        c_score = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        m_score = new javax.swing.JTextField();
        Back = new javax.swing.JButton();
        Submit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(e_score, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 60, -1));

        jLabel2.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Englishscore:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        SID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIDActionPerformed(evt);
            }
        });
        jPanel1.add(SID, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 140, -1));

        jLabel4.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Chinesescore:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));
        jPanel1.add(c_score, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 60, -1));

        jLabel5.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mathscore:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));
        jPanel1.add(m_score, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 60, -1));

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        jPanel1.add(Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/背景图1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SIDActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
       try{
           PreparedStatement pst;
           Connection con=DBUtil.getConnection();
            String sql="insert into stu_score values(?,?,?,?)";
           pst=con.prepareStatement(sql);
           pst.setString(1,SID.getText());
           pst.setString(2,c_score.getText());
           pst.setString(3,m_score.getText());
           pst.setString(4,e_score.getText());
           pst.executeUpdate();
       }catch(Exception e)
       {
           System.out.println(e);
       }
       MainScreen_Teacher s = new MainScreen_Teacher(id);
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_SubmitActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        MainScreen_Teacher s = new MainScreen_Teacher(id);
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Record().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTextField SID;
    private javax.swing.JButton Submit;
    private javax.swing.JTextField c_score;
    private javax.swing.JTextField e_score;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField m_score;
    // End of variables declaration//GEN-END:variables
}
