/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.math.BigDecimal;

/**
 *
 * -- OBJETO LUGAR --
 *
 * @author Lidia
 */
public class Lugar {

    //atributos
    private int id;
    private String nombre;
    private String[] descripcion;
    private BigDecimal precio;

    //constructor
    public Lugar() {
    }

    //getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion.split("\n");
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public void resumen() {
        System.out.println("Lugar: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripcion: ");
        for (String s : descripcion) {
            System.out.println("\t" + s);
        }
        System.out.println("Precio: " + precio);
    }

}
