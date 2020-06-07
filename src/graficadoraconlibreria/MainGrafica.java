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
    static ActionListener actionEvent = (ActionEvent e) -> {
        Pintar pintar = new Pintar();
        
        EjecutarScript ejecutar = new EjecutarScript();
        ObtenerMemoria memoria = new ObtenerMemoria();
        
        pintar.asignaValoresX();
        pintar.asignaValoresY();
        ejecutar.ejecutarTimer();
        //memoria.leerMemoria("MemoriaRamTotal");
        //memoria.agregarAVector();
    };

    //Evento para que se cambien las graficas
    static ActionListener actionEvent2 = (ActionEvent e) -> {
        ClasePanel.cuadricula = !ClasePanel.cuadricula;
        System.out.println("Boton Cambiar Colores");
    };

    public static void main(String[] args) {
        ClasePanel clasePanel = new ClasePanel();
        botonIniciar.setVisible(true);
        botonIniciar.addActionListener(actionEvent);
        botonColor.setVisible(true);
        botonColor.addActionListener(actionEvent2);

        JFrame jframe = new JFrame("Plano Cartesiano");
        jframe.setResizable(false);
        jframe.setVisible(true);
        
        clasePanel.setVisible(true);
        clasePanel.setBounds(0, 0, 1100, 1000);

        jframe.setSize(575, 750);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLayout(new BorderLayout());
        clasePanel.setLayout(null);
        jframe.setLayout(null);
        jframe.getContentPane().add(clasePanel);
        clasePanel.add(botonIniciar);
        clasePanel.add(botonColor);
        botonIniciar.setBounds(50, 500, 450, 50);
        botonColor.setBounds(50, 600, 450, 50);
    }

}
