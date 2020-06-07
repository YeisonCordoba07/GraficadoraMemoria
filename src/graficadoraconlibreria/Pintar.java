/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficadoraconlibreria;

/**
 *Esta clase se encarga de guardar en un vector los valores de la memoria utilizada
 * con sus respectivas coordenadas para graficar
 * @author YEISON
 */
public class Pintar {

    int valorEnX = 500;
    static int[][] v = new int[10][3];

//-----------------------------------------------------------------------------------------------
    /**
     * El vector tiene tres columnas, la primera guarda el parametro, que es la
     * memoria utilizada; la segunda guarda las coordenadas en Y que se van a graficar;
     * y la tercera, las coordenadas en X que se van a graficar.
     * La columna con los valores de X empieza llena, y los valores son fijos.
     * Los valores en Y se calculan haciendole unas operaciones al parametro.
     * X y Y son la ubicacion que va a tener el punto en la pantalla.
     * Antes de agregar el parametro al vector, mueve todos los valores para 
     * abrirle espacio, para esto llama al método moverValores.
     * 
     * @param valorMemoriaRam este parametro es la memoria ram utilizada
     */
    public void agregarAVector(int valorMemoriaRam) 
    {
        moverValores();
        v[0][0] = valorMemoriaRam;
        v[0][1] = (400 - (valorMemoriaRam / 10)) + 50;//Valor de Y, 500 y 50 dependen de los pixeles
        mostrarVector();
    }

//------------------------------------------------------------------------------
    /**
     * Este método mueve todos los valores del vector, quitando el mas viejo, o
     * el que esté en la fila 9.
     * 
     */
    private void moverValores() 
    {
        for (int i = 9; i > 0; i--) 
        {
            for (int j = 1; j >= 0; j--) 
            {
                v[i][j] = v[i - 1][j];
            }
        }
    }
    
    
    
//------------------------------------------------------------------------------
    /**
     * Este método llena la tercera columna con los valores de X. Estos valores
     * serán simpre los mismos durante la ejecucion del programa.
     */
    public void asignaValoresX()
    {
        for (int i = 0; i <= 9; i++) 
        {
            v[i][2] = valorEnX - (i * 50);
        }
    }

    
//------------------------------------------------------------------------------
    /**
     * Los valores de la segunda columna empiezan en 0.
     * Pero si se grafican las primera lineas qudarian en lo mas alto.
     * Así que, para que los primeros valores estén en lo mas bajo de la grafica,
     * se inician en 450 porque esa es la coordenada en y donde está la linea.
     */
    public void asignaValoresY()
    {
        for (int i = 0; i <= 9; i++) 
        {
            v[i][1] = 450;
        }
    }
    
    
    
//------------------------------------------------------------------------------
    /**
     * Imprime el vector.
     */
    private void mostrarVector()
    {
        for (int j = 2; j >= 0; j--) 
        {
            for (int i = 9; i >= 0; i--) 
            {
                System.out.print(v[i][j] + "\t ");
            }
            System.out.println("");
        }
        System.out.println("------------------------------------------------------------------------------");
    }

    
    
//------------------------------------------------------------------------------
    public int[][] retornaVector()
    {
        return v;
    }
    
    
//------------------------------------------------------------------------------
}
