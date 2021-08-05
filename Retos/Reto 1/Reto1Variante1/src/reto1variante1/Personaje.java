
package reto1variante1;

/**
 *La empresa desea que la etapa inicial del personaje principal haga las siguientes
acciones:
1. Moverse libremente a través del mapa, es decir, que el personaje pueda
subir, bajar, ir a la derecha, ir a la izquierda, la unidad de medida será en
pixeles (El personaje no podrá moverse en trayectorias diagonales, solo
de manera horizontal y vertical).
2. Recoger botiquines y usarlos cuando se le esté acabando la vida, ya que
el juego contempla luchas con poderosos enemigos, y para evitar que el
personaje muera precipitadamente, podrá hacer uso de botiquines (Las
luchas no están contempladas en la etapa inicial del juego).
3. Calcular la distancia recorrida con respecto al origen de coordenadas: Le
permitirá dar a conocer al jugador qué tan lejano se encuentra de la casa,
esto es debido a que, para poder guardar la partida, es necesario entrar
en ella.
 * @author crist
 */
public class Personaje {
   private String nombre;
   private char sexo;
   private double posicionX = 0; 
   private double posicionY = 0;
   private double distanciaTotal = 0;
   private int numeroBotiquines = 0; 
   private double vida = 100;
   

    public Personaje(String nombre, char sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }
   
 public void usarBotiquin(){
     if (numeroBotiquines > 0){
         numeroBotiquines--;
         vida = vida +5;
     }
 }
 
 public void recojerBotiquin(){
     numeroBotiquines++;
 }
 
 public void moverDerecha(double d){
     posicionX = posicionX + d;
     distanciaTotal = distanciaTotal + d;
 }
 
 public void moverIzquierda(double d){
     posicionX = posicionX - d;
     distanciaTotal = distanciaTotal + d;
 }
 
 public void moverArriba(double d){
     posicionY = posicionY + d;
     distanciaTotal = distanciaTotal + d;
 }
 
 public void moverAbajo(double d){
     posicionY = posicionY -d;
     distanciaTotal = distanciaTotal + d;
 }
 
 public double calcularDistanciaRespectoOrigen(){
     double distancia = Math.sqrt(((Math.pow(posicionX, 2))+(Math.pow(posicionY,2))));
     return distancia;
 }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }

    public double getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(double posciionY) {
        this.posicionY = posciionY;
    }

    public double getDistanciaTotal() {
        return distanciaTotal;
    }

    public void setDistanciaTotal(double distanciaTotal) {
        this.distanciaTotal = distanciaTotal;
    }

    public int getNumeroBotiquines() {
        return numeroBotiquines;
    }

    public void setNumeroBotiquines(int numeroBotiquines) {
        this.numeroBotiquines = numeroBotiquines;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }
 
}
