
package reto1variante1;

/**
 *
 * @author crist
 */
public class Reto1Variante1 {

    public static void main(String[] args) {
        /**
         * Creación del personaje usando la clase Personaje
         */
        Personaje explorer = new Personaje("Explorador",'m');
        /**
         * se mueve el personaje 
         */
        explorer.moverDerecha(2);
        /**
         * muestra del estado actual del Personaje por consola
         */
        System.out.println("nombre: "+ explorer.getNombre());
        System.out.println("sexo: "+ explorer.getSexo());
        System.out.println("posicionX: "+ explorer.getPosicionX());
        System.out.println("PosicionY: "+ explorer.getPosicionY());
        System.out.println("distanciaTotal: "+ explorer.getDistanciaTotal());
        System.out.println("numeroBotiquines: "+ explorer.getNumeroBotiquines());
        System.out.println("vida: "+ explorer.getVida());
          /**
         * se mueve el personaje 
         */
        explorer.moverAbajo(5);
        /**
         * muestra del estado actual del Personaje por consola
         */
        System.out.println("nombre: "+ explorer.getNombre());
        System.out.println("sexo: "+ explorer.getSexo());
        System.out.println("posicionX: "+ explorer.getPosicionX());
        System.out.println("PosicionY: "+ explorer.getPosicionY());
        System.out.println("distanciaTotal: "+ explorer.getDistanciaTotal());
        System.out.println("numeroBotiquines: "+ explorer.getNumeroBotiquines());
        System.out.println("vida: "+ explorer.getVida());
          /**
         * se mueve el personaje 
         */
        explorer.moverIzquierda(1);
        /**
         * muestra del estado actual del Personaje por consola
         */
        System.out.println("nombre: "+ explorer.getNombre());
        System.out.println("sexo: "+ explorer.getSexo());
        System.out.println("posicionX: "+ explorer.getPosicionX());
        System.out.println("PosicionY: "+ explorer.getPosicionY());
        System.out.println("distanciaTotal: "+ explorer.getDistanciaTotal());
        System.out.println("numeroBotiquines: "+ explorer.getNumeroBotiquines());
        System.out.println("vida: "+ explorer.getVida());
        /**
         * mostrar la distancia total con respecto al origen de coordenadas
         */
        System.out.println(explorer.calcularDistanciaRespectoOrigen());
        /**
         * se le infringe daño al personaje
         */
        explorer.setVida(explorer.getVida()-40);
        System.out.println(explorer.getVida());
        /**
         * muestra del estado actual del Personaje por consola
         */
        System.out.println("nombre: "+ explorer.getNombre());
        System.out.println("sexo: "+ explorer.getSexo());
        System.out.println("posicionX: "+ explorer.getPosicionX());
        System.out.println("PosicionY: "+ explorer.getPosicionY());
        System.out.println("distanciaTotal: "+ explorer.getDistanciaTotal());
        System.out.println("numeroBotiquines: "+ explorer.getNumeroBotiquines());
        System.out.println("vida: "+ explorer.getVida());
        /**
         * se recojen 3 botiquines
         */
        explorer.recojerBotiquin();
        explorer.recojerBotiquin();
        explorer.recojerBotiquin();
        /**
         * muestra del estado actual del Personaje por consola
         */
        System.out.println("nombre: "+ explorer.getNombre());
        System.out.println("sexo: "+ explorer.getSexo());
        System.out.println("posicionX: "+ explorer.getPosicionX());
        System.out.println("PosicionY: "+ explorer.getPosicionY());
        System.out.println("distanciaTotal: "+ explorer.getDistanciaTotal());
        System.out.println("numeroBotiquines: "+ explorer.getNumeroBotiquines());
        System.out.println("vida: "+ explorer.getVida());
        /**
         * se usan dos botiquines
         */
        explorer.usarBotiquin();
        explorer.usarBotiquin();
         /**
         * muestra del estado actual del Personaje por consola
         */
        System.out.println("nombre: "+ explorer.getNombre());
        System.out.println("sexo: "+ explorer.getSexo());
        System.out.println("posicionX: "+ explorer.getPosicionX());
        System.out.println("PosicionY: "+ explorer.getPosicionY());
        System.out.println("distanciaTotal: "+ explorer.getDistanciaTotal());
        System.out.println("numeroBotiquines: "+ explorer.getNumeroBotiquines());
        System.out.println("vida: "+ explorer.getVida());
    }
    
}
