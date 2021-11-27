package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Registration extends javax.swing.JFrame {

    Connection con;
    ResultSet rs;
    PreparedStatement ps;
    public Registration() {
        initComponents();
        
        try{
          //  String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String leave= "jdbc:odbc:empl_leave";
            con=DriverManager.getConnection(leave);
            }  
        catch(Exception e){System.out.print("fail");}
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        b = new javax.swing.JTextField();
        a = new javax.swing.JTextField();
        c = new javax.swing.JTextField();
        d = new javax.swing.JTextField();
        e = new javax.swing.JTextField();
        f = new javax.swing.JTextField();
        g = new javax.swing.JTextField();
        h = new javax.swing.JPasswordField();
        i = new javax.swing.JPasswordField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(650, 520));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("REGISTER HERE....");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 60, 209, 33);

        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(210, 440, 139, 33);

        jLabel10.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 255));
        jLabel10.setText("SUR NAME");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(130, 170, 70, 15);
        getContentPane().add(b);
        b.setBounds(320, 170, 126, 20);

        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });
        getContentPane().add(a);
        a.setBounds(320, 140, 126, 20);
        getContentPane().add(c);
        c.setBounds(320, 200, 126, 20);
        getContentPane().add(d);
        d.setBounds(320, 230, 126, 20);
        getContentPane().add(e);
        e.setBounds(320, 260, 126, 20);
        getContentPane().add(f);
        f.setBounds(320, 290, 126, 20);
        getContentPane().add(g);
        g.setBounds(320, 320, 126, 20);
        getContentPane().add(h);
        h.setBounds(320, 350, 126, 20);
        getContentPane().add(i);
        i.setBounds(320, 380, 126, 20);

        jLabel18.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 255));
        jLabel18.setText("DOB");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(130, 200, 70, 15);

        jLabel19.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 255));
        jLabel19.setText("ADDRESS");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(130, 230, 70, 15);

        jLabel20.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 255));
        jLabel20.setText("CONTACT NO.");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(130, 260, 90, 15);

        jLabel21.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 255));
        jLabel21.setText("DESIGNATION");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(130, 290, 90, 15);

        jLabel22.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 255));
        jLabel22.setText("USERNAME");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(130, 320, 70, 15);

        jLabel23.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 255));
        jLabel23.setText("PASSWORD");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(130, 350, 70, 15);

        jLabel24.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 255));
        jLabel24.setText("CONFIRM PASSWORD");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(130, 380, 120, 15);

        jLabel25.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 255));
        jLabel25.setText("FIRST NAME");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(130, 140, 70, 15);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      String a1=a.getText();
      String a2=b.getText();
      String a3=c.getText();
      String a4=d.getText();
      String a5=e.getText();
      String a6=f.getText();
      String a7=g.getText();
      String a8=h.getText();
      String a9=i.getText();
      try
      {
      if(a8==a9)
      {
          ps= con.prepareStatement("insert into register(fname,sname,dob,addr,cno,desg,username,password)");
          ps.setString(1, a1);
          ps.setString(2, a2);
          ps.setString(3, a3);
          ps.setString(4, a4);
          ps.setString(5, a5);
          ps.setString(6, a6);
          ps.setString(8, a8);
          ps.executeQuery();
          JOptionPane.showMessageDialog(null," USER REGISTERED ");
            new LOGIN().setVisible(true);
      }
      else
      {
      JOptionPane.showMessageDialog(null,"Username already exist or confirm your password again");
            new Registration().setVisible(true);
      }
              
              
              
           
      }
      catch(Exception e){};
    }//GEN-LAST:event_jButton1ActionPerformed

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Registration().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a;
    private javax.swing.JTextField b;
    private javax.swing.JTextField c;
    private javax.swing.JTextField d;
    private javax.swing.JTextField e;
    private javax.swing.JTextField f;
    private javax.swing.JTextField g;
    private javax.swing.JPasswordField h;
    private javax.swing.JPasswordField i;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    // End of variables declaration//GEN-END:variables
}
