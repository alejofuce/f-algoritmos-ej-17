/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;
import ejercicio3.Carrera;
/**
 *
 * @author eafuc
 */
public class Asignatura {
    private String nombre;
    private int creditos;
    private Carrera carrera;
    
    public Asignatura(Carrera c){
        carrera = c;
        nombre = "Informatica";
        creditos = 5;
    }
    
    public void establecer_nombre(String n){
        nombre = n;
    }
    
    public String obtener_nombre(){
        return nombre;
    }
    
    public void establecer_creditos(int crd){
        creditos = crd;
    }
    
    public int obtener_creditos(){
        return creditos;
    }
    
    
    @Override
    public String toString() {
        String cadena = String.format("Asignatura\nNombre: %s\nCreditos: %d\nCarrera: %s\nModalidad: %s\n",obtener_nombre(), obtener_creditos(), carrera.obtener_modalidad(), carrera.obtener_nombre());
        return cadena;
    }
}
