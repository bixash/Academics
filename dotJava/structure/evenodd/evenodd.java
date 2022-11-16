// 5. Write a program to check whether a number is even or odd.

package evenodd;
import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {

        int num;
        try (Scanner sc = new Scanner(System.in)) {

           
            System.out.print("\nEnter a number: ");
            num = sc.nextInt();

            if (num % 2 == 0 ) {
                System.out.println("\nNumber is even.");
            } 
            else {
                System.out.println("\nNumber is odd.");
            } 
        }

    }
}
