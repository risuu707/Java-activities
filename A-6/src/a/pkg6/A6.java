/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.pkg6;
import java.util.Scanner;
        
/**
 *
 * @author IGCaguiat
 */
public class A6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Ritcher Scale: ");
        float n = scan.nextFloat();
        
        if(n < 5.0 ){
            System.out.println("Little or no damage");
        } else if(n >= 5.0 && n < 5.5){
            System.out.println("Some damage");
        } else if(n >= 5.5 && n < 6.5){
            System.out.println("Serious damage");
        } else if(n >= 6.5 && n < 7.5){
            System.out.println("Disaster");
        } else if(n > 7.5){
            System.out.println("Catastrophe");
        } 
    }
    
}
