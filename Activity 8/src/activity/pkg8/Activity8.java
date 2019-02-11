package activity.pkg8;

import java.util.Scanner;

public class Activity8 {

    public static void main(String[] args) {
        System.out.println("Activity 8");
        System.out.println("Output the yearly depreciation of a item");
        System.out.println();
        
        Scanner scan = new Scanner(System.in);
        float price = 0, salvageValue =0;
        int years = 0;

        System.out.print("Enter the price: ");
        price = scan.nextFloat(); 
        System.out.print("Enter the salvage value: ");
        salvageValue = scan.nextFloat(); 
        System.out.print("Enter the amount of years: ");
        years = scan.nextInt(); 
        System.out.println("The yearly depreciation of those inputs is: " + yearlyDepreciation(price, years, salvageValue));
    }
    
    private static float yearlyDepreciation(float price, int years, float salvageValue) {
       return (price - salvageValue) / years;
    }
}
