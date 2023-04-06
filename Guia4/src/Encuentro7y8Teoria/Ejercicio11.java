/*
Ejercicio 11
Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.

Realice un subprograma que reciba una secuencia de caracteres y retorne la
codificación correspondiente. Utilice la estructura “según” para la
transformación.

 */
package Encuentro7y8Teoria;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese una frase");
        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();
        String retorno = fraseNueva(frase);
        System.out.println(retorno);
    }

    public static String fraseNueva(String frase) {
        String cambio = "";
        for (int j = 0; j < frase.length(); j++) {
            char letra = frase.toLowerCase().charAt(j);
            switch (letra) {
                case 'a':
                    cambio = cambio.concat("@");
                    break;
                case 'e':
                    cambio = cambio.concat("#");
                    break;
                case 'i':
                    cambio = cambio.concat("$");
                    break;
                case 'o':
                    cambio = cambio.concat("%");
                    break;
                case 'u':
                    cambio = cambio.concat("*");
                    break;
                default:
                    cambio = cambio.concat(frase.substring(j, j + 1));
            }

        }
        return cambio;
    }

}
