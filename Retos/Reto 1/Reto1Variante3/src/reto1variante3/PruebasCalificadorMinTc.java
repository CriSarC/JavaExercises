
package reto1variante3;

public class PruebasCalificadorMinTc {
    public static void main(String[] args) {
        /**
        * se instancia el objeto camion1
        */
       
       Autobus camion2 = new Autobus("Filomeno", 2, false);
       camion2.gestionarMarcha();
       camion2.gestionarMotor();
       camion2.recojerPasajero(2);
       camion2.gestionarMarcha();
       camion2.dejarPasajero();
       camion2.gestionarMarcha();
       camion2.recojerPasajero(2);
       camion2.recojerPasajero(3);
       camion2.recojerPasajero(6);
       camion2.moverIzquierda(3);
       /**
        * se muestran los atributos del objeto
        */
        System.out.println("nombreConductor: "+camion2.getNombreConductor());
        System.out.println("nPasajeros: "+camion2.getnPasajeros());
        System.out.println("cantidadDinero: "+camion2.getCantidadDinero());
        System.out.println("nMaximoPasajeros: "+camion2.getnMaximoPasajeros());
        System.out.println("localizacionX: "+camion2.getLocalizacionX());
        System.out.println("localizacionY: "+camion2.getLocalizacionY());
        System.out.println("puertaAbierta: "+camion2.isPuertaAbierta());
        System.out.println("aireAcondicionadoAcativado: "+camion2.isAireAcondicionadoActivado());
        System.out.println("motorEncendido: "+camion2.isMotorEncendido());
        System.out.println("wifiEncendido: "+camion2.isWifiEncendodo());
        System.out.println("enMarcha: "+camion2.isEnMarcha());
    }
    
}
