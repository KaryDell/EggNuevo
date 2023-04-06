/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encuentro2y3;

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
              Scanner zapallo = new Scanner(System.in);
      int num,num2;

      System.out.println("Ingrese un numero");
      num = zapallo.nextInt();
      
            System.out.println("Ingrese otro numero");
      num2 = zapallo.nextInt();
      
        System.out.println("La suma es " + (num + num2));
    }
    
}
