/*
5. Una obra social tiene tres clases de socios:
○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
○ Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio.
 */
package Encuentro4_5y6Practica;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio5Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String socio;
        double total, descuento;
        System.out.println("Ingrese su tipo de socio");
        socio = leer.next();
       
        if (socio.equalsIgnoreCase("a")) {
             System.out.println("Ingrese el costo del tratamiento");
        total = leer.nextDouble();
            System.out.println("El afiliado recibe un 50% de dto, el monto a pagar es " + (total * 0.50));
        } else if (socio.equalsIgnoreCase("b")) {
             System.out.println("Ingrese el costo del tratamiento");
        total = leer.nextDouble();
            System.out.println("El afiliado recibe un 35% de dto, el monto a pagar es " + (total * 0.65));
        } else if (socio.equalsIgnoreCase("c")) {
             System.out.println("Ingrese el costo del tratamiento");
        total = leer.nextDouble();
            System.out.println("El afiliado no recibe dto, el monto a pagar es " + total);
        } else {
            System.out.println("Ud no se encuentra afiliado");
        }
    }

}
