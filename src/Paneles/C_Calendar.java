/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import GUI.C_PCRT;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Date;
import javax.swing.JButton;

/**
 *
 * @author Lidia
 */
public class C_Calendar {

    /*
    *
    *
    *   ATRIBUTOS DE CLASE
    *
     */
    private static JPanel_Calendar panel;
    private C_PCRT ventana;
    private String dia_Seleccionado;
    private Date fecha;

    /*
    *
    *
    *   CONSTRUCTOR DE CLASE
    *
     */
    public C_Calendar(JPanel_Calendar panel, C_PCRT ventana) {
        this.panel = panel;
        this.ventana = ventana;
    }

    /*
    *
    *
    *   GETTERS
    *
     */
    public Date getFecha() {
        return fecha;
    }

    public String getDia_Seleccionado() {
        return dia_Seleccionado;
    }

    /*
    *
    *
    *   SETTERS
    *
     */
    public void setLeng(String leng) {
        switch (leng) {
            case "Espanol":
                setEspanol();
                break;
            case "Ingles":
                setIngles();
                break;
            case "Frances":
                setFrances();
                break;
            default:
                setEspanol();
        }
    }

    /*
    *
    *
    *   INICIALIZADOR DE PANEL
    *
     */
    public void inicio() {
        configuraJCalendar();
        setLeng(ventana.getLeng());
        configuraListeners();
    }

    public void regenerar(){
        dia_Seleccionado = null;
        fecha = null;
    }
    /*
    *
    *
    *   TRADUCTOR DEL PANEL
    *
     */
    private void setEspanol() {
        panel.getjLabel_Info().setText("INDIQUE EL DIA EN QUE REALIZARÁ SU RUTA.");
        panel.getjLabel_Lunes().setText("LUNES");
        panel.getjLabel_Martes().setText("MARTES");
        panel.getjLabel_Miercoles().setText("MIERCOLES");
        panel.getjLabel_Jueves().setText("JUEVES");
        panel.getjLabel_Viernes().setText("VIERNES");
        panel.getjLabel_Sabado().setText("SABADO");
        panel.getjLabel_Domingo().setText("DOMINGO");
    }

    private void setIngles() {
        panel.getjLabel_Info().setText("INDICATE THE DAY YOU WILL MAKE YOUR ROUTE.");
        panel.getjLabel_Lunes().setText("MONDAY");
        panel.getjLabel_Martes().setText("TUESDAY");
        panel.getjLabel_Miercoles().setText("WEDNESDAY");
        panel.getjLabel_Jueves().setText("THURSDAY");
        panel.getjLabel_Viernes().setText("FRIDAY");
        panel.getjLabel_Sabado().setText("SATURDAY");
        panel.getjLabel_Domingo().setText("SUNDAY");
    }

    private void setFrances() {
        panel.getjLabel_Info().setText("INDIQUEZ LE JOUR QUE VOUS FERÁS VOTRE ROUTE.");
        panel.getjLabel_Lunes().setText("LUNDI");
        panel.getjLabel_Martes().setText("MARDI");
        panel.getjLabel_Miercoles().setText("MERCREDI");
        panel.getjLabel_Jueves().setText("JEUDI");
        panel.getjLabel_Viernes().setText("VENDREDI");
        panel.getjLabel_Sabado().setText("SAMEDI");
        panel.getjLabel_Domingo().setText("DIMANCHE");
    }

    /*
    *
    *
    *   CONFIGURADOR DE JCALENDAR
    *
     */
    private void configuraJCalendar() {
        panel.getjCalendar().getDayChooser().setMinSelectableDate(new Date());  //Minimo elegible hoy.
        panel.getjCalendar().getDayChooser().getDayPanel().setBackground(java.awt.Color.white);
        for (Component c : panel.getjCalendar().getDayChooser().getDayPanel().getComponents()) {
            c.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            c.setBackground(java.awt.Color.white);

            c.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent evt) {
                    dayButtonMouseClicked(evt);
                }
            });

        }
    }

    /*
    *
    *
    *   CONFIGURADOR DE LISTENERS
    *
     */
    public void configuraListeners() {

        panel.getjCalendar().addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                jCalendarPropertyChange(evt);
            }
        });
    }

    /*
    *
    *
    *   CONFIGURAR ACTION PERFORMED
    *
     */
    private void dayButtonMouseClicked(java.awt.event.MouseEvent evt) {
        JButton elegido = (JButton) evt.getSource();
        if (elegido.isEnabled()) {
            if (dia_Seleccionado != null) {
                JPanel_Configuradas.abrir(ventana).getControlador().setFecha(fecha);
                JPanel_Configuradas.abrir(ventana).getControlador().setDia_Seleccionado(dia_Seleccionado);
                fecha = null;
                dia_Seleccionado = null;
                ventana.setMenu("CONF_Lista");
                ventana.desactivaSiguiente();
                ventana.activaAtras();
                ventana.next();
            }
        }

    }

    private void jCalendarPropertyChange(java.beans.PropertyChangeEvent evt) {
        this.fecha = panel.getjCalendar().getDate();
        System.out.println(fecha);
        switch (panel.getjCalendar().getDate().getDay()) {
            case 1:
                dia_Seleccionado = "Lunes";
                break;
            case 2:
                dia_Seleccionado = "Martes";
                break;
            case 3:
                dia_Seleccionado = "Miercoles";
                break;
            case 4:
                dia_Seleccionado = "Jueves";
                break;
            case 5:
                dia_Seleccionado = "Viernes";
                break;
            case 6:
                dia_Seleccionado = "Sabado";
                break;
            case 0:
                dia_Seleccionado = "Domingo";
                break;
        }
    }

}
