/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import GUI.C_PCRT;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Lidia
 */
public class JPanel_Ticket extends JPanel {

    /*
    *
    *
    *   ATRIBUTOS Y CONTROLADOR DE CLASE
    *
     */
    private static JPanel_Ticket panelInicio;
    private C_Ticket controlador;

    /*
    *
    *
    *   CONSTRUCTOR DE CLASE
    *
     */
    public JPanel_Ticket(C_PCRT vent) {
        this.controlador = new C_Ticket(this, vent);
        initComponents();
        controlador.inicio();   //Este inicio es el que esta en el controlador.
    }

    /*
    *
    *
    *   CONSTRUCTOR SINGLETON DE CLASE
    *
     */
    public static JPanel_Ticket abrir(C_PCRT vent) {
        if (panelInicio == null) {
            panelInicio = new JPanel_Ticket(vent);
        }
        return panelInicio;
    }

    /*
    *
    *
    *   GETTERS DEL PANEL
    *
     */
    public JLabel getjLabel_CodigoBarras() {
        return jLabel_CodigoBarras;
    }

    public C_Ticket getControlador() {
        return controlador;
    }

    public JLabel getjLabel_Info() {
        return jLabel_Info;
    }

    public JLabel getjLabel_Hora1() {
        return jLabel_Hora1;
    }

    public JLabel getjLabel_Hora2() {
        return jLabel_Hora2;
    }

    public JLabel getjLabel_Hora3() {
        return jLabel_Hora3;
    }

    public JLabel getjLabel_Producto1() {
        return jLabel_Producto1;
    }

    public JLabel getjLabel_Producto2() {
        return jLabel_Producto2;
    }

    public JLabel getjLabel_Producto3() {
        return jLabel_Producto3;
    }

    public JLabel getjLabel_Precio1() {
        return jLabel_Precio1;
    }

    public JLabel getjLabel_Precio2() {
        return jLabel_Precio2;
    }

    public JLabel getjLabel_Precio3() {
        return jLabel_Precio3;
    }

    public JLabel getjLabel_IVA_Num() {
        return jLabel_IVA_Num;
    }

    public JLabel getjLabel_Total_Num() {
        return jLabel_Total_Num;
    }

    public JLabel getjLabel_Fecha_Num() {
        return jLabel_Fecha_Num;
    }

    public JLabel getjLabel_Encabezado() {
        return jLabel_Encabezado;
    }

    public JLabel getjLabel_Fecha_Text() {
        return jLabel_Fecha_Text;
    }

    public JLabel getjLabel_Total_Text() {
        return jLabel_Total_Text;
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
        jLabel_Encabezado = new javax.swing.JLabel();
        jLabel_Hora1 = new javax.swing.JLabel();
        jLabel_Hora2 = new javax.swing.JLabel();
        jLabel_Hora3 = new javax.swing.JLabel();
        jLabel_Producto1 = new javax.swing.JLabel();
        jLabel_Producto2 = new javax.swing.JLabel();
        jLabel_Producto3 = new javax.swing.JLabel();
        jLabel_Precio1 = new javax.swing.JLabel();
        jLabel_Precio2 = new javax.swing.JLabel();
        jLabel_Precio3 = new javax.swing.JLabel();
        jLabel_Fecha_Text = new javax.swing.JLabel();
        jLabel_Fecha_Num = new javax.swing.JLabel();
        jLabel_IVA_Text = new javax.swing.JLabel();
        jLabel_IVA_Num = new javax.swing.JLabel();
        jLabel_Total_Text = new javax.swing.JLabel();
        jLabel_Total_Num = new javax.swing.JLabel();
        jLabel_CodigoBarras = new javax.swing.JLabel();
        jSeparator = new javax.swing.JSeparator();

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

        jLabel_Encabezado.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_Encabezado.setFont(new java.awt.Font("Andalus", 1, 40)); // NOI18N
        jLabel_Encabezado.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Encabezado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Encabezado.setOpaque(true);
        add(jLabel_Encabezado);
        jLabel_Encabezado.setBounds(230, 80, 440, 60);

        jLabel_Hora1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Hora1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel_Hora1.setOpaque(true);
        add(jLabel_Hora1);
        jLabel_Hora1.setBounds(240, 150, 70, 30);

        jLabel_Hora2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Hora2.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel_Hora2.setOpaque(true);
        add(jLabel_Hora2);
        jLabel_Hora2.setBounds(240, 190, 70, 30);

        jLabel_Hora3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Hora3.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel_Hora3.setOpaque(true);
        add(jLabel_Hora3);
        jLabel_Hora3.setBounds(240, 230, 70, 30);

        jLabel_Producto1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Producto1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel_Producto1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_Producto1.setOpaque(true);
        add(jLabel_Producto1);
        jLabel_Producto1.setBounds(320, 150, 260, 30);

        jLabel_Producto2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Producto2.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel_Producto2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_Producto2.setOpaque(true);
        add(jLabel_Producto2);
        jLabel_Producto2.setBounds(320, 190, 260, 30);

        jLabel_Producto3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Producto3.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel_Producto3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_Producto3.setOpaque(true);
        add(jLabel_Producto3);
        jLabel_Producto3.setBounds(320, 230, 260, 30);

        jLabel_Precio1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Precio1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel_Precio1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_Precio1.setOpaque(true);
        add(jLabel_Precio1);
        jLabel_Precio1.setBounds(590, 150, 70, 30);

        jLabel_Precio2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Precio2.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel_Precio2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_Precio2.setOpaque(true);
        add(jLabel_Precio2);
        jLabel_Precio2.setBounds(590, 190, 70, 30);

        jLabel_Precio3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Precio3.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel_Precio3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_Precio3.setOpaque(true);
        add(jLabel_Precio3);
        jLabel_Precio3.setBounds(590, 230, 70, 30);

        jLabel_Fecha_Text.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_Fecha_Text.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel_Fecha_Text.setForeground(new java.awt.Color(204, 204, 204));
        jLabel_Fecha_Text.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1)));
        jLabel_Fecha_Text.setOpaque(true);
        add(jLabel_Fecha_Text);
        jLabel_Fecha_Text.setBounds(240, 290, 160, 30);

        jLabel_Fecha_Num.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_Fecha_Num.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel_Fecha_Num.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Fecha_Num.setOpaque(true);
        add(jLabel_Fecha_Num);
        jLabel_Fecha_Num.setBounds(240, 320, 160, 40);

        jLabel_IVA_Text.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_IVA_Text.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel_IVA_Text.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_IVA_Text.setText("IVA (10%)");
        add(jLabel_IVA_Text);
        jLabel_IVA_Text.setBounds(500, 280, 60, 30);

        jLabel_IVA_Num.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_IVA_Num.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel_IVA_Num.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_IVA_Num.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10)));
        add(jLabel_IVA_Num);
        jLabel_IVA_Num.setBounds(560, 280, 100, 30);

        jLabel_Total_Text.setBackground(new java.awt.Color(255, 102, 102));
        jLabel_Total_Text.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel_Total_Text.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_Total_Text.setOpaque(true);
        add(jLabel_Total_Text);
        jLabel_Total_Text.setBounds(500, 320, 60, 30);

        jLabel_Total_Num.setBackground(new java.awt.Color(255, 102, 102));
        jLabel_Total_Num.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel_Total_Num.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_Total_Num.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10)));
        jLabel_Total_Num.setOpaque(true);
        add(jLabel_Total_Num);
        jLabel_Total_Num.setBounds(560, 320, 100, 30);

        jLabel_CodigoBarras.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_CodigoBarras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_CodigoBarras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_CodigoBarras.setIconTextGap(0);
        jLabel_CodigoBarras.setOpaque(true);
        add(jLabel_CodigoBarras);
        jLabel_CodigoBarras.setBounds(230, 370, 440, 80);
        add(jSeparator);
        jSeparator.setBounds(230, 270, 440, 2);
    }// </editor-fold>//GEN-END:initComponents

    /*
    *
    *
    *   DECLARACION DE VARIABLES DE COMPONENTES SWING
    *
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_CodigoBarras;
    private javax.swing.JLabel jLabel_Encabezado;
    private javax.swing.JLabel jLabel_Fecha_Num;
    private javax.swing.JLabel jLabel_Fecha_Text;
    private javax.swing.JLabel jLabel_Hora1;
    private javax.swing.JLabel jLabel_Hora2;
    private javax.swing.JLabel jLabel_Hora3;
    private javax.swing.JLabel jLabel_IVA_Num;
    private javax.swing.JLabel jLabel_IVA_Text;
    private javax.swing.JLabel jLabel_Info;
    private javax.swing.JLabel jLabel_Precio1;
    private javax.swing.JLabel jLabel_Precio2;
    private javax.swing.JLabel jLabel_Precio3;
    private javax.swing.JLabel jLabel_Producto1;
    private javax.swing.JLabel jLabel_Producto2;
    private javax.swing.JLabel jLabel_Producto3;
    private javax.swing.JLabel jLabel_Total_Num;
    private javax.swing.JLabel jLabel_Total_Text;
    private javax.swing.JSeparator jSeparator;
    // End of variables declaration//GEN-END:variables
}
