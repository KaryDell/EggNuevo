/*5. Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.*/
package Encuentro4_5y6Practica;

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
        int limit, num, num1, suma, suma1;
        System.out.println("Ingrese un numero que se usara de limite.");
        limit = leer.nextInt();
        System.out.println("Ahora ingrese un numero, para intentar superar el limite antes propuesto.");
        num = leer.nextInt();

        if (num < limit) {
            System.out.println("Usted aun no ha superado el limite, ingrese otro numero");
            while (num <= limit) {
                num = num+leer.nextInt();
               System.out.println("Usted aun no ha superado el limite, ingrese otro numero"); 
 
            }
            
        } 
        System.out.println("El limite fue superado con " +num);
    }
}
