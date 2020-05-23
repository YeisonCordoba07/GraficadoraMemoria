/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficadoraconlibreria;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author nanop
 */
public class MainGrafica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClasePanel clasePanel = new ClasePanel();
        EjecutarScript ejecutar = new EjecutarScript();
        ObtenerMemoria memoria = new ObtenerMemoria();

        ejecutar.run();
        memoria.run();

        JFrame jframe = new JFrame("Plano Cartesiano");

        jframe.setVisible(true);
        clasePanel.setVisible(true);
        
        clasePanel.setSize(200, 100);
        clasePanel.setBounds(0, 0, 500, 400);
        
        jframe.setSize(800, 840);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jframe.add(clasePanel);
        jframe.getContentPane().setBackground(Color.MAGENTA);
        //clasePanel.setBackground(Color.CYAN);
        

    }

}
