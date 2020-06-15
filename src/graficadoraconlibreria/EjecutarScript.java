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
 * Esta clase es la que se encarga de ejecutar el script cada cierto tiempo
 *
 * @author YEISON
 */
public class EjecutarScript {

    /**
     * Este método se es el que se llama para que empiece a ejecutarse el timer.
     */
    public void ejecutarTimer() 
    {
        timer.scheduleAtFixedRate(tarea, 1000, 7000);
    }

    Timer timer = new Timer();
    TimerTask tarea = new TimerTask() {
        /**
         * Este metodo tiene una variable String que se llama link, esta variable tiene la 
         * direccion en el equipo donde está el script que se ejecutará.
         * El script guarda en un archivo de texto toda la información que da el comando
         * systeminfo. Luego va al txt y guarda toda la linea donde está la memoria libre
         * del sistema en otro txt, y hace los mismo con la memoria ram total.
         * Despues crea un objeto de la clase ObtenerMemoria que va a los txt con
         * la memoria libre y la memoria ram total y los pasa a este programa.
         */
        @Override
        public void run()
        {
            try {
                ProcessBuilder p = new ProcessBuilder();
                String link = "C:\\Users\\nanop\\Downloads\\MemoriaRam.ps1";
                p.command("cmd.exe", "/c", link);
                p.start();
                
                ObtenerMemoria obtenerMemoria = new ObtenerMemoria();
                obtenerMemoria.leerMemoria("MemoriaUtilizada");

            } catch (IOException e) {
            }
        }
    };

}
