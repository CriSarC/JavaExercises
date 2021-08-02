
package pkg3.ejericiciosciclos;
import java.util.Scanner;
/**
 *la siguiente clase resuelve el problema:
 * Escribe un programa que lea por consola 
 * diez números e indique cuántos son positivos,
 * y cuántos son negativos.
 * @author crist
 */
public class Ejercicio3Ciclos {
    public static void main(String[] args) {
        int countNegativos = 0;
        int countPositivos = 0;
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.print("Ingrese un numero entero: ");
        int numero = scanner.nextInt();
        
        if(numero<0){
            countNegativos ++;
        }
        else if(numero>0){
            countPositivos ++;
        }
        else{
            System.out.println("el número" + numero + "no es ni negativo ni positivo");
        }
        }
        System.out.println("Hay " + countPositivos + " números Positivos");
        System.out.println("Hay " + countNegativos + " números Negativos");
        
    }
    
}
