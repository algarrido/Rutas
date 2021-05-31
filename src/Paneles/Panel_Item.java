/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import Modelo.Item;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Lidia
 */
public class Panel_Item extends JPanel {

    private Boton_Lugar mi_boton;
    private C_Configuradas panel;
    private Item mi_Item;
    private JButton boton_Borrar;
    private JLabel label_Hora;
    private JLabel label_Lugar;
    private GroupLayout mi_Layout;
    private final Font fuente = new Font("Dialog", 1, 15);
    private final Color colorBoton = new Color(255, 51, 51);

    public Panel_Item(Item item, C_Configuradas panel, Boton_Lugar miBoton) {
        this.mi_boton = miBoton;
        this.panel = panel;
        this.mi_Item = item;
        iniciaComponentes();
    }

    public Item getItem() {
        return mi_Item;
    }

    public Boton_Lugar getMi_boton() {
        return mi_boton;
    }

    private void iniciaComponentes() {
        boton_Borrar = new JButton();
        label_Hora = new JLabel();
        label_Lugar = new JLabel();

        this.setToolTipText(null);
        this.setMaximumSize(new Dimension(400, 30));
        this.setMinimumSize(new Dimension(400, 30));
        this.setOpaque(false);
        this.setPreferredSize(new Dimension(400, 30));

        boton_Borrar.setBackground(colorBoton);
        boton_Borrar.setFont(fuente);
        boton_Borrar.setForeground(Color.white);
        boton_Borrar.setText("X");
        boton_Borrar.setBorder(null);
        boton_Borrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                boton_BorrarActionPerformed(evt);
            }
        });

        label_Hora.setBackground(Color.white);
        label_Hora.setFont(fuente);
        label_Hora.setHorizontalAlignment(SwingConstants.TRAILING);
        label_Hora.setOpaque(true);
        label_Hora.setText(mi_Item.getHora().toString());

        label_Lugar.setBackground(Color.white);
        label_Lugar.setFont(fuente);
        label_Lugar.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        label_Lugar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        label_Lugar.setOpaque(true);
        label_Lugar.setText(mi_Item.getLugar().getNombre());

        configuraLayout();
    }

    private void configuraLayout() {
        mi_Layout = new GroupLayout(this);
        this.setLayout(mi_Layout);
        mi_Layout.setHorizontalGroup(
                mi_Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(mi_Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(boton_Borrar, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(label_Hora, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(label_Lugar, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE))
        );
        mi_Layout.setVerticalGroup(
                mi_Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(boton_Borrar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_Hora, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_Lugar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        );
    }

    private void boton_BorrarActionPerformed(ActionEvent evt) {
        panel.quitaFila(this);
    }
}
