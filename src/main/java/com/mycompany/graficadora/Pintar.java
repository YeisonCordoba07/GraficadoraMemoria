/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.graficadora;

import java.io.IOException;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author YEISON
 */
public class Pintar extends Thread {

    @Override
    public void run() {
        try {
            asignaValoresX();
            timer.scheduleAtFixedRate(tarea, 1000, 1000);

        } catch (Exception e) {
            System.out.println("Error gg: " + e);
        }
    }

    int valor;
    int[][] v = new int[10][3];
    Random random = new Random();

    Timer timer = new Timer();
    TimerTask tarea = new TimerTask() {

        //Proceso que se va a ejecutar cada cierto tiempo
        @Override
        public void run() {
            valor = random.nextInt(11);
            System.out.println("Valor: " + valor);
            moverValores();
            v[0][0] = valor;
            v[0][1] = 500 - (valor * 50);//Valor de Y, 500 y 50 dependen de los pixeles
            v[0][2] = 1100; //Valor de X
            mostrarVector();
        }

    };

    private void moverValores() {
        for(int i = 9; i > 0; i--){
            for(int j = 1; j >= 0; j--){
                v[i][j] = v[i - 1][j];
            }
        }
    }
    
    private void asignaValoresX(){
        for(int i = 0; i <= 9; i++){
            v[i][2] = 1100 - (i*100);
        }
    }
    
    private void mostrarVector(){
        for(int j = 2; j >= 0; j--){
            for(int i = 9; i >= 0; i--){
                System.out.print(v[i][j] + "\t ");
            }
            System.out.println("");
        }
        System.out.println("//---------------------------------------------------------------------------------------");
    }

}
