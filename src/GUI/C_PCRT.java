/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Paneles.JPanel_Calendar;
import Paneles.JPanel_Configuradas;
import Paneles.JPanel_Inicio;
import Paneles.JPanel_Preconfiguradas;
import Paneles.JPanel_Ticket;
import Paneles.Panel_Item;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Lidia
 */
public class C_PCRT {

    /*
    *
    *
    *   ATRIBUTOS DE CLASE
    *
     */
    private V_PCRT ventana;
    private String menu;
    private String leng;
    private CardLayout layout;

    /*
    *
    *
    *   CONSTRUCTOR DE CLASE
    *
     */
    public C_PCRT(V_PCRT ventana) {
        this.ventana = ventana;
    }

    /*
    *
    *
    *   GETTERS
    *
     */
    public String getmenu() {
        return menu;
    }

    public String getLeng() {
        return leng;
    }

    /*
    *
    *
    *   SETTERS
    *
     */
    public void setMenu(String menu) {
        this.menu = menu;
    }

    private void setLeng(String leng) {
        this.leng = leng;
        switch (this.leng) {
            case "Espanol":
                setEspanol();
                cambiaLeng("Espanol");
                break;
            case "Ingles":
                setIngles();
                cambiaLeng("Ingles");
                break;
            case "Frances":
                setFrances();
                cambiaLeng("Frances");
                break;
            default:
                setEspanol();
                cambiaLeng("Espanol");
        }
    }

    /*
    *
    *
    *   INICIALIZADOR DE VENTANA
    *
     */
    public void inicio() {
        this.leng = "Espanol";  //Esta variables es la que inicializa el Sistema a un idioma concreto. Idioma Inicial.
        ventana.setLocationRelativeTo(null);
        layout = new CardLayout();
        ventana.getContenedor().setLayout(layout);
        configuraListeners();
        cargaPanelInicio();
    }

    public void cargaPanelInicio() {
        JPanel_Ticket.abrir(this).getControlador().regenerar();
        JPanel_Configuradas.abrir(this).getControlador().regenerar();
        JPanel_Calendar.abrir(this).getControlador().regenerar();
        vaciaPanel();
        ventana.getContenedor().removeAll();
        ventana.getContenedor().add(JPanel_Inicio.abrir(this));
        menu = "Inicio";
        desactivaAtras();
        desactivaSiguiente();
    }

    public void cargaConfiguradas() {
        ventana.getContenedor().add(JPanel_Calendar.abrir(this));
        ventana.getContenedor().add(JPanel_Configuradas.abrir(this));
        ventana.getContenedor().add(JPanel_Ticket.abrir(this));
        ventana.getContenedor().revalidate(); 
        desactivaSiguiente();
        activaAtras();
        menu = "CONF_Calendar";
        next();
    }

    public void cargaPreconfiguradas() {
        ventana.getContenedor().add(JPanel_Calendar.abrir(this));
        ventana.getContenedor().add(JPanel_Preconfiguradas.abrir(this));
        ventana.getContenedor().add(JPanel_Ticket.abrir(this));
        desactivaSiguiente();
        activaAtras();
        menu = "PREC_Calendar";
        next();
    }

    public void diaNuevo() {
        JPanel_Ticket.abrir(this).getControlador().regenerar();
        switch(menu){
            case "CONF_Calendar":
                JPanel_Configuradas.abrir(this).getControlador().regenerar();
                break;
            case "PREC_Calendar":
                JPanel_Preconfiguradas.abrir(this).getControlador().regenerar();
                break;
        }
        vaciaPanel();
        JPanel_Calendar.abrir(this).getControlador().regenerar();
        desactivaSiguiente();
        activaAtras();
        back();
    }

    /*
    *
    *
    *   CONTROLADORES DEL PANEL DE ITEMS
    *
     */
    public void insertaFila(Panel_Item fila) {
        if (ventana.getjPanel_Contenedor_Items().getComponentCount() < 3) {
            ventana.getjPanel_Contenedor_Items().add(fila);
            fila.getMi_boton().setEnabled(false);
        }
        revalidaPanel();
    }

    public void eliminaFila(Panel_Item fila) {
        fila.getMi_boton().setEnabled(true);
        ventana.getjPanel_Contenedor_Items().remove(fila);
        revalidaPanel();
    }

    public void vaciaPanel() {
        ventana.getjPanel_Contenedor_Items().removeAll();
        revalidaPanel();
    }

    private void revalidaPanel() {
        ventana.getjPanel_Contenedor_Items().revalidate();
        ventana.getjPanel_Contenedor_Items().repaint();
        if (ventana.getjPanel_Contenedor_Items().getComponentCount() < 1) {
            desactivaSiguiente();
        } else {
            activaSiguiente();
        }
    }

    /*
    *
    *
    *   CONFIGURA LISTENERS
    *
     */
    public void configuraListeners() {
        ventana.getjButtonADMIN().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                jButtonADMINActionPerformed(evt);
            }
        });
        ventana.getjButtonATRAS().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                jButtonATRASActionPerformed(evt);
            }
        });
        ventana.getjButtonSIGUIENTE().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                jButtonSIGUIENTEActionPerformed(evt);
            }
        });
        ventana.getjButtonESP().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                jButtonESPActionPerformed(evt);
            }
        });
        ventana.getjButtonING().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                jButtonINGActionPerformed(evt);
            }
        });
        ventana.getjButtonFRA().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                jButtonFRAActionPerformed(evt);
            }
        });
    }

    /*
    *
    *
    *   TRADUCTOR DEL INTERFAZ DE LA VENTANA
    *
     */
    private void setEspanol() {
        ventana.getjLabelLOGO().setText("Rutas Turísticas");
        ventana.getjButtonESP().setEnabled(false);
        ventana.getjButtonING().setEnabled(true);
        ventana.getjButtonFRA().setEnabled(true);
    }

    private void setIngles() {
        ventana.getjLabelLOGO().setText("Tourist Routes");
        ventana.getjButtonESP().setEnabled(true);
        ventana.getjButtonING().setEnabled(false);
        ventana.getjButtonFRA().setEnabled(true);
    }

    private void setFrances() {
        ventana.getjLabelLOGO().setText("Routes Touristiques");
        ventana.getjButtonESP().setEnabled(true);
        ventana.getjButtonING().setEnabled(true);
        ventana.getjButtonFRA().setEnabled(false);
    }

    /*
    *
    *
    *   TRADUCTOR DE LOS PANELES DEL CONTENEDOR
    *
     */
    private void cambiaLeng(String lenguaje) {
        this.leng = lenguaje;
        JPanel_Inicio.abrir(this).getControlador().setLeng(lenguaje);
        JPanel_Configuradas.abrir(this).getControlador().setLeng(lenguaje);
        JPanel_Ticket.abrir(this).getControlador().setLeng(lenguaje);
    }

    /*
    *
    *
    *   CONTROLADOR DE LOS BOTONES SIGUIENTE Y ATRAS
    *
     */
    public void next() {
        layout.next(ventana.getContenedor());
    }

    public void back() {
        layout.previous(ventana.getContenedor());
    }

    public void activaSiguiente() {
        ventana.getjButtonSIGUIENTE().setEnabled(true);
    }

    public void desactivaSiguiente() {
        ventana.getjButtonSIGUIENTE().setEnabled(false);
    }

    public void activaAtras() {
        ventana.getjButtonATRAS().setEnabled(true);
    }

    public void desactivaAtras() {
        ventana.getjButtonATRAS().setEnabled(false);
    }

    /*
    *
    *
    *   CONFIGURAR ACTIONPERFORMED
    *
     */
    public void jButtonADMINActionPerformed(ActionEvent evt) {
        System.exit(0);
    }

    public void jButtonESPActionPerformed(ActionEvent evt) {
        setLeng("Espanol");
    }

    public void jButtonINGActionPerformed(ActionEvent evt) {
        setLeng("Ingles");
    }

    public void jButtonFRAActionPerformed(ActionEvent evt) {
        setLeng("Frances");
    }

    public void jButtonSIGUIENTEActionPerformed(ActionEvent evt) {
        switch (menu) {
            //Panel de Inicio
            case "Inicio":
                break;
            //Panel Configuradas
            case "CONF_Calendar":
                //AVANZA CUANDO SELECCIONAS EL DIA
                break;
            case "CONF_Lista":
                JPanel_Ticket.abrir(this).getControlador().setTicket(
                        JPanel_Configuradas.abrir(this).getControlador().getTicket(),
                        JPanel_Configuradas.abrir(this).getControlador().getFecha()
                );
                activaSiguiente();
                activaAtras();
                menu = "CONF_Ticket";
                ventana.getjPanel_Contenedor_Items().setVisible(false);
                next();
                break;
            case "CONF_Ticket":
                break;
            //Panel Preconfiguradas
            case "PREC_Calendar":
                //AVANZA CUANDO SELECCIONAS EL DIA
                break;
            case "PREC_Lista":
                break;
            case "PREC_Ticket":
                break;
        }
    }

    public void jButtonATRASActionPerformed(ActionEvent evt) {
        switch (menu) {
            //Panel de Inicio
            case "Inicio":
                break;
            //Panel Configuradas
            case "CONF_Calendar":
                cargaPanelInicio();
                break;
            case "CONF_Lista":
                int eleccionCONF = JOptionPane.showConfirmDialog(ventana, "Si vuelve atrás, no se guardarán los cambios.");
                if (eleccionCONF == JOptionPane.YES_OPTION) {
                    diaNuevo();
                    menu = "CONF_Calendar";
                }
                break;
            case "CONF_Ticket":
                JPanel_Ticket.abrir(this).getControlador().regenerar();
                ventana.getjPanel_Contenedor_Items().setVisible(true);
                activaSiguiente();
                activaAtras();
                menu = "CONF_Lista";
                back();
                break;
            //Panel Preconfiguradas
            case "PREC_Calendar":
                cargaPanelInicio();
                break;
            case "PREC_Lista":
                int eleccionPREC = JOptionPane.showConfirmDialog(ventana, "Si vuelve atrás, no se guardarán los cambios.");
                if (eleccionPREC == JOptionPane.YES_OPTION) {
                    diaNuevo();
                    menu = "PREC_Calendar";
                }
                break;
            case "PREC_Ticket":
                break;
        }
    }

}
