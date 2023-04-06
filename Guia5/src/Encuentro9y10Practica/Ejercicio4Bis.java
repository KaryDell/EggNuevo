/*

 */
package Encuentro9y10Practica;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio4Bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();

        int i, j, num;
        double d;
        int[][] vector = new int[4][4];
        int[][] vectorAux = new int[4][4];
        d = (int) (Math.random() * 10);
        System.out.println(d);
 
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                vector[i][j] = random.nextInt(9)-8;
            }
        }

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                vectorAux[j][i] = vector[i][j];
            }
        }

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(vectorAux[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("----------");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(vector[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
