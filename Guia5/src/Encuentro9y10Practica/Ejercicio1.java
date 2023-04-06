/*
Realizar un algoritmo que llene un vector con los 100 primeros números enteros 
y los muestre por pantalla en orden descendente.
*/

package Encuentro9y10Practica;

/**
 *
 * @author usuario
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int [] Numeros = new int [100];
        for (int i = 0; i < 100; i++) {
            Numeros [i] = i+1;
        }
        
        for (int i = 99; i > -1 ; i--) {
            System.out.println(Numeros [i]);
            for (int j = 0; j < 10; j++) {
                
            }
    }
    }
}