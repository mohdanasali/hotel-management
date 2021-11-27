/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * newbookingfrm.java
 *
 * Created on Feb 16, 2012, 1:19:10 PM
 */

package hotelmanagement;
import java.sql.*;
import javax.swing.*;
import java.util.*;
import java.util.Date;


/**
 *
 * @author nbc
 */
public class newbookingfrm extends javax.swing.JFrame {

    /** Creates new form newbookingfrm */
    public newbookingfrm() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtbno = new javax.swing.JTextField();
        txtcno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtdfrom = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtdto = new javax.swing.JTextField();
        cmbgender = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        cmbroomno = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txttype = new javax.swing.JTextField();
        txtrent = new javax.swing.JTextField();
        txtamount = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New booking");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel1.setText("NEW BOOKING");

        jLabel2.setText("Customer No.");

        jLabel3.setText("Booking No.");

        jLabel4.setText("Customer Name");

        jLabel5.setText("Customer Address");

        txtaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddressActionPerformed(evt);
            }
        });

        jLabel6.setText("Phone Name");

        jLabel7.setText("Gender");

        jLabel8.setText("Booking date from");

        jLabel9.setText("Booking Date To");

        txtdto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdtoActionPerformed(evt);
            }
        });

        cmbgender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

        jLabel10.setText("Room no");

        cmbroomno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbroomnoActionPerformed(evt);
            }
        });

        jLabel11.setText("Room type");

        jLabel12.setText("Rent per day");

        jLabel13.setText("Advance amount");

        save.setFont(new java.awt.Font("Tahoma", 1, 11));
        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Tahoma", 1, 11));
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Tahoma", 1, 11));
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txttype, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                        .addGap(381, 381, 381))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtaddress, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtbno)
                                    .addComponent(txtcno, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtcname, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(126, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdfrom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(txtphone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(txtamount, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(txtrent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(save)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(clear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(exit)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(60, 60, 60)
                                        .addComponent(cmbgender, 0, 94, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtdto, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)))
                                .addGap(129, 129, 129))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbroomno, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jLabel1)
                .addContainerGap(294, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtbno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtcname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(cmbgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdfrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(txtdto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cmbroomno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txttype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(txtrent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(save)
                            .addComponent(clear)
                            .addComponent(exit))
                        .addGap(105, 105, 105))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddressActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtaddressActionPerformed

    private void txtdtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdtoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtdtoActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    int tbno=0;
    try
    {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection c=DriverManager.getConnection("jdbc:odbc:hotel");
        Statement state=c.createStatement();
        ResultSet res=state.executeQuery("select * from roomtable");
        while(res.next())
        {
               cmbroomno.addItem((Object)res.getString("roomno"));
               
        }
        res=state.executeQuery("select * from bookingtable");
        while(res.next())
        {
            tbno=res.getInt("bno");

        }


    }catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,e.getMessage());
    }
    txtbno.setText(String.valueOf(tbno+1));
    txtcno.requestFocus();


    }//GEN-LAST:event_formWindowActivated

    private void cmbroomnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbroomnoActionPerformed
    int r;
    r=Integer.parseInt(String.valueOf(cmbroomno.getSelectedItem()));
    String qtype,qrent;
    
    try
    {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection c=DriverManager.getConnection("jdbc:odbc:hotel");
        Statement state=c.createStatement();
        ResultSet res=state.executeQuery("select * from roomtable where roomno="+r);
        res.next();
        qtype=res.getString("roomtype");
        qrent=res.getString("rent");

        txttype.setText(qtype);
        txtrent.setText(qrent);
        
    }catch(Exception e)
    {
    JOptionPane.showMessageDialog(null,"Invalid data");
    }

    }//GEN-LAST:event_cmbroomnoActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        String tbdatefrom,tbdateto;
        int tbno;
        long days1,days2,days3,days4;
        int dy=0,dm=0,dd=0,dy2,dm2,dd2,dy3,dm3,dd3,dy4,dd4,dm4;
        int tcno,troomno,trent,tadv;
        String tcname,tphone,tadd,tgender,tfrom,tto,ttype;

        tbdatefrom=txtdfrom.getText();
        tbdateto=txtdto.getText();

        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection c=DriverManager.getConnection("jdbc:odbc:hotel");
            Statement state=c.createStatement();
            ResultSet res1;
            int qrno;
            qrno=Integer.parseInt((String)cmbroomno.getSelectedItem());
            
            String tbdfrom,tbdto,query;
            boolean flag=true;
            query="select * from bookingtable where roomno="+qrno;
            res1=state.executeQuery(query);
            while(res1.next())
            {
                tbdfrom=res1.getString("dfrom");
                tbdto=res1.getString("dto");

                dy=Integer.parseInt(tbdfrom.substring(0,4));
                dm=Integer.parseInt(tbdfrom.substring(5,7));
                dd=Integer.parseInt(tbdfrom.substring(8,10));

                dy2=Integer.parseInt(tbdto.substring(0,4));
                dm2=Integer.parseInt(tbdto.substring(5,7));
                dd2=Integer.parseInt(tbdto.substring(8,10));

            //form date

                dd3=Integer.parseInt(tbdatefrom.substring(0,2));
                dm3=Integer.parseInt(tbdatefrom.substring(3,5));
                dy3=Integer.parseInt(tbdatefrom.substring(6,10));
              

                dd4=Integer.parseInt(tbdateto.substring(0,2));
                dm4=Integer.parseInt(tbdateto.substring(3,5));
                dy4=Integer.parseInt(tbdateto.substring(6,10));

                Calendar c1=Calendar.getInstance();
                Calendar c2=Calendar.getInstance();
                Calendar c3=Calendar.getInstance();
                Calendar c4=Calendar.getInstance();

                c1.set(dy,dm,dd);
                c2.set(dy2,dm2,dd2);
                c3.set(dy3,dm3,dd3);
                c4.set(dy4,dm4,dd4);

                long millis1=c1.getTimeInMillis();
                long millis2=c2.getTimeInMillis();
                long millis3=c3.getTimeInMillis();
                long millis4=c4.getTimeInMillis();

                days1=millis1/(24*60*60*1000);
                days2=millis2/(24*60*60*1000);
                days3=millis3/(24*60*60*1000);
                days4=millis4/(24*60*60*1000);

                JOptionPane.showMessageDialog(null,"Testing");
                
                if(days3>=days1 && days3<=days2||days4>=days1 && days4<=days2)
                {
                    
                        flag=false;
                        break;
                }
            }
            /*if(flag==false)
            {
                JOptionPane.showMessageDialog(null,"Sorry! room already booked");
                dispose();
            }*/
                

            tbno=Integer.parseInt(txtbno.getText());
            tcno=Integer.parseInt(txtcno.getText());
            troomno=Integer.parseInt((String)cmbroomno.getSelectedItem());
            trent=Integer.parseInt(txtrent.getText());
            tadv=Integer.parseInt(txtamount.getText());
            tcname=txtcname.getText();
            tphone=txtphone.getText();
            tadd=txtaddress.getText();
            tgender=String.valueOf(cmbgender.getSelectedItem());
            tfrom=txtdfrom.getText();
            tto=txtdto.getText();
            ttype=txttype.getText();

            query = "insert into bookingtable values("+tbno+","+tcno+",'"+tcname+"','"+tadd+"','"+tphone+"','"+tgender+"',"+troomno+",'"+ttype+"',"+trent+",'"+tfrom+"','"+tto+"',"+tadv+")";
            state.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Successfully saved");

        }catch(Exception e)
        {
             JOptionPane.showMessageDialog(null,"ALREADY BOOKED");
        }

    }//GEN-LAST:event_saveActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
            dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        txtbno.setText("");
        txtcno.setText("");
        txtrent.setText("");
        txtamount.setText("");
        txtcname.setText("");
        txtphone.setText("");
        txtaddress.setText("");
        txtdfrom.setText("");
        txtdto.setText("");
        txttype.setText("");
        int tbno=0;

      try
      {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection c=DriverManager.getConnection("jdbc:odbc:hotel");
        Statement state=c.createStatement();
        ResultSet res;
        res=state.executeQuery("select * from bookingtable");
        while(res.next())
        {
            tbno=res.getInt("bno");

        }


    }catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,e.getMessage());
    }
        txtbno.setText(String.valueOf(tbno+1));
        txtcno.requestFocus();
    }//GEN-LAST:event_clearActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newbookingfrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JComboBox cmbgender;
    private javax.swing.JComboBox cmbroomno;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton save;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtamount;
    private javax.swing.JTextField txtbno;
    private javax.swing.JTextField txtcname;
    private javax.swing.JTextField txtcno;
    private javax.swing.JTextField txtdfrom;
    private javax.swing.JTextField txtdto;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtrent;
    private javax.swing.JTextField txttype;
    // End of variables declaration//GEN-END:variables

}