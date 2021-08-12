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
public class Enemigo extends Personaje{
    private int evolucionesAplicadas = 0;
    private int resistencia = 1;

    public Enemigo(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        super(nombre, sexo, posicionX, posicionY, damage);
    }
    
    public void evolucionar(){
        if(getVida() <=30 && evolucionesAplicadas==0){
            damage +=20;
            evolucionesAplicadas++;
        }
        if (getVida() <=10 && evolucionesAplicadas==1){
            evolucionesAplicadas++;
            resistencia++;
        }
    }
    
    @Override
    public void recibirImpacto(double d){
         
        setVida(getVida()-(d/resistencia));
        
    }
    
    public int getEvolucionesAplicadas() {
        return evolucionesAplicadas;
    }

    public void setEvolucionesAplicadas(int evolucionesAplicadas) {
        this.evolucionesAplicadas = evolucionesAplicadas;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
    
    
}
