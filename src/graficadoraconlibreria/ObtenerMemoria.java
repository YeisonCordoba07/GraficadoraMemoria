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
public class ObtenerMemoria {

    static int memoriaRamUtilizada;
    Pintar pintar = new Pintar();
    static int memoriaRamTotal;



    public void leerMemoria(String nombreMemoria) {
        String memorialString = "";
        boolean esMemoriaTotal = false;
        try {
            //Verifica cual memoria hay que sacar, si la Total o la Utilizada
            if (nombreMemoria.equalsIgnoreCase("MemoriaRamTotal")) {
                esMemoriaTotal = true;
            } else if (nombreMemoria.equalsIgnoreCase("MemoriaUtilizada")) {
                esMemoriaTotal = false;
            } else {
                System.out.println("Error en el parametro entrante al intentar asignar a la general");
            }

            FileReader archivo = null;
            if (esMemoriaTotal) {
                archivo = new FileReader("C:\\Users\\nanop\\Downloads\\MemoriaTotal.txt");
            } else {
                archivo = new FileReader("C:\\Users\\nanop\\Downloads\\MemoriaLibre.txt");
            }

            //o salto de linea en el archivo
            int memoria = archivo.read();

            while (memoria != -1) {
                memoria = archivo.read();

                //Al convertirlo a char lo estamos convirtiendo en codigo ASII
                char memoriaChar = (char) memoria;

                //Lo agrega al string
                memorialString += memoriaChar;
            }
            System.out.println("Memoria Completa Inicio:\n" + memorialString + "Memoria Completa Final");
            System.out.println("");

            //Guarda la el valor de la memoria libre en 'memoriaLibreCortada', para ello saca ese valor como una subcadena
            //Aquí hay que poner la posicion exacta de donde estará la memoria
//            String memoriaLibreCortada = memoriaLibreString.substring(149, 158);
//            String memoriaCortada = memorialString.substring(149, 158);
//            String memoriaLibreCortada = memoriaLibreString.substring(201, 210);
//            String memoriaCortada = memorialString.substring(201, 210);  
            String memoriaCortada = "";

            try {
                if (esMemoriaTotal) {

                } else {

                }
                memoriaCortada = memorialString.substring(199, 208);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Error al cortar: " + e);
            }
            memoriaCortada = memoriaCortada.trim();
            System.out.println("INICIO MEMORIA CORTE:" + memoriaCortada + ":FIN CORTE");
            System.out.println("");

            //Le quita los espacios vacios a memoriaLibreCortada y memoriaCortada --> 3_._0_9_2   8_._0_0_2  7_0_9

            String a = "";
            for (int i = 0; i < memoriaCortada.length(); i++) {

                if (i % 2 == 0) {
                    char c = memoriaCortada.charAt(i);
                    a += Character.toString(c);
                    a = a.replace("M", "");
                    a = a.replace("B", "");
                    a = a.replace(" ", "");
                    System.out.println("I =" + i + "== A=" + a);
                }
            }

            //El punto significa mil, pero en java este significa que es un decimal, entonces hay que quitarlo
            memoriaCortada = a.replace(".", "");

            System.out.println("Memoria cortada sin el punto:" + memoriaCortada);

            //Esto quita los espacios que hayan al principio o al final
            memoriaCortada.trim();

            System.out.println("El tamaño de la " + nombreMemoria + "cortada es: " + memoriaCortada.length());


            /*AQUÍ HAY UN ERROR DE JAVA, NO CONVIERTE CORRECTAMENTE APESAR DE QUE ESTÁ BIEN*/
            //Convierte el valor de la subcadena que tiene la memoria libre a int
            int enteroMemoria = 0;
            try {
                enteroMemoria = Integer.parseInt(memoriaCortada);
            } catch (NumberFormatException e) {
                System.out.println("Error al convertir: " + e);
            }

            archivo.close();
            //Toma la memoria total del sistema y le resta la memoria libre, para obtener la memoria utilizada
            if (esMemoriaTotal) {
                this.memoriaRamTotal = enteroMemoria;
                System.out.println("La" + nombreMemoria + ": " + enteroMemoria + " MB");
            } else {
                if (memoriaRamTotal == 0) {
                    leerMemoria("MemoriaRamTotal");
                }
                if (enteroMemoria <= 0) {
                    pintar.agregarAVector(0);
                    System.out.println("La" + nombreMemoria + ": " + 0 + " MB");
                } else {
                    this.memoriaRamUtilizada = this.memoriaRamTotal - enteroMemoria;
                    System.out.println("La" + nombreMemoria + ": " + this.memoriaRamUtilizada + " MB");
                    pintar.agregarAVector(this.memoriaRamUtilizada);
                }

            }

            //Cuando el programa falla, la grafica cae hasta 0, se puede evitar
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("Error al leer: "+e);
        }
    }

    public int getMemoriaRamTotal() {
        return memoriaRamTotal;
    }
}
