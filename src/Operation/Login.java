/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Operation;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {
 
    public Login() {
        initComponents();
        setTitle("Login");
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        p1 = new javax.swing.JPasswordField();
        submit_bt = new javax.swing.JButton();
        cancel_bt = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t_rbt = new javax.swing.JRadioButton();
        s_rbt = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1136, 71, -1, -1));

        jLabel4.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Administration:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, 20));

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        jPanel1.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 170, 20));

        p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1ActionPerformed(evt);
            }
        });
        jPanel1.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 170, -1));

        submit_bt.setText("Submit");
        submit_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btActionPerformed(evt);
            }
        });
        jPanel1.add(submit_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        cancel_bt.setText("Cancel");
        cancel_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btActionPerformed(evt);
            }
        });
        jPanel1.add(cancel_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 20));

        jLabel2.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("Register");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 80, 30));

        buttonGroup1.add(t_rbt);
        t_rbt.setText("Teacher");
        t_rbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_rbtActionPerformed(evt);
            }
        });
        jPanel1.add(t_rbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        buttonGroup1.add(s_rbt);
        s_rbt.setText("Student");
        s_rbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_rbtActionPerformed(evt);
            }
        });
        jPanel1.add(s_rbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/背景图1.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 230));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1ActionPerformed

    private void submit_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btActionPerformed
        
        try{
        PreparedStatement pst;
        ResultSet rs;
        Connection con=DBUtil.getConnection();
        String sql=null;
        boolean option1=t_rbt.isSelected();
        boolean option2=s_rbt.isSelected();
        if(option1)
           {
              sql = "select * from user_teacher where TID=? and TPassword=?";
           }
        if(option2){
              sql = "select * from user_student where SID=? and SPassword=?";
           }
        pst=con.prepareStatement(sql);
        pst.setString(1,t1.getText());
        pst.setString(2,p1.getText());
        String getid=t1.getText();
        rs=pst.executeQuery();
       if(t1.getText().length()==0)
       {       JOptionPane.showMessageDialog(this, "Empty User Name","Warning",JOptionPane.WARNING_MESSAGE);  }    
       else if(p1.getPassword().length==0)  
       {       JOptionPane.showMessageDialog(this, "Empty Password","Warning",JOptionPane.WARNING_MESSAGE);   }
       else if (rs.next())
       {   
           if(option1)
           {
               MainScreen_Teacher t=new MainScreen_Teacher(t1.getText());
                t.setVisible(true);
                dispose();
           }
           if(option2){
                    MainScreen_Student k = new MainScreen_Student(t1.getText());
                    k.setVisible(true);
                    dispose();
           }
           
       }
       else
       {
           JOptionPane.showMessageDialog(this, "Incorrect User Name or Password","Error",JOptionPane.ERROR_MESSAGE);
       }
       }
       catch(Exception e){
           System.out.println(e);
       }
        
    }//GEN-LAST:event_submit_btActionPerformed

    private void cancel_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cancel_btActionPerformed

    private void t_rbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_rbtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_rbtActionPerformed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed

   }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Register s = new Register();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void s_rbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_rbtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s_rbtActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            
            public void run() {
             
                new Login().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancel_bt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField p1;
    private javax.swing.JRadioButton s_rbt;
    private javax.swing.JButton submit_bt;
    private javax.swing.JTextField t1;
    private javax.swing.JRadioButton t_rbt;
    // End of variables declaration//GEN-END:variables
}