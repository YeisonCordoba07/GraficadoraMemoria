/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficadoraconlibreria;

import java.io.IOException;
import java.util.TimerTask;
import java.util.Timer;

/**
 *
 * @author YEISON
 */
public class EjecutarScript extends Thread {

    @Override
    public void run() {
        try {
            timer.scheduleAtFixedRate(tarea, 0, 4000);

        } catch (Exception e) {
            System.out.println("Error gg: " + e);
        }
    }

    Timer timer = new Timer();
    TimerTask tarea = new TimerTask() {

        //Proceso que se va a ejecutar cada cierto tiempo
        @Override
        public void run() {
            try {
                //Ejecuta el script que guarda la memoria Ram en un txt
                ProcessBuilder p = new ProcessBuilder();
                String link = "C:\\Users\\nanop\\Downloads\\MemoriaRam.ps1";
                p.command("cmd.exe", "/c", link);
                p.start();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    };

}
