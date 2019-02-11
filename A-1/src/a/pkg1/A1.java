/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.pkg1;

import java.util.Scanner;

/**
 *
 * @author IGCaguiat
 */
public class A1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        String letter = scan.nextLine();
         
        if(letter.equals("A") || letter.equals("a") ||
                letter.equals("E") || letter.equals("e") ||
                letter.equals("I") || letter.equals("i")  ||
                letter.equals("O") || letter.equals("o") ||
                letter.equals("U") || letter.equals("u")) {
            
            System.out.println("VOWEL");
        }else {
            System.out.println("CONSONANT");
        }
        
    }
    
}
