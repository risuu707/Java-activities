package a.pkg9;
import java.util.Scanner;
public class A9 {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       float ttf;
       System.out.println("Enter tuition fee: ");
       float tf = scan.nextFloat();
       
       System.out.println("Mode of payments:");
       System.out.format("(Press 1 for cash, 2 for Two-Installment, 3 for Three-Installment)", null);
       System.out.println();
        float mop = scan.nextFloat();
        
        if (mop == 1) {
            ttf = (float) (tf - (tf * 0.1)) ;
            System.out.println("Your total tuition fee: " + ttf);
        } else if (mop == 2) {
            ttf = (float) (tf - (tf * 0.05)) ;
            System.out.println("Your total tuition fee: " + ttf );
        } else if (mop == 3) {
            ttf = (float) (tf + (tf * 0.1)) ;
            System.out.println("Your total tuition fee: " + ttf);
        } else {
            System.out.println("ERROR");
        }
    
    }
}
