
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
        int [] numeros = new int [10];
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<10;i++){
            System.out.print("Ingrese un número: ");
            numeros [i] = scanner.nextInt();
        }
        
        for (int j=9;j>=0;j--){
            System.out.print(numeros[j]+" "); 
        }
        
    }
    }
