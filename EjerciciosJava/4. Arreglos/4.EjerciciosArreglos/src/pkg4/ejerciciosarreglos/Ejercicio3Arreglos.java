
package pkg4.ejerciciosarreglos;

import java.util.Scanner;

/**
 * la siguiente clase resuelve este ejercicio:
 *Crea un programa que solicite por consola 8 números 
 * enteros y que luego muestre esos números junto con 
 * la palabra "par" o "impar".
 * @author crist
 */
public class Ejercicio3Arreglos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escoja la solución: ");
        System.out.println("1 - Chalo Gonzalo ");
        System.out.println("2 - Samuel J");
        int solucionUsuario = scanner.nextInt();
        
        int [] numeros = new int[8];
        for (int i=0;i<8;i++){
            System.out.print("Ingrese un número entero: ");
            numeros[i] = scanner.nextInt();
        }
        switch (solucionUsuario){
           
        case 1: // Caso de Chalo Gonzalo
        
        for(int j=0;j<8;j++){
            if(numeros[j]%2==0){
                System.out.println(numeros[j]+" par");
            }
            else{
                System.out.println(numeros[j]+" impar");
            }
        }   
        break;
        case 2: // Caso de Samuel J
        for(int i=0;i<8;i++){
          String signo= (numeros[i]%2==0) ? "par":"impar";
          System.out.println(numeros[i]+" "+signo);
      }    
        break;
        default:
        System.out.printf("Opción no valida, ejecute nuevamente el programa" );    

    }
}
}