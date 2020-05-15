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
public class Pintar extends Thread {

    int valor;
    int valorEnX = 500;
    static int[][] v = new int[10][3];
    Random random = new Random();

    NewMain ventana = new NewMain();
//-----------------------------------------------------------------------------------------------

    public void run(int valorMemoriaRam) {
        try {
            asignaValoresX();

            valor = random.nextInt(11);
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
                v[0][1] = (800 - (valorMemoriaRam / 10))/2;//Valor de Y, 500 y 50 dependen de los pixeles
                //v[0][2] = valorEnX; //Valor de X
            //}

            mostrarVector();

            //dibujarGrafica();
            //dibujarLinea();
            //Graficadora.panel.repaint();
        } catch (Exception e) {
            System.out.println("Error gg: " + e);
        }
    }
//-----------------------------------------------------------------------------------------------
//    Timer timer = new Timer();
//    TimerTask tarea = new TimerTask() {
//
//        //Proceso que se va a ejecutar cada cierto tiempo
//        @Override
//        public void run() {
//
//        }
//
//    };
//-----------------------------------------------------------------------------------------------

    public void dibujarLinea() {
        Graphics g = Graficadora.panel.getGraphics();
        Graficadora.panel.repaint();

        int r = random.nextInt(6);
        switch (r) {
            case 1:
                g.setColor(Color.red);
                break;
            case 2:
                g.setColor(Color.blue);

                break;
            case 4:
                g.setColor(Color.green);
                break;
            case 3:
                g.setColor(Color.black);
                break;
            case 5:
                g.setColor(Color.orange);
                break;
            default:
                break;
        }

//        for (int i = 9; i >= 1; i--) {
//            g.drawLine(v[i][2], v[i][1], v[i - 1][2], v[i - 1][1]);
//            g.drawRect(v[i][2], v[i][1], 5, 5);
//        }
        //ventana.ventana2.setVisible(true);
    }

    public void dibujarGrafica(Graphics g) {

        XYSeries linea = new XYSeries("Ram");
        linea.add(v[0][2], v[0][1]);
        linea.add(v[1][2], v[1][1]);
        linea.add(v[2][2], v[2][1]);
        linea.add(v[3][2], v[3][1]);
        linea.add(v[4][2], v[4][1]);
        linea.add(v[5][2], v[5][1]);
        linea.add(v[6][2], v[6][1]);
        linea.add(v[7][2], v[7][1]);
        linea.add(v[8][2], v[8][1]);
        linea.add(v[9][2], v[9][1]);

        XYSeriesCollection dataset2 = new XYSeriesCollection();
        dataset2.addSeries(linea);

        JFreeChart graficaLinea = ChartFactory.createXYLineChart("Memoria Ram", "Posicion X", "Posicion Y", dataset2, PlotOrientation.VERTICAL, true, true, false);
        ChartPanel panel2 = new ChartPanel(graficaLinea);

//        JFrame ventana2 = new JFrame();
//        ventana2.setVisible(true);
//        ventana2.setSize(600, 800);
        //repaint();
        ventana.ventana2.remove(panel2);
        ventana.ventana2.add(panel2);
        ventana.ventana2.setVisible(true);
    }

//-----------------------------------------------------------------------------------------------
    private void moverValores() {
        for (int i = 9; i > 0; i--) {
            for (int j = 1; j >= 0; j--) {
                v[i][j] = v[i - 1][j];
            }
        }
    }

    private void asignaValoresX() {
        for (int i = 0; i <= 9; i++) {
            v[i][2] = valorEnX - (i * 50);
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
