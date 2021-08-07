
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
        System.out.println("Escoja la solución: ");
        System.out.println("1 - Chalo Gonzalo ");
        System.out.println("2 - Samuel J");
        int solucionUsuario = scanner.nextInt();
        
        switch (solucionUsuario){
           
        case 1: // Caso de Chalo Gonzalo
            
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
  
        break;
        case 2: // Caso de Samuel J
            System.out.print("Ingrese un número entero positivo: ");
            int numeroEntrada = scanner.nextInt();
            int numeroBase= (numeroEntrada+numeroEntrada-1);
            int Contador=1;
            String Espacio = " ";
            StringBuilder Cadena = new StringBuilder();
            
            if (numeroEntrada==1){
            System.out.println(numeroEntrada);
            }
            else if (numeroEntrada==0){
            System.out.println("");
            }
            else {
            
                
                
            for(int fila=1; fila<=(numeroEntrada);fila++){
                for(int columna=1; columna<=(numeroBase-Contador);columna++){
                Cadena.append(Espacio);
                }
                int Contador2=0;
                while(Contador2!=(fila-1)){
                Cadena.append(Contador2+1);
                Contador2++;
                }
                Cadena.append(Contador);
                System.out.printf("Contador: "+ Contador2+ "___"); 
                while(Contador2!=0){
                Cadena.append((Contador2+1-1));
                Contador2=Contador2-1;
                
                }
                
                
                for(int columna=1; columna<=(numeroBase-Contador);columna++){
                Cadena.append(Espacio);
                }
                Contador++;
                System.out.println(Cadena);
                Cadena.delete(0, Cadena.length());
             }
            
            
            }
        break;
        
        default:
        System.out.printf("Opción no valida, ejecute nuevamente el programa" );    
       }
    }
}

