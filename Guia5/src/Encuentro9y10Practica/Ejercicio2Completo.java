/*

*/

package Encuentro9y10Practica;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Ejercicio2Completo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer= new Scanner(System.in);
        Random rand = new Random();
        int n = 0;
        int num5 = 0;
        System.out.println("Ingrese el tamaño del vector: ");
        n= leer.nextInt();
        int [] numeros  = new int[n];
        boolean nume4 = false;
        for (int i = 0; i < n-1; i++) {
            
            numeros [i] = rand.nextInt(5);
            System.out.println(numeros[i]);
        }
        System.out.println("Ingrese un numero a buscar en el vector; ");
               int num2 = leer.nextInt();
               
        for (int i = 0; i < n-1; i++) {
            if (num2 == numeros [i]) {
                nume4 = true;
                System.out.println("EL numero se encuentra en posision" + i);
               num5 = num5 +1;
            }
           
                
            }
             if (num5 > 1) {
                 System.out.println("Se encuntra repetido;" + num5 + "veces");
            
        }
             if (nume4 == false) {
                System.out.println("No se encuentra");
        }
       
    }
    
}
