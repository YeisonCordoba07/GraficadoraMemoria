/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficadoraconlibreria;

import static graficadoraconlibreria.NewMain.panel2;
import static graficadoraconlibreria.NewMain.ventana2;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Locale;
import java.util.TimerTask;
import java.util.Timer;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
    public JLabel[] labeles = new JLabel[10];

    public Graficadora() {

        initComponents();

        panel.setVisible(true);
        panel.setSize(525, 400);
        panel.setBounds(100, 0, 525, 400);
        this.getContentPane().setBackground(Color.yellow);
        panel.setBackground(Color.darkGray);
        this.setSize(1500, 1000);
        this.add(panel);

        //Labels que mostrarán los segundos en la parte de abajo de la grafica
        labeles[0] = jLabel1;
        labeles[1] = jLabel2;
        labeles[2] = jLabel3;
        labeles[3] = jLabel4;
        labeles[4] = jLabel5;
        labeles[5] = jLabel6;
        labeles[6] = jLabel7;
        labeles[7] = jLabel8;
        labeles[8] = jLabel9;
        labeles[9] = jLabel10;

        //Les da la posicion y el texto a los Labels
        for (int i = 0; i < 10; i++) {

            labeles[i].setVisible(true);
            labeles[i].setText("" + i * 4);
            //labeles[i].setBounds(500-(i*50), 500, WIDTH, HEIGHT);
            labeles[i].setLocation(595 - (i * 50), 400);
            this.getContentPane().add(labeles[i]);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jButton1.setText("Graficar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        jLabel8.setText("jLabel8");

        jLabel9.setText("jLabel9");

        jLabel10.setText("jLabel10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(586, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3))
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(56, 56, 56))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel10)))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        EjecutarScript ejecutarScript = new EjecutarScript();



        ejecutarScript.run();

        //repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
        //Mover mouse
        //repaint();
    }//GEN-LAST:event_formMouseMoved

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
    Pintar pintar = new Pintar();

    public void paint(Graphics g) {
        super.paint(g);
        g = panel.getGraphics();

        pintarTablero(g);
        int[][] v = pintar.retornaVector();

        //Pinta la ram del sistema
        g.setColor(Color.red);
        for (int i = 9; i >= 1; i--) {
            g.drawLine(v[i][2], v[i][1], v[i - 1][2], v[i - 1][1]);
            g.drawRect(v[i][2], v[i][1], 5, 5);
        }

        repaint();

    }

    public void pintarTablero(Graphics g) {
        //Dibuja las lineas grices que definen el tablero o el plano
        for (int i = 0; i < 10; i++) {
            g.setColor(Color.gray);
            g.drawRect(500 - (i * 50), 0, 500 - (i * 50), 500);
            g.drawLine(0, i * 50, 500, i * 50);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
