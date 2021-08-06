
package reto1variante3;

public class Reto1Variante3 {

   
    public static void main(String[] args) {
       /**
        * se instancia el objeto camion1
        */
       
       Autobus camion1 = new Autobus("Pepe", 30, false);
       /**
        * se muestran los atributos del objeto
        */
        System.out.println("nombreConductor: "+camion1.getNombreConductor());
        System.out.println("nPasajeros: "+camion1.getnPasajeros());
        System.out.println("cantidadDinero: "+camion1.getCantidadDinero());
        System.out.println("nMaximoPasajeros: "+camion1.getnMaximoPasajeros());
        System.out.println("localizacionX: "+camion1.getLocalizacionX());
        System.out.println("localizacionY: "+camion1.getLocalizacionY());
        System.out.println("puertaAbierta: "+camion1.isPuertaAbierta());
        System.out.println("aireAcondicionadoAcativado: "+camion1.isAireAcondicionadoActivado());
        System.out.println("motorEncendido: "+camion1.isMotorEncendido());
        System.out.println("wifiEncendido: "+camion1.isWifiEncendodo());
        System.out.println("enMarcha: "+camion1.isEnMarcha());
        /**
         * se intenta mover el autobus 5 km a la derecha
         */
        camion1.moverDerecha(5);
           /**
        * se muestran los atributos del objeto
        */
        System.out.println("nombreConductor: "+camion1.getNombreConductor());
        System.out.println("nPasajeros: "+camion1.getnPasajeros());
        System.out.println("cantidadDinero: "+camion1.getCantidadDinero());
        System.out.println("nMaximoPasajeros: "+camion1.getnMaximoPasajeros());
        System.out.println("localizacionX: "+camion1.getLocalizacionX());
        System.out.println("localizacionY: "+camion1.getLocalizacionY());
        System.out.println("puertaAbierta: "+camion1.isPuertaAbierta());
        System.out.println("aireAcondicionadoAcativado: "+camion1.isAireAcondicionadoActivado());
        System.out.println("motorEncendido: "+camion1.isMotorEncendido());
        System.out.println("wifiEncendido: "+camion1.isWifiEncendodo());
        System.out.println("enMarcha: "+camion1.isEnMarcha());
        /**
         * se intenta encender el Wifi, el aire acondicionado y poner
         * el autobus en marcha
         */
        camion1.gestionarWifi();
        camion1.gestionarAireAcondicionado();
        camion1.gestionarMarcha();
           /**
        * se muestran los atributos del objeto
        */
        System.out.println("nombreConductor: "+camion1.getNombreConductor());
        System.out.println("nPasajeros: "+camion1.getnPasajeros());
        System.out.println("cantidadDinero: "+camion1.getCantidadDinero());
        System.out.println("nMaximoPasajeros: "+camion1.getnMaximoPasajeros());
        System.out.println("localizacionX: "+camion1.getLocalizacionX());
        System.out.println("localizacionY: "+camion1.getLocalizacionY());
        System.out.println("puertaAbierta: "+camion1.isPuertaAbierta());
        System.out.println("aireAcondicionadoAcativado: "+camion1.isAireAcondicionadoActivado());
        System.out.println("motorEncendido: "+camion1.isMotorEncendido());
        System.out.println("wifiEncendido: "+camion1.isWifiEncendodo());
        System.out.println("enMarcha: "+camion1.isEnMarcha());
        /**
         * enciende el motor,pone el autobús en marcha y
         * mueve el autobús 5km a la derecha
         */
        camion1.gestionarMotor();
        camion1.gestionarMarcha();
        camion1.moverDerecha(5);
           /**
        * se muestran los atributos del objeto
        */
        System.out.println("nombreConductor: "+camion1.getNombreConductor());
        System.out.println("nPasajeros: "+camion1.getnPasajeros());
        System.out.println("cantidadDinero: "+camion1.getCantidadDinero());
        System.out.println("nMaximoPasajeros: "+camion1.getnMaximoPasajeros());
        System.out.println("localizacionX: "+camion1.getLocalizacionX());
        System.out.println("localizacionY: "+camion1.getLocalizacionY());
        System.out.println("puertaAbierta: "+camion1.isPuertaAbierta());
        System.out.println("aireAcondicionadoAcativado: "+camion1.isAireAcondicionadoActivado());
        System.out.println("motorEncendido: "+camion1.isMotorEncendido());
        System.out.println("wifiEncendido: "+camion1.isWifiEncendodo());
        System.out.println("enMarcha: "+camion1.isEnMarcha());
        /**
         * intenta recojer un pasajero de estrato 2
         * intenta abrir la puerta
         * mueve el autobus 10km hacia arriba
         */
        camion1.recojerPasajero(2);
        camion1.gestionarPuerta();
        camion1.moverArriba(10);
           /**
        * se muestran los atributos del objeto
        */
        System.out.println("nombreConductor: "+camion1.getNombreConductor());
        System.out.println("nPasajeros: "+camion1.getnPasajeros());
        System.out.println("cantidadDinero: "+camion1.getCantidadDinero());
        System.out.println("nMaximoPasajeros: "+camion1.getnMaximoPasajeros());
        System.out.println("localizacionX: "+camion1.getLocalizacionX());
        System.out.println("localizacionY: "+camion1.getLocalizacionY());
        System.out.println("puertaAbierta: "+camion1.isPuertaAbierta());
        System.out.println("aireAcondicionadoAcativado: "+camion1.isAireAcondicionadoActivado());
        System.out.println("motorEncendido: "+camion1.isMotorEncendido());
        System.out.println("wifiEncendido: "+camion1.isWifiEncendodo());
        System.out.println("enMarcha: "+camion1.isEnMarcha());
        /**
         * frena el autobús, abre la puerta y
         * recoje a 3 pasajeros de estratos
         * 1,4 y 6 respectivamente
         */
        camion1.gestionarMarcha();
        camion1.gestionarPuerta();
        camion1.recojerPasajero(1);
        camion1.recojerPasajero(4);
        camion1.recojerPasajero(6);
             /**
        * se muestran los atributos del objeto
        */
        System.out.println("nombreConductor: "+camion1.getNombreConductor());
        System.out.println("nPasajeros: "+camion1.getnPasajeros());
        System.out.println("cantidadDinero: "+camion1.getCantidadDinero());
        System.out.println("nMaximoPasajeros: "+camion1.getnMaximoPasajeros());
        System.out.println("localizacionX: "+camion1.getLocalizacionX());
        System.out.println("localizacionY: "+camion1.getLocalizacionY());
        System.out.println("puertaAbierta: "+camion1.isPuertaAbierta());
        System.out.println("aireAcondicionadoAcativado: "+camion1.isAireAcondicionadoActivado());
        System.out.println("motorEncendido: "+camion1.isMotorEncendido());
        System.out.println("wifiEncendido: "+camion1.isWifiEncendodo());
        System.out.println("enMarcha: "+camion1.isEnMarcha());
        /**
         * enciende el wifi, el aire acondicionado
         * intenta poner en marcha el autobús y lo intenta mover
         * 2 km a la izquierda
         */
        camion1.gestionarWifi();
        camion1.gestionarAireAcondicionado();
        camion1.gestionarMarcha();
        camion1.moverIzquierda(2);
             /**
        * se muestran los atributos del objeto
        */
        System.out.println("nombreConductor: "+camion1.getNombreConductor());
        System.out.println("nPasajeros: "+camion1.getnPasajeros());
        System.out.println("cantidadDinero: "+camion1.getCantidadDinero());
        System.out.println("nMaximoPasajeros: "+camion1.getnMaximoPasajeros());
        System.out.println("localizacionX: "+camion1.getLocalizacionX());
        System.out.println("localizacionY: "+camion1.getLocalizacionY());
        System.out.println("puertaAbierta: "+camion1.isPuertaAbierta());
        System.out.println("aireAcondicionadoAcativado: "+camion1.isAireAcondicionadoActivado());
        System.out.println("motorEncendido: "+camion1.isMotorEncendido());
        System.out.println("wifiEncendido: "+camion1.isWifiEncendodo());
        System.out.println("enMarcha: "+camion1.isEnMarcha());
        /**
         * deja un pasajero, apaga el motor y calcula que tan lejos 
         * esta el acopio
         */
        camion1.dejarPasajero();
        camion1.gestionarMotor();
        System.out.println("distancia acopio: "+camion1.calcularDistanciaAcopio());
              /**
        * se muestran los atributos del objeto
        */
        System.out.println("nombreConductor: "+camion1.getNombreConductor());
        System.out.println("nPasajeros: "+camion1.getnPasajeros());
        System.out.println("cantidadDinero: "+camion1.getCantidadDinero());
        System.out.println("nMaximoPasajeros: "+camion1.getnMaximoPasajeros());
        System.out.println("localizacionX: "+camion1.getLocalizacionX());
        System.out.println("localizacionY: "+camion1.getLocalizacionY());
        System.out.println("puertaAbierta: "+camion1.isPuertaAbierta());
        System.out.println("aireAcondicionadoAcativado: "+camion1.isAireAcondicionadoActivado());
        System.out.println("motorEncendido: "+camion1.isMotorEncendido());
        System.out.println("wifiEncendido: "+camion1.isWifiEncendodo());
        System.out.println("enMarcha: "+camion1.isEnMarcha());
        
    }
    
}
