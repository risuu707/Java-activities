package a.pkg2;
import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
      Scanner scan=new Scanner  (System.in);
       System.out.println("Enter Month ");
      int Month = scan.nextInt();
       System.out.println("Enter day ");
      int day = scan.nextInt();
       System.out.println("Enter year ");
      int year = scan.nextInt();
      
      if(Month == 1)
          System.out.println("January " + day + ", "  + year);
      else if (Month == 2)
          System.out.println("February " + day  + ", " + year);
      else if (Month == 3)
          System.out.println("March " + day + ", "  + year);
      else if (Month == 4)
          System.out.println("April " + day + ", "  + year);
      else if (Month == 5)
          System.out.println("May " + day + ", "  + year);
      else if (Month == 6)
          System.out.println("June " + day + ", "   + year);
      else if (Month == 7)
          System.out.println("July " + day + ", "  + year);
      else if (Month == 8)
          System.out.println("August " + day + ", "  + year);
      else if (Month == 9)
          System.out.println("September " + day + ", " + year);
      else if (Month == 10) 
          System.out.println("October " + day + ", "  + year);
      else if (Month == 11)
          System.out.println("Novenver " + day + ", "  + year);
      else if (Month == 12)
          System.out.println("December " + day + ", "   + year);
      else          
          System.out.println("Invalid");     
    }
}
