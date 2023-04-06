/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.

*/

package Encuentro9y10Teoria;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        String [] Equipo = new String [6];
        System.out.println("Ingrese los nombres");
        for (int i = 0; i < 6; i++) {
            System.out.println("Ingrese nombre"+(i+1) ); 
            Equipo [i] = leer.nextLine();
        }
        for (int i = 0; i < 6; i++) {
            System.out.print(" "+ Equipo [i]+ "");
        
        
    }
    }
}
