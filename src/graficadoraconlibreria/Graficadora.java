/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficadoraconlibreria;

import java.util.Locale;
import java.util.TimerTask;
import java.util.Timer;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultKeyedValuesDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author YEISON
 */
public class Graficadora extends javax.swing.JFrame {

    public Graficadora() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 751, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 511, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Graficadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Graficadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Graficadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graficadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graficadora().setVisible(true);
            }
        });
//Grafica con String--------------------------------------------------------------------------------------------------------
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(15,"g", "20");
        dataset.addValue(15,"g", "15");
        dataset.addValue(30, "g","20");
        dataset.addValue(60, "g","40");
        dataset.addValue(120, "g", "10");
        dataset.addValue(120, "g", "5");
        dataset.addValue(120, "g", "87");
        dataset.addValue(120, "g", "10");

        JFreeChart chart = ChartFactory.createLineChart("Titulo", "Titulo 2", "Titulo 3", dataset, PlotOrientation.VERTICAL, true, true, false);
        ChartPanel panel = new ChartPanel(chart);

        JFrame ventana = new JFrame();
        ventana.setVisible(true);
        ventana.setSize(600, 800);
        ventana.add(panel);
        
//Grafica con cordenadas--------------------------------------------------------------------------------------------------------
        XYSeries linea = new XYSeries("Ram");
        linea.add(1, 5);
        linea.add(2, 5);
        linea.add(10, 5);
        linea.add(13, 15);
        linea.add(15, 25);
        linea.add(10, 50);
        
        XYSeriesCollection dataset2 = new XYSeriesCollection();
        dataset2.addSeries(linea);
        
        JFreeChart graficaLinea = ChartFactory.createXYLineChart("Memoria Ram", "Posicion X", "Posicion Y", dataset2, PlotOrientation.VERTICAL, true, true, false);
        ChartPanel panel2 = new ChartPanel(graficaLinea);

        JFrame ventana2 = new JFrame();
        ventana2.setVisible(true);
        ventana2.setSize(600, 800);
        ventana2.add(panel2);



//--------------------------------------------------------------------------------------------------------
//        EjecutarScript ejecutarScript = new EjecutarScript();
//        ejecutarScript.run();
//        ObtenerMemoria memoria = new ObtenerMemoria();
//        memoria.run();
//        ObtenerMemoria2 memoria2 = new ObtenerMemoria2();
//        memoria2.leer();
//        Pintar pintar = new Pintar();
//        pintar.run();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
