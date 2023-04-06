/*
Realizar un algoritmo que llene un vector de tamaño N con
valores aleatorios y le pida al usuario un número a buscar en el vector. 
El programa mostrará dónde se encuentra el numero y si se encuentra repetido
*/

package Encuentro9y10Practica;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Introduce el tamaño del vector: ");
        int n = sc.nextInt();
        
        int[] vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            vector[i] = rand.nextInt(100); // Genera un número aleatorio entre 0 y 99
        }
        
        System.out.print("Introduce el número a buscar: ");
        int numBuscar = sc.nextInt();
        
        
        boolean encontrado = false;
        boolean repetido = false;
        int posicion = -1;
        
        for (int i = 0; i < n; i++) {
            if (vector[i] == numBuscar) {
                if (!encontrado) {
                    encontrado = true;
                    posicion = i;
                } else {
                    repetido = true;
                }
            }
        }
        
        if (encontrado) {
            System.out.println("El número " + numBuscar + " se encuentra en la posición " + posicion);
            
            if (repetido) {
                System.out.println("Además, el número está repetido en el vector.");
            }
        } else {
            System.out.println("El número " + numBuscar + " no se encuentra en el vector.");
        }
    }
}