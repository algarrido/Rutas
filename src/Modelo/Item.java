/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Time;

/**
 *
 * @author Lidia
 */
public class Item {

    private Time hora;
    private Lugar lugar;

    public Item() {
    }

    public Item(Time hora, Lugar lugar) {
        this.hora = hora;
        this.lugar = lugar;
    }

    public Time getHora() {
        return hora;
    }

    public Lugar getLugar() {
        return lugar;
    }

    @Override
    public String toString() {
        return lugar.getId() + ") - " + lugar.getNombre() + " a las " + hora;
    }

}
