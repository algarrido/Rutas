/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import GUI.C_PCRT;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Lidia
 *
 */
public class JPanel_Configuradas extends JPanel {

    /*
    *
    *
    *   ATRIBUTOS Y CONTROLADOR DE CLASE
    *
     */
    private static JPanel_Configuradas panelConfiguradas;
    private C_Configuradas controlador;

    /*
    *
    *
    *   CONSTRUCTOR DE CLASE
    *
     */
    public JPanel_Configuradas(C_PCRT vent) {
        this.controlador = new C_Configuradas(this, vent);
        initComponents();
        this.controlador.inicio();
    }

    /*
    *
    *
    *   CONSTRUCTOR SINGLETON DE CLASE
    *
     */
    public static JPanel_Configuradas abrir(C_PCRT vent) {
        if (panelConfiguradas == null) {
            panelConfiguradas = new JPanel_Configuradas(vent);
        }
        return panelConfiguradas;
    }

    /*
    *
    *
    *   GETTERS DEL PANEL
    *
     */
    public C_Configuradas getControlador() {
        return controlador;
    }

    public JLabel getjLabel_Info() {
        return jLabel_Info;
    }

    public JScrollPane getjScrollPane_Configurador() {
        return jScrollPane_Configurador;
    }

    /*
    *
    *
    *   INICIALIZADOR DE COMPONENTES SWING
    *
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Info = new javax.swing.JLabel();
        jScrollPane_Configurador = new javax.swing.JScrollPane();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(900, 460));
        setMinimumSize(new java.awt.Dimension(900, 460));
        setPreferredSize(new java.awt.Dimension(900, 460));
        setLayout(null);

        jLabel_Info.setBackground(new java.awt.Color(255, 102, 102));
        jLabel_Info.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel_Info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/INFO.png"))); // NOI18N
        jLabel_Info.setToolTipText(null);
        jLabel_Info.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 20));
        jLabel_Info.setIconTextGap(20);
        jLabel_Info.setOpaque(true);
        jLabel_Info.setPreferredSize(new java.awt.Dimension(900, 70));
        add(jLabel_Info);
        jLabel_Info.setBounds(0, 0, 900, 70);

        jScrollPane_Configurador.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane_Configurador.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 50, 0, 0));
        jScrollPane_Configurador.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane_Configurador.setToolTipText(null);
        jScrollPane_Configurador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane_Configurador.setHorizontalScrollBar(null);
        jScrollPane_Configurador.setPreferredSize(new java.awt.Dimension(860, 370));
        jScrollPane_Configurador.getVerticalScrollBar().setUnitIncrement(16); //Esto sirve para cambiar la velocidad de la rueda del raton haciendo scroll
        add(jScrollPane_Configurador);
        jScrollPane_Configurador.setBounds(10, 80, 880, 370);
        jScrollPane_Configurador.setVisible(false);
    }// </editor-fold>//GEN-END:initComponents

    /*
    *
    *
    *   DECLARACION DE VARIABLES DE COMPONENTES SWING
    *
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_Info;
    private javax.swing.JScrollPane jScrollPane_Configurador;
    // End of variables declaration//GEN-END:variables
}
