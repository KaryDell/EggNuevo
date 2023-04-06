//1. Crear un programa que dado un número determine si es par o impar.
package Encuentro4_5y6Practica;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int num = leer.nextInt();
        if (num % 2 == 0) {
            System.out.println("El numero igresado es par");
         }else{
        System.out.println("El numero ingresado es impar");

        }

    }

}
