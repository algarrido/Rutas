/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * -- CONECTOR DE LA BD --
 *
 * @author Lidia
 */
public class ConexionBD {

    //atributos
    private Connection conexion = null;
    public static int numCon = 0;

    //constructor
    public ConexionBD(String nomb_Metodo) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/pcrt?autoReconnect=true&useSSL=false", "root", "");
            if (conexion != null) {
                System.err.println((numCon += 1) + " - " + nomb_Metodo + " ha realizado con éxito la conexion con la base de datos.");
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Se ha producido un error de conexion al intentar acceder a la base de datos.\nError en el metodo: " + nomb_Metodo, "Error de conexion", JOptionPane.ERROR_MESSAGE);
        }
    }

    //getter y setter
    public Connection getConexion() {
        return conexion;
    }

    public void desconectar() throws SQLException {
        conexion.close();
        conexion = null;
    }
}
