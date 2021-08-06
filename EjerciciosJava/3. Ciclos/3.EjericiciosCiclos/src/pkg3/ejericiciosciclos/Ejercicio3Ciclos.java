
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
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escoja la solución: ");
        System.out.println("1 - Chalo Gonzalo ");
        System.out.println("2 - Samuel J");
        int solucionUsuario = scanner.nextInt();
        
        switch (solucionUsuario){
           
        case 1: // Caso de Chalo Gonzalo
            int countNegativos = 0;
            int countPositivos = 0;
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
           
        break;
        case 2: // Caso de Samuel J
            int Contador=0;
            int numeroPositivos=0;
            int numeroNegativos=0; 
            System.out.print("Ingrese un numero entero: ");
            int numeroEntrada;
            while (Contador<10){
            Contador+=1;
            numeroEntrada = scanner.nextInt();
            if(numeroEntrada<0){
                numeroNegativos ++;
            }
            else if(numeroEntrada>0){
                numeroPositivos ++;
            }
            else {
                System.out.print("No es un numero negativo o positivo ingrese el numero nuevamente: ");
                Contador --;
            }
            }
            System.out.println("Hay " + numeroPositivos + " números Positivos");
            System.out.println("Hay " + numeroNegativos + " números Negativos");
            
        break;
        
        default:
        System.out.printf("Opción no valida, ejecute nuevamente el programa" ); 
        
        
    }
}
}
