/*Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, 
a medida que el usuario las va ingresando, construya una “sopa de letras para niños”
de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal 
en una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras, 
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima por pantalla 
la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java substring(),
Length() y Math.random().
 */
package Encuentro9y10Practica;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author usuario
 */
public class Ejercicio6Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        int f = 0, c = 0;
        char[][] sopa = new char[20][20];

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                sopa[i][j] = (char) (random.nextInt(10) + '0');

            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("[" + sopa[i][j] + "]");
            }
            System.out.println("");
        }
        for (int x = 0; x < 5; x++) {
            System.out.println("Ingrese palabra");

            String palabra = leer.nextLine();
            int longitud = palabra.length();
            for (int i = 0;i < longitud;i++) {
                sopa[0][i] = palabra.charAt(i);

            }
        }
    }

}

/*System.out.println ("Ingrese palabra");
        
        String palabra = leer.nextLine();
    int longitud = palabra.length();
    for (int i = 0;
    i< longitud ;
    i

    
        ++) {
            sopa[0][i] = palabra.charAt(i);

    }
    for (int i = 0;
    i< 20; i

    
    
    ++) {

        }
    for (int i = 0;
    i< 20; i

    
        ++) {
            for (int j = 0; j < 20; j++) {
            System.out.print(sopa[i][j] + "-");

        }
        System.out.println(" ");
    }
}*/
