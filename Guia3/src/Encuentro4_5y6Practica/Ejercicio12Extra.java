/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
números del 0-0-0 al 9-9-9, con la particularidad que cada vez que
aparezca un 3 lo sustituya por una E.
*/

package Encuentro4_5y6Practica;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Ejercicio12Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                for ( int k = 0; k < 10; k++){
                    String digito_1 = (i == 3) ? "E" : Integer.toString(i);
                    String digito_2 = (j == 3) ? "E" : Integer.toString(j);
                    String digito_3 = (k == 3) ? "E" : Integer.toString(k);
                    System.out.println(digito_1 + "-" + digito_2 + "-" + digito_3);
                }
                
            }
        }
    }
    
}
