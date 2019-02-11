package activity.pkg10;

import java.util.Scanner;

public class Activity10 {
    public static void main(String[] args) {
        System.out.println("Activity 10");
        System.out.println("Compute the radius of a circle");
        System.out.println();
        
        Scanner scan = new Scanner(System.in);
        float radius = 0; 
        
        System.out.print("Enter the radius: ");
        radius = scan.nextFloat();
        System.out.println("The area of the circle is: " + areaOfCircle(radius)); 
    }
    
    private static float areaOfCircle(float radius) {
        return (float) (3.1416 * ( radius * radius ));
    }
}