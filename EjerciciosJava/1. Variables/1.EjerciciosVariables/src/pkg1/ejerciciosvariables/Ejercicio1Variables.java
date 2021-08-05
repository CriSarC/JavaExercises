
package pkg1.ejerciciosvariables;

import java.util.Scanner;

//Escribe un programa en el que se declare
//las variables enteras numeroA y numeroB.
//Asignales los valores 89 y 323. Mostrar
//por consola el valor de cada variable, 
//la suma, la resta, la división y la 
//multiplicación.

public class Ejercicio1Variables {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escoja la solución: ");
        System.out.println("1 - Chalo Gonzalo ");
        System.out.println("2 - Samuel J");
        int solucionUsuario = scanner.nextInt();
        
        switch (solucionUsuario){
         
        case 1: // Caso de Chalo Gonzalo
            
        int numeroA = 89;
        int numeroB = 323;
        System.out.println("la el numero A es: " + numeroA);
        System.out.println("la el numero B es: " + numeroB);
        System.out.println("la suma: numero A + numero B es: " + (numeroA+numeroB));
        System.out.println("la Resta: numero A - numero B es: " + (numeroA-numeroB));
        System.out.println("la Multiplicación: numero A x numero B es: " + (numeroA*numeroB));
        System.out.println("la División: numero A / numero B es: " + (numeroA/numeroB));
        
        case 2: // Caso de Samuel J
          
        int numeroAA;
        int numeroBB;
        do {
       
        System.out.println("Ingrese un numero entero entre el 89 al 323: ");
        numeroAA = scanner.nextInt();
        System.out.println("Ingrese un numero entero entre el 89 al 323: ");
        numeroBB = scanner.nextInt();
        
        if ((numeroAA>322 || numeroAA<89)&&(numeroBB>322 || numeroBB<89))
        {
        System.out.println("Nos valores ingresados no cumple con lo solicitado, por favor ingrese nuevamente los numeros");
        }
        } while ((numeroAA>322 || numeroAA<89)&&(numeroBB>322 || numeroBB<89));
        
        System.out.println("La Suma de los numeros ingresados es: " + (numeroAA+numeroBB));
        System.out.println("La Resta de los numeros ingresados es: " + (numeroAA-numeroBB));
        System.out.println("La Multiplicación de los numeros ingresados es: " + (numeroAA+numeroBB));
        System.out.println("La Multiplicación de los numeros ingresados es: " + (numeroAA/numeroBB));    
       
        break;
        
        default:
        System.out.printf("Opción no valida, ejecute nuevamente el programa" );    
        }
    
     }

}