/*

*/

package Encuentro7y8Practica;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        double resultado;
        int opcion = 0;
        System.out.println("Ingresar 2 numeros para operaciones");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        while (opcion != 4) {
            System.out.println("===== MENU =====");
            System.out.println("1. SUMA ");
            System.out.println("2. RESTA");
            System.out.println("3. MULTIPLICA");
            System.out.print("4 SALIR ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    resultado = sumar(num1, num2);
                    System.out.println("La suma es: " + resultado);
                    break;
                
                case 2:
                    resultado = restar(num1, num2);
                    System.out.println("La resta es: " + resultado);
                    break;
                    
                case 3:
                    resultado = multi(num1, num2);
                    System.out.println("La multiplicacion es: " + resultado);
                    break;
                    
                 case 4:    
                    System.out.println("Saliendo del programa...");
                    break;
                    
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }


    }
      public static double sumar(int num1, int num2) {
          int retorno;
          retorno = num1 + num2;
        return retorno;
    }         
     public static int restar(int num1, int num2) {
        return num1 - num2;
    }
     public static int multi(int num1, int num2) {
        return num1 * num2;
    }      
}