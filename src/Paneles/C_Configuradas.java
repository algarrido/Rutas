/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import GUI.C_PCRT;
import GUI.V_Lugar;
import Modelo.ControladorBD;
import Modelo.Item;
import Modelo.Lugar;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import javax.swing.JPanel;

/**
 *
 * @author Lidia
 */
public class C_Configuradas {

    /*
    *
    *
    *   ATRIBUTOS DE CLASE
    *
     */
    private static JPanel_Configuradas panel;
    private C_PCRT ventana;
    private String[] info;
    private String[] infoESP = {"SELECCIONE UN LUGAR DE LA LISTA PARA AGREGARLO A SU RUTA.", "SELECCIONE OTRO LUGAR O PULSE SIGUIENTE PARA TERMINAR.", "INDIQUE A QUE HORA VISITARA ESTE LUGAR.", "HA TERMINADO DE CONFIGURAR SU RUTA, PULSE SIGUIENTE PARA CONTINUAR.", "SOLO PUEDE ELEGIR 3 SESIONAS POR RUTA.", "SESION INCORRECTA, DEBEN EXISTIR AL MENOS 60 MINUTOS ENTRE SESIONES."};
    private String[] infoING = {"SELECT A PLACE FROM THE LIST TO ADD IT TO YOUR ROUTE.", "SELECT ANOTHER PLACE OR PRESS NEXT TO FINISH.", "INDICATE THE SESSION YOU WILL VISIT THIS PLACE.", "YOU HAVE FINISHED TO CONFIGURE YOUR ROUTE, PRESS NEXT TO CONTINUE.", "YOU CAN ONLY CHOOSE 3 SESSIONS BY ROUTE.", "INCORRECT SESSION, THERE MUST BE AT LEAST 60 MINUTES BETWEEN SESSIONS."};
    private String[] infoFRA = {"SÉLECTIONNEZ UN EMPLACEMENT DE LA LISTE POUR L'AJOUTER À VOTRE ROUTE.", "SÉLECTIONNEZ UNE AUTRE EMPLACEMENT OU PRESSE SUIVANT POUR FINIR.", "INDIQUER VOTRE VISITE TEMPS POUR CE EMPLACEMENT", "VOUS AVEZ FINI VOTRE ROUTE PRESSE SUIVANT POUR CONTINUER.", "SEULEMENT VOUS POUVEZ CHOISIR 3 SESSIONS DE ROUTE.", "SESSION INCORRECT, IL DOIT AVOIR AU MOINS 60 MINUTES ENTRE SESSIONS."};
    private String dia_Seleccionado;
    private int estado = 1;
    private Date fecha;
    private ArrayList<Item> ticket = new ArrayList<Item>();
    private Boton_Lugar pulsado = null;

    /*
    *
    *
    *   CONSTRUCTOR DE CLASE
    *
     */
    public C_Configuradas(JPanel_Configuradas panel, C_PCRT ventana) {
        this.panel = panel;
        this.ventana = ventana;
    }

    /*
    *
    *
    *   GETTERS
    *
     */
    public static JPanel_Configuradas getPanel() {
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
        rellenaPanelLugares(dia_Seleccionado);
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

    public void setPulsado(Boton_Lugar pulsado) {
        this.pulsado = pulsado;
        V_Lugar.abrir(this).getControlador().anadeLugar(pulsado.getLugar(), dia_Seleccionado);
        V_Lugar.abrir(this).getControlador().setLeng(ventana.getLeng());
        V_Lugar.abrir(this).getControlador().setPulsado(this.pulsado);
        V_Lugar.abrir(this).setVisible(true);
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
        pulsado = null;
        estado = 1;
        vaciaPanelLugares();
        setInfo(info);
    }

    /*
    *
    *
    *   MANEJO DE ITEMS DEL TICKET
    *
     */
    public void anadeFila(Item item, Boton_Lugar bot) {
        if (ticket.size() < 3) {
            if (compruebaTicket(item) == true) {
                ventana.insertaFila(new Panel_Item(item, this, bot));
                ticket.add(item);
                panel.getjLabel_Info().setText(info[2]);
                if (ticket.size() == 3) {
                    panel.getjLabel_Info().setText(info[3]);
                }
            } else {
                panel.getjLabel_Info().setText(info[5]);
            }
        } else {
            panel.getjLabel_Info().setText(info[4]);
        }

    }

    public void quitaFila(Panel_Item panIt) {

        if (ticket.size() == 1) {
            ticket.clear();
            ventana.eliminaFila(panIt);
            this.estado = 1;
            setInfo(this.info);
        } else {
            for (Iterator<Item> iterador = ticket.iterator(); iterador.hasNext();) {
                Item it = iterador.next();
                if (it.equals(panIt.getItem())) {
                    // Elimina este item del iterador y del ArrayList
                    ventana.eliminaFila(panIt);
                    iterador.remove();
                }
            }
        }
    }

    private boolean compruebaTicket(Item itm) {
        //variable que se devuelve
        boolean correcto = true;
        //comprueba si el ticket ya esta lleno de items
        if (!ticket.isEmpty()) {
            long minA = TimeUnit.MILLISECONDS.toMinutes(itm.getHora().getTime());
            for (Item i : ticket) {
                long minB = TimeUnit.MILLISECONDS.toMinutes(i.getHora().getTime());
                int diferencia = (int) (minA - minB);
                if (diferencia < 0) {
                    if (diferencia > -60) {
                        correcto = false;
                    }
                } else {
                    if (diferencia < 60) {
                        correcto = false;
                    }
                }
            }
        }
        return correcto;
    }

    /*
    *
    *
    *   TRADUCTOR DEL PANEL
    *
     */
    private void setEspanol() {
        setInfo(infoESP);
        if (panel.getjScrollPane_Configurador().isVisible() && dia_Seleccionado != null) {
            traducePanelLugares("Espanol");
        }
    }

    private void setIngles() {
        setInfo(infoING);
        if (panel.getjScrollPane_Configurador().isVisible() && dia_Seleccionado != null) {
            traducePanelLugares("Ingles");
        }

    }

    private void setFrances() {
        setInfo(infoFRA);
        if (panel.getjScrollPane_Configurador().isVisible() && dia_Seleccionado != null) {
            traducePanelLugares("Frances");
        }
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
     */
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
    }

    public void vaciaPanelLugares() {
        dia_Seleccionado = null;
        fecha = null;
        panel.getjScrollPane_Configurador().revalidate();
        panel.getjScrollPane_Configurador().repaint();
        panel.getjScrollPane_Configurador().setVisible(false);
    }
}
