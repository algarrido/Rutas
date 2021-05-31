/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Time;
import java.util.GregorianCalendar;

/**
 *
 * @author Lidia
 */
public class Sesion {

    //atributos
    private int id_Lugar;
    private int dia;
    private Time hora;

    //constructor
    public Sesion() {
    }

    //getters y setters
    public int getId_Lugar() {
        return id_Lugar;
    }

    public void setId_Lugar(int id_Lugar) {
        this.id_Lugar = id_Lugar;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(String dia) {
        switch (dia) {
            case "DOMINGO":
                this.dia = GregorianCalendar.SUNDAY;
                break;         //1 - Domingo
            case "LUNES":
                this.dia = GregorianCalendar.MONDAY;
                break;           //2 - Lunes
            case "MARTES":
                this.dia = GregorianCalendar.TUESDAY;
                break;         //3 - Lunes
            case "MIERCOLES":
                this.dia = GregorianCalendar.WEDNESDAY;
                break;    //4 - Lunes
            case "JUEVES":
                this.dia = GregorianCalendar.THURSDAY;
                break;        //5 - Lunes
            case "VIERNES":
                this.dia = GregorianCalendar.FRIDAY;
                break;         //6 - Lunes
            case "SABADO":
                this.dia = GregorianCalendar.SATURDAY;
                break;        //7 - Lunes
            default:
                this.dia = 0;
                break;       //0 - DIA NO ASIGNADO
        }
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return hora.toString();
    }

}
