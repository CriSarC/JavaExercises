
package reto3variante1;


public class BotonPrueba extends Boton {

    public BotonPrueba(double ancho, double alto, String colorFondo, String colorTexto, String texto) {
        super(ancho, alto, colorFondo, colorTexto, texto);
    }

    @Override
    public void hacerClick( ) {
         setTexto("Hello World!");
    }
    
}
