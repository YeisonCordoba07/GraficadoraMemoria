/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficadoraconlibreria;

import static graficadoraconlibreria.Graficadora.panel;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author nanop
 */
public class ClasePanel extends JPanel {

    Pintar pintar = new Pintar();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //Dibuja las lineas grices que definen el tablero o el plano
        for (int i = 0; i < 10; i++) {
            g.setColor(Color.gray);
//            g.drawLine(500 - (i * 50), 0, 500 - (i * 50), 500);
//            g.drawLine(0, i * 50, 500, i * 50);
        }
        g.drawLine(0, 500, 500, 500);
//        g = panel.getGraphics();

        //pintarTablero(g);
        int[][] v = pintar.retornaVector();

        //Pinta la ram del sistema
        g.setColor(Color.red);
        for (int i = 9; i >= 1; i--) {
            g.drawLine(v[i][2], v[i][1], v[i - 1][2], v[i - 1][1]);
            g.drawRect(v[i][2], v[i][1], 5, 5);

        }
        repaint();
    }

}