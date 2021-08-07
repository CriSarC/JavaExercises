
package pkg4.ejerciciosarreglos;

import java.util.Scanner;

/**
 *la siguiente clase resuelve este ejercicio:
 * Crear un arreglo de 10 caracteres con el nombre
 * caracteres y asigna valores a los elementos según 
 * la siguiente tabla:
     Posición  0   1   2   3   4   5   6   7   8   9
        Valor    ‘h' ‘z'                '@'      '  ' '+' ‘J'
 * @author crist
 */
public class Ejercicio1Arreglos {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escoja la solución: ");
        System.out.println("1 - Chalo Gonzalo ");
        System.out.println("2 - Samuel J");
        int solucionUsuario = scanner.nextInt();
        
        switch (solucionUsuario){
           
        case 1: // Caso de Chalo Gonzalo
        
        char [] arreglo = new char [10];
        
        arreglo [0] = 'h';
        arreglo [1] = 'z';
        arreglo [5] = '@';
        arreglo [7] = ' ';        
        arreglo [8] = '+';
        arreglo [9] = 'J';
        
        for (int i=0; i<arreglo.length;i++){
            System.out.print(arreglo[i] + " ");
        }
        
        break;
        case 2: // Caso de Samuel J
        System.out.print("Samuel lo hizo igual");    
        break;
        
        default:
        System.out.printf("Opción no valida, ejecute nuevamente el programa" );    
    }
 }
}
