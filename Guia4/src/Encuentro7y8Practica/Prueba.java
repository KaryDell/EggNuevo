/*

*/

package Encuentro7y8Practica;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre=leer.nextLine();
        System.out.println("Hola, " +nombre+ " cómo estás?");
        saludo(nombre);
        System.out.println("Hola, " +nombre+ " cómo estás?");
    }
public static String saludo(String name){
    name="Carina";
    return name;
}

}
