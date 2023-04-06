/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
Crear un programa que permita introducir un cuadrado por teclado y 
determine si este cuadrado es mágico o no. El programa deberá comprobar 
que los números introducidos son correctos, es decir, están entre el 1 y el 9.

*/

package Encuentro9y10Practica;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int f = 3 , c = 3 , sumaFilas , sumaColumnas , sumaDiagonal1 = 0 , sumaDiagonal2 = 0 ;
        int [][] matriz = new int [f][c] ;
       // int [] vector1 = new int [f];
        // int [] vector2 = new int [c];
        if ( f == c ) {
            for (int i = 0; i < f; i++) {
                for (int j = 0; j < c; j++) {
                   
                    matriz[i][j] = leer.nextInt();
                   // if (matriz[i][j] >= 1 && matriz[i][j] <= 9) {
                     //   continue;
                   // }
                }
                
            }
            for (int i = 0; i < f; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print("[" + matriz[i][j] + "]");
                }
                System.out.println("");  
                
                // BUBLE FOR ANIDADO QUE REALIZA LA SUMA DE LAS FILAS
            }
            for (int i = 0; i < f; i++) {
                sumaFilas = 0;
                for (int j = 0; j < c; j++) {
                    sumaFilas = sumaFilas + matriz[i][j];
     
            }
              System.out.println("La fila " + i + "suma : " + sumaFilas);  
        }
            // BUCLE FOR ANIDADO QUE REALIZA LA SUMA DE LAS COLUMNAS
            for (int i = 0; i < f ; i++) {
                sumaColumnas = 0 ;
                for (int j = 0; j < c; j++) {
                    sumaColumnas = sumaColumnas + matriz[j][i];
                    
                }
                 System.out.println("La COLUMNA " + i + "suma : " + sumaColumnas);
            }
            for (int i = 0; i < f; i++) {
                
                for (int j = 0; j < c; j++) {
                    if ( i == j ) {
                        sumaDiagonal1 = sumaDiagonal1 + matriz[i][j];
                    }
                }  
            }
                System.out.println("La suma de la diagonal principal es : " + sumaDiagonal1); 
            for (int i = 0; i < f; i++) {
                
                for (int j = 0; j < c; j++) {
                
                    if ( i== j) {
                        sumaDiagonal2 = sumaDiagonal2 + matriz[j][i];
                    }
                }
                
            }
            System.out.println("La suma de la diagonal secundaria es : " + sumaDiagonal2); 
    }else{
            System.out.println("La matriz no es cuadrada");
        }  
    }
}