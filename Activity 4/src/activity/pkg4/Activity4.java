package activity.pkg4;

import java.util.Scanner;

public class Activity4 {
    
    public static void main(String[] args) {
        System.out.println("Activity 4");
        System.out.println("Convert inches to centimeters");
        System.out.println();
        
        Scanner scan = new Scanner(System.in);
        float inches = 0;

        System.out.print("Enter the inches you want to convert in centimeters: ");
        inches = scan.nextFloat(); 
        System.out.println("The converted inches to centimeters is: " + inchesToCentimeters(inches) + " centimeters");
    }
    
    private static float inchesToCentimeters(float inches) {
        return (float) (inches * 2.54);
    }
    
}
