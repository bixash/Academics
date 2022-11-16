// 6. Write a program to compare two numbers
package compare;
import java.util.Scanner;
public class compare {
    public static void main(String[] args) {
         
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("\nEnter first integer: ");
            int a = scan.nextInt();

            System.out.print("Enter second integer: ");
            int b = scan.nextInt();


            if (a>b) {
                System.out.println(+a+"greater!");
            }
             else if (b>a) {
                System.out.println(+b+"greater!");
            }
            else {
                System.out.println("\nBoth are equal!");
            }
        }
            
    }
}
