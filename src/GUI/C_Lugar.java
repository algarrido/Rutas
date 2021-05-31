/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Modelo.ControladorBD;
import Modelo.Item;
import Modelo.Lugar;
import Modelo.Sesion;
import Paneles.Boton_Lugar;
import Paneles.C_Configuradas;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.sql.Time;
import javax.swing.DefaultListModel;

/**
 *
 * @author Lidia
 */
public class C_Lugar {

    /*
    *
    *
    *   ATRIBUTOS DE CLASE
    *
     */
    private static V_Lugar dialog;
    private C_Configuradas panel;
    private Boton_Lugar pulsado;
    private Lugar miLugar;
    private Time hora_Seleccionada;
    private final Color transparente = new Color(0, 0, 0, (float) 0);
    private final Color translucido = new Color(0, 0, 0, (float) 0.8);

    /*
    *
    *
    *   CONSTRUCTOR DE CLASE
    *
     */
    public C_Lugar(V_Lugar dialog, C_Configuradas panel) {
        this.dialog = dialog;
        this.panel = panel;
    }

    /*
    *
    *
    *   GETTERS
    *
     */
    public Time getHora_Seleccionada() {
        return hora_Seleccionada;
    }

    /*
     *
     *
     *   SETTERS
     *
     */
    public void anadeLugar(Lugar miLugar, String dia) {
        this.miLugar = miLugar;
        procesaLugar(miLugar, dia);
    }

    public void setLeng(String leng) {
        switch (leng) {
            case "Espanol":
                dialog.getjButton_Anadir().setText("AÑADIR SESION");
                dialog.getjLabel_Precio_Texto().setText("Precio:");
                break;
            case "Ingles":
                dialog.getjButton_Anadir().setText("ADD SESSION");
                dialog.getjLabel_Precio_Texto().setText("Cost:");
                break;
            case "Frances":
                dialog.getjButton_Anadir().setText("AJOUTER SESSION");
                dialog.getjLabel_Precio_Texto().setText("Prix:");
                break;
            default:
                dialog.getjButton_Anadir().setText("AÑADIR SESION");
                dialog.getjLabel_Precio_Texto().setText("Precio:");
        }
    }

    public void setPulsado(Boton_Lugar pulsado) {
        this.pulsado = pulsado;
    }

    private void procesaLugar(Lugar l, String d) {
        setjLabel_Nombre(l.getNombre());
        setjLabel_IMG(l.getId());
        setjTextArea_Descripcion(l.getDescripcion());
        setjLabel_Precio(l.getPrecio());
        setSesiones(l, d);
    }

    private void setjLabel_Nombre(String nombre) {
        dialog.getjLabel_Nombre().setText(nombre);
    }

    private void setjLabel_IMG(int id) {
        try {
            dialog.getjLabel_IMG().setIcon(new javax.swing.ImageIcon("src/Imagenes/" + id + ".png"));
        } catch (Exception e) {
            dialog.getjLabel_IMG().setIcon(new javax.swing.ImageIcon("src/Imagenes/0.png"));
        }
    }

    private void setjLabel_Precio(BigDecimal precio) {
        dialog.getjLabel_Precio_Numero().setText(precio.toPlainString() + "€");
    }

    private void setjTextArea_Descripcion(String[] desc) {
        String parrafo = "";
        for (String str : desc) {
            parrafo = parrafo + str + "\n";
        }
        dialog.getjTextArea_Descripcion().setText(parrafo);
    }

    private void setSesiones(Lugar l, String dia) {
        DefaultListModel modeloList = new DefaultListModel();
        for (Sesion s : ControladorBD.getControlador().getSesiones(l.getId(), dia)) {
            modeloList.addElement(s.getHora().toString());
        }
        dialog.getjList_Sesiones().setModel(modeloList);
    }

    /*
    *
    *
    *   INICIALIZADOR DEL DIALOG
    *
     */
    public void inicio() {
        configuraListeners();
        dialog.setLocationRelativeTo(null);
        //dialog.setLocation(dialog.getX(), (dialog.getY() + 35));
        dialog.setBackground(transparente);
        dialog.getFondo1().setBackground(translucido);
        dialog.getFondo2().setBackground(translucido);
    }

    /*
    *
    *
    *   CONFIGURADOR DE LISTENERS
    *
     */
    public void configuraListeners() {
        dialog.getjButton_Salir().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                jButton_SalirActionPerformed(evt);
            }
        });
        dialog.getjButton_Anadir().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                jButton_AnadirActionPerformed(evt);
            }
        });
    }

    /*
    *
    *
    *   CONFIGURAR ACTION PERFORMED
    *
     */
    private void jButton_SalirActionPerformed(java.awt.event.ActionEvent evt) {
        panel.setEstado(2);
        panel.setInfo(panel.getInfo());
        dialog.dispose();
    }

    private void jButton_AnadirActionPerformed(java.awt.event.ActionEvent evt) {
        if (dialog.getjList_Sesiones().getSelectedIndex() > -1) {
            hora_Seleccionada = Time.valueOf(dialog.getjList_Sesiones().getSelectedValue());
            Item i = new Item(hora_Seleccionada, miLugar);
            panel.anadeFila(i, pulsado);
            dialog.setVisible(false);
        } else {
            panel.setEstado(2);
            panel.setInfo(panel.getInfo());
            dialog.dispose();
        }
    }

}
