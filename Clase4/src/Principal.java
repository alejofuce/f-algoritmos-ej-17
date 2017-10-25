/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eafuc
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carrera c = new Carrera();
        c.set_name("Informatica");
        c.set_mod("Distancia");
        System.out.println(c.get_name());
        System.out.println(c.get_mod());
        
        Carrera c2 = new Carrera("Electronica");
        System.out.println(c2.get_mod());
        
        Carrera c3 = new Carrera("Semipresencial","Sistemas");
        System.out.println(c3.get_mod());
        c3.set_mod("Distancia");
        System.out.println(c3.get_mod());
        c3.set_mod(c3.get_mod().toUpperCase());
        System.out.println(c3.get_mod());
    }
    
}
