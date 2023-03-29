package introjava;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jere5
 */
public class Ejercicio_2_consigna_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        
        Scanner leer = new Scanner (System.in);
        
        frase = leer.nextLine();
        
        System.out.println(frase.toUpperCase() );
        
        System.out.println("");
        
        System.out.println(frase.toLowerCase() );
        
    }
    
}
