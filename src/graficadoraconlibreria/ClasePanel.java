/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficadoraconlibreria;

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
    public void paint(Graphics g) {
        super.paint(g);
        //Dibuja las lineas grices que definen el tablero o el plano
//        for (int i = 0; i < 10; i++) {
//            g.setColor(Color.gray);
//            g.drawLine(500 - (i * 50), 0, 500 - (i * 50), 400);
//            g.drawLine(0, i * 50, 500, i * 50);
//        }

        //Lineas pequeñas en el eje X
        for (int i = 0; i < 10; i++) {
            g.setColor(Color.gray);
            //El +50 es para que empiece desde la coordenada 50 en X
//            g.drawLine(i * 50+50, 400, i * 50+50, 395);
//            g.drawLine(i * 50+50, 400, i * 50+50, 405);
            g.drawLine(i * 50 + 50, 500, i * 50 + 50, 495);
            g.drawLine(i * 50 + 50, 500, i * 50 + 50, 505);
            //g.drawString((36 - (i * 4)) + "", i * 49+50, 420);
        }
        //Lineas de X y Y
        g.drawLine(50, 500, 500, 500);
        g.drawLine(500, 500, 500, 0);

        //pintarTablero(g);
        int[][] v = pintar.retornaVector();

        //Pinta la ram del sistema
        g.setColor(Color.red);
        for (int i = 9; i >= 1; i--) {
            g.drawLine(v[i][2], v[i][1], v[i - 1][2], v[i - 1][1]);
            //Restar 2 en las X para que quede centrado
            g.fillRect(v[i][2], v[i][1], 5, 5);
        }
        //Hace que la grafica se actulice
        repaint();
    }

}
