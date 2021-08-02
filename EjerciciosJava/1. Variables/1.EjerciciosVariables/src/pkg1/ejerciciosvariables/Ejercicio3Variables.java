/*
Escribe un programa que calcule el total de una factura a
partir de la base de la compra (precio sin IVA). La base de
la compra estará almacenada en una variable.

Salida en consola:

Base sin IVA:  $3500
IVA: $665
Total: $4165

 */
package pkg1.ejerciciosvariables;

import java.util.Scanner;

public class Ejercicio3Variables {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el precio total de la compra: ");
        float costoBase = scanner.nextFloat();
        int iva = 665;
        System.out.printf("Base sin IVA: " + "%.2f%n",(costoBase-iva));
        System.out.println("IVA: " + iva);
        System.out.println("Total: " + costoBase);
    }
}
