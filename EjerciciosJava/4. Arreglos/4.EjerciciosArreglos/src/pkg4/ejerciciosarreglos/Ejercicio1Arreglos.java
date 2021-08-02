
package pkg4.ejerciciosarreglos;

/**
 *la siguiente clase resuelve este ejercicio:
 * Crear un arreglo de 10 caracteres con el nombre
 * caracteres y asigna valores a los elementos según 
 * la siguiente tabla:
     Posición  0   1   2   3   4   5   6   7   8   9
        Valor    ‘h' ‘z'                '@'      '  ' '+' ‘J'
 * @author crist
 */
public class Ejercicio1Arreglos {
    public static void main(String[] args) {
        char [] arreglo = new char [10];
        
        arreglo [0] = 'h';
        arreglo [1] = 'z';
        arreglo [5] = '@';
        arreglo [7] = ' ';        
        arreglo [8] = '+';
        arreglo [9] = 'J';
        
        for (int i=0; i<arreglo.length;i++){
            System.out.print(arreglo[i] + " ");
        }
    }
    
}
