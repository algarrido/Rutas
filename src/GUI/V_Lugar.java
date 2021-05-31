/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Paneles.C_Configuradas;
import java.awt.Dialog;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Lidia
 */
public class V_Lugar extends Dialog {

    /*
    *
    *
    *   ATRIBUTOS Y CONTROLADOR DE CLASE
    *
     */
    private static V_Lugar dialogLugar;
    private C_Lugar controlador;

    /*
    *
    *
    *   CONSTRUCTOR DE CLASE
    *
     */
    public V_Lugar(C_Configuradas panel) {
        super(null, true);
        this.controlador = new C_Lugar(this, panel);
        initComponents();
        this.controlador.inicio();
    }

    /*
    *
    *
    *   CONSTRUCTOR SINGLETON DE CLASE
    *
     */
    public static V_Lugar abrir(C_Configuradas panel) {
        if (dialogLugar == null) {
            dialogLugar = new V_Lugar(panel);
        }
        return dialogLugar;
    }

    /*
    *
    *
    *   GETTERS DEL PANEL
    *
     */
    public C_Lugar getControlador() {
        return controlador;
    }

    public JButton getjButton_Anadir() {
        return jButton_Anadir;
    }

    public JButton getjButton_Salir() {
        return jButton_Salir;
    }

    public JLabel getjLabel_IMG() {
        return jLabel_IMG;
    }

    public JLabel getjLabel_Nombre() {
        return jLabel_Nombre;
    }

    public JLabel getjLabel_Precio_Numero() {
        return jLabel_Precio_Numero;
    }

    public JLabel getjLabel_Precio_Texto() {
        return jLabel_Precio_Texto;
    }

    public JList<String> getjList_Sesiones() {
        return jList_Sesiones;
    }

    public JScrollPane getjScrollPane_Descripcion() {
        return jScrollPane_Descripcion;
    }

    public JScrollPane getjScrollPane_Lista_Sesiones() {
        return jScrollPane_Lista_Sesiones;
    }

    public JTextArea getjTextArea_Descripcion() {
        return jTextArea_Descripcion;
    }

    public JLabel getFondo1() {
        return Fondo1;
    }

    public JLabel getFondo2() {
        return Fondo2;
    }

    /*
    *
    *
    *   INICIALIZADOR DE COMPONENTES SWING
    *
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_Salir = new javax.swing.JButton();
        jButton_Anadir = new javax.swing.JButton();
        jLabel_Nombre = new javax.swing.JLabel();
        jLabel_IMG = new javax.swing.JLabel();
        jLabel_Precio_Numero = new javax.swing.JLabel();
        jLabel_Precio_Texto = new javax.swing.JLabel();
        jScrollPane_Descripcion = new javax.swing.JScrollPane();
        jTextArea_Descripcion = new javax.swing.JTextArea();
        jScrollPane_Lista_Sesiones = new javax.swing.JScrollPane();
        jList_Sesiones = new javax.swing.JList<>();
        Fondo1 = new javax.swing.JLabel();
        Fondo2 = new javax.swing.JLabel();
        Fondo3 = new javax.swing.JLabel();

        setBackground(null);
        setMaximumSize(new java.awt.Dimension(900, 700));
        setMinimumSize(new java.awt.Dimension(900, 700));
        setUndecorated(true);
        setSize(new java.awt.Dimension(900, 390));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });
        setLayout(null);

        jButton_Salir.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Salir.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SALIR.png"))); // NOI18N
        jButton_Salir.setToolTipText(null);
        jButton_Salir.setAlignmentX(0.5F);
        jButton_Salir.setBorder(null);
        jButton_Salir.setBorderPainted(false);
        jButton_Salir.setContentAreaFilled(false);
        jButton_Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Salir.setOpaque(true);
        add(jButton_Salir);
        jButton_Salir.setBounds(770, 190, 50, 50);

        jButton_Anadir.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Anadir.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton_Anadir.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Anadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ANADIR1.png"))); // NOI18N
        jButton_Anadir.setText("ANADIR SESION");
        jButton_Anadir.setToolTipText(null);
        jButton_Anadir.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton_Anadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Anadir.setDisabledIcon(null);
        jButton_Anadir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_Anadir.setIconTextGap(0);
        jButton_Anadir.setPreferredSize(new java.awt.Dimension(230, 50));
        add(jButton_Anadir);
        jButton_Anadir.setBounds(580, 520, 230, 50);

        jLabel_Nombre.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Nombre.setFont(new java.awt.Font("Andalus", 0, 45)); // NOI18N
        jLabel_Nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Nombre.setToolTipText(null);
        jLabel_Nombre.setAlignmentX(0.5F);
        jLabel_Nombre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_Nombre.setIconTextGap(10);
        jLabel_Nombre.setOpaque(true);
        jLabel_Nombre.setPreferredSize(new java.awt.Dimension(680, 60));
        add(jLabel_Nombre);
        jLabel_Nombre.setBounds(80, 190, 690, 50);

        jLabel_IMG.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_IMG.setToolTipText(null);
        jLabel_IMG.setOpaque(true);
        jLabel_IMG.setPreferredSize(new java.awt.Dimension(510, 160));
        add(jLabel_IMG);
        jLabel_IMG.setBounds(80, 240, 510, 160);

        jLabel_Precio_Numero.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Precio_Numero.setFont(new java.awt.Font("Andalus", 1, 45)); // NOI18N
        jLabel_Precio_Numero.setToolTipText(null);
        jLabel_Precio_Numero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_Precio_Numero.setPreferredSize(new java.awt.Dimension(340, 70));
        add(jLabel_Precio_Numero);
        jLabel_Precio_Numero.setBounds(250, 520, 320, 60);

        jLabel_Precio_Texto.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Precio_Texto.setFont(new java.awt.Font("Andalus", 0, 45)); // NOI18N
        jLabel_Precio_Texto.setText("Precio:");
        jLabel_Precio_Texto.setToolTipText(null);
        jLabel_Precio_Texto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_Precio_Texto.setPreferredSize(new java.awt.Dimension(740, 70));
        add(jLabel_Precio_Texto);
        jLabel_Precio_Texto.setBounds(80, 520, 140, 60);

        jScrollPane_Descripcion.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane_Descripcion.setBorder(null);
        jScrollPane_Descripcion.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane_Descripcion.setToolTipText(null);
        jScrollPane_Descripcion.setHorizontalScrollBar(null);

        jTextArea_Descripcion.setEditable(false);
        jTextArea_Descripcion.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea_Descripcion.setColumns(20);
        jTextArea_Descripcion.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jTextArea_Descripcion.setLineWrap(true);
        jTextArea_Descripcion.setRows(5);
        jTextArea_Descripcion.setToolTipText(null);
        jTextArea_Descripcion.setWrapStyleWord(true);
        jTextArea_Descripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 15));
        jTextArea_Descripcion.setCaretColor(new java.awt.Color(102, 102, 102));
        jTextArea_Descripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextArea_Descripcion.setFocusable(false);
        jTextArea_Descripcion.setRequestFocusEnabled(false);
        jTextArea_Descripcion.setVerifyInputWhenFocusTarget(false);
        jScrollPane_Descripcion.setViewportView(jTextArea_Descripcion);

        add(jScrollPane_Descripcion);
        jScrollPane_Descripcion.setBounds(80, 400, 510, 120);

        jScrollPane_Lista_Sesiones.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane_Lista_Sesiones.setBorder(null);
        jScrollPane_Lista_Sesiones.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane_Lista_Sesiones.setToolTipText(null);

        jList_Sesiones.setBackground(new java.awt.Color(204, 204, 204));
        jList_Sesiones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 20));
        jList_Sesiones.setFont(new java.awt.Font("Arial", 0, 40)); // NOI18N
        jList_Sesiones.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList_Sesiones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jList_Sesiones.setFixedCellHeight(62);
        jList_Sesiones.setSelectionBackground(new java.awt.Color(153, 255, 153));
        jList_Sesiones.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane_Lista_Sesiones.setViewportView(jList_Sesiones);

        add(jScrollPane_Lista_Sesiones);
        jScrollPane_Lista_Sesiones.setBounds(590, 240, 230, 280);

        Fondo1.setBackground(null);
        Fondo1.setOpaque(true);
        add(Fondo1);
        Fondo1.setBounds(0, 610, 900, 90);

        Fondo2.setBackground(null);
        Fondo2.setOpaque(true);
        add(Fondo2);
        Fondo2.setBounds(0, 0, 900, 120);

        Fondo3.setBackground(new java.awt.Color(255, 255, 255));
        Fondo3.setOpaque(true);
        add(Fondo3);
        Fondo3.setBounds(0, 190, 900, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        dispose();
    }//GEN-LAST:event_closeDialog

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
            java.util.logging.Logger.getLogger(V_Lugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Lugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Lugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Lugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
            }
        });
    }

    /*


    COMPONENTES


     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo1;
    private javax.swing.JLabel Fondo2;
    private javax.swing.JLabel Fondo3;
    private javax.swing.JButton jButton_Anadir;
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JLabel jLabel_IMG;
    private javax.swing.JLabel jLabel_Nombre;
    private javax.swing.JLabel jLabel_Precio_Numero;
    private javax.swing.JLabel jLabel_Precio_Texto;
    private javax.swing.JList<String> jList_Sesiones;
    private javax.swing.JScrollPane jScrollPane_Descripcion;
    private javax.swing.JScrollPane jScrollPane_Lista_Sesiones;
    private javax.swing.JTextArea jTextArea_Descripcion;
    // End of variables declaration//GEN-END:variables

}
