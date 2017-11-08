/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias4;

/**
 *
 * @author hp
 */
public class Asignatura_Presencial extends Asigantura {
    private int numero_horas;
    // Constructor
    public Asignatura_Presencial (String n, String t, double c, int h){
        super(n,t,c);
        establecer_numero_horas(h);
    }
    // Metodo set
    public void establecer_numero_horas(int h){
        numero_horas=h;
    }
    // Metodo get
    public int obtener_numero_horas(){
        return numero_horas;
    }
    // Metodo toString
    @Override
    public String toString(){
        String cadena = String.format("Asignatura Presencial\n"
                + "%s\n"
                + "\tNumero horas: %d\n", 
                super.toString(), obtener_numero_horas());
        return cadena;
    }
}

