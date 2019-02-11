/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.pkg8;
import java.util.Scanner;
/**
 *
 * @author IGCaguiat
 */
public class A8 {

    /**
     * @param args the command line arguments
     */
    
    

    public static void main(String[] args) {
        
        final int min = 1;
        final int max= 2999;
        final String[] romanNumeral_M= {"", "M", "MM", "MMM"};
        final String[] romanNumeral_C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        final String[] romanNumeral_X= {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        final String[] romanNumeral_I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        
        Scanner scan = new Scanner(System.in);
        
        int number = 0;
        String romanNumeral = null;
        
        System.out.println("Enter the number you want to convert in roman numerals: ");
        number =  scan.nextInt();
        
        if (number < min || number > max) {
            romanNumeral  = "Number shoud between 1 and 3000";
            System.out.println(romanNumeral);
           
        }else {
           romanNumeral = new  StringBuilder()
                .append(romanNumeral_M[number / 1000])
                .append(romanNumeral_C[number % 1000 / 100])
                .append(romanNumeral_X[number % 100 / 10])
                .append(romanNumeral_I[number % 10])
                .toString();
            System.out.format("The roman numerals of %d are %s \n", number, romanNumeral);
        }
          
        
    }
    
}
   