
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eafuc
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Programa para imprimir tabla de multiplicar de numero dado por usuario
        Scanner e = new Scanner(System.in);
        
        int num;
        int mul;
        
        System.out.println("Ingrese el numero del que desea la tabla");
        num = e.nextInt();
        
        for(int i=1; i<=12; i++){
            mul = num * i;
            System.out.printf("%d * %d = %d\n",num, i, mul);
        }
    }
    
}
