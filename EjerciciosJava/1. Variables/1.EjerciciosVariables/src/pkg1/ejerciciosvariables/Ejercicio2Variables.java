/*
Realiza un conversor de pesos a dolar. La cantidad en pesos
que se quiere convertir deberá estar almacenada en una variable.
El valor de un dolar es: $3.895 pesos
 */
package pkg1.ejerciciosvariables;

import java.util.Scanner;

public class Ejercicio2Variables {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escoja la solución: ");
        System.out.println("1 - Chalo Gonzalo ");
        System.out.println("2 - Samuel J");
        int solucionUsuario = scanner.nextInt();
        
        switch (solucionUsuario){
           
        case 1: // Caso de Chalo Gonzalo
        System.out.print("ingrese dinero en pesos colombianos a convertir: ");
        double dineroPesos = scanner.nextDouble();
        double tasaConversion = 3895;
        System.out.printf("la conversion a dolares de: " + dineroPesos  + " es: " + "%.2f%n",(dineroPesos/tasaConversion) );
        break;
        
        case 2: // Caso de Samuel J
        System.out.print("ingrese dinero en pesos colombianos a convertir: ");
        float dineroIngresado = scanner.nextFloat();
        float tasaConver = 3895;
        System.out.printf("la conversion a dolares de: " + dineroIngresado  + " es: " + "%.5f%n",(dineroIngresado/tasaConver) );
        break;
        
        default:
        System.out.printf("Opción no valida, ejecute nuevamente el programa" );    
        
       }
  
    }
    
}
