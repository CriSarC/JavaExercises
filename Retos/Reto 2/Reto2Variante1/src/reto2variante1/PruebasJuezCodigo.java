/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2variante1;

/**
 *
 * @author crist
 */
public class PruebasJuezCodigo {
    public static void main(String[] args) {
        Enemigo e = new Enemigo("Virico",'f',1.0,1.0,120);
        
        Jugador j = new Jugador("er",'m',0,0,100);
        
        j.golpear(e);
        j.golpear(e);
        j.usarBotiquin();
        j.recogerBotiquin();
        j.recogerBotiquin();
        j.usarBotiquin();
        j.moverAbajo(2);
        e.golpear(j);
           /**
         * se muestran los atributos de los objetos 
         */
        System.out.println("nombre Jugador: "+j.getNombre());
        System.out.println("sexo Jugador: "+j.getSexo());
        System.out.println("posicionX Jugador: "+j.getPosicionX());
        System.out.println("posicionY Jugador: "+j.getPosicionY());
        System.out.println("damage Jugador: "+j.getDamage());
        System.out.println("vida Jugador: "+j.getVida());
        System.out.println("numeroBotiquines Jugador: "+j.getNumeroBotiquines());
        System.out.println(" ");
        
        System.out.println("nombre Enemigo: "+e.getNombre());
        System.out.println("sexo Enemigo: "+e.getSexo());
        System.out.println("posicionX Enemigo: "+e.getPosicionX());
        System.out.println("posicionY Enemigo: "+e.getPosicionY());
        System.out.println("damage Enemigo: "+e.getDamage());
        System.out.println("vida Enemigo: "+e.getVida());
        System.out.println("evolucionesAplicadas Enemigo: "+e.getEvolucionesAplicadas());
        System.out.println("resistencia Enemigo: "+e.getResistencia());
        System.out.println(" ");
    }
}
