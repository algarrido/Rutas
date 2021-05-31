/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import Modelo.Lugar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JToggleButton;

/**
 *
 * @author Lidia
 */
public class Boton_Lugar extends JToggleButton implements ActionListener {

    /**
     * Atributos
     */
    private final C_Configuradas mipanel;
    private Lugar lugar;

    /**
     * Constructor
     */
    public Boton_Lugar(C_Configuradas mipanel, Lugar l) {
        this.mipanel = mipanel;
        this.lugar = l;
        configura_JButton_Lugar();
    }

    /**
     * Getters
     */
    public Lugar getLugar() {
        return lugar;
    }

    /**
     * Metodos
     */
    //Configura el aspecto visual del Label que se muestra en el selector de lugares
    private void configura_JButton_Lugar() {
        setPreferredSize(new java.awt.Dimension(770, 115));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setFont(new java.awt.Font("Andalus", 0, 45));
        setForeground(new java.awt.Color(255, 255, 255));
        setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setText(lugar.getNombre());
        setBorder(null);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setToolTipText(null);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        aplica_Fondo();
        addActionListener((ActionEvent e) -> {
            actionPerformed(e);
        });
    }

    //Comprueba si existe un fondo para este label de lugar y se lo aplica, en caso contrario captura la excepcion y le aplica un color de fondo por defecto
    private void aplica_Fondo() {
        setDisabledIcon(new javax.swing.ImageIcon("src/Imagenes/0_BOTON.png"));
        try {
            String rutaIcono = "src/Imagenes/" + lugar.getId() + "_BOTON.png";
            setIcon(new javax.swing.ImageIcon(rutaIcono));
            setOpaque(false);
        } catch (Exception e) {
            setIcon(new javax.swing.ImageIcon("src/Imagenes/0_BOTON.png"));
            setOpaque(false);
        }
    }

    /**
     * Accion del boton
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (mipanel.getTicket().size() != 3) {
            mipanel.setEstado(4);
            mipanel.setInfo(mipanel.getInfo());
            mipanel.setPulsado(this);
        }
    }

}
