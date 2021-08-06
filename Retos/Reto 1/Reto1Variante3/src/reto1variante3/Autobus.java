
package reto1variante3;

/**
 *La ciudad dotará a los autobuses de aire acondicionado y Wifi para sus
pasajeros, además de que aumentará la seguridad de los pasajeros en cuanto a
los siguientes aspectos:
• El conductor no podrá recoger ni dejar bajar un pasajero si el autobús
está en marcha.
• El autobús no podrá avanzar hasta que el conductor cierre la puerta
después de recoger un pasajero.
También se agregará una tecnología que regule el número de pasajeros
(Dependiendo si hay o no medidas restrictivas de movilidad por el Covid – 19),
por lo que, si el autobús está completamente lleno, el conductor solo podrá abrir
la puerta para dejar bajar uno o más pasajeros, y además de que el sistema
cobrará el precio del pasaje dependiendo del estrato socioeconómico del
pasajero.
Esta tecnología de administración se desarrollará en Java.
Usted ha sido contratado como Java Expert Developer, porque ha logrado
demostrar habilidades de desarrollo en este lenguaje de programación y se le
ha concedido implementar la clase correspondiente al autobús.
La empresa a cargo de esta implementación le da las siguientes observaciones
sobre el funcionamiento del autobús y el sistema de seguridad:
1. El Wifi y el aire acondicionado estarán apagados siempre que el motor
esté apagado.
2. La puerta del autobús debe permanecer cerrada siempre que esté en
marcha.
3. Para poder que una persona se baje, la puerta debe estar abierta, y en
consecuencia el autobús no puede estar en marcha.
4. Para poder que una persona se suba, la puerta debe estar abierta, y en
consecuencia el autobús no puede estar en marcha.
5. Para poder que el autobús esté en marcha, el motor deberá estar
encendido (Pero si el motor está encendido no necesariamente debe
estar en marcha).
6. Las tarifas son las siguientes:
a. Para estratos 0, 1 y 2, el pasaje se cobra a 1500 pesos colombianos.
b. Para estratos 3 y 4, el pasaje se cobra a 2600 pesos.
c. Para estratos 5 y 6, el pasaje se cobra a 3000 pesos.
7. El conductor podrá saber a qué distancia (En kilómetros) se encuentra del
acopio, gracias a este gestor.
 * @author crist
 */
public class Autobus {
    private String nombreConductor;
    private int nPasajeros = 0;
    private double cantidadDinero = 0;
    private int nMaximoPasajeros;
    private double localizacionX = 0;
    private double localizacionY = 0;
    private boolean puertaAbierta;
    private boolean  aireAcondicionadoActivado = false;
    private boolean motorEncendido = false;
    private boolean wifiEncendido = false;
    private boolean enMarcha = false;
    
    public Autobus(String nombreConductor,int nMaximoPasajeros, boolean puertaAbierta){
        this.nombreConductor = nombreConductor;
        this.nMaximoPasajeros = nMaximoPasajeros;
        this.puertaAbierta = puertaAbierta;
    }
    
    public void recojerPasajero(int estrato){
        
       if(puertaAbierta==true && (nMaximoPasajeros-nPasajeros)>0){
         int costoP = 0;
        if(estrato==1 || estrato==1 || estrato==2){
            costoP = 1500;
        }
        else if(estrato==3 || estrato==4){
            costoP = 2600;
        }
        else if(estrato==5 || estrato==6){
            costoP = 3000;
        }
        cantidadDinero += costoP;
        nPasajeros++;
        
    }
    }
    
    public void dejarPasajero(){
        if(puertaAbierta==true){
           nPasajeros--;    
        }
    }
    public double calcularDistanciaAcopio(){
        return Math.sqrt((Math.pow(localizacionX,2)+Math.pow(localizacionY,2)));
    }
    public void gestionarPuerta(){
        if(enMarcha==false && puertaAbierta==false){
            puertaAbierta = true;
        }
        else if(enMarcha==false && puertaAbierta==true){
            puertaAbierta = false;
        }  
    }
    public void gestionarAireAcondicionado(){
        if(motorEncendido==true && aireAcondicionadoActivado==false){
            aireAcondicionadoActivado = true;
        }else if(motorEncendido==true && aireAcondicionadoActivado==true){
            aireAcondicionadoActivado =false;
        }
    }
    public void gestionarMotor(){
        if(motorEncendido==false){
            motorEncendido = true;
        }
        else if(motorEncendido==true){
            motorEncendido = false;
            aireAcondicionadoActivado = false;
            wifiEncendido = false;
        }
    }
    public void gestionarWifi(){
         if(motorEncendido==true && wifiEncendido==false){
            wifiEncendido = true;
        }
        else if(motorEncendido==true && wifiEncendido==true){
            wifiEncendido =false;
        }
    }
    public void gestionarMarcha(){
         if(motorEncendido==true && puertaAbierta==false && enMarcha==false){
            enMarcha = true;
        }else if(motorEncendido==true && enMarcha==true){
            enMarcha =false;
        }
    }
    public void moverDerecha(double d){
         if(enMarcha==true){
            localizacionX+=d;
         }       
    }
    public void moverIzquierda(double d){
        if(enMarcha==true){
            localizacionX-=d;
         }
    }
    public void moverArriba(double d){
        if(enMarcha==true){
            localizacionY+=d;
         }
    }
    public void moverAbajo(double d){
        if(enMarcha==true){
            localizacionY-=d;
         }
    }
    
    public String getNombreConductor(){
        return nombreConductor;
    }
    public void setNombreConductor(String nombreConductor){
        this.nombreConductor= nombreConductor;
    }
    public int getnPasajeros() {
        return nPasajeros;
    }
    public void setnPasajeros(int nPasajeros){
        this.nPasajeros = nPasajeros;
    }
    public double getCantidadDinero(){
        return cantidadDinero;
    }
    public void setCantidadDinero(double cantidadDinero){
        this.cantidadDinero = cantidadDinero;
    }
    public int getnMaximoPasajeros(){
        return nMaximoPasajeros;
    }
    public void setnMaximoPasajeros(int nMaximoPasajeros){
        this.nMaximoPasajeros = nMaximoPasajeros;
    }
    public double getLocalizacionX(){
       return localizacionX;
    }
    public void setLocalizacionX(double localizacionX){
        this.localizacionX = localizacionX;
    }
    public double getLocalizacionY(){
        return localizacionY;
    }
    public void setLocalizacionY(double localizacionY){
        this.localizacionY = localizacionY;
    }
    public boolean isPuertaAbierta(){
        return puertaAbierta;
    }
    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }
    public boolean isAireAcondicionadoActivado() {
        return aireAcondicionadoActivado;
    }
    public void setAireAcondicionadoActivado(boolean aireAcondicionadoActivado) {
        this.aireAcondicionadoActivado = aireAcondicionadoActivado;
    }
    public boolean isMotorEncendido(){
        return motorEncendido;
    }
    public void setMotorEncendido(boolean motorEncendido){
        this.motorEncendido = motorEncendido;
    }
    public boolean isWifiEncendodo(){
        return wifiEncendido;
    }
    public void setWifiEncendido(boolean wifiEncendido){
        this.wifiEncendido = wifiEncendido;
    }
    public boolean isEnMarcha(){
            return enMarcha;
    }
    public void setEnMarcha(boolean enMarcha){
        this.enMarcha = enMarcha;
    }
}