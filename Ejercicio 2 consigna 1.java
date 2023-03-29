/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author jere5
 */
public class JavaApplicatio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 2 números enteros");
        
         num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        System.out.println("La suma es: " + (num1+num2));
    }
    
}
