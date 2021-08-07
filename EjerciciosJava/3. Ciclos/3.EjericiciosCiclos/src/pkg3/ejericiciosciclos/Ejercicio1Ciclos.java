
package pkg3.ejericiciosciclos;

import java.util.Scanner;

/**
 *Muestra los números múltiplos de 8 de 
 *0 a 100 utilizando un bucle while.
 * @author crist
 */
public class Ejercicio1Ciclos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escoja la solución: ");
        System.out.println("1 - Chalo Gonzalo ");
        System.out.println("2 - Samuel J");
        int solucionUsuario = scanner.nextInt();
        
        switch (solucionUsuario){
           
        case 1: // Caso de Chalo Gonzalo
        int contador = 1;
        
        do{
           if(contador%8==0){
               System.out.println(contador);
               contador++;
           }
           contador++;
       }while(contador < 101);
        
        break;
        case 2: // Caso de Samuel J
            
        int Resultado = 0;
        
       while((Resultado+8) <= 100){
         Resultado+=8;
         System.out.println(Resultado);  
       }
  
        break;

        default:
        System.out.printf("Opción no valida, ejecute nuevamente el programa" );    
        }

    }
   }
