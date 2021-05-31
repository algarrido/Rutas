/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import GUI.C_PCRT;
import Modelo.Item;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import javax.swing.ImageIcon;
import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeFactory;

/**
 *
 * @author Lidia
 */
public class C_Ticket {

    /*
    *
    *
    *   ATRIBUTOS DE CLASE
    *
     */
    private static JPanel_Ticket panel;
    private C_PCRT ventana;
    private Date fecha;
    private ArrayList<Item> ticket;
    private double total = 0;
    private double iva = 0;
    private double codigo;

    /*
    *
    *
    *   CONSTRUCTOR DE CLASE
    *
     */
    public C_Ticket(JPanel_Ticket panel, C_PCRT ventana) {
        this.panel = panel;
        this.ventana = ventana;
    }

    /*
    *
    *
    *   GETTERS
    *
     */
    public static JPanel_Ticket getPanel() {
        return panel;
    }

    /*
    *
    *
    *   SETTERS
    *
     */
    public void setLeng(String leng) {
        switch (leng) {
            case "Espanol":
                panel.getjLabel_Info().setText("Este es su ticket de compra. Si esta de acuerdo pulse Siguiente.");
                panel.getjLabel_Encabezado().setText("Mi Ticket");
                panel.getjLabel_Total_Text().setText("Total:");
                panel.getjLabel_Fecha_Text().setText("Válido para la fecha:");
                break;
            case "Ingles":
                panel.getjLabel_Info().setText("This is your purchase ticket. If you agree, click Next.");
                panel.getjLabel_Encabezado().setText("My Ticket");
                panel.getjLabel_Total_Text().setText("Total:");
                panel.getjLabel_Fecha_Text().setText("Valid for the date:");
                break;
            case "Frances":
                panel.getjLabel_Info().setText("C'est votre billet d'achat. Si vous êtes d'accord, cliquez Suivant.");
                panel.getjLabel_Encabezado().setText("Mon Billet");
                panel.getjLabel_Total_Text().setText("Total:");
                panel.getjLabel_Fecha_Text().setText("Valable pour la date:");
                break;
            default:

        }
    }

    public void setTicket(ArrayList<Item> ticket, Date fecha) {
        this.ticket = ticket;
        this.fecha = fecha;
        configuraTicket();
    }

    /*
    *
    *
    *   INICIALIZADOR DE PANEL
    *
     */
    public void inicio() {
        setLeng(ventana.getLeng());
    }
    
    public void regenerar() {
        this.codigo = 0;
        this.fecha = null;
        this.ticket = null;
        this.total = 0;
        this.iva = 0;
        panel.getjLabel_Hora1().setText("");
        panel.getjLabel_Producto1().setText("");
        panel.getjLabel_Precio1().setText("");
        panel.getjLabel_Hora2().setText("");
        panel.getjLabel_Producto2().setText("");
        panel.getjLabel_Precio2().setText("");
        panel.getjLabel_Hora3().setText("");
        panel.getjLabel_Producto3().setText("");
        panel.getjLabel_Precio3().setText("");
        panel.getjLabel_IVA_Num().setText("");
        panel.getjLabel_Total_Num().setText("");
        panel.getjLabel_Fecha_Num().setText("");
        panel.getjLabel_CodigoBarras().setIcon(null);
    }

    /*
    *
    *
    *   CREA ICONO DEL CODIGO DE BARRAS
    *
     */
    private void ImprimirCodigoBarras() {
        Barcode barcode = null;
        try {

            barcode = BarcodeFactory.createCode39(String.valueOf(codigo), true);

            barcode.setDrawingText(false);
            barcode.setBarWidth(2);
            barcode.setBarHeight(70);
            BufferedImage image = new BufferedImage(400, 80, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g = (Graphics2D) image.getGraphics();
            //barcode.draw(g, 5, 20);
            barcode.draw(g, 0, 5);

            ImageIcon icon = new ImageIcon(image);
            panel.getjLabel_CodigoBarras().setIcon(icon);

        } catch (Exception e) {
        }

    }

    /*
    *
    *
    *   CONFIGURADOR DEL TICKET
    *
     */
    public void configuraTicket() {

        codigo = Math.random();
        ImprimirCodigoBarras();

        Collections.sort(this.ticket, new Comparator<Item>() {
            @Override
            public int compare(Item i1, Item i2) {
                return Integer.valueOf((i1.getHora()).compareTo(i2.getHora()));
            }
        });

        switch (ticket.size()) {
            case 1:
                setItem1();
                break;
            case 2:
                setItem1();
                setItem2();
                break;
            case 3:
                setItem1();
                setItem2();
                setItem3();
                break;
            default:
                break;
        }
        DateFormat datfor = new SimpleDateFormat("dd/MM/yyyy");
        String validez = datfor.format(this.fecha);
        panel.getjLabel_Fecha_Num().setText(validez);

        this.total = Math.round(total * 100);
        this.total = this.total / 100;
        this.iva = Math.round((total * 0.10) * 100);
        this.iva = this.iva / 100;

        panel.getjLabel_IVA_Num().setText(String.valueOf(iva) + " €");
        panel.getjLabel_Total_Num().setText(String.valueOf(total + iva) + " €");
    }

    /*
    *
    *
    *   CONFIGURADOR DE LAS FILAS DE ITEMS DEL TICKET
    *
     */
    private void setItem1() {
        panel.getjLabel_Hora1().setText(ticket.get(0).getHora().toString());
        panel.getjLabel_Producto1().setText(ticket.get(0).getLugar().getNombre());
        panel.getjLabel_Precio1().setText(ticket.get(0).getLugar().getPrecio().toString());
        this.total += ticket.get(0).getLugar().getPrecio().doubleValue();
    }

    private void setItem2() {
        panel.getjLabel_Hora2().setText(ticket.get(1).getHora().toString());
        panel.getjLabel_Producto2().setText(ticket.get(1).getLugar().getNombre());
        panel.getjLabel_Precio2().setText(ticket.get(1).getLugar().getPrecio().toString());
        this.total += ticket.get(1).getLugar().getPrecio().doubleValue();
    }

    private void setItem3() {
        panel.getjLabel_Hora3().setText(ticket.get(2).getHora().toString());
        panel.getjLabel_Producto3().setText(ticket.get(2).getLugar().getNombre());
        panel.getjLabel_Precio3().setText(ticket.get(2).getLugar().getPrecio().toString());
        this.total += ticket.get(2).getLugar().getPrecio().doubleValue();
    }

}
