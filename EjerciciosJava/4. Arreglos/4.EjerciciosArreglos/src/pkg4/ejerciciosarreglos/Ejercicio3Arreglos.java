
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
        int [] numeros = new int[8];
        for (int i=0;i<8;i++){
            System.out.print("Ingrese un número entero: ");
            numeros[i] = scanner.nextInt();
        }
        for(int j=0;j<8;j++){
            if(numeros[j]%2==0){
                System.out.println(numeros[j]+" par");
            }
            else{
                System.out.println(numeros[j]+" impar");
            }
        }
    }
}
