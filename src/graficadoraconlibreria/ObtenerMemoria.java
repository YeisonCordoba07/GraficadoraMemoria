/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficadoraconlibreria;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author YEISON
 */
public class ObtenerMemoria{

//    @Override
//    public void run() {
//        try {
//            timer.scheduleAtFixedRate(tarea, 2000, 4000);
//        } catch (Exception e) {
//            System.out.println("Error gg: " + e);
//        }
//    }
//
//    Timer timer = new Timer();
//    TimerTask tarea = new TimerTask() {
//
//        //Proceso que se va a ejecutar cada cierto tiempo
//        @Override
//        public void run() {
//            leer();
//        }
//
//    };
    //--------------------------------------------------------------------------------------------------------------------
    public void leer() {
        int memoriaRamUtilizada;
        Pintar pintar = new Pintar();
        
        String memoriaLibreString = "";
        String memoriaTotalString = "";

        try {

            FileReader archivo = new FileReader("C:\\Users\\nanop\\Downloads\\MemoriaLibre.txt");
            FileReader archivo2 = new FileReader("C:\\Users\\nanop\\Downloads\\MemoriaTotal.txt");

            //Se pone int porque este lo lee y lo pasa directamente como lo entiende la maquina en 1 y 0
            //Para solucionar el problema de que el primer caracter no lo lee, podemos inicializar memoria a 0 
            //o salto de linea en el archivo
            int memoria = archivo.read();
            int memoriaTotal = archivo2.read();

            while (memoria != -1) {
                memoria = archivo.read();

                //Al convertirlo a char lo estamos convirtiendo en codigo ASII
                char memoriaChar = (char) memoria;

                //Lo agrega al string
                memoriaLibreString += memoriaChar;
            }
            while (memoriaTotal != -1) {
                memoriaTotal = archivo2.read();

                //Al convertirlo a char lo estamos convirtiendo en codigo ASII
                char memoriaChar = (char) memoriaTotal;

                //Lo agrega al string
                memoriaTotalString += memoriaChar;
            }

            System.out.println("Memoria Libre Completa Inicio:\n" + memoriaLibreString + ":Memoria Libre Completa Final");
            System.out.println("");
            System.out.println("Memoria total Completa Inicio:\n" + memoriaTotalString + "Memoria total Completa Final");
            System.out.println("");

            //Guarda la el valor de la memoria libre en 'memoriaLibreCortada', para ello saca ese valor como una subcadena
            //Aquí hay que poner la posicion exacta de donde estará la memoria
//            String memoriaLibreCortada = memoriaLibreString.substring(149, 158);
//            String memoriaTotalCortada = memoriaTotalString.substring(149, 158);
//            String memoriaLibreCortada = memoriaLibreString.substring(201, 210);
//            String memoriaTotalCortada = memoriaTotalString.substring(201, 210);  
            String memoriaLibreCortada = "";
            String memoriaTotalCortada = "";

            try {
                memoriaLibreCortada = memoriaLibreString.substring(199, 208);
                memoriaTotalCortada = memoriaTotalString.substring(199, 208);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Error al cortar: " + e);
            }

            System.out.println("INICIO MEMORIA LIBRE CORTE:" + memoriaLibreCortada + ":FIN CORTE");
            System.out.println("");
            System.out.println("INICIO MEMORIA TOTAL CORTE:" + memoriaTotalCortada + ":FIN TOTAL CORTE");
            System.out.println("");

            //Le quita los espacios vacios a memoriaLibreCortada y memoriaTotalCortada --> 3_._0_9_2   8_._0_0_2  7_0_9
            String a = "";
            for (int i = 0; i < memoriaLibreCortada.length(); i++) {

                if (i % 2 == 0) {
                    char c = memoriaLibreCortada.charAt(i);
                    a += Character.toString(c);
                    a = a.replace("M", "");
                    a = a.replace("B", "");
                    a = a.replace(" ", "");
                    System.out.println("I =" + i + "== A=" + a);
                }
            }
            String b = "";
            for (int i = 0; i < memoriaTotalCortada.length(); i++) {

                if (i % 2 == 0) {
                    char c = memoriaTotalCortada.charAt(i);
                    b += Character.toString(c);
                    System.out.println("I =" + i + "== B=" + b);
                }
            }

            //El punto significa mil, pero en java este significa que es un decimal, entonces hay que quitarlo
            memoriaLibreCortada = a.replace(".", "");
            memoriaTotalCortada = b.replace(".", "");
            System.out.println("Memoria libre cortada sin el punto:" + memoriaLibreCortada);
            System.out.println("Memoria total cortada sin el punto:" + memoriaTotalCortada);

            //Esto quita los espacios que hayan al principio o al final
            memoriaLibreCortada.trim();
            memoriaTotalCortada.trim();

            System.out.println("El tamaño de memoria libre cortada es: " + memoriaLibreCortada.length());
            System.out.println("El tamaño de memoria total cortada es: " + memoriaTotalCortada.length());


            /*AQUÍ HAY UN ERROR DE JAVA, NO CONVIERTE CORRECTAMENTE APESAR DE QUE ESTÁ BIEN*/
            //Convierte el valor de la subcadena que tiene la memoria libre a int
            int memoriaRamLibre = 0;
            int memoriaRamTotal = 0;
            try {
                memoriaRamLibre = Integer.parseInt(memoriaLibreCortada);
                memoriaRamTotal = Integer.parseInt(memoriaTotalCortada);
            } catch (NumberFormatException e) {
                System.out.println("Error al convertir: " + e);
            }

            System.out.println("La memoria libre es: " + memoriaRamLibre);
            System.out.println("La memoria total es: " + memoriaRamTotal);

            //Toma la memoria total del sistema y le resta la memoria libre, para obtener la memoria utilizada
            memoriaRamUtilizada = memoriaRamTotal - memoriaRamLibre;
            System.out.println("La memoria utilizada es: " + memoriaRamUtilizada + " MB");
            archivo.close();

            //Cuando el programa falla, la grafica cae hasta 0, se puede evitar
            pintar.run(memoriaRamUtilizada);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("Error gg");
        }

    }//Fin leer

}
