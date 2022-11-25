// 3. Write a program to calculate discount on the basis of following assumption:
// a) If purchased amount is greater than or equal to 1000, discount is 5%
// b) If purchased amount is less than 1000, discount is 3%


package ifelse.discount.threeDis;
import java.util.Scanner;
public class threeDis {
    
    public static void main(String[]args) {

        
        try(Scanner scan = new Scanner(System.in))
        {
         double discount = 0;
         System.out.print("\nEnter a marked price: ");
         float markedPrice = scan.nextFloat();
 
         if ( markedPrice >= 1000) {
            discount = markedPrice * 0.05;
         } 
         else {
            discount = markedPrice * 0.03;
         }
 
         System.out.print("Discount Price: "+ discount);
 
        }
 
 
     }
 
}
