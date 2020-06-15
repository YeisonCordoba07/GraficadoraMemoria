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

    static boolean cuadricula = false;

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        //Dibuja las lineas grices que definen el tablero o el plano
        if (cuadricula) 
        {
            g.setColor(Color.gray);
            g.fillRect(50, 0+50, 455, 405);
            g.setColor(Color.lightGray);
            for (int i = 0; i < 10; i++) 
            {
                g.drawLine((i * 50) + 50, 0+50, (i * 50) + 50, 400+50);//Dibuja las lineas verticales
                if(i != 9)
                {
                     g.drawLine(50, i * 50+50, 500, i * 50+50);//Dibuja lineas horizontales
                     //Para dibujar mas lineas horizontales descomentar lo siguiente
                     //g.drawLine(50, i * 50+75, 500, i * 50+75);
                }    
            }
        } else {
            //g.setColor(Color.black);
            g.fillRect(50, 0+50, 455, 405);
            //Descomentar lo que sigue para que la grafica negra tenga cuadriculas
//            g.setColor(Color.gray);
//            for (int i = 0; i < 10; i++) 
//            {
//                g.drawLine((i * 50) + 50, 0+50, (i * 50) + 50, 400+50);//Dibuja las lineas verticales
//                g.drawLine(50, i * 50, 500, i * 50);//Dibuja lineas horizontales
//            }
        }

        //Dibuja las Lineas pequeñas en el eje X
        for (int i = 0; i < 10; i++) {
            g.setColor(Color.lightGray);
            //El +50 es para que empiece desde la coordenada 50 en X
            g.drawLine(i * 50 + 50, 400+50, i * 50 + 50, 395+50);
            g.drawLine(i * 50 + 50, 400+50, i * 50 + 50, 405+50);

            //Esto dibuja los numeros en el eje X que indican el tiempo
            g.setColor(Color.darkGray);
            g.drawString((63 - (i * 7)) + "", i * 49 + 50, 420+50);
            
            //Esto dibuja los numeros en el eje Y que indican la Memoria Ram
            if(i == 0)
            {
                g.drawString((ObtenerMemoria.memoriaRamTotal*((i)/10.0))+ "", 510, 450-(i*40));
            }
            //Dibuja el 0
            g.drawString((ObtenerMemoria.memoriaRamTotal*((i+1)/10.0))+ "", 510, 420-(i*40));
        }
        
        //Dibuja las Lineas de X y Y
        g.setColor(Color.white);
        g.drawLine(50, 400+50, 500, 400+50);
        g.drawLine(500, 400+50, 500, 0+50);

        
        int[][] v = pintar.retornaVector();

        //Pinta la ram del sistema
        g.setColor(Color.red);
        for (int i = 9; i >= 1; i--) 
        {
            g.drawLine(v[i][2], v[i][1], v[i - 1][2], v[i - 1][1]);
            g.drawLine(v[i][2] + 1, v[i][1] + 1, v[i - 1][2] + 1, v[i - 1][1] + 1);
            
            //Descomentar lo siguiente para que aparezcan los puntos
            //g.fillRect(v[i][2] - 2, v[i][1] - 2, 6, 6);
        }
        //Hace que la grafica se actulice
        repaint();
    }

}
