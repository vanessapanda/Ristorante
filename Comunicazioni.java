/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Sistema_ristorante;

import javax.swing.JFrame;

/**
 *
 * @author VITO
 */
public class Comunicazioni extends javax.swing.JFrame {

    /**
     * Creates new form Comunicazioni_Form
     */
    public Comunicazioni() {
        initComponents();
        this.setLocationRelativeTo(null); //center form in the screen
        setExtendedState( JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel_titolo = new javax.swing.JLabel();
        jLabel_img = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_info = new javax.swing.JTextArea();
        jButton_home = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_titolo.setFont(new java.awt.Font("Sitka Small", 1, 48)); // NOI18N
        jLabel_titolo.setForeground(new java.awt.Color(255, 102, 102));
        jLabel_titolo.setText(" RISTORANTE LIMITED EVENT ");
        jPanel2.add(jLabel_titolo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 810, -1));

        jLabel_img.setIcon(new javax.swing.ImageIcon("C:\\Users\\VITO\\Desktop\\Vanessa progetto\\closed.jpg")); // NOI18N
        jPanel2.add(jLabel_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 233, 172));

        jScrollPane1.setAutoscrolls(true);

        jTextArea_info.setEditable(false);
        jTextArea_info.setColumns(20);
        jTextArea_info.setFont(new java.awt.Font("Monospaced", 3, 18)); // NOI18N
        jTextArea_info.setRows(5);
        jTextArea_info.setText("IN SEGUITO ALLE NUOVE RESTRIZIONI IMPOSTE DAL DPCM DEL 3 NOVEMBRE QUESTA ATTIVITA' RESTERA'\nCHIUSA FINO A NUOVE DISPOSIZIONI.FIDUCIOSI NEL SUPERAMENTO DI QUESTO PERIODO VI ASPETTIAMO AL PIU'PRESTO NEL NOSTRO RISTORANTE.\n                                                    A PRESTO!!\n                                                                  \n                                                                       LO STAFF");
        jTextArea_info.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(jTextArea_info);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 1870, 150));

        jButton_home.setBackground(new java.awt.Color(204, 204, 204));
        jButton_home.setForeground(new java.awt.Color(153, 153, 153));
        jButton_home.setText(" >> TORNA ALLA PAGINA PRINCIPALE");
        jButton_home.setMaximumSize(new java.awt.Dimension(185, 21));
        jButton_home.setMinimumSize(new java.awt.Dimension(185, 21));
        jButton_home.setPreferredSize(new java.awt.Dimension(185, 21));
        jButton_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_homeMouseClicked(evt);
            }
        });
        jPanel2.add(jButton_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 710, 240, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1079, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_homeMouseClicked
            Main_Page mainform = new Main_Page();
            mainform.setVisible(true);
            mainform.pack();
            mainform.setLocationRelativeTo(null);
            this.dispose();
    }//GEN-LAST:event_jButton_homeMouseClicked

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
            java.util.logging.Logger.getLogger(Comunicazioni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comunicazioni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comunicazioni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comunicazioni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comunicazioni().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_home;
    private javax.swing.JLabel jLabel_img;
    private javax.swing.JLabel jLabel_titolo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_info;
    // End of variables declaration//GEN-END:variables
}
