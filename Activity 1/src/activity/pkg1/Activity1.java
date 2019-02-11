package activity.pkg1;

import java.util.Scanner;

public class Activity1 {    
    
    public static void main(String[] args) {
        System.out.println("Activity 1");
        System.out.println("Compute the volume of a sphere");
        System.out.println();
        
        Scanner scan = new Scanner(System.in);
        float radius = 0; 
        
        System.out.print("Enter the radius: ");
        radius = scan.nextFloat();
        System.out.println("The volume of the sphere is: " + volumeOfSpehere(radius));
       
    }
    private static float volumeOfSpehere(float r) {
        return (float) (( 4.0/3.0 ) *  3.1416  * ( r * r * r ));
    }
}
