
package reto1variante2;

/**
 *
 * @author crist
 */
public class Reto1Variante2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * se instancia el objeto cliente
         */
        SIMCard cliente = new SIMCard("3015308969");
        /**
         * se muestran los datos del cliente
         */
        System.out.println("empresaTelefonica: " +cliente.getEmpresaTelefonia());
        System.out.println("saldo: "+cliente.getSaldo());
        System.out.println("numeroTelefonico: "+cliente.getNumeroTelefono());
        System.out.println("celularApagado: "+cliente.isCelularApagado());
        System.out.println("modoAvionActivado: "+cliente.isModoAvionActivado());
        System.out.println("datosActicados: "+cliente.isDatosActivados());
        System.out.println("saldoDatos: "+cliente.getSaldoDatos());
        /**
         * se recargan 50 000 pesos
         */
        cliente.recargarSaldo(50000);
        /**
         * se muestran los datos del cliente
         */
        System.out.println("empresaTelefonica: " +cliente.getEmpresaTelefonia());
        System.out.println("saldo: "+cliente.getSaldo());
        System.out.println("numeroTelefonico: "+cliente.getNumeroTelefono());
        System.out.println("celularApagado: "+cliente.isCelularApagado());
        System.out.println("modoAvionActivado: "+cliente.isModoAvionActivado());
        System.out.println("datosActicados: "+cliente.isDatosActivados());
        System.out.println("saldoDatos: "+cliente.getSaldoDatos());
        /**
         * se compran 12 GB de datos
         */
        cliente.comprarDatos(12);
        /**
         * se muestran los datos del cliente
         */
        System.out.println("empresaTelefonica: " +cliente.getEmpresaTelefonia());
        System.out.println("saldo: "+cliente.getSaldo());
        System.out.println("numeroTelefonico: "+cliente.getNumeroTelefono());
        System.out.println("celularApagado: "+cliente.isCelularApagado());
        System.out.println("modoAvionActivado: "+cliente.isModoAvionActivado());
        System.out.println("datosActicados: "+cliente.isDatosActivados());
        System.out.println("saldoDatos: "+cliente.getSaldoDatos());
        /**
         * el calificador intenta usar 3GB de plan de datos
         */
        cliente.consumirDatos(3);
        /**
         * se muestran los datos del cliente
         */
        System.out.println("empresaTelefonica: " +cliente.getEmpresaTelefonia());
        System.out.println("saldo: "+cliente.getSaldo());
        System.out.println("numeroTelefonico: "+cliente.getNumeroTelefono());
        System.out.println("celularApagado: "+cliente.isCelularApagado());
        System.out.println("modoAvionActivado: "+cliente.isModoAvionActivado());
        System.out.println("datosActicados: "+cliente.isDatosActivados());
        System.out.println("saldoDatos: "+cliente.getSaldoDatos());
        /**
         * se enciende el celular y se hace una llamada de 125 segundos
         */
        cliente.gestionarEncendidoCelular();
        cliente.llamar(120);
        /**
         * se muestran los datos del cliente
         */
        System.out.println("empresaTelefonica: " +cliente.getEmpresaTelefonia());
        System.out.println("saldo: "+cliente.getSaldo());
        System.out.println("numeroTelefonico: "+cliente.getNumeroTelefono());
        System.out.println("celularApagado: "+cliente.isCelularApagado());
        System.out.println("modoAvionActivado: "+cliente.isModoAvionActivado());
        System.out.println("datosActicados: "+cliente.isDatosActivados());
        System.out.println("saldoDatos: "+cliente.getSaldoDatos());
        /**
         * se enciende el modo avión y enciende los datos
         */
        cliente.gestionarModoAvion();
        cliente.gestionarDatos();
        /**
         * se muestran los datos del cliente
         */
        System.out.println("empresaTelefonica: " +cliente.getEmpresaTelefonia());
        System.out.println("saldo: "+cliente.getSaldo());
        System.out.println("numeroTelefonico: "+cliente.getNumeroTelefono());
        System.out.println("celularApagado: "+cliente.isCelularApagado());
        System.out.println("modoAvionActivado: "+cliente.isModoAvionActivado());
        System.out.println("datosActicados: "+cliente.isDatosActivados());
        System.out.println("saldoDatos: "+cliente.getSaldoDatos());
        /**
         * apaga el modo avion y enciende datos moviles
         */
        cliente.gestionarModoAvion();
        cliente.gestionarDatos();
        /**
         * se muestran los datos del cliente
         */
        System.out.println("empresaTelefonica: " +cliente.getEmpresaTelefonia());
        System.out.println("saldo: "+cliente.getSaldo());
        System.out.println("numeroTelefonico: "+cliente.getNumeroTelefono());
        System.out.println("celularApagado: "+cliente.isCelularApagado());
        System.out.println("modoAvionActivado: "+cliente.isModoAvionActivado());
        System.out.println("datosActicados: "+cliente.isDatosActivados());
        System.out.println("saldoDatos: "+cliente.getSaldoDatos());
        /**
         * consume 3 GB
         */
        cliente.consumirDatos(3);
        /**
         * se muestran los datos del cliente
         */
        System.out.println("empresaTelefonica: " +cliente.getEmpresaTelefonia());
        System.out.println("saldo: "+cliente.getSaldo());
        System.out.println("numeroTelefonico: "+cliente.getNumeroTelefono());
        System.out.println("celularApagado: "+cliente.isCelularApagado());
        System.out.println("modoAvionActivado: "+cliente.isModoAvionActivado());
        System.out.println("datosActicados: "+cliente.isDatosActivados());
        System.out.println("saldoDatos: "+cliente.getSaldoDatos());
        /**
         * se apaga el celular
         */
        cliente.gestionarEncendidoCelular();
        /**
         * se muestran los datos del cliente
         */
        System.out.println("empresaTelefonica: " +cliente.getEmpresaTelefonia());
        System.out.println("saldo: "+cliente.getSaldo());
        System.out.println("numeroTelefonico: "+cliente.getNumeroTelefono());
        System.out.println("celularApagado: "+cliente.isCelularApagado());
        System.out.println("modoAvionActivado: "+cliente.isModoAvionActivado());
        System.out.println("datosActicados: "+cliente.isDatosActivados());
        System.out.println("saldoDatos: "+cliente.getSaldoDatos());
    }
    
}
