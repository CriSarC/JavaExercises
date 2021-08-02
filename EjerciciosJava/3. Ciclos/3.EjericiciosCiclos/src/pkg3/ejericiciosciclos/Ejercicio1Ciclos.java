
package pkg3.ejericiciosciclos;

/**
 *Muestra los números múltiplos de 8 de 
 *0 a 100 utilizando un bucle while.
 * @author crist
 */
public class Ejercicio1Ciclos {

    public static void main(String[] args) {
       int contador = 1;
        do{
           if(contador%8==0){
               System.out.println(contador);
               contador++;
           }
           contador++;
       }while(contador < 101);
    }
    
}
