/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Punto Configurador de Rutas Turisticas
 *
 * @author Lidia
 * @version 1.0
 *
 */

/*

 */
public class V_PCRT extends javax.swing.JFrame {

    /*
    *
    *
    *   CONTROLADOR DE CLASE
    *
     */
    private C_PCRT controlador;

    /*
    *
    *
    *   CONSTRUCTOR DE CLASE
    *
     */
    public V_PCRT() {
        this.controlador = new C_PCRT(this);
        initComponents();
        this.controlador.inicio();

    }

    /*
    *
    *
    *   GETTERS DEL HEADER
    *
     */
    public JPanel getjPanel_Header() {
        return jPanel_Header;
    }

    public JButton getjButtonADMIN() {
        return jButtonADMIN;
    }

    public JLabel getjLabelLOGO() {
        return jLabelLOGO;
    }

    public JButton getjButtonESP() {
        return jButtonESP;
    }

    public JButton getjButtonING() {
        return jButtonING;
    }

    public JButton getjButtonFRA() {
        return jButtonFRA;
    }

    /*
    *
    *
    *   GETTERS DEL CONTENEDOR
    *
     */
    public JPanel getContenedor() {
        return contenedor;
    }

    /*
    *
    *
    *   GETTERS DEL FOOTER
    *
     */
    public JPanel getjPanel_Footer() {
        return jPanel_Footer;
    }

    public JButton getjButtonATRAS() {
        return jButtonATRAS;
    }

    public JButton getjButtonSIGUIENTE() {
        return jButtonSIGUIENTE;
    }

    public JPanel getjPanel_Contenedor_Items() {
        return jPanel_Contenedor_Items;
    }

    /*
    *
    *
    *   INICIALIZADOR DE COMPONENTES SWING
    *
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Header = new javax.swing.JPanel();
        jLabelLOGO = new javax.swing.JLabel();
        jButtonADMIN = new javax.swing.JButton();
        jButtonFRA = new javax.swing.JButton();
        jButtonESP = new javax.swing.JButton();
        jButtonING = new javax.swing.JButton();
        jPanel_Footer = new javax.swing.JPanel();
        jPanel_Contenedor_Items = new javax.swing.JPanel();
        jButtonSIGUIENTE = new javax.swing.JButton();
        jButtonATRAS = new javax.swing.JButton();
        contenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 700));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel_Header.setBackground(new java.awt.Color(0, 0, 0));
        jPanel_Header.setToolTipText(null);
        jPanel_Header.setMaximumSize(new java.awt.Dimension(900, 120));
        jPanel_Header.setMinimumSize(new java.awt.Dimension(900, 120));
        jPanel_Header.setPreferredSize(new java.awt.Dimension(900, 120));
        jPanel_Header.setLayout(null);

        jLabelLOGO.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLOGO.setFont(new java.awt.Font("Brush Script MT", 0, 80)); // NOI18N
        jLabelLOGO.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLOGO.setIcon(new javax.swing.ImageIcon("src/Imagenes/LOGO.png"));
        jLabelLOGO.setText("Rutas Turistcias");
        jLabelLOGO.setToolTipText(null);
        jLabelLOGO.setIconTextGap(-95);
        jPanel_Header.add(jLabelLOGO);
        jLabelLOGO.setBounds(60, 0, 550, 120);

        jButtonADMIN.setIcon(new javax.swing.ImageIcon("src/Imagenes/ADMIN.png"));
        jButtonADMIN.setToolTipText(null);
        jButtonADMIN.setBorder(null);
        jButtonADMIN.setContentAreaFilled(false);
        jButtonADMIN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonADMIN.setMaximumSize(new java.awt.Dimension(65, 65));
        jButtonADMIN.setMinimumSize(new java.awt.Dimension(65, 65));
        jButtonADMIN.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel_Header.add(jButtonADMIN);
        jButtonADMIN.setBounds(0, 0, 40, 40);

        jButtonFRA.setIcon(new javax.swing.ImageIcon("src/Imagenes/FRA.png"));
        jButtonFRA.setToolTipText(null);
        jButtonFRA.setBorder(null);
        jButtonFRA.setContentAreaFilled(false);
        jButtonFRA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonFRA.setDisabledIcon(new javax.swing.ImageIcon("src/Imagenes/FRA_DIS.png"));
        jButtonFRA.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel_Header.add(jButtonFRA);
        jButtonFRA.setBounds(630, 20, 80, 80);

        jButtonESP.setIcon(new javax.swing.ImageIcon("src/Imagenes/ESP.png"));
        jButtonESP.setToolTipText(null);
        jButtonESP.setBorder(null);
        jButtonESP.setContentAreaFilled(false);
        jButtonESP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonESP.setDisabledIcon(new javax.swing.ImageIcon("src/Imagenes/ESP_DIS.png"));
        jButtonESP.setEnabled(false);
        jButtonESP.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel_Header.add(jButtonESP);
        jButtonESP.setBounds(810, 20, 80, 80);

        jButtonING.setIcon(new javax.swing.ImageIcon("src/Imagenes/ING.png"));
        jButtonING.setToolTipText(null);
        jButtonING.setBorder(null);
        jButtonING.setContentAreaFilled(false);
        jButtonING.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonING.setDisabledIcon(new javax.swing.ImageIcon("src/Imagenes/ING_DIS.png"));
        jButtonING.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel_Header.add(jButtonING);
        jButtonING.setBounds(720, 20, 80, 80);

        getContentPane().add(jPanel_Header);
        jPanel_Header.setBounds(0, 0, 900, 120);

        jPanel_Footer.setBackground(new java.awt.Color(0, 0, 0));
        jPanel_Footer.setToolTipText(null);
        jPanel_Footer.setMaximumSize(new java.awt.Dimension(900, 120));
        jPanel_Footer.setMinimumSize(new java.awt.Dimension(900, 120));
        jPanel_Footer.setPreferredSize(new java.awt.Dimension(900, 120));
        jPanel_Footer.setLayout(null);

        jPanel_Contenedor_Items.setBackground(new java.awt.Color(0, 0, 0));
        jPanel_Contenedor_Items.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEmptyBorder(5, 1, 5, 1)));
        jPanel_Contenedor_Items.setToolTipText(null);
        jPanel_Contenedor_Items.setMaximumSize(new java.awt.Dimension(410, 120));
        jPanel_Contenedor_Items.setMinimumSize(new java.awt.Dimension(410, 120));
        jPanel_Contenedor_Items.setPreferredSize(new java.awt.Dimension(410, 120));
        jPanel_Contenedor_Items.setLayout(new java.awt.GridLayout(3, 1));
        jPanel_Footer.add(jPanel_Contenedor_Items);
        jPanel_Contenedor_Items.setBounds(250, 0, 410, 120);

        jButtonSIGUIENTE.setIcon(new javax.swing.ImageIcon("src/Imagenes/SIGUIENTE.png"));
        jButtonSIGUIENTE.setToolTipText(null);
        jButtonSIGUIENTE.setBorder(null);
        jButtonSIGUIENTE.setContentAreaFilled(false);
        jButtonSIGUIENTE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSIGUIENTE.setDisabledIcon(new javax.swing.ImageIcon("src/Imagenes/SIGUIENTE_DIS.png"));
        jButtonSIGUIENTE.setEnabled(false);
        jButtonSIGUIENTE.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel_Footer.add(jButtonSIGUIENTE);
        jButtonSIGUIENTE.setBounds(800, 20, 80, 80);

        jButtonATRAS.setIcon(new javax.swing.ImageIcon("src/Imagenes/ATRAS.png"));
        jButtonATRAS.setToolTipText(null);
        jButtonATRAS.setBorder(null);
        jButtonATRAS.setContentAreaFilled(false);
        jButtonATRAS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonATRAS.setDisabledIcon(new javax.swing.ImageIcon("src/Imagenes/ATRAS_DIS.png"));
        jButtonATRAS.setEnabled(false);
        jButtonATRAS.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel_Footer.add(jButtonATRAS);
        jButtonATRAS.setBounds(20, 20, 80, 80);

        getContentPane().add(jPanel_Footer);
        jPanel_Footer.setBounds(0, 600, 900, 100);

        contenedor.setBackground(new java.awt.Color(255, 255, 255));
        contenedor.setToolTipText(null);
        contenedor.setMaximumSize(new java.awt.Dimension(900, 460));
        contenedor.setPreferredSize(new java.awt.Dimension(900, 460));

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        getContentPane().add(contenedor);
        contenedor.setBounds(0, 120, 900, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    *
    *
    *   INICIALIZADOR DEL FRAME SWING
    *
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
            java.util.logging.Logger.getLogger(V_PCRT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_PCRT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_PCRT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_PCRT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_PCRT().setVisible(true);
            }
        });
    }

    /*
    *
    *
    *   DECLARACION DE VARIABLES DE COMPONENTES SWING
    *
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedor;
    private javax.swing.JButton jButtonADMIN;
    private javax.swing.JButton jButtonATRAS;
    private javax.swing.JButton jButtonESP;
    private javax.swing.JButton jButtonFRA;
    private javax.swing.JButton jButtonING;
    private javax.swing.JButton jButtonSIGUIENTE;
    private javax.swing.JLabel jLabelLOGO;
    private javax.swing.JPanel jPanel_Contenedor_Items;
    private javax.swing.JPanel jPanel_Footer;
    private javax.swing.JPanel jPanel_Header;
    // End of variables declaration//GEN-END:variables
}
