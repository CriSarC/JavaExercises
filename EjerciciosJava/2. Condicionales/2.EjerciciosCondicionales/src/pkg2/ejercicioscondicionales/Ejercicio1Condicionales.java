/*
Escribe un programa en que dado un número
del 1 a 7 escriba el correspondiente nombre del
día de la semana y lo muestre por consola
 */
package pkg2.ejercicioscondicionales;

import java.util.Scanner;

public class Ejercicio1Condicionales {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escoja la solución: ");
        System.out.println("1 - Chalo Gonzalo ");
        System.out.println("2 - Samuel J");
        int solucionUsuario = scanner.nextInt();
        
        switch (solucionUsuario){
           
        case 1: // Caso de Chalo Gonzalo
            System.out.print("Ingrese un número de un día de la sumana: ");
            int diaSemana = scanner.nextInt();
            if(diaSemana == 1){
                System.out.println("Lunes");
            }
            else if(diaSemana == 2){
                System.out.println("Martes");
            }
            else if(diaSemana == 3){
                System.out.println("Miercoles");
            }
            else if(diaSemana == 4){
                System.out.println("Jueves");
            }
            else if(diaSemana == 5){
                System.out.println("Viernes");
            }
            else if(diaSemana == 6){
                System.out.println("Sabado");
            }
            else if(diaSemana == 7){
                System.out.println("Domingo");
            }
            else{
                System.out.println("el número no corresponde a ningun día");
            }
        break;
        case 2: // Caso de Samuel J
            System.out.print("Ingrese un número de un día de la sumana: ");
            int dia= scanner.nextInt();
            switch (dia){

            case 1:
                System.out.println("Lunes");
                break;
            case 2: 
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.printf("el número no corresponde a ningun día" );
                break;
            }
        break;
        
        default:
        System.out.printf("Opción no valida, ejecute nuevamente el programa" );    
        }
        
        
        
        
    }
    
}
