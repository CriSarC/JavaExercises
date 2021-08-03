
package pkg3.ejericiciosciclos;
import java.util.Scanner;
/**
 * la clase resuelve este ejercicio:
 *Escribe un programa que recibe un número por consola 
 *e imprima una pirámide de números
Ejemplo
          1 
         121
        12321 
       1234321

 * @author crist
 */
public class Ejercicio4Ciclos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();
        int espacioIzquierda = 0;
        int capa = 0;
        String guion = " ";
        StringBuffer buff = new StringBuffer();
       do{
            capa++;
            espacioIzquierda = ((numero*2) - (capa*2));
            buff.delete(0, buff.length());
            for(int i=espacioIzquierda;i>0;i--){
                buff.append(guion);
            }
            System.out.print(buff);
            for(int ramaIzquierda=1;ramaIzquierda<capa;ramaIzquierda++){
                System.out.print(String.format("%-2s", ramaIzquierda));
            }
            for(int ramaDerecha=capa;ramaDerecha>0;ramaDerecha--){
                System.out.print(String.format("%-2s",ramaDerecha));
            }
            System.out.println(" ");
       }while(capa<numero);
    }
}
