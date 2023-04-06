/*4. Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
Substring y equals() de Java.*/

package Encuentro4_5y6Practica;

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
        Scanner palabra = new Scanner(System.in);
        System.out.println("Ingrese una palabra, por favor.");
        String palab = palabra.nextLine();
        //System.out.println(palab.substring(0, 1));
        //String letra = new String("A");
        if (palab.substring(0, 1).equalsIgnoreCase("A")) {
            System.out.println("Su palabra comienza con A, es correcto.");
        } else {
            System.out.println("Su palabra no commienza con A, es incorrecto.");
        }
    }
}