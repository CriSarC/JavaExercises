
package pkg4.ejerciciosarreglos;

import java.util.Scanner;

/**
 * la siguiente clase resuelve el ejercicio:
 * Crea un programa que reciba por consola
 * 10 números y que luego los muestre en orden
 * inverso, es decir, el primero que se 
 * ingresa es el último en mostrarse y viceversa.
 * @author crist
 */
public class Ejercicio2Arreglos {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escoja la solución: ");
        System.out.println("1 - Chalo Gonzalo ");
        System.out.println("2 - Samuel J");
        int solucionUsuario = scanner.nextInt();
        
        
        int [] numeros = new int [10];
            for (int i=0;i<10;i++){
                System.out.print("Ingrese un número: ");
                numeros [i] = scanner.nextInt();
            }
            
        switch (solucionUsuario){
           
        case 1: // Caso de Chalo Gonzalo
           for (int j=9;j>=0;j--){
                System.out.print(numeros[j]+" "); 
            }
        break;
        
        case 2: // Caso de Samuel J
            int i=10;
            while (i!=0){
            System.out.print(numeros[i-1]+" "); 
            i--;
            }
        break;
        default:
        System.out.printf("Opción no valida, ejecute nuevamente el programa" );    
        
    }
    }
}
