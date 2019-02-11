package activity.pkg2;

import java.util.Scanner;

public class Activity2 {
 
    public static void main(String[] args) {
        System.out.println("Activity 2");
        System.out.println("Convert celcuis to fahrenheit");
        System.out.println();
        
        Scanner scan = new Scanner(System.in);
        float celcius = 0; 
        
        System.out.print("Enter the celcius you want to convert in fahrenheit: ");
        celcius = scan.nextFloat(); 
        System.out.println("The fahrenheit is: " + celciusToFahrenheit(celcius) + " fahrenheit");
    }
    
    private static float celciusToFahrenheit(float celcius) {
        return (float) (( 9.0/5.0 ) * celcius + 32); 
    }
}
