/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import GUI.C_PCRT;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

/**
 *
 * @author Lidia
 */
public class JPanel_Inicio extends JPanel {

    /*
    *
    *
    *   ATRIBUTOS Y CONTROLADOR DE CLASE
    *
     */
    private static JPanel_Inicio panelInicio;
    private C_Inicio controlador;

    /*
    *
    *
    *   CONSTRUCTOR DE CLASE
    *
     */
    public JPanel_Inicio(C_PCRT vent) {
        this.controlador = new C_Inicio(this, vent);
        initComponents();
        this.controlador.inicio();
    }

    /*
    *
    *
    *   CONSTRUCTOR SINGLETON DE CLASE
    *
     */
    public static JPanel_Inicio abrir(C_PCRT vent) {
        if (panelInicio == null) {
            panelInicio = new JPanel_Inicio(vent);
        }
        return panelInicio;
    }

    /*
    *
    *
    *   GETTERS DEL PANEL
    *
     */
    public C_Inicio getControlador() {
        return controlador;
    }

    public JLabel getjLabel_Info() {
        return jLabel_Info;
    }

    public JToggleButton getjToggleButtonConfiguradas() {
        return jToggleButtonConfiguradas;
    }

    public JToggleButton getjToggleButtonPreconfiguradas() {
        return jToggleButtonPreconfiguradas;
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

        jLabel_Info = new javax.swing.JLabel();
        jToggleButtonConfiguradas = new javax.swing.JToggleButton();
        jToggleButtonPreconfiguradas = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(900, 460));
        setMinimumSize(new java.awt.Dimension(900, 460));
        setPreferredSize(new java.awt.Dimension(900, 460));
        setLayout(null);

        jLabel_Info.setBackground(new java.awt.Color(255, 102, 102));
        jLabel_Info.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        jLabel_Info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/INFO.png"))); // NOI18N
        jLabel_Info.setToolTipText(null);
        jLabel_Info.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1));
        jLabel_Info.setIconTextGap(20);
        jLabel_Info.setOpaque(true);
        jLabel_Info.setPreferredSize(new java.awt.Dimension(900, 70));
        add(jLabel_Info);
        jLabel_Info.setBounds(0, 0, 900, 70);

        jToggleButtonConfiguradas.setBackground(new java.awt.Color(153, 255, 153));
        jToggleButtonConfiguradas.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jToggleButtonConfiguradas.setToolTipText(null);
        jToggleButtonConfiguradas.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 10), javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        jToggleButtonConfiguradas.setContentAreaFilled(false);
        jToggleButtonConfiguradas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButtonConfiguradas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonConfiguradas.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jToggleButtonConfiguradas.setPreferredSize(new java.awt.Dimension(800, 180));
        jToggleButtonConfiguradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonConfiguradasActionPerformed(evt);
            }
        });
        add(jToggleButtonConfiguradas);
        jToggleButtonConfiguradas.setBounds(50, 80, 800, 180);

        jToggleButtonPreconfiguradas.setBackground(new java.awt.Color(153, 255, 153));
        jToggleButtonPreconfiguradas.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jToggleButtonPreconfiguradas.setToolTipText(null);
        jToggleButtonPreconfiguradas.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 10), javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        jToggleButtonPreconfiguradas.setContentAreaFilled(false);
        jToggleButtonPreconfiguradas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButtonPreconfiguradas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonPreconfiguradas.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jToggleButtonPreconfiguradas.setPreferredSize(new java.awt.Dimension(800, 180));
        jToggleButtonPreconfiguradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonPreconfiguradasActionPerformed(evt);
            }
        });
        add(jToggleButtonPreconfiguradas);
        jToggleButtonPreconfiguradas.setBounds(50, 270, 800, 180);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonPreconfiguradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonPreconfiguradasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonPreconfiguradasActionPerformed

    private void jToggleButtonConfiguradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonConfiguradasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonConfiguradasActionPerformed

    /*
    *
    *
    *   DECLARACION DE VARIABLES DE COMPONENTES SWING
    *
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_Info;
    private javax.swing.JToggleButton jToggleButtonConfiguradas;
    private javax.swing.JToggleButton jToggleButtonPreconfiguradas;
    // End of variables declaration//GEN-END:variables
}
