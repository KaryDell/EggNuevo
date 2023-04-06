/*

*/

package Encuentro7y8Practica;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
   System.out.println("Ingrese el valor en Euros");

        float euros = leer.nextFloat();

        System.out.println("Ingrese una moneda a la que quiere convertir");

        String moneda = leer.next();

        moneda = moneda.toLowerCase();

        convertidor(euros, moneda);

    }

    public static void convertidor(float euros, String moneda) {

        double resultado = 0;
        switch (moneda) {
            case "libras":

                resultado = euros * 0.86;

                break;

            case "dolares":

                resultado = euros * 1.28611;

                break;

            case "yenes":

                resultado = euros * 129.852;

                break;

            default:

                System.out.println("Opcion incorecta");

        }

        System.out.println(" los euros ingresados equivaSlen a : " + resultado + " " + moneda);

    }

}
