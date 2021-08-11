/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.ejercicios_02;

/**
 *
 * @author crist
 */
public class Ejercicio2Ciclos {
    public static void main(String[] args) {
        char piramide = '*';
            int espacioIzquierda = 0;
            int espacioCentro = 0;
            int capa = 0;
            String guion = " ";
            String hueco = " ";
            StringBuffer buff = new StringBuffer();
            
            for (int base=0; base <10; base++ ){
               System.out.print("*");
           }
            System.out.println(" ");
           do{
                capa++;
                espacioIzquierda = ((capa));
                buff.delete(0, buff.length());
                for(int i=espacioIzquierda;i<3;i++){
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
           System.out.println("     "+"*");
           
    }
    }

