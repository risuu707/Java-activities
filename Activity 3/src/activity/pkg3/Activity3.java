package activity.pkg3;

import java.util.Scanner;

public class Activity3 {
  
    public static void main(String[] args) {
        System.out.println("Activity 3");
        System.out.println("Convert dollar to peso");
        System.out.println();
        
        Scanner scan = new Scanner(System.in);
        float dollar = 0;
        
        System.out.print("Enter the dollar you want to convert in peso: ");
        dollar = scan.nextFloat(); 
        System.out.println("The amount of dollar converted in peso is: " + dollarToPeso(dollar) + " pesos");
    }
    
    private static float dollarToPeso(float dollar) {
        return (float) (dollar * 51.50); 
    }  
}
