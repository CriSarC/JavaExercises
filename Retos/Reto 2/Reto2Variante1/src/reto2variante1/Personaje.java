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
public class Personaje {
    private String nombre;
    private char sexo;
    private double posicionX;
    private double posicionY;
    double damage;
    private double vida = 100;

    public Personaje(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.damage = damage;
    }

    public void golpear(Personaje p){
        
        double dannoHecho = damage/calcularDistanciaRespectoPersonaje(p);
         if(p.vida>0){
                p.recibirImpacto(dannoHecho);
         if(p.vida<0){
              p.vida = 0;
           }
      }
    }
    
    public void recibirImpacto(double d){
      
            vida -= d;
          
    }
    
    public double calcularDistanciaRespectoPersonaje(Personaje p){
        double d = Math.sqrt((Math.pow((p.posicionX-posicionX),2)+Math.pow((p.posicionY-posicionY),2)));
        return d;
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

    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }
    
    
    
}
