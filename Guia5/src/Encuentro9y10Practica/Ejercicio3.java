/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package Encuentro9y10Practica;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Ingrese el tamaño del vector");
        int tamanio = leer.nextInt();
        int contador1 = 0, contador2 = 0, contador3 = 0, contador4 = 0, contador5 = 0;
        int[] numeros = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            numeros[i] = rand.nextInt(10000);
            System.out.print("|" + numeros[i]);

        }
        System.out.println("|");
        System.out.print("\n");
        for (int i = 0; i < tamanio; i++) {
            if (numeros[i] >= 0 && numeros[i] < 10) {
                contador1++;
                //System.out.println("entre 0 y 10 " + contador1);
            }
            if (numeros[i] >= 10 && numeros[i] < 100) {

                contador2++;
                // System.out.println("entre 10 y 100 "+contador2);
            }
            if (numeros[i] >= 100 && numeros[i] < 1000) {

                contador3++;
                //System.out.println("entre 100 y 1000 "+contador3);
            }
            if (numeros[i] >= 1000 && numeros[i] < 10000) {

                contador4++;
                //System.out.println("entre 1000 y 10000 "+contador4);
            }
            if (numeros[i] >= 10000 && numeros[i] < 100000) {

                contador5++;
                //System.out.println("entre 10000 y 100000 "+contador5);
            }

        }
        System.out.println("Hay " + contador1 + " números de un dígito en el vector");
        System.out.println("Hay " + contador2 + " números de dos dígitos en el vector");
        System.out.println("Hay " + contador3 + " números de tres dígitos en el vector");
        System.out.println("Hay " + contador4 + " números de cuatro dígitos en el vector");
        System.out.println("Hay " + contador5 + " números de cinco dígitos en el vector");
    }
}
