/*
3. Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package Encuentro2y3;

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
       System.out.println("Ingrese una frase");
       
       String frase = leer.nextLine();
       System.out.println("Mayuscula: " + frase.toUpperCase());
       System.out.println("Minuscula: " + frase.toLowerCase());
    }
    
}
