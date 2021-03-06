
package pkg2.ejercicioscondicionales;
import java.util.Scanner;

/**
 * Esta clase define la solucion al siguiente ejercicio: 
 * Escribe un programa que ordene tres números
 * enteros introducidos por teclado. Que los muestre
 * sin ordenar y despues ordenados por consola
 * @author: CriSarC
 * @version: 1-08-2021-1 
 */
public class Ejercicio2Condicionales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numeroA = scanner.nextInt();
        System.out.print("Ingrese un número entero: ");
        int numeroB = scanner.nextInt();
        System.out.print("Ingrese un número entero: ");
        int numeroC = scanner.nextInt();
        System.out.println("los números ingresados son: " +numeroA+" "+numeroB+" "+numeroC);
        
        System.out.println("Escoja la solución: ");
        System.out.println("1 - Chalo Gonzalo ");
        System.out.println("2 - Samuel J");
        int solucionUsuario = scanner.nextInt();
        switch (solucionUsuario){
        
        
                
        case 1: // Caso de Chalo Gonzalo
         int cont = 0;  
        /**
         * con el Do While me aseguro de que solo hagan este proceso 3 veces
         */
        do{
            /**
             * separo en 3 condicionales cada uno para los casos de menor, medio y mayor
             */
                if(numeroA<numeroB && numeroA<numeroC){
                    System.out.println("menor: "+numeroA);
                    cont++;
                }
                else if(numeroB<numeroA && numeroB<numeroC){
                    System.out.println("menor: "+numeroB);
                    cont++;
                }
                else if(numeroC<numeroA && numeroC<numeroB){
                    System.out.println("menor: "+numeroC);
                    cont++;
                }
                
                if(numeroA>numeroB && numeroA<numeroC){
                    System.out.println("medio: "+numeroA);
                    cont++;
                }
                else if(numeroA>numeroC && numeroA<numeroB){
                    System.out.println("medio: "+numeroA);
                    cont++;
                }
                else if(numeroB>numeroA && numeroB<numeroC){
                    System.out.println("medio: "+numeroB);
                    cont++;
                }
                 else if(numeroB>numeroC && numeroB<numeroA){
                    System.out.println("medio: "+numeroB);
                    cont++;
                }
                else if(numeroC>numeroA && numeroC<numeroB){
                    System.out.println("medio: "+numeroC);
                    cont++;
                }
                else if(numeroC>numeroB && numeroC<numeroA){
                    System.out.println("medio: "+numeroC);
                    cont++;
                }
                                
                if(numeroA>numeroB && numeroA>numeroC){
                    System.out.println("mayor: "+numeroA);
                    cont++;
                }
                else if(numeroB>numeroA && numeroB>numeroC){
                    System.out.println("mayor: "+numeroB);
                    cont++;
                }
                else if(numeroC>numeroA && numeroC>numeroB){
                    System.out.println("mayor: "+numeroC);
                    cont++;
                }
                else{
                    System.out.println("error");
                }
        } while(cont < 3);
        
            System.out.println("Números ordenados de menor a mayor");
            
        case 2: // Caso de Samuel J
           
            
            int numeroMayor = ((numeroA > numeroB)&&(numeroA > numeroC) ) ? numeroA:numeroB;
            System.out.println("numeroMayor: "+numeroMayor);
            
            if (!((numeroA > numeroB)&&(numeroA > numeroC))||(((numeroB > numeroA)&&(numeroB > numeroC)) ))
            {numeroMayor=numeroC;System.out.println("numeroMayor: "+numeroMayor);}

            int numeroMenor = ((numeroA < numeroB)&&(numeroA < numeroC) ) ? numeroA:numeroB;
            
            if (!((numeroA < numeroB)&&(numeroA < numeroC))||(((numeroB < numeroA)&&(numeroB < numeroC)) ))
            {numeroMenor=numeroC;System.out.println("numeroMenor: "+numeroMenor);}
            
            int numeroMedio = (((numeroA > numeroB)&&(numeroA < numeroC))||((numeroA < numeroB)&&(numeroA > numeroC)))  ? numeroA:numeroB;
            
            if (!((((numeroA > numeroB)&&(numeroA < numeroC))||((numeroA < numeroB)&&(numeroA > numeroC)))||(((numeroB > numeroA)&&(numeroB < numeroC))||((numeroB < numeroA)&&(numeroB > numeroC)))))
                        
            System.out.println("mayor: "+numeroMayor);
            System.out.println("medio: "+numeroMedio);
            System.out.println("menor: "+numeroMenor);
                               
        break;
        
        default:
        System.out.printf("Opción no valida, ejecute nuevamente el programa" );
        break;
        }
        
        
    
}
}
