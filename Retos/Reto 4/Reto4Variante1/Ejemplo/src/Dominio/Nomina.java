
package Dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

//clase es un sustantivo
public class Nomina {
    
    private List<Persona> salarios;

    public Nomina() {
        this.salarios = new ArrayList<>();
    }

    public List<Persona> getSalarios() {
        return salarios;
    }

    public void setSalarios(List<Persona> salarios) {
        this.salarios = salarios;
    }
    
    public void añadirPersona (Persona p){
        this.salarios.add(p);
        
    }
    
    public void eliminarPersona(String cc){
        Persona aux;
        int sw = 0;
        /*
        for (Persona p: this.salarios){
         if(p.getCedula().equals(cc)){
            this.salarios.remove(p);
        }
        }
        
        */
        for(int i = 0; i< this.salarios.size(); i++){
            aux = this.salarios.get(i);
            if(aux.getCedula().equals(cc)){
            //if(this.salarios.get(i).getCedula().equals(cc))    
                this.salarios.remove(i);
                //this.salarios.remove(p)--para foreach
                sw =1;
                break;
            }
            //removeif tambien se puede usar para eliminar
        }
        //if(sw == 0){  para cuando este añadiendo
        //    this.salarios.add(p);
        //} tambien funciona el metodo contains 
        
        if(sw == 0){
            System.out.println("La persona con cc:"+CC+"no fue encontrada");
        }
    }
    public double obtenerSalario(String cc){
        
        Persona aux;
        for(int i=0; i<this.salarios.size();i++){
            aux= this.salarios.get(i);
            if(aux.getCedula().equals(cc)){
                return aux.getSalario();
            }
        }
        return -1.0;
    }
    
    //vervos en infinitivo que represente lo que esta haciendo el metodo
    public double calcularDesviacion(){
        double suma = 0;
        double promedio = 5000000;
        // promedio = this.calcularPromedio():
        
        for(Persona p: this.salarios){
            suma += Math.pow(p.getSalario()-promedio,2);
        }
        suma = suma / this.salarios.size();
        
        suma = Math.sqrt(suma);
        
        return suma;
    
    }
    

    
   
}
