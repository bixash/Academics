// 10. The rates of tax on gross salary are as shown below:
//      Income              Tax
// Less than 10,000         Nill
// Rs. 10,000 to 19,999     10%
// Rs. 20,000 to 39,999     15%
// Rs. 40,000 to above      20%
// Write a program to compute the net salary after deducting the tax for the given
// information and print the same

package ifelse.incometax;
import java.util.Scanner;
public class incometax {
   public static void main(String[]args) {
 
      try(Scanner scan = new Scanner(System.in))
      {
      double tax = 0;
      System.out.print("\nEnter your salary amount: ");
      float income = scan.nextFloat();

      if( income >= 40000) 
         tax = income * 0.2;
      else if(income >= 20000 && income <= 39999)
         tax = income * 0.15;
      else if(income >= 10000 && income <= 19999)
         tax = income * 0.1;
      else 
         tax = 0;

      System.out.print("\nNet Salary: "+ (income-tax));

      }
   }
}
