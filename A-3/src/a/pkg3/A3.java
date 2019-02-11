/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.pkg3;

import java.util.Scanner;

/**
 *
 * @author IGCaguiat
 */
public class A3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Temperature: ");
        float temp = scan.nextFloat();
        
        if(temp < 0 ){
            System.out.println("ICE");
        } else if(temp >= 0 && temp <= 100){
            System.out.println("WATER");
        } else if(temp > 100){
            System.out.println("STEAM");
        } 
    }
    
}
