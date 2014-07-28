/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hojatrabajo2algoritmos;

import java.util.Scanner;

/**
 *
 * @author Adolfo
 */
public class HojaTrabajo2Algoritmos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese cadena: ");
        Scanner tecladoIn = new Scanner(System.in); 
        String expresion = tecladoIn.nextLine();
        VectorStack vector = new VectorStack (expresion);
        System.out.println("Resultado: "+ vector.operar());
    }
    
}
