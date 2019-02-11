
package Activities;

public class Activities {
    
    public float volumeOfSpehere(float radius) {
        return (float) (( 4/3 ) *  3.1416  * ( radius * radius * radius ));
    }
    
    public float celciusToFahrenheit(float celcius) {
        return ( 9/5 ) * celcius + 32; 
    }
    
    public float dollarToPeso(float dollar) {
        return (float) (dollar * 51.50); 
    }
    
    public float inchesToCentimeters(float inches) {
        return (float) (inches * 2.54);
    }
    
    public void swapNumbersUsingThreeVariables(int firstNumber, int secondNumber){
       System.out.println("Before Swapping:" + "\nFirst number is: " + firstNumber + "\n" + "Second number is: " + secondNumber);
       int thirdNumber = 0;
       thirdNumber = firstNumber;
       firstNumber = secondNumber;
       secondNumber = thirdNumber;   
       System.out.println("After Swapping:" + "\nFirst number is: " + firstNumber + "\n" + "Second number is: " + secondNumber);
    }
    
    public float circumferenceOfCircle(float radius) {
        return (float) (2*3.1416) * radius;
    }
    
    public void swapNumbersUsingTwoVariables(int firstNumber, int secondNumber) {
       System.out.println("Before Swapping:" + "\nFirst number is: " + firstNumber + "\n" + "Second number is: " + secondNumber);
       firstNumber = firstNumber + secondNumber;
       secondNumber = firstNumber - secondNumber;
       firstNumber = firstNumber - secondNumber;
       System.out.println("After Swapping:" + "\nFirst number is: " + firstNumber + "\n" + "Second number is: " + secondNumber);
    }
    
    public float yearlyDepreciation(float price, int years, float salvageValue) {
       return (price - salvageValue) / years;
    }
    
    public float computeEOQ(float r, float s, float i) {
        return ( 2 * r * s ) / i;
    }
    
    public float areaOfCircle(float radius) {
        return (float) (3.1416 * ( radius * radius ));
    }
    
}
