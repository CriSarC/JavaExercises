
package pkg5.ejercicios_02;

/**
 *Crear un programa que imprima por consola una pirámide hueca 
 * (solo mostrara el contorno, el cual estará hecha con asteriscos). 
 * Tener en cuenta que la base esta formada por 9 asteriscos

        *
      *   *
    *       *
  *           *
* * * * * * * * *

 * @author crist
 */
public class Ejercicio1Ciclos {

    public static void main(String[] args) {
      
            char piramide = '*';
            int espacioIzquierda = 0;
            int espacioCentro = 0;
            int capa = 0;
            String guion = " ";
            String hueco = " ";
            StringBuffer buff = new StringBuffer();
            System.out.println("     "+"*");
           do{
                capa++;
                espacioIzquierda = ((3*2) - (capa*2));
                buff.delete(0, buff.length());
                for(int i=espacioIzquierda;i>0;i--){
                    buff.append(guion);
                }
                System.out.print(buff);
                
                for(int ramaIzquierda=1;ramaIzquierda<(2);ramaIzquierda++){
                    System.out.print(String.format("%-2s", '*'));
                }
                
                espacioCentro = (capa-1)*4;
                buff.delete(0, buff.length());
                for(int i=espacioCentro;i>0;i--){
                    buff.append(guion);
                }
                System.out.print(buff);
                
                for(int ramaDerecha=1;ramaDerecha<2;ramaDerecha++){
                    System.out.print(String.format("%-2s",'*'));
                }
                System.out.println(" ");
           }while(capa<3);
           
           for (int base=0; base <10; base++ ){
               System.out.print("*");
           }
    }
    
}
