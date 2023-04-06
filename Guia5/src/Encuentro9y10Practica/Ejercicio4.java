/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios 
y muestre la traspuesta de la matriz. 
La matriz traspuesta de una matriz A se denota por B 
y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package Encuentro9y10Practica;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        Scanner leer = new Scanner(System.in);
        int[][] matriz_original = new int[4][4];
        int[][] matriz_traspuesta = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz_original[i][j] = random.nextInt(20)-10;

                System.out.print("["+matriz_original[i][j] + "]");

            }
            System.out.println("");
        }    
        System.out.println("La matriz traspuesta sería: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz_traspuesta[i][j]=matriz_original[j][i];
                System.out.print("["+matriz_traspuesta[i][j]+"]");
            }
           System.out.println(""); 
        }
    }

}
