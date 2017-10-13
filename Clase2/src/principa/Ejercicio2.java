/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principa;

/**
 *
 * @author eafuc
 */
public class Ejercicio2 {

    public static void main(String[] Args) {
        Computadora c = new Computadora();
        System.out.println(c.obtener_velocidad_procesador());
        c.establecer_velocidad_procesador(4.2);
        System.out.println(c.obtener_velocidad_procesador());
    }
}
