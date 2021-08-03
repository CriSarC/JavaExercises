
package pkg2.ejercicioscondicionales;
import java.util.Scanner;
/**
 *Esta clase da solución al siguiente ejercicio:
 * Escribe un programa que diga cuál es el primercifra
 * de un número entero introducido por teclado. Se permiten
 * números de hasta 5 cifras.
 * @author crist
 */
public class Ejercicio3Condicionales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingresa un numero entero menor a 5 Cifras: ");
        int num = scanner.nextInt();
        int num1 = num;
        int cont = 0;
        /**
         * se usa un Do While para contar el número de digitos
         */
        do{
            num = num/10;
            cont++;
           //se agrega el cont<7 para asegurar que el ciclo no se repita muchas veces
        }while(num>0 && cont<7);
        /**
         * se revisa por medio de un condicional y se calcula el primer digito
         */
       if(cont<6){
        int divisor = (int) Math.pow(10,cont-1); 
         System.out.println("La primer cifra del numero ingresado es: " + (num1/divisor));
       }
       else
            System.out.println("El número tiene más de 5 digitos");
                    
                            
    }
}
