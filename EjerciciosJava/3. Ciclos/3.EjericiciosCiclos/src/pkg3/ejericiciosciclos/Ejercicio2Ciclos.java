
package pkg3.ejericiciosciclos;

import java.util.Scanner;

/**
 * la siguiente clase resuelve este problema:
 *Escribe un programa que calcule el promedio de un 
 * conjunto de números positivos introducidos por teclado. 
 * El programa no sabe cuántos números se ingresaran. 
 * El usuario indicará que ha terminado de ingresar los 
 * datos cuando ingrese un número negativo.
 * @author crist
 */
public class Ejercicio2Ciclos {
    public static void main(String[] args) {
        
        double suma = 0;
        double numeros = 0;
        int count = 0; 
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese un número positivo (para finalizar ingrese un número negativo: ");
            numeros = scanner.nextFloat();
            if (numeros >0){
                suma += numeros;
            }
            count++;
        }while(numeros>0);
        System.out.println("El promedio de los números positivos ingresados es: " + (suma/(count-1)));
    }
   
}
