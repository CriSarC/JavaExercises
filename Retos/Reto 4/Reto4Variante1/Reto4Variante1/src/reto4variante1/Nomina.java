
package reto4variante1;

//EL CALIFICADOR GENERARÁ ERROR SI USTED NO IMPLEMENTA TODOS LOS MÉTODOS ESPECIFICADOS EN EL ENUNCIADO
import java.util.ArrayList;
public class Nomina {

    private ArrayList<Trabajador> trabajadores;

    public Nomina() {
        this.trabajadores = new ArrayList<>();
    }
    
    public ArrayList<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(ArrayList<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }
    
    public void agregarTrabajador(Trabajador t){
        //for(Trabajador tr: this.trabajadores){
            if(!this.trabajadores.contains(t)){

               //poner con indice mejor para saber la posicion
          //  }else{
                 this.trabajadores.add(t);
            //}
        }
  
    }
    
    public void eliminarTrabajador(String ID){
        //falta hacer la busqueda
        Trabajador aux;
        for(int i = 0; i< this.trabajadores.size(); i++){
            aux = this.trabajadores.get(i);
            if(aux.getCC().equals(ID)){
               
                this.trabajadores.remove(i);
            //trabajadores.remove(ID);
            }
        }
    }
    
    public double calcularSalarioQuincenalNomina(){
        double quincenal = 0;
        for(Trabajador tr: trabajadores){
            
            quincenal += tr.salarioQuincenal();
        
        }
        return quincenal;
    }
    
    public double promedioEdadNomina(){
        double promedio = 1;
        double edades = 0;
        int cont = 0;
        
        for(Trabajador tr: trabajadores){
            edades += tr.calcularEdad();
            cont++;
        }
        promedio = edades/cont;
        return promedio;
    
    }
    
    public double desviacionEstandarEdadNomina(){
        double des = 0;
        double rest = 0;
        double cont = 0;
        for(Trabajador tr: trabajadores){
            rest += Math.pow(tr.calcularEdad()-promedioEdadNomina(),2);
            cont++;
        }
        des = Math.sqrt(rest/cont);
        return des;
    }
    
    public double salarioQuincenalTrabajador(String ID){
        double salario = 0;
        for(Trabajador tr: trabajadores){
            if(tr.getCC().equals(ID)){
                salario = tr.salarioQuincenal();
            }
        }
        
        return salario;
    }

}