/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eafuc
 */
public class Computadora {
    private double velocidad_procesador;
        public void establecer_velocidad_procesador(double velocidad){
            velocidad_procesador = velocidad;
            
        }
        // No se necesita darle valores de entrada a este metodo en especifico.
        public double obtener_velocidad_procesador(){
            
            return velocidad_procesador;
        }
}
