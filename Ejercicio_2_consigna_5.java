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
public class Ejercicio_2_consigna_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        num = leer.nextInt();
        System.out.println(Math.multiplyExact(num, 2)+ " " + Math.multiplyExact(num, 3) + " " +Math.sqrt(num) );
        
    }
    
}
