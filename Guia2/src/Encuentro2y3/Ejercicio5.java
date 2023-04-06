/*
 5. Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().
 */
package Encuentro2y3;

import java.util.Scanner;



/**
 *
 * @author usuario
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
    double num = leer.nextDouble();
        System.out.println("\nEl doble de " +num+ " es " +(num*2)+ "\n"+"***********************"+"\n"+"El triple de " +num+ " es " +(num*3)+ "\n"+"***********************"+"\n"+"La raiz cuadrada de " +num+ " es " +Math.sqrt(num));
        
     
        
    }
    
}