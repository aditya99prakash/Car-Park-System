/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JProj;

 
import Impor.NewJFrame2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author MAHE
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jRadioButton3 = new javax.swing.JRadioButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 0));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 0, 0));
        jRadioButton2.setText("SERVICE");
        jRadioButton2.setToolTipText("");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton2);
        jRadioButton2.setBounds(370, 180, 100, 23);

        jRadioButton1.setBackground(new java.awt.Color(51, 255, 51));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 0, 0));
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("ADMIN");
        jPanel2.add(jRadioButton1);
        jRadioButton1.setBounds(370, 210, 100, 23);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PASSWORD");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 200, 70, 30);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("USER ID");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 160, 60, 30);

        jLabel2.setBackground(new java.awt.Color(255, 153, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CAR PARKING");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(40, 20, 300, 80);

        jButton2.setText("LOGIN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(110, 280, 73, 30);

        jButton3.setText("SIGN UP");
        jButton3.setToolTipText("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(220, 280, 90, 30);

        jTextField1.setText(" ");
        jPanel2.add(jTextField1);
        jTextField1.setBounds(100, 160, 100, 30);

        jRadioButton3.setBackground(new java.awt.Color(204, 204, 0));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 0, 0));
        jRadioButton3.setText("USER");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton3);
        jRadioButton3.setBounds(370, 150, 100, 23);
        jPanel2.add(jPasswordField1);
        jPasswordField1.setBounds(100, 200, 100, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JProj/multi-storey-car-park-2705368_960_720.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 570, 410);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {System.out.print("SS");
            Class.forName("com.mysql.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","tiger");
	Statement stmt=con.createStatement();
        int flag=0;
        String thisid="";
       String userid="";
       String pword="";
       if (jRadioButton3.isSelected()==true)
       {
       String selectSQL = "SELECT ID,Pword FROM lab.customers ";
PreparedStatement preparedStatement = con.prepareStatement(selectSQL);
//preparedStatement.setInt(1, 1001);
ResultSet rs = preparedStatement.executeQuery(selectSQL );
while (rs.next()) {
	  userid = rs.getString("ID");
	  pword = rs.getString("Pword");
      //    System.out.println(userid);
      //    System.out.println(jTextField1.toString());
          if (jTextField1.getText().trim().equals(userid))
                {//System.out.println("SS");
                System.out.println(jPasswordField1.getText());
                  if( jPasswordField1.getText().trim().equals(pword))
                  {thisid=userid;
                      flag=1;
                  break;
                  }
        //      jTextField1.setText(userid);
          //            jTextField2.setText(pword);
             }
}
    //   jTextField1.setText(userid);
      //                jTextField2.setText(pword);
          if(flag==1)
          {      JOptionPane.showMessageDialog(this, "SUCCESFULL LOGIN");
       
          BOOKING b =new BOOKING(thisid);
           b.setSize(750, 450);

          b.setVisible(true);
          }
          else JOptionPane.showMessageDialog(this, "Unsuccesfull Login");
       }   
 if (jRadioButton2.isSelected()==true)
 {flag=0;
  String selectSQL = "SELECT ID,Pword FROM lab.taxi_driver ";
 PreparedStatement preparedStatement = con.prepareStatement(selectSQL);
//preparedStatement.setInt(1, 1001);
ResultSet rs = preparedStatement.executeQuery(selectSQL );
while (rs.next()) {
    
    userid = rs.getString("ID");
	  pword = rs.getString("Pword");
      //    System.out.println(userid);
      //    System.out.println(jTextField1.toString());
          if (jTextField1.getText().trim().equals(userid))
                {System.out.println("SS");
                System.out.println(jPasswordField1.getText());
                  if( jPasswordField1.getText().equals(pword))
                  {thisid=userid;
                      flag=1;
                  break;
                  }
        //      jTextField1.setText(userid);
          //            jTextField2.setText(pword);
             }
}
    //   jTextField1.setText(userid);
      //                jTextField2.setText(pword);
          if(flag==1)
          {    JOptionPane.showMessageDialog(this, "SUCCESFULL LOGIN");
          taxi t =new taxi(thisid);
          t.setVisible(true);
          }
          else {
              
               selectSQL = "SELECT ID,Pword FROM lab.valet ";

//preparedStatement.setInt(1, 1001);
 rs = preparedStatement.executeQuery(selectSQL );
while (rs.next()) {
    
    userid = rs.getString("ID");
	  pword = rs.getString("Pword");
      //    System.out.println(userid);
      //    System.out.println(jTextField1.toString());
          if (jTextField1.getText().trim().equals(userid))
                {System.out.println("SS");
                System.out.println(jPasswordField1.getText());
                  if( jPasswordField1.getText().equals(pword))
                  {thisid=userid;
                      flag=1;
                  break;
                  }
                }
              
          
          
          }
       
if (flag==0)
JOptionPane.showMessageDialog(this, "UNSUCCESFUL LOGIN");
else
{
    valet v =new valet(thisid);
    v.setVisible(true);
}
          }
     
 

 }
 
 if (jRadioButton1.isSelected()==true)
 {if (jTextField1.getText().trim().equals("admin"))
 { if( jPasswordField1.getText().equals("admin100"))
 {
     flag=1;
     
 }
     
 }
 if(flag==0)
 {
     JOptionPane.showMessageDialog(this, "UNSUCCESFUL LOGIN");
 }
 else{
     ADMIN_LOGIN a=new ADMIN_LOGIN();
     a.setVisible(true);
     dispose();
 }
     
 }
 
       
 } catch (Exception ex) {
            Logger.getLogger(NewJFrame2.class.getName()).log(Level.SEVERE, null, ex);
        
   }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//JOptionPane.showMessageDialog(this, "SUCCESFULL LOGIN");
//dispose();
//JProj.registration r;        

     //   r = new JProj.registration();
        
//JProj.eee
//r.setVisible(true);
dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
