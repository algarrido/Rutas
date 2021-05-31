/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import GUI.C_PCRT;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Lidia
 */
public class C_Inicio {

    /*
    *
    *
    *   ATRIBUTOS DE CLASE
    *
     */
    private static JPanel_Inicio panel;
    private C_PCRT ventana;

    /*
    *
    *
    *   CONSTRUCTOR DE CLASE
    *
     */
    public C_Inicio(JPanel_Inicio panel, C_PCRT ventana) {
        this.panel = panel;
        this.ventana = ventana;
    }

    /*
    *
    *
    *   GETTERS
    *
     */
    public static JPanel_Inicio getPanel() {
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
                setEspanol();
                break;
            case "Ingles":
                setIngles();
                break;
            case "Frances":
                setFrances();
                break;
            default:
                setEspanol();
        }
    }

    /*
    *
    *
    *   INICIALIZADOR DE PANEL
    *
     */
    public void inicio() {
        configuraListeners();
        setLeng(ventana.getLeng());
    }

    /*
    *
    *
    *   TRADUCTOR DEL PANEL
    *
     */
    private void setEspanol() {
        panel.getjLabel_Info().setText("ELIJA EL TIPO DE RUTA QUE DESEA CONTRATAR.");
        panel.getjToggleButtonConfiguradas().setText("<html><center><h1 style=color:#264d77>RUTAS CONFIGURADAS.</h1></center><p>Si elige esta opción podrá configurar desde cero una ruta que se adapte a sus gustos personales y necesidades.</p><p>Mediante el configurador de rutas podrá combinar a su gusto el lugar y la hora de sus visitas turísticas.</p></html>");
        panel.getjToggleButtonPreconfiguradas().setText("<html><center><h1 style=color:#264d77>RUTAS PRECONFIGURADAS.</h1></center><p>Si elige esta opción se le mostrará una lista de rutas previemente configuradas, con un itinerario cerrado para que contrate aquella que mas se ajuste a sus necesidades.</p></hmtl>");
    }

    private void setIngles() {
        panel.getjLabel_Info().setText("CHOOSE THE TYPE OF ROUTE YOU WANT TO CONTRACT.");
        panel.getjToggleButtonConfiguradas().setText("<html><center><h1 style=color:#264d77>CONFIGURED ROUTES.</h1></center><p>If you choose this option you can configure from scratch a route that suits your personal tastes and needs.</p><p>By means of the route configurator you can combine the place and time of your sightseeing.</p></html>");
        panel.getjToggleButtonPreconfiguradas().setText("<html><center><h1 style=color:#264d77>PRE-CONFIGURED ROUTES.</h1></center><p>If you choose this option you will be shown a list of previously configured routes, with a closed itinerary to hire the one that best suits your needs.</p></hmtl>");
    }

    private void setFrances() {
        panel.getjLabel_Info().setText("CHOISIS LE TYPE DE ROUTE QUE VOUS VOULEZ CONTRAT.");
        panel.getjToggleButtonConfiguradas().setText("<html><center><h1 style=color:#264d77>ROUTES CONFIGURÉES.</h1></center><p>Si vous choisissez cette option, vous pouvez configurer à partir de zéro une route adapté à vos goûts et besoins personnels.</p><p>Grâce au configurateur d'routes, vous pouvez combiner l'endroit et l'heure de votre visite.</p></html>");
        panel.getjToggleButtonPreconfiguradas().setText("<html><center><h1 style=color:#264d77>ROUTES PRE-CONFIGURÉES.</h1></center><p>Si vous choisissez cette option, vous recevrez une liste des routes précédemment configurés, avec un itinéraire fermé pour embaucher celui qui correspond le mieux à vos besoins.</p></hmtl>");
    }

    /*
    *
    *
    *   CONFIGURADOR DE LISTENERS
    *
     */
    public void configuraListeners() {
        panel.getjToggleButtonConfiguradas().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                jToggleButtonConfiguradasMouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                jToggleButtonConfiguradasMouseEntered(evt);
            }

            @Override
            public void mouseExited(MouseEvent evt) {
                jToggleButtonConfiguradasMouseExited(evt);
            }
        });
        panel.getjToggleButtonPreconfiguradas().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                jToggleButtonPreconfiguradasMouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                jToggleButtonPreconfiguradasMouseEntered(evt);
            }

            @Override
            public void mouseExited(MouseEvent evt) {
                jToggleButtonPreconfiguradasMouseExited(evt);
            }
        });
    }

    /*
    *
    *
    *   CONFIGURAR ACTION PERFORMED
    *
     */
    private void jToggleButtonConfiguradasMouseEntered(MouseEvent evt) {
        panel.getjToggleButtonConfiguradas().setOpaque(true);
    }

    private void jToggleButtonConfiguradasMouseExited(MouseEvent evt) {
        panel.getjToggleButtonConfiguradas().setOpaque(false);
    }

    private void jToggleButtonConfiguradasMouseClicked(MouseEvent evt) {
        ventana.cargaConfiguradas();
    }

    private void jToggleButtonPreconfiguradasMouseEntered(MouseEvent evt) {
        panel.getjToggleButtonPreconfiguradas().setOpaque(true);
    }

    private void jToggleButtonPreconfiguradasMouseExited(MouseEvent evt) {
        panel.getjToggleButtonPreconfiguradas().setOpaque(false);
    }

    private void jToggleButtonPreconfiguradasMouseClicked(MouseEvent evt) {
        ventana.cargaPreconfiguradas();
    }
}
