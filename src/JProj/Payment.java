/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JProj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author MAHE
 */
public class Payment extends javax.swing.JFrame {

    /**
     * Creates new form Payment
     */
    public Payment() {
        initComponents();
    }
String thisid;
    Payment(String thisid) {
        try {
            initComponents();
            this.thisid=thisid;
            int fee=0;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","tiger");
            Statement stmt=con.createStatement();
               String selectSQL = "SELECT fees FROM lab.customers where id='"+thisid+"'";
PreparedStatement preparedStatement = con.prepareStatement(selectSQL);
//preparedStatement.setInt(1, 1001);
ResultSet rs = preparedStatement.executeQuery(selectSQL );
  while(rs.next())
  {
      if(rs.getString("fees") == null)
      
      break;
  else
      fee=Integer.parseInt(rs.getString("fees"));
  }
 
  System.out.print(fee);
  
  selectSQL = "SELECT fee FROM lab.booking where cid='"+thisid+"'";
  preparedStatement = con.prepareStatement(selectSQL);
  rs = preparedStatement.executeQuery(selectSQL );
  while(rs.next())
  {if(rs.getString("fee") == null)
      
      break;
  else
      fee+=Integer.parseInt(rs.getString("fee"));
  } 
  jLabel3.setText("Amount Payable is "+String.valueOf(fee));
//  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        } catch ( Exception ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 153));
        jLabel2.setText("Select a Payment Mode");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(470, 10, 360, 50);

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setFont(new java.awt.Font("Rockwell Condensed", 1, 36)); // NOI18N
        jButton1.setText("Confirm Payment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(500, 260, 320, 51);

        jRadioButton1.setBackground(new java.awt.Color(255, 153, 153));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jRadioButton1.setText(" Card");
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(520, 130, 200, 39);

        jRadioButton3.setBackground(new java.awt.Color(255, 153, 153));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jRadioButton3.setText("Cash");
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(520, 180, 200, 37);

        jButton2.setBackground(new java.awt.Color(153, 255, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("ADD CARD  ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(110, 280, 160, 40);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(470, 70, 200, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JProj/pay.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 850, 400);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Add_card ac=new Add_card(thisid);  // TODO add your handling code here:
ac.setVisible(true);
ac.setSize(400, 300);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if (jRadioButton3.isSelected()==true)
{
JOptionPane.showMessageDialog(rootPane,"Pay cash at counter");
}
if (jRadioButton1.isSelected()==true)
{   try {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","tiger");
    Statement stmt=con.createStatement();
    String selectSQL = "SELECT cno FROM lab.card where id='"+thisid+"'";
    PreparedStatement preparedStatement = con.prepareStatement(selectSQL);
    ResultSet rs=preparedStatement.executeQuery(selectSQL );
   String c="";
    while(rs.next())
    {if (rs.getString("cno")==null)
        break;
        c=rs.getString("cno");
    }
    if(c.equals(""))
         JOptionPane.showMessageDialog(rootPane,"ERROR NO CARD ADDED");
    else
    JOptionPane.showMessageDialog(rootPane,"PAYMENT SUCEEDED WITH CARD NO"+c);
    
    }
// TODO add your handling code here:
    catch (Exception ex) {
        Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
    }
    
}
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton3;
    // End of variables declaration//GEN-END:variables
}
