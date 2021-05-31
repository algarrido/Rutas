/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * --CONTROLADOR DE LA BD--
 *
 * @author Lidia
 */
public class ControladorBD {

    //atributos
    private static ControladorBD controladorBD;
    private ConexionBD conexion;
    private PreparedStatement pstm;
    private ResultSet resultado;

    //constructor vacio
    private ControladorBD() throws ClassNotFoundException {
    }

    //constructor singleton
    public static ControladorBD getControlador() {
        try {
            if (controladorBD == null) {
                controladorBD = new ControladorBD();
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error de controlador no se encuentra la clase controladora de la BD.", "Error en getControlador()", JOptionPane.ERROR_MESSAGE);
        }
        return controladorBD;
    }

    //Este metodo devuelve el numero de filas que contiene la tabla indicada
    public int getFilas(String tabla, String condicion) {
        int filas = 0;
        try {
            conexion = new ConexionBD("getFilas(tabla, condicion)");
            pstm = conexion.getConexion().prepareStatement("SELECT COUNT(*) FROM ? ?");
            pstm.setString(1, tabla);
            pstm.setString(2, condicion);
            resultado = pstm.executeQuery();
            while (resultado.next()) {
                filas = resultado.getInt(1);
            }
            resultado.close();
            pstm.close();
            conexion.desconectar();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Error de consulta no se pudo obtener el numero de filas de la tabla.", "Error en getFilas()", JOptionPane.ERROR_MESSAGE);
            filas = 0;
        } finally {
            return filas;
        }
    }

    //Este metodo obtiene una lista de todos los lugares de la BD teniendo en cuenta el idioma indicado previamente
    public Lugar getLugar(int id, String idioma) {
        Lugar lugarElegido = new Lugar();
        try {
            conexion = new ConexionBD("getLugar(id,idioma)");
            pstm = conexion.getConexion().prepareStatement(
                    "SELECT lugar.ID, traduccion_lugar.Nombre, traduccion_lugar.Descripcion, lugar.Precio "
                    + "FROM lugar, traduccion_lugar, lenguaje "
                    + "WHERE lugar.ID = traduccion_lugar.ID_Lugar "
                    + "AND lenguaje.ID = traduccion_lugar.ID_Lenguaje "
                    + "AND lugar.ID = ? "
                    + "AND traduccion_lugar.ID_Lenguaje = (SELECT ID FROM lenguaje WHERE lenguaje.Idioma = ?)");
            pstm.setInt(1, id);
            pstm.setString(2, idioma);
            resultado = pstm.executeQuery();
            while (resultado.next()) {
                lugarElegido.setId(resultado.getInt(1));
                lugarElegido.setNombre(resultado.getString(2));
                lugarElegido.setDescripcion(resultado.getString(3));
                lugarElegido.setPrecio(resultado.getBigDecimal(4));
            }
            resultado.close();
            pstm.close();
            conexion.desconectar();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Error de consulta no se pudo obtener el objeto lugar de la BD.", "Error en getLugar()", JOptionPane.ERROR_MESSAGE);
            lugarElegido = null;
        } finally {
            return lugarElegido;
        }
    }

    //Este metodo obtiene una lista de todos los lugares de la BD teniendo en cuenta el idioma indicado previamente
    public ArrayList<Lugar> getListaLugares(String idioma, String dia) {
        ArrayList<Lugar> listaLugares = new ArrayList<Lugar>();
        try {
            conexion = new ConexionBD("getListaLugares(idioma,dia)");
            String sql = "SELECT DISTINCT lugar.ID, traduccion_lugar.Nombre, traduccion_lugar.Descripcion, lugar.Precio "
                    + "FROM lugar, traduccion_lugar, lenguaje, sesion "
                    + "WHERE lugar.ID = traduccion_lugar.ID_Lugar AND lugar.id = sesion.ID_Lugar "
                    + "AND lenguaje.ID = traduccion_lugar.ID_Lenguaje "
                    + "AND traduccion_lugar.ID_Lenguaje = (SELECT ID FROM lenguaje WHERE lenguaje.Idioma = ?) "
                    + "AND sesion.Dia = ?";
            pstm = conexion.getConexion().prepareStatement(sql);
            pstm.setString(1, idioma);
            pstm.setString(2, dia);
            resultado = pstm.executeQuery();
            while (resultado.next()) {
                Lugar temp = new Lugar();
                temp.setId(resultado.getInt(1));
                temp.setNombre(resultado.getString(2));
                temp.setDescripcion(resultado.getString(3));
                temp.setPrecio(resultado.getBigDecimal(4));
                listaLugares.add(temp);
            }
            resultado.close();
            pstm.close();
            conexion.desconectar();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Error de consulta no se pudo obtener la lista de lugares de la BD.", "Error en getLugares()", JOptionPane.ERROR_MESSAGE);
            listaLugares = null;
        } finally {
            return listaLugares;
        }
    }

    //Este metodo complementa al metodo getLugaresAbiertos(situado justo debajo) para fabricar su Array de indices
    private int getNumLugaresAbiertos(String diaSemana) {
        int numAbiertos = 0;
        try {
            conexion = new ConexionBD("getNumLugaresAbiertos(dia)");
            pstm = conexion.getConexion().prepareStatement(
                    "SELECT COUNT( DISTINCT lugar.ID) "
                    + "FROM lugar, sesion "
                    + "WHERE lugar.ID = sesion.ID_Lugar "
                    + "AND sesion.Dia = ?");
            pstm.setString(1, diaSemana);
            resultado = pstm.executeQuery();
            while (resultado.next()) {
                numAbiertos = resultado.getInt(1);
            }
            resultado.close();
            pstm.close();
            conexion.desconectar();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Error de consulta no se pudo obtener el numero de filas de la tabla de lugares abiertos.", "Error en getNumLugaresAbiertos()", JOptionPane.ERROR_MESSAGE);
            numAbiertos = 0;
        } finally {
            return numAbiertos;
        }
    }

    //Este metodo se usa para que indicando un dia de la semana devuelva una lista de los lugares que hay abiertos
    public Integer[] getLugaresAbiertos(String dia) {
        Integer[] lugaresAbiertos = new Integer[getNumLugaresAbiertos(dia)];
        try {
            conexion = new ConexionBD("getLugaresAbiertos(dia)");
            pstm = conexion.getConexion().prepareStatement(
                    "SELECT DISTINCT lugar.ID "
                    + "FROM lugar, sesion "
                    + "WHERE lugar.ID = sesion.ID_Lugar "
                    + "AND sesion.Dia = ?");
            pstm.setString(1, dia);
            resultado = pstm.executeQuery();
            int inc = 0;
            while (resultado.next()) {
                lugaresAbiertos[inc] = resultado.getInt(1);
                inc++;
            }
            resultado.close();
            pstm.close();
            conexion.desconectar();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Error de consulta no se pudo obtener la lista de lugares abiertos de la BD.", "Error en getLugaresAbiertos()", JOptionPane.ERROR_MESSAGE);
            return null;
        } finally {
            return lugaresAbiertos;
        }
    }

    public ArrayList<Sesion> getSesiones(int id_Lugar, String dia) {
        ArrayList<Sesion> listaSesiones = new ArrayList<Sesion>();
        try {
            conexion = new ConexionBD("getSesiones(ID_lugar, dia)");
            pstm = conexion.getConexion().prepareStatement(
                    "SELECT sesion.ID_Lugar, sesion.Dia, sesion.Hora "
                    + "FROM sesion, lugar "
                    + "WHERE sesion.ID_Lugar = lugar.ID "
                    + "AND sesion.ID_Lugar = ? "
                    + "AND sesion.Dia = ? "
                    + "ORDER BY sesion.Hora");
            pstm.setInt(1, id_Lugar);
            pstm.setString(2, dia);
            resultado = pstm.executeQuery();
            while (resultado.next()) {
                Sesion temp = new Sesion();
                temp.setId_Lugar(resultado.getInt(1));
                temp.setDia(resultado.getString(2));
                temp.setHora(resultado.getTime(3));
                listaSesiones.add(temp);
            }
            resultado.close();
            pstm.close();
            conexion.desconectar();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Error de consulta no se pudo obtener la lista de sesiones de la BD.", "Error en getSesiones()", JOptionPane.ERROR_MESSAGE);
            listaSesiones = null;
        } finally {
            return listaSesiones;
        }
    }

    public Time[] getHoras(int id, String dia) {
        int cont = 0;
        ArrayList<Sesion> sesiones = getSesiones(id, dia);
        Time[] horas = new Time[sesiones.size()];
        for (Sesion ses : sesiones) {
            horas[cont] = ses.getHora();
            cont++;
        }
        return horas;
    }
}
