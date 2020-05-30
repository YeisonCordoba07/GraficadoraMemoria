/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficadoraconlibreria;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author nanop
 */
public class MainGrafica {

    /**
     * @param args the command line arguments
     */
    static JButton botonIniciar = new JButton("Iniciar");
    static JButton botonColor = new JButton("Cambiar Grafica");

    //Evento para que al dar click empiece a graficar
    static ActionListener actionEvent = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Pintar pintar = new Pintar();
            pintar.asignaValoresY();
            EjecutarScript ejecutar = new EjecutarScript();
            ObtenerMemoria memoria = new ObtenerMemoria();
            ejecutar.run();
            //memoria.run();
            System.out.println("Boton Iniciar");
        }
    };
    
    //Evento para que se cambien las graficas
    static ActionListener actionEvent2 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ClasePanel.cuadricula = !ClasePanel.cuadricula;
            System.out.println("Boton Cambiar Colores");
        }
    };

    public static void main(String[] args) {
        ClasePanel clasePanel = new ClasePanel();
        botonIniciar.setVisible(true);
        botonIniciar.addActionListener(actionEvent);
        botonColor.setVisible(true);
        botonColor.addActionListener(actionEvent2);

        JFrame jframe = new JFrame("Plano Cartesiano");

        jframe.setVisible(true);
        clasePanel.setVisible(true);

        clasePanel.setSize(200, 100);
        clasePanel.setBounds(0, 0, 500, 400);

        jframe.setSize(800, 840);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLayout(new BorderLayout());

        jframe.add(clasePanel);
        jframe.getContentPane().setBackground(Color.MAGENTA);
        jframe.add(botonIniciar, BorderLayout.EAST);
        jframe.add(botonColor, BorderLayout.SOUTH);
        //clasePanel.setBackground(Color.CYAN);

    }

}
