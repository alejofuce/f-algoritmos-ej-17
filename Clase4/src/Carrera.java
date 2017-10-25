/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eafuc
 */
public class Carrera {
    private String nombre;
    private String modalidad;
    
    public void set_name(String n){
        nombre = n;
    }
    
    public String get_name(){
        return nombre;
    }
    
    public void set_mod(String n){
        modalidad = n;
    }
    
    public String get_mod(){
        return modalidad;
    }

    
    public Carrera (){
        modalidad = "Distancia";
    }
    
    public Carrera (String mod){
        modalidad = mod;
    }
    
    public Carrera (String mod, String x){
        modalidad = mod;
        nombre = "x";
    }
    
    
}
