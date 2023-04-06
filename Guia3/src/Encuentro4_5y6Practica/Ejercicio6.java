/*6. Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.*/
package Encuentro4_5y6Practica;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;

        double num1, num2, num3;
        int salida = 1;
        String resp;
        String menu = "MENU\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir";
        System.out.println("Ingrese el valor del primer número");
        num1 = leer.nextDouble();
        System.out.println("Ingrese el valor del segundo número");
        num2 = leer.nextDouble();
        while (salida != 5) {
            System.out.println(menu);
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    num3 = num1 + num2;
                    System.out.println("El resultado es " + num3);
                    break;
                case 2:
                    num3 = num1 - num2;
                    System.out.println("El resultado es " + num3);
                    break;
                case 3:
                    num3 = num1 * num2;
                    System.out.println("El resultado es " + num3);
                    break;
                case 4:
                    num3 = num1 / num2;
                    System.out.println("El resultado es " + num3);
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    resp = leer.next().toLowerCase();
                    if (resp.equals("s")) {
                        salida = 5;
                        break;
                    } else if (resp.equals("n")) {
                        break;
                    }
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }

    }

}
