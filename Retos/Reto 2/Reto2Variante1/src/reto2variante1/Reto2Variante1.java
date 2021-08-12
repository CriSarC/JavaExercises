
package reto2variante1;

public class Reto2Variante1 {

  
    public static void main(String[] args) {
        /**
         * se instancian jugador y enemigo
         */
        Jugador j = new Jugador("Eplorador", 'm',0,5,100);
        Enemigo e = new Enemigo("Bitter", 'f',0,0,80);
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
        /**
         * el jugador golpea al enememigo 2 veces, 
         * se mueve 10 metros a la derecha, y 5 hacia abajo
         */
        j.golpear(e);
        j.golpear(e);
        j.moverDerecha(10);
        j.moverAbajo(5);
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
        /**
         * el enemigo golpea al jugador 2 veces,
         * el jugador recoge un botiquin
         */
        e.golpear(j);
        e.golpear(j);
        j.recogerBotiquin();
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
        /**
         * el jugador usa dos veces botiquin y
         * golpea 3 veces al enemigo
         */
        j.usarBotiquin();
        j.usarBotiquin();
        j.golpear(e);
        j.golpear(e);
        j.golpear(e);
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
        /**
         * el enemigo golpea dos veces al jugador
         */
        e.golpear(j);
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
        /**
         * el jugador golpea dos veces al enemigo
         */
        j.golpear(e);
        j.golpear(e);
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
        /**
         * el jugador golpea 3 veces al enemigo
         */
        j.golpear(e);
        j.golpear(e);
        j.golpear(e);
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
