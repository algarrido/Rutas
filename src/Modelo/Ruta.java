/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Lidia
 */
public class Ruta {

    private Item[] visitas = new Item[3];
    private String nombre;
    private String descripcion;
    private Double total;

    public Ruta() {
    }

    public Ruta(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Item[] getVisitas() {
        return visitas;
    }

    public void setVisita(Item item, int posicion) throws Exception {
        for (int i = 0; i < 3; i++) {
            if (this.visitas[i] == null) {
                this.visitas[i] = item;
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

}
