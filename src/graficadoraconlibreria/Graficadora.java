/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficadoraconlibreria;

import static graficadoraconlibreria.NewMain.panel2;
import static graficadoraconlibreria.NewMain.ventana2;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Locale;
import java.util.TimerTask;
import java.util.Timer;
import javax.swing.JFrame;
import javax.swing.JPanel;
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

    public static JPanel panel = new JPanel();

    public Graficadora() {

        initComponents();

        panel.setVisible(true);
        panel.setSize(1100, 900);
        this.setBackground(Color.yellow);
        //panel.setBackground(Color.blue);
        this.setSize(1000, 1000);
        this.add(panel);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(526, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(152, 152, 152))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jButton1)
                .addContainerGap(353, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        EjecutarScript ejecutarScript = new EjecutarScript();

        ObtenerMemoria memoria = new ObtenerMemoria();

        ejecutarScript.run();
        memoria.run();
        //repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

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
//**************************************************************************************************************************
////Grafica con String--------------------------------------------------------------------------------------------------------
//        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
//        dataset.addValue(15,"g", "20");
//        dataset.addValue(15,"g", "15");
//        dataset.addValue(30, "g","20");
//        dataset.addValue(60, "g","40");
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
//        
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
//**************************************************************************************************************************

//--------------------------------------------------------------------------------------------------------
//        EjecutarScript ejecutarScript = new EjecutarScript();
//        ejecutarScript.run();
//        ObtenerMemoria memoria = new ObtenerMemoria();
//        memoria.run();
//        ObtenerMemoria2 memoria2 = new ObtenerMemoria2();
//        memoria2.leer();
//        Pintar pintar = new Pintar();
//        pintar.run();
        // panel2.setBackground(Color.BLUE);
    }

    public void paint(Graphics g) {
        super.paint(g);
        
        repaint();
        Pintar pintar = new Pintar();
        //pintar.dibujarLinea();
        int[][] v = pintar.retornaVector();
        //repaint();
        for (int i = 9; i >= 1; i--) {
            g.drawLine(v[i][2], v[i][1], v[i - 1][2], v[i - 1][1]);
            g.drawRect(v[i][2], v[i][1], 5, 5);
        }


    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
