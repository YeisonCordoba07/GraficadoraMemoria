/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficadoraconlibreria;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author nanop
 */
public class Grafica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClasePanel clasePanel = new ClasePanel();

        JFrame ventana = new JFrame("Plano Cartesiano");
        ventana.setVisible(true);
        clasePanel.setVisible(true);
        ventana.setSize(800, 840);

        ventana.add(clasePanel);
        ventana.getContentPane().setBackground(Color.MAGENTA);
        //clasePanel.setBackground(Color.CYAN);
        clasePanel.setSize(200, 100);
    }

}
