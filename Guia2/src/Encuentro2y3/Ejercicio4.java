/*
4. Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).
 */
package Encuentro2y3;

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
       Scanner leer = new Scanner(System.in);
       double gradosC;
       System.out.println("Ingrese grados centigrados(para decimal utilice coma)");
       gradosC = leer.nextDouble();
       double gradosF = 32 + (9*gradosC/5);
       System.out.println("El equivalente en grados Farenheit es: " + gradosF +"F°");
    }
    
}
