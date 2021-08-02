
package pkg1.ejerciciosvariables;

import java.util.Scanner;

//Escribe un programa en el que se declare
//las variables enteras numeroA y numeroB.
//Asignales los valores 89 y 323. Mostrar
//por consola el valor de cada variable, 
//la suma, la resta, la división y la 
//multiplicación.

public class EjerciciosVariables {
    
    public static void main(String[] args) {
    
        //Solucion Samuel 
         int numeroA;
         int numeroB;
        do 
        {Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese un numero entero entre el 89 al 323: ");
        numeroA = scanner.nextInt();
        System.out.println("Ingrese un numero entero entre el 89 al 323: ");
        numeroB = scanner.nextInt();
        if ((numeroA>322 || numeroA<89)&&(numeroB>322 || numeroB<89)){
        System.out.println("Nos valores ingresados no cumple con lo solicitado, por favor ingrese nuevamente los numeros");
        }
        } while ((numeroA>322 || numeroA<89)&&(numeroB>322 || numeroB<89));
        
        System.out.println("La Suma de los numeros ingresados es: " + (numeroA+numeroB));
        System.out.println("La Resta de los numeros ingresados es: " + (numeroA-numeroB));
        System.out.println("La Multiplicación de los numeros ingresados es: " + (numeroA+numeroB));
        System.out.println("La Multiplicación de los numeros ingresados es: " + (numeroA/numeroB));
   
}
}