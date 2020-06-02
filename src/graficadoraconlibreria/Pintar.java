/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficadoraconlibreria;

import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author YEISON
 */
public class Pintar {

    int valor;
    int valorEnX = 500;
    static int[][] v = new int[10][3];

//-----------------------------------------------------------------------------------------------

    public void agregarAVector(int valorMemoriaRam) {
        try {
            //Si la memoria ram es menor que 0, no la grafica, sino 
            //que duplica la ultima que haya en el vector
//            if (valorMemoriaRam <= 0) {
//                v[0][0] = v[1][0];
//                v[0][1] = v[1][1];
//                System.out.println("###################################");
//            } else {
            System.out.println("Valor: " + valorMemoriaRam);
            moverValores();
            v[0][0] = valorMemoriaRam;
            v[0][1] = (400 - (valorMemoriaRam / 10)) + 50;//Valor de Y, 500 y 50 dependen de los pixeles

            mostrarVector();

            //dibujarGrafica();
            //dibujarLinea();
            //Graficadora.panel.repaint();
        } catch (Exception e) {
            System.out.println("Error vector: " + e);
        }
    }


//-----------------------------------------------------------------------------------------------
    private void moverValores() {
        for (int i = 9; i > 0; i--) {
            for (int j = 1; j >= 0; j--) {
                v[i][j] = v[i - 1][j];
            }
        }
    }

    public void asignaValoresX() {
        for (int i = 0; i <= 9; i++) {
            v[i][2] = valorEnX - (i * 50);
        }
    }

    public void asignaValoresY() {
        for (int i = 0; i <= 9; i++) {
            v[i][1] = 450;
        }
    }

    private void mostrarVector() {
        for (int j = 2; j >= 0; j--) {
            for (int i = 9; i >= 0; i--) {
                System.out.print(v[i][j] + "\t ");
            }
            System.out.println("");
        }
        System.out.println("//---------------------------------------------------------------------------------------");
    }

//-----------------------------------------------------------------------------------------------
    public int[][] retornaVector() {
        return v;
    }
}
