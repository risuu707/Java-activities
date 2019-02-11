
package c.java.project;

import Activities.Activities;

public class CJavaProject {

    public static void main(String[] args) {
        Activities activity = new Activities();
        
        System.out.println("Best college in UdM");
        System.out.println("Have the best teachers");
        System.out.println("Has a good facilities");
        System.out.println("Clean Environment");
        System.out.println("All teachers are kind");
        System.out.println("Student can have a lot of fun");
        System.out.println("Has a lot of programs for cet students");
        System.out.println("Good administration");
        System.out.println("Unity Exist");
        System.out.println("");
        
        float radius = 5;
        float celcius = (float) 32.6;
        float dollar = 4;
        float inches = 5;
        int firstNumber = 56;
        int secondNumber = 45;
        float price = 678; 
        float salvageValue = 700; 
        int years = 2;
        float totalYearlyProductionRequirement = 6;
        float setupCostPerOrder = 780; 
        float inventoryCarryingCostPerUnit = 600;
        
        System.out.println("Activity 1: \nThe volume of the sphere is: " + activity.volumeOfSpehere(radius));
        
        System.out.println("Activity 2: \nThe Celcius to Fahrenheit: " + activity.celciusToFahrenheit(29));
        
        System.out.println("Activity 3: \nThe Dollar to Peso: " + activity.dollarToPeso(6));
        
        System.out.println("Activity 4: \nThe Inches to Centimeters: " + activity.inchesToCentimeters((float) 5.8));
        
        System.out.println("Activity 5: \nSwap two numbers using three variables: ");
        activity.swapNumbersUsingThreeVariables(firstNumber, secondNumber);
        
        System.out.println("Activity 6: \nThe Circumference of a circle: : " + activity.circumferenceOfCircle(4));
        
        System.out.println("Activity 7: \nSwap two numbers usng two variables: ");
        activity.swapNumbersUsingTwoVariables(firstNumber, secondNumber);
        
        System.out.println("Activity 8: \nThe Yearly depreciation: : " + activity.yearlyDepreciation(price, years, salvageValue));
        
        System.out.println("Activity 9: \nCompute EOQ : " + activity.computeEOQ(totalYearlyProductionRequirement , setupCostPerOrder, inventoryCarryingCostPerUnit));
        
        System.out.println("Activity 10: \nThe Area of Circle: : " + activity.areaOfCircle(radius));

    }
    
}
