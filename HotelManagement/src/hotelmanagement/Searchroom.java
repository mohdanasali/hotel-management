

package hotelmanagement;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class Searchroom extends javax.swing.JFrame {

    /** Creates new form Searchroom */
    public Searchroom() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        op1 = new javax.swing.JRadioButton();
        op2 = new javax.swing.JRadioButton();
        lb1 = new javax.swing.JLabel();
        txts = new javax.swing.JTextField();
        serach = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tb.setFont(new java.awt.Font("Tahoma", 1, 12));
        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Room No", "Room Type", "Rent"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tb);

        exit.setFont(new java.awt.Font("Tahoma", 1, 12));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Andalus", 1, 24));
        jLabel1.setText("Serch Room");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12));
        jLabel2.setText("OPTIONS");

        buttonGroup1.add(op1);
        op1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        op1.setText("Serch by Room Number");
        op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(op2);
        op2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        op2.setText("Serch by Room Type");
        op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op2ActionPerformed(evt);
            }
        });

        lb1.setFont(new java.awt.Font("Tahoma", 1, 12));
        lb1.setText("Enter Room No. ");

        txts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsActionPerformed(evt);
            }
        });

        serach.setFont(new java.awt.Font("Tahoma", 1, 12));
        serach.setMnemonic('s');
        serach.setText("Serch");
        serach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serachActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(op2)
                                    .addComponent(op1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(jLabel2))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txts, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(serach))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(exit)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(op1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(op2)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb1)
                    .addComponent(txts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(serach)
                .addGap(63, 63, 63)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exit)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op1ActionPerformed
        lb1.setText("Enter Room No.");
}//GEN-LAST:event_op1ActionPerformed

    private void op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op2ActionPerformed
        lb1.setText("Enter Room Type");
}//GEN-LAST:event_op2ActionPerformed

    private void txtsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtsActionPerformed

    private void serachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serachActionPerformed
        try {
            DefaultTableModel m=(DefaultTableModel)tb.getModel();
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection c = DriverManager.getConnection("jdbc:odbc:hotel");
            Statement state = c.createStatement();
            String query;
            ResultSet res;
            int srno;
            String stype;
            //Removing all rows
            int rows=m.getRowCount();
            for(int i=0;i<rows;i++) {
                m.removeRow(0);
            }
            if(op1.isSelected()) {
                srno=Integer.parseInt(txts.getText());
                query="select * from roomtable where roomno="+srno;
                res=state.executeQuery(query);
                while(res.next()) {
                    m.addRow(new Object[]{res.getString("roomno"), res.getString("roomtype"), res.getString("Rent")});
                }
            } else if(op2.isSelected()) {
                stype = txts.getText();
                query="select * from roomtable where roomtype='"+stype+"'";
                res=state.executeQuery(query);
                while(res.next()) {
                    m.addRow(new Object[]{res.getString("roomno"), res.getString("roomtype"), res.getString("Rent")});
                }
            }
        }catch(Exception e) {
        }
}//GEN-LAST:event_serachActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        dispose();
}//GEN-LAST:event_exitActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Searchroom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb1;
    private javax.swing.JRadioButton op1;
    private javax.swing.JRadioButton op2;
    private javax.swing.JButton serach;
    private javax.swing.JTable tb;
    private javax.swing.JTextField txts;
    // End of variables declaration//GEN-END:variables

}