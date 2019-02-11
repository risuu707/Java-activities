package activity.pkg7;

import java.util.Scanner;

public class Activity7 {
   
    public static void main(String[] args) {
        System.out.println("Activity 7");
        System.out.println("Swap two numbers using only two variables");
        System.out.println();
        
        Scanner scan = new Scanner(System.in);
        int firstNumber = 0, secondNumber = 0;

        System.out.print("Enter the first number input: ");
        firstNumber = scan.nextInt(); 
        System.out.print("Enter the second number input: ");
        secondNumber = scan.nextInt(); 
        System.out.println("The numbers before swapping: " + firstNumber + ", " + secondNumber);
        System.out.println("The numbers after swapping: " + swapTwoNumbers(firstNumber, secondNumber));
    }

    private static String swapTwoNumbers(int firstNumber, int secondNumber) {
        firstNumber = firstNumber + secondNumber; 
        secondNumber = firstNumber -  secondNumber;
        firstNumber = firstNumber - secondNumber; 
        return firstNumber + ", " + secondNumber;
    }
}
