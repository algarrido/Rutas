

package GUI;

import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;


/**
 *
 * @author Lidia
 */
public class FactoriaPDF {

    
    private static PDDocument documentoPDF;

    public static void main(String[] args) {

        String[] entrada = {"Hora1", "Lugar1",
            "Hora2", "Lugar2",
            "Hora3", "Lugar3",
            "Fecha"};
        String[] recibo = {"Cantidad1", "Item1", "Precio1",
            "Cantidad2", "Item2", "Precio2",
            "Cantidad3", "Item3", "Precio3",
            "Cantidad4", "Item4", "Precio4",
            "Cantidad5", "Item5", "Precio5",
            "Iva",
            "Total"};

        String plantilla = "Plantilla.pdf";
        String ticket = "miTicket.pdf";
        

        try {
            documentoPDF = PDDocument.load(new File(plantilla));
            documentoPDF.getNumberOfPages();
//////////////////////////////////////////////////////////////////////////////
            rellenaCampo(entrada[0], "08:30");
            rellenaCampo(entrada[1], "Alcázar de los Reyes Cristianos");
            rellenaCampo(entrada[2], "10:00");
            rellenaCampo(entrada[3], "Baños del Alcázar Califal");
            rellenaCampo(entrada[4], "12:00");
            rellenaCampo(entrada[5], "Jardín Botánico");
            rellenaCampo(entrada[6], "Miercoles, 10/05/2017");
//////////////////////////////////////////////////////////////////////////////
            rellenaCampo(recibo[0], "1");
            rellenaCampo(recibo[1], "ENTR_ALC");
            rellenaCampo(recibo[2], "4.50");
            rellenaCampo(recibo[3], "1");
            rellenaCampo(recibo[4], "ENTR_BAÑ");
            rellenaCampo(recibo[5], "2.50");
            rellenaCampo(recibo[6], "1");
            rellenaCampo(recibo[7], "ENTR_BOT");
            rellenaCampo(recibo[8], "3.00");
            rellenaCampo(recibo[9], "1");
            rellenaCampo(recibo[10], "Servicio Guia");
            rellenaCampo(recibo[11], "15.00");
            rellenaCampo(recibo[12], "1");
            rellenaCampo(recibo[13], "Callejero");
            rellenaCampo(recibo[14], "1.00");
            rellenaCampo(recibo[15], "2.60");
            rellenaCampo(recibo[16], "28.60");
/////////////////////////////////////////////////////////////////////////////
            documentoPDF.save(ticket);
            documentoPDF.close();
        } catch (IOException ioex) {
            ioex.printStackTrace();
        }

        System.out.println("Complete");
    }

    public static void rellenaCampo(String campo, String valor) throws IOException {
        PDDocumentCatalog docCatalog = documentoPDF.getDocumentCatalog();
        PDAcroForm acroForm = docCatalog.getAcroForm();
        PDField field = acroForm.getField(campo);
        if (field != null) {
            field.setValue(valor);
        } else {
            System.err.println("No se han encontrado campos de formulario con el nombre:" + campo);
        }
    }

}

