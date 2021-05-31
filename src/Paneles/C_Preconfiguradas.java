/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import GUI.C_PCRT;
import Modelo.Item;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JButton;

/**
 *
 * @author Lidia
 */

public class C_Preconfiguradas {

    /*
    *
    *
    *   ATRIBUTOS DE CLASE
    *
     */
    private static JPanel_Preconfiguradas panel;
    private C_PCRT ventana;
    private String[] info;
    private String[] infoESP = {"SELECCIONE UNA RUTA DE LA LISTA.", "INDIQUE A QUE HORA COMENZARÁ SU RUTA.", "SI ESTA DE ACUERDO CON AL ELECCION, PULSE SIGUIENTE PARA CONTINUAR."};
    private String[] infoING = {"SELECT A ROUTE FROM THE LIST.", "INDICATE AT WHAT TIME YOU WILL BEGIN YOUR ROUTE.", "IF YOU AGREE TO THE ELECTION, PRESS NEXT TO CONTINUE."};
    private String[] infoFRA = {"SÉLECTIONNEZ UNE ROUTE DE LA LISTE.", "INDIQUEA À QUEL MOMENT VOUS COMMENCEREZ VOTRE ROUTE.", "SI VOUS ACCEPTEZ LE ELECTION, PRESSE SUIVANT POUR CONTINUER."};
    private String dia_Seleccionado;
    private int estado = 1;
    private Date fecha;
    private ArrayList<Item> ticket = new ArrayList<Item>();

    /*
    *
    *
    *   CONSTRUCTOR DE CLASE
    *
     */
    public C_Preconfiguradas(JPanel_Preconfiguradas panel, C_PCRT ventana) {
        this.panel = panel;
        this.ventana = ventana;
    }

    /*
    *
    *
    *   GETTERS
    *
     */
    public static JPanel_Preconfiguradas getPanel() {
        return panel;
    }

    public Date getFecha() {
        return fecha;
    }

    public ArrayList<Item> getTicket() {
        return ticket;
    }

    public String[] getInfo() {
        return info;
    }

    public String getDia_Seleccionado() {
        return dia_Seleccionado;
    }

    public C_PCRT getVentana() {
        return ventana;
    }

    /*
    *
    *
    *   SETTERS
    *
     */
    public void setDia_Seleccionado(String dia_Seleccionado) {
        this.dia_Seleccionado = dia_Seleccionado;
        //rellenaPanelLugares(dia_Seleccionado);
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
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
        regenerar();
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    /*
    *
    *
    *   INICIALIZADOR DE PANEL
    *
     */
    public void inicio() {
        setLeng(ventana.getLeng());
        setInfo(infoESP);
    }

    /*
    *
    *
    *   REINICIADOR DE PANEL
    *
     */
    public void regenerar() {
        ticket.clear();
        //ventana.vaciaPanel();
        setInfo(info);
    }

    /*
    *
    *
    *   TRADUCTOR DEL PANEL
    *
     */
    private void setEspanol() {
        setInfo(infoESP);
        //if (panel.getjScrollPane_Configurador().isVisible() && dia_Seleccionado != null) {
        //traducePanelLugares("Espanol");
        //}
    }

    private void setIngles() {
        setInfo(infoING);
        //if (panel.getjScrollPane_Configurador().isVisible() && dia_Seleccionado != null) {
        //traducePanelLugares("Ingles");
        //}

    }

    private void setFrances() {
        setInfo(infoFRA);
        //if (panel.getjScrollPane_Configurador().isVisible() && dia_Seleccionado != null) {
        //traducePanelLugares("Frances");
        //}
    }

    /*
    *
    *
    *   TRADUCTOR INFO
    *
     */
    public void setInfo(String[] lengInfo) {
        info = lengInfo;
        switch (this.estado) {
            case 1:
                panel.getjLabel_Info().setText(info[0]);
                break;
            case 2:
                panel.getjLabel_Info().setText(info[1]);
                break;
            case 3:
                panel.getjLabel_Info().setText(info[3]);
                break;
            case 4:
                panel.getjLabel_Info().setText(info[2]);
                break;
            case 5:
                panel.getjLabel_Info().setText(info[3]);
                break;
            case 6:
                panel.getjLabel_Info().setText(info[2]);
                break;
            case 7:
                panel.getjLabel_Info().setText(info[3]);
                break;
            default:
                panel.getjLabel_Info().setText("");
        }
    }

    /*
    *
    *
    *   CONFIGURADORES DEL PANEL DE LUGARES
    *

    private void configuraPanelLugares(JPanel p) {
        p.setPreferredSize(new java.awt.Dimension(790, 370));
        p.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 10));
        p.setName("Panel_Lugares");
        p.setBackground(new java.awt.Color(255, 255, 255));
        p.setToolTipText(null);
    }

    private void rellenaPanelLugares(String diaSem) {
        JPanel contenedor_Lugares = new JPanel();
        configuraPanelLugares(contenedor_Lugares);
        for (Lugar l : ControladorBD.getControlador().getListaLugares(ventana.getLeng(), diaSem)) {
            contenedor_Lugares.add(new Boton_Lugar(this, l));
        }
        int altura = (115 + 10) * contenedor_Lugares.getComponentCount();
        contenedor_Lugares.setPreferredSize(new java.awt.Dimension(790, altura + 10));
        panel.getjScrollPane_Configurador().setViewportView(contenedor_Lugares);
        panel.getjScrollPane_Configurador().setVisible(true);
        panel.getjCalendar().setVisible(false);
        panel.getjPanel_Dias_Semana().setVisible(false);
    }

    private void traducePanelLugares(String lenguaje) {
        panel.getjScrollPane_Configurador().revalidate();
        panel.getjScrollPane_Configurador().repaint();
        panel.getjScrollPane_Configurador().setVisible(false);
        JPanel contenedor_Lugares = new JPanel();
        configuraPanelLugares(contenedor_Lugares);
        for (Lugar l : ControladorBD.getControlador().getListaLugares(lenguaje, dia_Seleccionado)) {
            contenedor_Lugares.add(new Boton_Lugar(this, l));
        }
        int altura = (115 + 10) * contenedor_Lugares.getComponentCount();
        contenedor_Lugares.setPreferredSize(new java.awt.Dimension(790, altura + 10));
        panel.getjScrollPane_Configurador().setViewportView(contenedor_Lugares);
        panel.getjScrollPane_Configurador().setVisible(true);
        panel.getjCalendar().setVisible(false);
        panel.getjPanel_Dias_Semana().setVisible(false);
    }

    public void vaciaPanelLugares() {
        panel.getjScrollPane_Configurador().revalidate();
        panel.getjScrollPane_Configurador().repaint();
        panel.getjScrollPane_Configurador().setVisible(false);
        dia_Seleccionado = null;
        panel.getjCalendar().getDayChooser().revalidate();
        panel.getjCalendar().getDayChooser().repaint();
        panel.getjCalendar().setVisible(true);
        panel.getjPanel_Dias_Semana().setVisible(true);
        
        ventana.setIndice(1);
    }

    public void bloqueaSeleccionado(Boton_Lugar b) {
        JPanel panelBotones = (JPanel) panel.getjScrollPane_Configurador().getViewport().getView();
        for (Component c : panelBotones.getComponents()) {
            if (c.equals(b)) {
                c.setEnabled(false);
            }
        }
        panel.getjScrollPane_Configurador().setViewportView(panelBotones);
    }
     */
}
