/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;
import herencias4.Asignatura_Presencial;
/**
 *
 * @author reroes
 */
public class Herencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Profesor p =new Profesor(1000.1);
        System.out.println(p.getNombre());
        
        Profesor p1 = new Profesor();
        System.out.println(p1.getNombre());
        
        Profesor p2 = new Profesor("Luis", "Alvarez", 20, 3000.2);
        System.out.println(p2.getNombre());
        
        Estudiante e = new Estudiante("Andres", "Roman", 15, 345.50);
        System.out.println(e.getEdad());
        
        Profesor p3 = new Profesor("Luis", "Alvarez", 25, 3000.2);
        System.out.println(p3.getEdad());
        */
        Asignatura_Presencial a1 = new Asignatura_Presencial("Programacion", "Comun", 100, 180);
        Asignatura_Presencial a2 = new Asignatura_Presencial("Literatura", "Troncal", 300, 200);
        Asignatura_Presencial [] asig = {a1,a2};
        Estudiante e = new Estudiante("Rene", "Elizalde", 34, asig);
        System.out.println(e);
        
    }
    
}
