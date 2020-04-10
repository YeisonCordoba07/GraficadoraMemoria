/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficadoraconlibreria;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultKeyedValuesDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author YEISON
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Hola55", 20);
        dataset.setValue("Segundo", 20);
        dataset.setValue("Tercero", 40);
        dataset.setValue("Cuarto", 10);

        
        JFreeChart chart = ChartFactory.createPieChart("Titulo", dataset, true, true, false);
        ChartPanel panel = new ChartPanel(chart);
    }
    
}
