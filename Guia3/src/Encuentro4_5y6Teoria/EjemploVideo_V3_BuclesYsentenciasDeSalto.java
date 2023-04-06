/*Muestre N sumatorias de los primeros números enteros partiendo desde 1, siendo N Para
de un aviso si el usuario identifica un valor de N superior a 1000 por ejecución lenta*/
package Encuentro4_5y6Teoria;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjemploVideo_V3_BuclesYsentenciasDeSalto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        do{
            System.out.println("Ingrese un numero entero positivo");
            num = leer.nextInt();
            if (num>1000){
                System.out.println("Este programa podría tardar, está seguro? (s/n)");
               String confirma=leer.next();
               if (confirma.equals("s"));{
                break;
            }
               
            }
        } while (num<=0 || num>1000);
        
      int j, suma;
      for (int i=1;i<=num;i++){
          if(i%2!=0)
              continue;
          suma=0;
          j=1;
          while(j<=i){
              suma+=j;
              j++;
              
          }
          System.out.println("La suma de los " +i+ " numeros naturales es igual a " +suma);
      }
        
    }

}
