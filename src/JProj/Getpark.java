package JProj;


import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;






/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAHE
 */

public class Getpark extends javax.swing.JFrame {
 static int fg=0;
    String thisid;
static int prevred[]=new int[10];
static int x=0,s=0,flag=0;
static int t;
int temp;
   static  int graph[][] = new int[][]{{0,1,2,3,4,5,6,7,8,9,10}, {1,0,1,2,3,4,5,6,7,8,9}, 
{2, 1, 0, 1, 2,3,4,5,6,7,8}, 
{3, 2,1,0,1,2,3,4,5,6,7}, 
 {4, 3, 2, 1, 0,1,2,3,4,5,6}, 
 {5,4,3,2,1,0,1,2,3,4,5},
 {6,5,4,3,2,1,0,1,2,3,4},
          {7,6,5,4,3,2,1,0,1,2,3},
          {8,7,6,5,4,3,2,1,0,1,2}  ,   
          {9,8,7,6,5,4,3,2,1,0,1},
          {10,9,8,7,6,5,4,3,2,1,0}
                  
  }; 
        int graph2[][] = new int[][]{{0,1,2,3,4,5,6,7,8,9,10}, {1,0,1,2,3,4,5,6,7,8,9}, 
{2, 1, 0, 1, 2,3,4,5,6,7,8}, 
{3, 2,1,0,1,2,3,4,5,6,7}, 
 {4, 3, 2, 1, 0,1,2,3,4,5,6}, 
 {5,4,3,2,1,0,1,2,3,4,5},
 {6,5,4,3,2,1,0,1,2,3,4},
          {7,6,5,4,3,2,1,0,1,2,3},
          {8,7,6,5,4,3,2,1,0,1,2}  ,   
          {9,8,7,6,5,4,3,2,1,0,1},
          {10,9,8,7,6,5,4,3,2,1,0}
                  
  }; 
      
 //int mark[][]=new int[10][10];
    Getpark(String thisid) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    this.thisid=thisid;
    initComponents();
     
     JButton jx[]={jButton1,jButton2,jButton3,jButton4,jButton5,jButton6,jButton7,jButton8,jButton9,jButton10};
     for(int j=0;j<x;j++)
                { t=prevred[j];
                //System.out.println(prevred[j]+"J is"+j );
                    jx[t].setBackground(Color.red);
                }
     
     for(int a=0;a<10;a++)
     {
         for(int b=0;b<10;b++)
         {
             System.out.print(graph[a][b]+"  ");
             
         }System.out.println();
     }System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
     
    }
    
    
  
     class Helper extends TimerTask{

       
    int i=0;
   
    Timer tim;
    Helper(Timer tim)
    {
        this.tim=tim;
    }
        public void run()
       {//i++;
           jLabel2.setText(String.valueOf(i++));
            if(i==6)
            
            {//synchronized()
             
              if (jCheckBox1.isSelected()==true)
              {  
                  try {
                  JOptionPane.showMessageDialog(rootPane, "Slot Booked");
                  Class.forName("com.mysql.jdbc.Driver");
                  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","tiger");
                  Statement stmt=con.createStatement();
                   String selectSQL = "update lab.customers set selected='"+String.valueOf(temp+1)+"' where ID='"+thisid+"'";
PreparedStatement preparedStatement = con.prepareStatement(selectSQL);
//preparedStatement.setInt(1, 1001);
 preparedStatement.execute();
                jCheckBox1.setSelected(false);
                  if(fg!=1)//&&flag!=0)
    {System.out.println("called"+temp);
        for(int k=0;k<10;k++)
    {graph[temp+1][k]=999;
    
    graph[k][temp+1]=999;
    }
    
    } fg=0;
    flag=1;
    
     for(int a=0;a<10;a++)
     {
         for(int b=0;b<10;b++)
         {
             System.out.print(graph[a][b]+"  ");
             
         }System.out.println();
     }System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
      
                
                  } catch (Exception ex) {
                      Logger.getLogger(Getpark.class.getName()).log(Level.SEVERE, null, ex);
                  }
              }else{
                  fg=1;
           JButton jx[]={jButton1,jButton2,jButton3,jButton4,jButton5,jButton6,jButton7,jButton8,jButton9,jButton10};
                  for(int j=0;j<10;j++)
                {
                    jx[temp].setBackground(Color.green);
                }
               x--;
                JOptionPane.showMessageDialog(rootPane, "TIME UP");
              }
             tim.cancel();
            
              
                    }}
        
    }

    static final int V=11; 
	int minDistance(int dist[], Boolean sptSet[]) 
	{ 
		// Initialize min value 
		int min = Integer.MAX_VALUE, min_index=-1; 

		for (int v = 0; v < V; v++) 
			if (sptSet[v] == false && dist[v] <= min) 
			{ 
				min = dist[v]; 
				min_index = v; 
			} 

		return min_index; 
	} 
        
        void printSolution(int dist[], int n) 
	{  temp=dist[1];
		System.out.println("Vertex Distance from Source"); 
		for (int i = 1; i < V; i++) 
                { if (dist[i]<temp)
                             temp=dist[i];}
                 
                
           JButton jx[]={jButton1,jButton2,jButton3,jButton4,jButton5,jButton6,jButton7,jButton8,jButton9,jButton10};
        temp--;
 //       System.out.println("TEMP IS"+temp);
      prevred[x]=temp;
      System.out.println(prevred[x]+"XIS"+x);
      jx[temp].setBackground(Color.red);
             x++;
                
                    
                
           
             
         for (int i = 1; i < V; i++) 
                {
                 //   System.out.println(dist[i]);
                }
	} 
    /**
     * Creates new form New
     * JFrame
     */
          
        void dijkstra(int graph[][], int src) 
	{ 
		int dist[] = new int[V]; // The output array. dist[i] will hold 
								// the shortest distance from src to i 

		// sptSet[i] will true if vertex i is included in shortest 
		// path tree or shortest distance from src to i is finalized 
		Boolean sptSet[] = new Boolean[V]; 

		// Initialize all distances as INFINITE and stpSet[] as false 
		for (int i = 0; i < V; i++) 
		{ 
			dist[i] = Integer.MAX_VALUE; 
			sptSet[i] = false; 
		} 

		// Distance of source vertex from itself is always 0 
		dist[src] = 0; 

		// Find shortest path for all vertices 
		for (int count = 0; count < V-1; count++) 
		{ 
			// Pick the minimum distance vertex from the set of vertices 
			// not yet processed. u is always equal to src in first 
			// iteration. 
			int u = minDistance(dist, sptSet); 

			// Mark the picked vertex as processed 
			sptSet[u] = true; 

			// Update dist value of the adjacent vertices of the 
			// picked vertex. 
			for (int v = 0; v < V; v++) 

				// Update dist[v] only if is not in sptSet, there is an 
				// edge from u to v, and total weight of path from src to 
				// v through u is smaller than current value of dist[v] 
				if (!sptSet[v] && graph[u][v]!=0 && 
						dist[u] != Integer.MAX_VALUE && 
						dist[u]+graph[u][v] < dist[v]) 
					dist[v] = dist[u] + graph[u][v]; 
		} 

		// print the constructed distance array 
		printSolution(dist, V); 
	} 
    public Getpark() {
        initComponents();
        thisid="adi99";
         for(int a=0;a<10;a++)
     {
         for(int b=0;b<10;b++)
         {
             System.out.print(graph[a][b]+"  ");
             
         }System.out.println();
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

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSlot = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(102, 255, 51));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("SLOT1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 60, 100, 30);

        jButton2.setBackground(new java.awt.Color(51, 255, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("SLOT2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(120, 90, 90, 30);

        jButton3.setBackground(new java.awt.Color(51, 255, 0));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("SLOT3");
        jPanel1.add(jButton3);
        jButton3.setBounds(220, 120, 90, 30);

        jButton4.setBackground(new java.awt.Color(102, 255, 0));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("SLOT4");
        jPanel1.add(jButton4);
        jButton4.setBounds(320, 160, 100, 30);

        jSlot.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSlot.setText("GET SLOT");
        jSlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSlotActionPerformed(evt);
            }
        });
        jPanel1.add(jSlot);
        jSlot.setBounds(640, 100, 110, 25);

        jButton5.setBackground(new java.awt.Color(102, 255, 51));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setText("SLOT 5");
        jPanel1.add(jButton5);
        jButton5.setBounds(430, 200, 90, 30);

        jButton6.setBackground(new java.awt.Color(102, 255, 51));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton6.setText("SLOT6");
        jPanel1.add(jButton6);
        jButton6.setBounds(430, 260, 90, 30);

        jButton7.setBackground(new java.awt.Color(102, 255, 51));
        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton7.setText("SLOT7");
        jPanel1.add(jButton7);
        jButton7.setBounds(330, 290, 90, 30);

        jButton8.setBackground(new java.awt.Color(102, 255, 51));
        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton8.setText("SLOT8");
        jPanel1.add(jButton8);
        jButton8.setBounds(230, 320, 90, 30);

        jButton9.setBackground(new java.awt.Color(102, 255, 51));
        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton9.setText("SLOT9");
        jPanel1.add(jButton9);
        jButton9.setBounds(130, 340, 90, 30);

        jButton10.setBackground(new java.awt.Color(102, 255, 51));
        jButton10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton10.setText("SLOT10");
        jPanel1.add(jButton10);
        jButton10.setBounds(20, 360, 100, 30);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("ENTRANCE");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 20, 140, 20);

        jButton13.setBackground(new java.awt.Color(255, 255, 51));
        jButton13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton13.setText("SLOT 11");
        jPanel1.add(jButton13);
        jButton13.setBounds(20, 140, 87, 25);

        jButton14.setBackground(new java.awt.Color(255, 255, 0));
        jButton14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton14.setText("SLOT 12");
        jPanel1.add(jButton14);
        jButton14.setBounds(20, 180, 90, 25);

        jButton15.setBackground(new java.awt.Color(255, 255, 0));
        jButton15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton15.setText("SLOT 13");
        jPanel1.add(jButton15);
        jButton15.setBounds(20, 220, 87, 25);

        jButton17.setBackground(new java.awt.Color(255, 255, 0));
        jButton17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton17.setText("SLOT 15");
        jPanel1.add(jButton17);
        jButton17.setBounds(20, 310, 90, 25);

        jButton16.setBackground(new java.awt.Color(255, 255, 0));
        jButton16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton16.setText("SLOT 14");
        jPanel1.add(jButton16);
        jButton16.setBounds(20, 260, 90, 25);

        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("CONFIRM");
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(460, 40, 100, 23);

        jButton11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton11.setText("Return");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);
        jButton11.setBounds(650, 320, 77, 25);

        jButton12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton12.setText("GET VALET");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12);
        jButton12.setBounds(640, 50, 120, 25);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JProj/texture-1306790_960_720.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(4, 4, 800, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
static int i=0;
 
 
    private void jSlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSlotActionPerformed
 
     // System.out.println(fg+"fg"+t);
   //     fg=1;
  
    
    
  /*  for(int x=0;x<5;x++)
    {   for(int y=0;y<5;y++)
        {     System.out.print(graph[x][y]);
        }System.out.println();
    }*/
        dijkstra(graph, 0);         // TODO add your handling code here:
 
JOptionPane.showMessageDialog(this,"Please Confirm Slot in next 5 seconds");
  Timer tim =new Timer();
TimerTask task=new Helper(tim);
          tim.schedule(task, 0,1000);

          
          
    }//GEN-LAST:event_jSlotActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
BOOKING bsdk=new BOOKING(thisid);   
dispose();
bsdk.setSize(770, 480);
bsdk.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
 
     
    
    
        try {     
         int opt=JOptionPane.showConfirmDialog(rootPane, "VALET CONTACTED! AVAIL CAR WASH AS WELL?");
//int opt1=0;
if(opt==0)
{   try {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","tiger");
    Statement stmt=con.createStatement();
    String selectSQL = "update lab.customers set fees=fees+200 where ID='"+thisid+"'";
    PreparedStatement preparedStatement = con.prepareStatement(selectSQL);
    preparedStatement.execute();
    selectSQL = "update lab.customers set valcall='yes' where ID='"+thisid+"'";
    preparedStatement = con.prepareStatement(selectSQL);
    preparedStatement.execute();
    selectSQL = "update lab.customers set cwash='yes' where ID='"+thisid+"'";
    preparedStatement = con.prepareStatement(selectSQL);
    preparedStatement.execute();
}



// TODO add your handling code here:
catch (Exception ex) {
    Logger.getLogger(BOOKING.class.getName()).log(Level.SEVERE, null, ex);
}
}
else{ try {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","tiger");
    Statement stmt=con.createStatement();
    
    String selectSQL = "update lab.customers set valcall='yes' where id='"+thisid+"'";
    PreparedStatement  preparedStatement = con.prepareStatement(selectSQL);
    preparedStatement.execute();
}




catch (Exception ex) {
    Logger.getLogger(BOOKING.class.getName()).log(Level.SEVERE, null, ex);
}

}


Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","tiger");
Statement stmt=con.createStatement();

String selectSQL = "select selected from lab.customers where id='"+thisid+"'";
PreparedStatement  preparedStatement = con.prepareStatement(selectSQL);
 
ResultSet rs = preparedStatement.executeQuery(selectSQL );
while(rs.next()){
 s=Integer.parseInt(rs.getString("selected"));
 //s--;
// System.out.println(s);
 for(int k=0;k<10;k++)
 {  graph[s][k]=graph2[s][k];
 if (k==0)    
 graph[k][s]=graph2[k][s];
   

     //  System.out.println((graph[s][k])+"GSK");
 } fg=1;
   JButton jx[]={jButton1,jButton2,jButton3,jButton4,jButton5,jButton6,jButton7,jButton8,jButton9,jButton10};
   s--;
 jx[s].setBackground(Color.green);
 for(int k=0;k<10;k++)
 {
    if(prevred[k]==s)
    {//System.out.print(k);
        prevred[k]=prevred[k+1];
   break;
    }
 }
 x--;
 fg=1;
}
///LOL
 
   for(int a=0;a<10;a++)
     {
         for(int b=0;b<10;b++)
         {
             System.out.print(graph[a][b]+"  ");
             
         }System.out.println();
     }System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
// TODO add your handling code here:
     } catch (Exception ex) {
         Logger.getLogger(Getpark.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Getpark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Getpark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Getpark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Getpark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Getpark().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton jButton1;
    private static javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private static javax.swing.JButton jButton2;
    private static javax.swing.JButton jButton3;
    private static javax.swing.JButton jButton4;
    private static javax.swing.JButton jButton5;
    private static javax.swing.JButton jButton6;
    private static javax.swing.JButton jButton7;
    private static javax.swing.JButton jButton8;
    private static javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jSlot;
    // End of variables declaration//GEN-END:variables
}
