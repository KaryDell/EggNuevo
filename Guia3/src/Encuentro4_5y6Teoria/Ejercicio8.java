/*
 Escriba un programa que valide si una nota está entre 0 y 10, sino está  entre 0
y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package Encuentro4_5y6Teoria;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double nota;
        System.out.println("Ingrese su nota");
        nota = leer.nextDouble();
        while (nota < 0 || nota > 10) {
            System.out.println("La nota es incorrecta, ingrese un valor valido del 0 al 10");
            nota = leer.nextDouble();

        }
        System.out.println("La nota obtenida es " +nota);
    }

}
