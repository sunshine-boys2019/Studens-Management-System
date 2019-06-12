/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Logging extends javax.swing.JFrame {
    String get_user;
    /**
     * Creates new form Register
     */
    public Logging() {
        initComponents();
    }

    Logging(String user) {
        initComponents();
        get_user=user;
        setTitle("Logging");
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
        jLabel2 = new javax.swing.JLabel();
        submit_bt = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        SID = new javax.swing.JTextField();
        btm = new javax.swing.JRadioButton();
        btf = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        enrollyear = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        month = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        day = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        major = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        year = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        place = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        SName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Native palce:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        submit_bt.setText("Submit");
        submit_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btActionPerformed(evt);
            }
        });
        jPanel1.add(submit_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jLabel3.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("日");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, 20));

        SID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIDActionPerformed(evt);
            }
        });
        jPanel1.add(SID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 100, -1));

        buttonGroup1.add(btm);
        btm.setText("M");
        jPanel1.add(btm, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 40, -1));

        buttonGroup1.add(btf);
        btf.setText("F");
        jPanel1.add(btf, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gender:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        enrollyear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2015", "2016", "2017", "2018" }));
        enrollyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enrollyearActionPerformed(evt);
            }
        });
        jPanel1.add(enrollyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 70, -1));

        jLabel5.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jPanel1.add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("年");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, 20));

        day.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(day, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("月");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, 20));

        jLabel8.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Birth:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        major.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                majorActionPerformed(evt);
            }
        });
        jPanel1.add(major, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 100, 20));

        jLabel9.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Major:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        year.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1994", "1995", "1996", "1997", "1998", "1999", "2000" }));
        jPanel1.add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        jLabel10.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("年");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, 20));

        jLabel11.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Enrollment date:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        place.setColumns(20);
        place.setRows(5);
        jScrollPane1.setViewportView(place);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 170, 90));

        jLabel12.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Name:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        SName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SNameActionPerformed(evt);
            }
        });
        jPanel1.add(SName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 100, -1));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/背景图.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 330));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submit_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btActionPerformed
        try {
            PreparedStatement pst1;
            PreparedStatement pst2;
            Connection con=DBUtil.getConnection();
            String sql1 = "insert into info_student (SID,SName,SGender,SBirth,Major,Enrollmentyear,Nativeplace) values(?,?,?,?,?,?,?)";
            pst1 = con.prepareStatement(sql1);
            pst1.setString(1, SID.getText());
            pst1.setString(2, SName.getText());
            String sex; 
            if (btm.isSelected()) {
                sex = "M";
            } else {
                sex = "F";
            }
            pst1.setString(3, sex);
            String birth = (String) year.getSelectedItem() + "/" + (String) month.getSelectedItem() + "/" + (String) day.getSelectedItem();
            pst1.setString(4, birth);
            String Major =major.getText();
            pst1.setString(5, Major);
            String Enrollyear = (String) enrollyear.getSelectedItem();
            pst1.setString(6, Enrollyear);
            pst1.setString(7, place.getText());
            pst1.executeUpdate();
            String sql2 = "insert into user_student values(SID,SPassword) values(?,?)";
            pst2 = con.prepareStatement(sql2);
            pst2.setString(1,SID.getText());
            pst2.setString(2,"1234");
            pst2.executeUpdate();
            dispose();
            pst1.close();
            pst2.close();
            con.close();
        } catch (Exception e) {
            System.out.println( e);
        }
        MainScreen_Teacher s = new MainScreen_Teacher(get_user);
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_submit_btActionPerformed

    private void SIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SIDActionPerformed

    private void SNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MainScreen_Teacher s = new MainScreen_Teacher(get_user);
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void majorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_majorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_majorActionPerformed

    private void enrollyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrollyearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enrollyearActionPerformed

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
            java.util.logging.Logger.getLogger(Logging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Logging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Logging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Logging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Logging().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SID;
    private javax.swing.JTextField SName;
    private javax.swing.JRadioButton btf;
    private javax.swing.JRadioButton btm;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox day;
    private javax.swing.JComboBox enrollyear;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField major;
    private javax.swing.JComboBox month;
    private javax.swing.JTextArea place;
    private javax.swing.JButton submit_bt;
    private javax.swing.JComboBox year;
    // End of variables declaration//GEN-END:variables
}
