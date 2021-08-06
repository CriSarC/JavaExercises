
package reto1variante2;

/**
 *Para la configuración de la SIMCard, se buscará hacer un prototipo inicial, que
buscará simular su funcionamiento en un entorno de consola, para ello se ha
decidido realizar la implementación en Java.
Usted ha sido contratado como Java Expert Developer, porque ha logrado
demostrar habilidades de desarrollo en este lenguaje de programación y se le
ha concedido implementar una clase llamada SIMCard.
La empresa hace las siguientes observaciones sobre el funcionamiento de este
prototipo:
1. Si el celular está apagado o en modo avión, no se pueden realizar
llamadas, ni consumir datos.
2. Si los datos están apagados no se puede consumir datos.
3. Si el celular se pone en modo avión y los datos están encendidos, se
apagan, y si se intentan activar teniendo el modo avión activado, NO se
activarán.
4. Si el celular está apagado, los datos y el modo avión estarán desactivados.
5. El cobro de los datos se hará en la unidad de medida Gigabytes (GB), y los
precios son los siguientes:
a. Si el cliente compra 10 GB o menos, se cobran a 3000 pesos cada
GB.
b. Si el cliente compra entre 10 GB a 30 GB, las primeras 10GB se
cobran a 3000 pesos cada GB, y las demás a 2500 pesos cada una.
c. Si el cliente compra más de 30 GB, las primeras 20GB se cobran a
3000 pesos cada GB, y las demás a 1500 pesos cada una.
6. El cobro de los datos se hará en la unidad de medida Segundos, y los
precios son los siguientes:
a. Si la llamada dura 60 segundos o menos, se cobra cada segundo a
1 peso.
b. Si la llamada dura más de 60 segundos, se cobran los primeros 60
segundos a 1 peso, y los demás a medio peso.
 * @author crist
 */
public class SIMCard {
    private String empresaTelefonia = "HI";
    private double saldo = 0;
    private String numeroTelefono;
    private boolean celularApagado = true;
    private boolean modoAvionActivado = false;
    private boolean datosActivados = false;
    private int saldoDatos = 0;
    
    public SIMCard(String numeroTelefono){
        this.numeroTelefono = numeroTelefono;
    }
    
    public void comprarDatos(int c){
        int costo = 1;
        if(c<10){
            costo = c*3000;
        }
        else if(10<c && c<30){
            costo = (10*3000)+((c-10)*2500);
        }
        else if(c>30){
            costo = (20*3000)+((c-20)*1500);
        }
        if(costo<saldo){
        saldo -= costo;
        saldoDatos += c;
        }
       }
    
    public void consumirDatos(int c){
        if(saldoDatos>c && celularApagado==false){
            saldoDatos -= c;
        }
    }
    
    public void llamar(int s){
        double costoS = 1;
        if(s<=60){
            costoS = s*1;
        }

        else if(s>60){
            costoS = (60*1)+((s-60)*(1/2));
        }
         if(celularApagado==false && modoAvionActivado==false && saldo>costoS){
            saldo -= costoS;
        }
    }
    
    public void recargarSaldo(double s){
        saldo += s;
    }
    
    public void gestionarEncendidoCelular(){
        if(celularApagado==true){
            celularApagado = false;
        }
        else{
            celularApagado = true;
            datosActivados = false;
            modoAvionActivado = false;
        }
    }
    
    public void gestionarModoAvion(){
         if(celularApagado==false){
            if(modoAvionActivado==false){
                modoAvionActivado = true;
            }
            else{
                modoAvionActivado = false;
                datosActivados = false;
                
            }
        }
    }
    
    public void gestionarDatos(){
        if(celularApagado==false && modoAvionActivado==false){
            if(datosActivados==false){
                datosActivados = true;
            }
            else{
                datosActivados = false;
            }
        }
    }

    public String getEmpresaTelefonia() {
        return empresaTelefonia;
    }

    public void setEmpresaTelefonia(String empresaTelefonia) {
        this.empresaTelefonia = empresaTelefonia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public boolean isCelularApagado() {
        return celularApagado;
    }

    public void setCelularApagado(boolean celularApagado) {
        this.celularApagado = celularApagado;
    }

    public boolean isModoAvionActivado() {
        return modoAvionActivado;
    }

    public void setModoAvionActivado(boolean modoAvionActivado) {
        this.modoAvionActivado = modoAvionActivado;
    }

    public boolean isDatosActivados() {
        return datosActivados;
    }

    public void setDatosActivados(boolean datosActivados) {
        this.datosActivados = datosActivados;
    }

    public int getSaldoDatos() {
        return saldoDatos;
    }

    public void setSaldoDatos(int saldoDatos) {
        this.saldoDatos = saldoDatos;
    }
    
    
}
