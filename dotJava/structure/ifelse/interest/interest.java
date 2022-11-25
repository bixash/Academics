// 8. Write a program to calculate the simple interest on the basis of following assumption:
// b) If balance is greater than or equal to 10000, interest is 7 %
// c) If balance is greater than or equal to 50000 and less than 100000 interest is 5 %
// d) If balance is less than 50000, interest is 3%


package ifelse.interest;
import java.util.Scanner;
public class interest {
    
    public static void main(String[]args) {

        try(Scanner scan = new Scanner(System.in))
        {
             double interest = 0;
             System.out.print("\nEnter a principal amount: ");
             float principal = scan.nextFloat();
 
             if( principal >= 100000) 
                 interest = principal * 0.07;

             else if(principal >= 50000 && principal < 100000)
                 interest = principal * 0.05;

             else 
                 interest = principal * 0.03;
 
             System.out.print("Interest amount: "+ interest);
 
        }
 
 
     }
}
