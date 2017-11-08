/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;
import herencias4.Asignatura_Presencial;
import java.util.Arrays;
/**
 *
 * @author reroes
 */
public class Estudiante extends Persona{
    private Asignatura_Presencial [] asignaturas;
    // Constructor
    public Estudiante(String n, String a, int e, Asignatura_Presencial []asig){
        super(n, a, e);
        asignaturas=asig;
    }
    // Metodo set
    public void establecer_asignaturas (Asignatura_Presencial []asig){
        asignaturas=asig;
    }
    // Metodo get
    public Asignatura_Presencial[] obtener_asignaturas(){
        return asignaturas;
    }
    // Metodos
    public double obtener_valor_matricula(){
        Asignatura_Presencial[] A = obtener_asignaturas();
        double suma=0;
        for (int i=0; i<A.length; i++){
           Asignatura_Presencial me = A[i];
           suma+=me.obtener_costo();           
        }
        return suma;
    }
    @Override
    public String toString(){
        String cadena_asignaturas="";
        Asignatura_Presencial []A = obtener_asignaturas();
        for(int i=0; i<A.length; i++){
            cadena_asignaturas = String.format("%s%s", cadena_asignaturas, A[i]);
        }
        
        return String.format("%s\n"
                + "Costo de matricula: $ %.2f\n"
                + "Listado de asignaturas:\n"
                + "%s",
                super.toString(), obtener_valor_matricula(), cadena_asignaturas);
    }
    
    
    // @Override
    // public String toString(){
    
    //    return String.format("%s - %f", getApellido(), getMatricula());
    // }
}

