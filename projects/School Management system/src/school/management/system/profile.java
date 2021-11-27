/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.management.system;

/**
 *
 * @author dell.com
 */
public class profile extends javax.swing.JFrame {
  ;

    public profile() {
        initComponents();
       

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 670));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 153, 51));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("LOGOUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(460, 600, 120, 30);

        jTextArea1.setBackground(new java.awt.Color(255, 204, 102));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("S.F.D.A.V. Public School established in 1991 has the strength of 1000 students on its roll. The school has a building \nhaving beautiful lush green campus constructed on 2 acres of land in Avas Vikas Coloy, Circular Road. The school functions \nunder the registered D.A.V. College Trust and Managing Society with eminent educationists, social workers.\n\nThe school is housed in modern alternative building equipped with all requisite facilities, well stocked libraries, \nlaboratories, computers, smart classrooms facilities for creative arts, indoor and outdoor games. The school’s educational \nphilosophy is inspired by the progressive views of Maharishi Dayanand Saraswati a Hindu spiritual leader and social \nreformer,opens opportunities for the development of different facets of the child’s personality. Besides academic \nexcellence and intellectual development , the school endeavors to help each child discover and develop one’s innate \ntalents and abilities. It seeks to instill in the children. Positive attitudes and values such as truthfulness, \nunselfishness, self respect , self control, sense of duty , good manners , team spirit , dignity of labours , punctuality , \ncompassion , freedom of mind and a rational and scientific approach. Conscious effort is made to poster pride and love for\nthe country and its heritage. The school Alumni has indeed done their Alma Mater proud by exploring great opportunities\nin the country and abroad to give back to society what they were nurtured for.\n\nAcademically, the result has been extremely good with many students securing distinctions in all subjects. Students have \nbeen securing Merit Certificates from C.B.S.E. for being among the top 0.1% in their subjects at All India level.\n\nIn sports and other co-curricular activities also, the school’s students have won several gold and other medals and trophies\nespecially in volley ball, table tennis, debates, music etc. Some of our students were selected to represent U.P. in the \nnationals. The school has been conferred with International School award by British Council.");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 100, 910, 490);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("WELCOME TO OUR SCHOOL");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 10, 700, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
