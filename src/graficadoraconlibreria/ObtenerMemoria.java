/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficadoraconlibreria;

import java.io.FileReader;
import java.io.IOException;

/**
 *Esta clase se encarga de pasar los txt al programa para sacarles el valor
 * de la memoria ram libre o la memoria ram total, luego con estos saca la memoria 
 * ram utilizada y la pasa a la clase Pintar para que la agrege al vector
 * @author YEISON
 */
public class ObtenerMemoria {

    static int memoriaRamUtilizada;
    Pintar pintar = new Pintar();
    static int memoriaRamTotal;


/**
 * Este método va a donde está el txt con la informacion y lo guarda en memoriaString,
 * luego lo recorta con substring() para que solo quede el numero que se está buscando,
 * y se guarda en memoriaCortada.
 * Luego le quita los espacios que hay entre los numeros y lo guarda en memoriaSinEspacios,
 * se le quita el punto para que java no lo interprete como decimal, también le quita los 
 * espacios que puedan tener al principio o al final y lo convierte a numero.
 * Por ultimo hace unas operaciones para hallar la memoria utilizada y pasarsela
 * a la clase Pintar para que la agregue al vector.
 *
 * @param nombreMemoria define si se va a sacar la memoria ram libre o la total
 */
    public void leerMemoria(String nombreMemoria) 
    {
        String memoriaString = "";
        boolean esMemoriaTotal = false;
        try {
            /*Verifica cual memoria hay que sacar, si la Total o la Utilizada*/
            if (nombreMemoria.equalsIgnoreCase("MemoriaRamTotal")) 
            {
                esMemoriaTotal = true;
            } else if (nombreMemoria.equalsIgnoreCase("MemoriaUtilizada")) {
                esMemoriaTotal = false;
            } else {
                System.out.println("Error en el parametro entrante al intentar asignar a la general");
            }

            /*Guarda la direccion de donde está el archivo de texto con la informacion*/
            FileReader archivo = null;
            if (esMemoriaTotal) 
            {
                archivo = new FileReader("C:\\Users\\nanop\\Downloads\\MemoriaTotal.txt");
            } else {
                archivo = new FileReader("C:\\Users\\nanop\\Downloads\\MemoriaLibre.txt");
            }

            int memoria = archivo.read();
            while (memoria != -1) 
            {
                memoria = archivo.read();
                //Al convertirlo memoriaSinEspacios char lo estamos convirtiendo en codigo ASII
                char memoriaChar = (char) memoria;
                //Lo agrega al string
                memoriaString += memoriaChar;
            }

            String memoriaCortada = "";

            try {
                /*La condicion es en caso de que la memoria ram total y la libre 
                necesiten contarse de manera diferente*/
                if (esMemoriaTotal) 
                {

                } else {

                }
                /*memoriaString tiene toda la linea con la informacion,
                en memoriaCortada solo se guarda el numero y se desecha lo otro*/
                memoriaCortada = memoriaString.substring(199, 208);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Error al cortar: " + e);
            }
            /*Elimina los espacios que tenga al principio o al final*/
            memoriaCortada = memoriaCortada.trim();

            /*Le quita los espacios vacios memoriaSinEspacios memoriaCortada
            --> 3_._0_9_2   8_._0_0_2   7_0_9*/
            String memoriaSinEspacios = "";
            for (int i = 0; i < memoriaCortada.length(); i++)
            {
                if (i % 2 == 0) 
                {
                    char c = memoriaCortada.charAt(i);
                    memoriaSinEspacios += Character.toString(c);
                    memoriaSinEspacios = memoriaSinEspacios.replace("M", "");
                    memoriaSinEspacios = memoriaSinEspacios.replace("B", "");
                    memoriaSinEspacios = memoriaSinEspacios.replace(" ", "");
                }
            }

            
            /*Para java el punto en un numero significa que es un decimal, pero en este caso ese punto
            significa mil*/
            memoriaCortada = memoriaSinEspacios.replace(".", "");
            memoriaCortada.trim();
            
            int enteroMemoria = 0;
            try {
                enteroMemoria = Integer.parseInt(memoriaCortada);
            } catch (NumberFormatException e) {
                System.out.println("Error al convertir: " + e);
            }

            archivo.close();
            
            
            /*Toma la memoria total del sistema y le resta la memoria libre, 
            para obtener la memoria utilizada*/
            /*Si la memoria que se estaba sacando era la total, entonces le asigna ese valor a 
            memoriaRamTotal. 
            Si la memoria que se sacaba era la libre, verifica que la total
            no sea cero, si sí lo es, vuelve a ejecutar este metodo para hallar 
            la total.
            Cuando tenga la memoria total y la libre, preguta si la memoria que sacó
            es igual o menor que cero, si lo es, entonces le pasa el valor de 
            como 0. Si el valor que se sacó no es cero, entonces a la memoria ram
            total le resta la libre (que fue la que sacó este metodo) para 
            obtener la memoria ram utilizada*/
            if (esMemoriaTotal)
            {
                this.memoriaRamTotal = enteroMemoria;
            } else {
                if (memoriaRamTotal == 0) 
                {
                    leerMemoria("MemoriaRamTotal");
                }
                if (enteroMemoria <= 0) 
                {
                    pintar.agregarAVector(0);
                } else {
                    this.memoriaRamUtilizada = this.memoriaRamTotal - enteroMemoria;
                    System.out.println("La" + nombreMemoria + ": " + this.memoriaRamUtilizada + " MB");
                    pintar.agregarAVector(this.memoriaRamUtilizada);
                }
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("Error al leer: "+e);
        }
    }

    public int getMemoriaRamTotal() {
        return memoriaRamTotal;
    }
}
