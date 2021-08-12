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
public class Jugador extends Personaje {
    private int numeroBotiquines = 0;
    

    public Jugador(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        super(nombre, sexo, posicionX, posicionY, damage);
    }
/**
 * aquí el juez de codigo considera que el jugador
 * deberia gastar mas botiquines asi tenga la vida llena
 * yo soy mas benevolente con el jugador y no lo dejo
 * gastar botiquin si ya esta totalmente sano
 * con el codigo comentado en el if de abajo
 */
    public void usarBotiquin(){
        if(numeroBotiquines>0 /**&& getVida()<100*/){
            numeroBotiquines--;
            setVida(getVida()+5);
            if (getVida()>100){
                setVida(100);
            }
        }
    }
    
    public void recogerBotiquin(){
        numeroBotiquines++;
    }
    
    public void moverDerecha(double d){
        setPosicionX(getPosicionX()+d);

    }
    
    public void moverIzquierda(double d){
        setPosicionX(getPosicionX()-d);
        if(getPosicionX()<0){
            setPosicionX(0);
        }
    }
    
    public void moverArriba(double d){
        setPosicionY(getPosicionY()+d);
    }
    public void moverAbajo(double d){
        setPosicionY(getPosicionY()-d);
        if(getPosicionY()<0){
            setPosicionY(0);
        }
    }
    
    public void golpear(Enemigo p){
        double dannoHecho = damage/calcularDistanciaRespectoPersonaje(p);
        if (p.getVida()>0){
            p.recibirImpacto(dannoHecho);
          if (p.getVida()<0){
               p.setVida(0);
           }
        }
        p.evolucionar();
    }
    
    public int getNumeroBotiquines() {
        return numeroBotiquines;
    }

    public void setNumeroBotiquines(int numeroBotiquines) {
        this.numeroBotiquines = numeroBotiquines;
    }
    
}
