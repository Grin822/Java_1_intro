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
public class Ejercicio_2_consigna_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float gradosC, gradosF;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese los °C");
        
        gradosC = leer.nextFloat();
        gradosF = 32+(9*gradosC/5);
        
        System.out.println("El equivalente de " +gradosC +"C a F es de: " +gradosF);
    }
    
}
