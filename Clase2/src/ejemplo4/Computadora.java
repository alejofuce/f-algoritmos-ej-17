/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo4;

/**
 *
 * @author eafuc
 */
public class Computadora {

    private double velocidad_procesador;

    public void establecer_velocidad_procesador(double velocidad) {
        if (velocidad > 5.0) {
            velocidad_procesador = 5.0;
        } else {
            velocidad_procesador = velocidad;
        }
    }

    public double obtener_velocidad_procesador() {
        return velocidad_procesador;
    }

    @Override
    public String toString() {
        String cadena = String.format("Computadora con\nvelocidad de %.2f", obtener_velocidad_procesador());
        return cadena;
    }
}
