/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import GUI.C_PCRT;
import com.toedter.calendar.JCalendar;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Lidia
 *
 */
public class JPanel_Calendar extends JPanel {

    /*
    *
    *
    *   ATRIBUTOS Y CONTROLADOR DE CLASE
    *
     */
    private static JPanel_Calendar panelCalendar;
    private C_Calendar controlador;

    /*
    *
    *
    *   CONSTRUCTOR DE CLASE
    *
     */
    public JPanel_Calendar(C_PCRT vent) {
        this.controlador = new C_Calendar(this, vent);
        initComponents();
        this.controlador.inicio();
    }

    /*
    *
    *
    *   CONSTRUCTOR SINGLETON DE CLASE
    *
     */
    public static JPanel_Calendar abrir(C_PCRT vent) {
        if (panelCalendar == null) {
            panelCalendar = new JPanel_Calendar(vent);
        }
        return panelCalendar;
    }

    /*
    *
    *
    *   GETTERS DEL PANEL
    *
     */
    public C_Calendar getControlador() {
        return controlador;
    }

    public JCalendar getjCalendar() {
        return jCalendar;
    }

    public JLabel getjLabel_Domingo() {
        return jLabel_Domingo;
    }

    public JLabel getjLabel_Info() {
        return jLabel_Info;
    }

    public JLabel getjLabel_Jueves() {
        return jLabel_Jueves;
    }

    public JLabel getjLabel_Lunes() {
        return jLabel_Lunes;
    }

    public JLabel getjLabel_Martes() {
        return jLabel_Martes;
    }

    public JLabel getjLabel_Miercoles() {
        return jLabel_Miercoles;
    }

    public JLabel getjLabel_Sabado() {
        return jLabel_Sabado;
    }

    public JLabel getjLabel_Viernes() {
        return jLabel_Viernes;
    }

    public JPanel getjPanel_Dias_Semana() {
        return jPanel_Dias_Semana;
    }

    public void reiniciaJCalendar(){
        jCalendar = new com.toedter.calendar.JCalendar();
        jCalendar.getYearChooser().setVisible(false);
        jCalendar.getMonthChooser().setVisible(false);
        jCalendar.getDayChooser().setDayBordersVisible(false);
        jCalendar.setBackground(null);
        jCalendar.setToolTipText(null);
        jCalendar.setDecorationBackgroundColor(new java.awt.Color(0, 0, 0));
        jCalendar.setDecorationBackgroundVisible(false);
        jCalendar.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jCalendar.setMinSelectableDate(new java.util.Date(-62135769537000L));
        jCalendar.setPreferredSize(new java.awt.Dimension(900, 320));
        jCalendar.setSundayForeground(Color.red);
        jCalendar.setTodayButtonText("HOY");
        jCalendar.setWeekOfYearVisible(false);
        jCalendar.setWeekdayForeground(new java.awt.Color(0, 0, 0));
        add(jCalendar);
        jCalendar.setBounds(20, 100, 860, 400);
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
        jPanel_Dias_Semana = new javax.swing.JPanel();
        jLabel_Lunes = new javax.swing.JLabel();
        jLabel_Martes = new javax.swing.JLabel();
        jLabel_Miercoles = new javax.swing.JLabel();
        jLabel_Jueves = new javax.swing.JLabel();
        jLabel_Viernes = new javax.swing.JLabel();
        jLabel_Sabado = new javax.swing.JLabel();
        jLabel_Domingo = new javax.swing.JLabel();
        jCalendar = new com.toedter.calendar.JCalendar();

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

        jPanel_Dias_Semana.setBackground(new java.awt.Color(0, 0, 0));
        jPanel_Dias_Semana.setPreferredSize(new java.awt.Dimension(860, 65));

        jLabel_Lunes.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_Lunes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel_Lunes.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Lunes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Lunes.setText("LUNES");
        jLabel_Lunes.setPreferredSize(new java.awt.Dimension(120, 55));

        jLabel_Martes.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_Martes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel_Martes.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Martes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Martes.setText("MARTES");
        jLabel_Martes.setPreferredSize(new java.awt.Dimension(120, 55));

        jLabel_Miercoles.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_Miercoles.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel_Miercoles.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Miercoles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Miercoles.setText("MIERCOLES");
        jLabel_Miercoles.setPreferredSize(new java.awt.Dimension(120, 55));

        jLabel_Jueves.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_Jueves.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel_Jueves.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Jueves.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Jueves.setText("JUEVES");
        jLabel_Jueves.setPreferredSize(new java.awt.Dimension(120, 55));

        jLabel_Viernes.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_Viernes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel_Viernes.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Viernes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Viernes.setText("VIERNES");
        jLabel_Viernes.setPreferredSize(new java.awt.Dimension(120, 55));

        jLabel_Sabado.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_Sabado.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel_Sabado.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Sabado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Sabado.setText("SABADO");
        jLabel_Sabado.setPreferredSize(new java.awt.Dimension(120, 55));

        jLabel_Domingo.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_Domingo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel_Domingo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Domingo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Domingo.setText("DOMINGO");
        jLabel_Domingo.setPreferredSize(new java.awt.Dimension(120, 55));

        javax.swing.GroupLayout jPanel_Dias_SemanaLayout = new javax.swing.GroupLayout(jPanel_Dias_Semana);
        jPanel_Dias_Semana.setLayout(jPanel_Dias_SemanaLayout);
        jPanel_Dias_SemanaLayout.setHorizontalGroup(
            jPanel_Dias_SemanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
            .addGroup(jPanel_Dias_SemanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_Dias_SemanaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel_Lunes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(2, 2, 2)
                    .addComponent(jLabel_Martes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(2, 2, 2)
                    .addComponent(jLabel_Miercoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(2, 2, 2)
                    .addComponent(jLabel_Jueves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(2, 2, 2)
                    .addComponent(jLabel_Viernes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(2, 2, 2)
                    .addComponent(jLabel_Sabado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(2, 2, 2)
                    .addComponent(jLabel_Domingo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel_Dias_SemanaLayout.setVerticalGroup(
            jPanel_Dias_SemanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
            .addGroup(jPanel_Dias_SemanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_Dias_SemanaLayout.createSequentialGroup()
                    .addGap(0, 5, Short.MAX_VALUE)
                    .addGroup(jPanel_Dias_SemanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel_Lunes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_Martes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_Miercoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_Jueves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_Viernes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_Sabado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_Domingo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 5, Short.MAX_VALUE)))
        );

        add(jPanel_Dias_Semana);
        jPanel_Dias_Semana.setBounds(20, 75, 860, 65);

        jCalendar.getYearChooser().setVisible(false);
        jCalendar.getMonthChooser().setVisible(false);
        jCalendar.getDayChooser().setDayBordersVisible(false);
        jCalendar.setBackground(null);
        jCalendar.setToolTipText(null);
        jCalendar.setDecorationBackgroundColor(new java.awt.Color(0, 0, 0));
        jCalendar.setDecorationBackgroundVisible(false);
        jCalendar.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jCalendar.setMinSelectableDate(new java.util.Date(-62135769537000L));
        jCalendar.setPreferredSize(new java.awt.Dimension(900, 320));
        jCalendar.setSundayForeground(Color.red);
        jCalendar.setTodayButtonText("HOY");
        jCalendar.setWeekOfYearVisible(false);
        jCalendar.setWeekdayForeground(new java.awt.Color(0, 0, 0));
        add(jCalendar);
        jCalendar.setBounds(20, 100, 860, 400);
    }// </editor-fold>//GEN-END:initComponents

    /*
    *
    *
    *   DECLARACION DE VARIABLES DE COMPONENTES SWING
    *
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JCalendar jCalendar;
    private javax.swing.JLabel jLabel_Domingo;
    private javax.swing.JLabel jLabel_Info;
    private javax.swing.JLabel jLabel_Jueves;
    private javax.swing.JLabel jLabel_Lunes;
    private javax.swing.JLabel jLabel_Martes;
    private javax.swing.JLabel jLabel_Miercoles;
    private javax.swing.JLabel jLabel_Sabado;
    private javax.swing.JLabel jLabel_Viernes;
    private javax.swing.JPanel jPanel_Dias_Semana;
    // End of variables declaration//GEN-END:variables
}
