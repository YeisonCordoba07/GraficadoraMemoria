/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.graficadora;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author YEISON
 */
public class ObtenerMemoria2 {

    public void leer() {

        String texto = "";
        String textoMemoria = "";
        String textoMemoriaTotal = "";
        try {

            //Ubicacion archivo
            FileReader direccion = new FileReader("C:\\Users\\YEISON\\Downloads\\MemoriaLibre.txt");
            FileReader direccion2 = new FileReader("C:\\Users\\YEISON\\Downloads\\MemoriaTotal.txt");

            //Le decimos a buffer que lea lo que está en esa direccion y lo guarde en entradaBuffer 1 y 2 
            BufferedReader entradaBuffer = new BufferedReader(direccion);
            BufferedReader entradaBuffer2 = new BufferedReader(direccion2);

            do {

                //Readline lee de linea en linea
                textoMemoria += texto;
                textoMemoria += "\n";
                texto = entradaBuffer.readLine();

            } while (texto != null);

            do {

                //Readline lee de linea en linea
                textoMemoriaTotal += texto;
                textoMemoriaTotal += "\n";
                texto = entradaBuffer2.readLine();

            } while (texto != null);

            System.out.println("MEMORIA LIBRE INICIO:"+textoMemoria+":MEMORIA LIBRE FINAL");
            System.out.println("MEMORIA TOTAL INICIO:"+textoMemoriaTotal+":MEMORIA TOTAL FINAL");

            //Guarda el valor de la memoria libre y total como una subcadena y la guarda en 'memoriaRamString' y 'memoriaRamTotalString'
            String memoriaRamString = textoMemoria.substring(150, 160);
            String memoriaRamTotalString = textoMemoriaTotal.substring(154, 164);
            
            System.out.println("Memoria Ram String:"+memoriaRamString+":Memoria Ram String");
            System.out.println("Memoria Ram Total String:"+memoriaRamTotalString+":Memoria Ram Total String");

            //Quita el punto para que java no lo interprete como un decimal
            memoriaRamString = memoriaRamString.replace(".", "");
            memoriaRamTotalString = memoriaRamTotalString.replace(".", "");
            
            System.out.println("Memoria Cortada:"+memoriaRamString+":Memoria Cortada");
            System.out.println("Memoria total cortada:"+memoriaRamTotalString+":Memoria Total Cortada");

            //Resta la memoria libre y la memoria total del sistema para saber cuanto es la memoria utilizada
            //Pero antes debe convertirlas a int
            
            int memoriaRamUtilizada = Integer.parseInt(memoriaRamTotalString) - Integer.parseInt(memoriaRamString);

            System.out.println(memoriaRamString);
            System.out.println(memoriaRamTotalString);
            System.out.println("La memoria utilizada es: " + memoriaRamUtilizada + " MB");

        } catch (IOException e) {
            System.err.print("Error gg");
        }

    }
}
