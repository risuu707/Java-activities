package activity.pkg9;

import java.util.Scanner;

public class Activity9 {

    public static void main(String[] args) {
        System.out.println("Activity 9");
        System.out.println("Determine the most economical quantity");
        System.out.println();
        
        Scanner scan = new Scanner(System.in);
        float r = 0, s = 0, i = 0;

        System.out.print("Enter the annual demand: ");
        r = scan.nextFloat();
        System.out.print("Enter the carrying cost per unit: ");
        s = scan.nextFloat();
        System.out.print("Enter the fixed order cost: ");
        i = scan.nextFloat(); 
        System.out.println("The economic order quantity is: " + computeEOQ(r, s, i));     
    }
    
    private static float computeEOQ(float r, float s, float i) {
        return (float) Math.sqrt(( 2 * r * i ) / s);
    }  
}