/*2. Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java.*/


package Encuentro4_5y6Practica;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.println("Por favor, Ingresar una frase");
    String palabra=leer.nextLine();
    if (palabra.equalsIgnoreCase("Eureka")){
        System.out.println("La frase ingresada es correcta");
    }else{
        System.out.println("La frase ingresada es incorrecta");
    }
    }

}
