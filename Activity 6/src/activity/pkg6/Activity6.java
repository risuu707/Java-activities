package activity.pkg6;

import java.util.Scanner;

public class Activity6 {

    public static void main(String[] args) {
        System.out.println("Activity 6");
        System.out.println("Find the circumference of a circle");
        System.out.println();
        
        Scanner scan = new Scanner(System.in);
        float radius = 0;

        System.out.print("Enter the radius: ");
        radius= scan.nextFloat(); 
        System.out.println("The circumference of the circle is: " + circumferenceOfCircle(radius));
    }
    
    private static float circumferenceOfCircle(float radius) {
        return (float) ( 2.0*3.1416 ) * radius;
    }  
}
