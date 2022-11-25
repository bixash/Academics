// 9. Admission to a professional course is subject to the following conditions:
// a) Marks in mathematics >=60
// b) Marks in physics >=50
// c) Marks in chemistry >=40
// d) Total in all three subjects >=200
// Or
// Total in mathematics and physics>=150
// Given the marks in three subjects, write a program to process the applications to list
// eligible candidates.

package ifelse.eligible;
import java.util.Scanner;
public class eligible {
    public static void main(String[]args) {
 
        try(Scanner scan = new Scanner(System.in))
        {
            System.out.print("\nEnter your Math marks: ");
            float math = scan.nextFloat();
    
            System.out.print("Enter your Physics marks: ");
            float physics = scan.nextFloat();
    
            System.out.print("Enter your Chemistry marks: ");
            float chemistry = scan.nextFloat();
    
            if( (math + physics + chemistry) >= 200 && math >=60 && physics >=50 && chemistry >=40) 
                System.out.print("\nYay! You're eligible!");
            else if((math + physics) >= 150)
                System.out.print("\nYay! You're eligible!");
            else 
                System.out.print("\nSorry! You're not eligible!");
        }
     }
}
