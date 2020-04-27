/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficadoraconlibreria;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author nanop
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
            public static  JFrame ventana2 = new JFrame();
            
    public static void main(String[] args) {
        // TODO code application logic here

//        //Grafica con String--------------------------------------------------------------------------------------------------------
//        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
//        dataset.addValue(15, "g", "20");
//        dataset.addValue(15, "g", "15");
//        dataset.addValue(30, "g", "20");
//        dataset.addValue(60, "g", "40");
//        dataset.addValue(120, "g", "10");
//        dataset.addValue(120, "g", "5");
//        dataset.addValue(120, "g", "87");
//        dataset.addValue(120, "g", "10");
//
//        JFreeChart chart = ChartFactory.createLineChart("Titulo", "Titulo 2", "Titulo 3", dataset, PlotOrientation.VERTICAL, true, true, false);
//        ChartPanel panel = new ChartPanel(chart);
//
//        JFrame ventana = new JFrame();
//        ventana.setVisible(true);
//        ventana.setSize(600, 800);
//        ventana.add(panel);
////Grafica con cordenadas--------------------------------------------------------------------------------------------------------
//        XYSeries linea = new XYSeries("Ram");
//        linea.add(1, 5);
//        linea.add(2, 5);
//        linea.add(10, 5);
//        linea.add(13, 15);
//        linea.add(15, 25);
//        linea.add(10, 50);
//
//        XYSeriesCollection dataset2 = new XYSeriesCollection();
//        dataset2.addSeries(linea);
//
//        JFreeChart graficaLinea = ChartFactory.createXYLineChart("Memoria Ram", "Posicion X", "Posicion Y", dataset2, PlotOrientation.VERTICAL, true, true, false);
//        ChartPanel panel2 = new ChartPanel(graficaLinea);
//
//        JFrame ventana2 = new JFrame();
//        ventana2.setVisible(true);
//        ventana2.setSize(600, 800);
//        ventana2.add(panel2);

        ventana2.setVisible(true);
        ventana2.setSize(600, 800);
        EjecutarScript ejecutarScript = new EjecutarScript();

        ObtenerMemoria memoria = new ObtenerMemoria();

        ejecutarScript.run();
        memoria.run();

//        ObtenerMemoria2 memoria2 = new ObtenerMemoria2();
//        memoria2.leer();
//        Pintar pintar = new Pintar();
//        pintar.run();
    }

}
