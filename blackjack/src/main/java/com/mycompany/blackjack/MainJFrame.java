/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.blackjack;

import javax.swing.JFrame;

/**
 *
 * @author egzamin
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        Stos_kart = new javax.swing.JLabel();
        karta_gracza1 = new javax.swing.JLabel();
        karta_gracza2 = new javax.swing.JLabel();
        karta_gracza3 = new javax.swing.JLabel();
        karta_gracza4 = new javax.swing.JLabel();
        karta_gracza5 = new javax.swing.JLabel();
        karta_gracza6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        karta_przeciwnika1 = new javax.swing.JLabel();
        karta_przeciwnika2 = new javax.swing.JLabel();
        karta_przeciwnika3 = new javax.swing.JLabel();
        karta_przeciwnika4 = new javax.swing.JLabel();
        karta_przeciwnika5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(8, 94, 8));

        Stos_kart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/blackjack/images/placeholder_2.png"))); // NOI18N
        Stos_kart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stos_kartMouseClicked(evt);
            }
        });

        karta_gracza1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/blackjack/images/miejsce_na_karte.png"))); // NOI18N

        karta_gracza2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/blackjack/images/miejsce_na_karte.png"))); // NOI18N

        karta_gracza3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/blackjack/images/miejsce_na_karte.png"))); // NOI18N

        karta_gracza4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/blackjack/images/miejsce_na_karte.png"))); // NOI18N

        karta_gracza5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/blackjack/images/miejsce_na_karte.png"))); // NOI18N

        karta_gracza6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/blackjack/images/miejsce_na_karte.png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 102, 102));
        jButton1.setText("P A S S");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        karta_przeciwnika1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/blackjack/images/karty_przeciwnika.png"))); // NOI18N

        karta_przeciwnika2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/blackjack/images/karty_przeciwnika.png"))); // NOI18N

        karta_przeciwnika3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/blackjack/images/karty_przeciwnika.png"))); // NOI18N

        karta_przeciwnika4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/blackjack/images/karty_przeciwnika.png"))); // NOI18N

        karta_przeciwnika5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/blackjack/images/karty_przeciwnika.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(karta_gracza1)
                        .addGap(18, 18, 18)
                        .addComponent(karta_gracza2)
                        .addGap(18, 18, 18)
                        .addComponent(karta_gracza3)
                        .addGap(18, 18, 18)
                        .addComponent(karta_gracza4)
                        .addGap(18, 18, 18)
                        .addComponent(karta_gracza5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(karta_przeciwnika1)
                        .addGap(18, 18, 18)
                        .addComponent(karta_przeciwnika2)
                        .addGap(18, 18, 18)
                        .addComponent(karta_przeciwnika3)
                        .addGap(18, 18, 18)
                        .addComponent(karta_przeciwnika4)
                        .addGap(18, 18, 18)
                        .addComponent(karta_przeciwnika5)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Stos_kart)
                    .addComponent(karta_gracza6))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Stos_kart)
                    .addComponent(karta_przeciwnika1)
                    .addComponent(karta_przeciwnika2)
                    .addComponent(karta_przeciwnika3)
                    .addComponent(karta_przeciwnika4)
                    .addComponent(karta_przeciwnika5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(karta_gracza1)
                    .addComponent(karta_gracza2)
                    .addComponent(karta_gracza3)
                    .addComponent(karta_gracza4)
                    .addComponent(karta_gracza5)
                    .addComponent(karta_gracza6))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Stos_kartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stos_kartMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Stos_kartMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainJFrame frame = new MainJFrame();
                frame.setVisible(true);
                frame.setExtendedState(MAXIMIZED_BOTH);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Stos_kart;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel karta_gracza1;
    private javax.swing.JLabel karta_gracza2;
    private javax.swing.JLabel karta_gracza3;
    private javax.swing.JLabel karta_gracza4;
    private javax.swing.JLabel karta_gracza5;
    private javax.swing.JLabel karta_gracza6;
    private javax.swing.JLabel karta_przeciwnika1;
    private javax.swing.JLabel karta_przeciwnika2;
    private javax.swing.JLabel karta_przeciwnika3;
    private javax.swing.JLabel karta_przeciwnika4;
    private javax.swing.JLabel karta_przeciwnika5;
    // End of variables declaration//GEN-END:variables
}
