/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficadoraconlibreria;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

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
        pintar.asignaValoresX();
        pintar.asignaValoresY();
        ejecutar.ejecutarTimer();

    };

    //Evento para que se cambien las graficas
    static ActionListener actionEvent2 = (ActionEvent e) -> {
        ClasePanel.cuadricula = !ClasePanel.cuadricula;
    };

    static JLabel titulo = new JLabel("Memoria Ram Utilizada");

    public static void main(String[] args) 
    {
        ClasePanel clasePanel = new ClasePanel();
        botonIniciar.setVisible(true);
        botonIniciar.addActionListener(actionEvent);
        botonColor.setVisible(true);
        botonColor.addActionListener(actionEvent2);

        botonIniciar.setFont(new Font("arial", Font.ROMAN_BASELINE, 30));
        botonColor.setFont(new Font("arial", Font.ROMAN_BASELINE, 30));

        titulo.setBounds(125, -20, 500, 100);
        titulo.setFont(new Font("arial", Font.ROMAN_BASELINE, 30));

        JFrame jframe = new JFrame("SIMULADOR GRAFICO");

        jframe.setResizable(false);
        jframe.setVisible(true);

        clasePanel.setVisible(true);
        clasePanel.setBounds(0, 0, 1100, 1000);
        clasePanel.add(titulo);
        titulo.setVisible(true);

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
