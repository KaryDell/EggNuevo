/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas 
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados. 
Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. 
Las ponderaciones de cada nota son:
-Primer trabajo práctico evaluativo 10%
-Segundo trabajo práctico evaluativo 15%
-Primer Integrador 25%
-Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados, 
teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.
 */
package Encuentro9y10Practica;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio4Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int alumnos = 10, desaprobados = 0, aprobados = 0, n1 = 0, n2 = 0, n3 = 0, n4 = 0;
        double nf1 = 0, nf2 = 0, nf3 = 0, nf4 = 0;
        double [] notas= new double[alumnos];
        for (int i = 0; i < alumnos; i++) {
            System.out.println("Ingrese las notas obtenidas de "+(i+1));
            n1=leer.nextInt();
            n2=leer.nextInt();
            n3=leer.nextInt();
            n4=leer.nextInt();
            //System.out.println("Las notas finales son ");
            nf1=n1*0.10;
            nf2=n2*0.15;
            nf3=n3*0.25;
            nf4=n4*0.50;
          notas [i]=nf1+nf2+nf3+nf4;
         
        }
        for (int i = 0; i < alumnos; i++) {
            if (notas[i]>=7) {
                aprobados++;
            }else{
                desaprobados++;
            }
            System.out.println("Nota final de " +i+" "+notas[i]);
        }
        System.out.println("La cantidad de aprobados es "+aprobados);
        System.out.println("La cantidad de desaprobados es "+desaprobados);
    }

}
