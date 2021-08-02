/*
Realiza un conversor de pesos a dolar. La cantidad en pesos
que se quiere convertir deberá estar almacenada en una variable.
El valor de un dolar es: $3.895 pesos
 */
package pkg1.ejerciciosvariables;

import java.util.Scanner;

public class Ejercicio2Variables {
    public static void main(String[] args) {
        System.out.print("ingrese dinero en pesos colombianos a conveertir: ");
        Scanner scanner = new Scanner(System.in);
        double dineroPesos = scanner.nextInt();
        double tasaConversion = 3895;
        System.out.printf("la conversion a dolares de: " + dineroPesos  + " es: " + "%.2f%n",(dineroPesos/tasaConversion) );
    }
    
}
