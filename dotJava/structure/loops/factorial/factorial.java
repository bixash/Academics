// 25. Write a program to find factorial of a number. [Hint: factorial n = n! = n * (n – 1) * (n –2) *…* 2 * 1]

package loops.factorial;
import java.util.Scanner;
public class factorial {

    public static void main(String[] args) {
        

        int num;
        int fact = 1;
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("\nEnter a number to find out its factorial: ");
            num = sc.nextInt();
        }

        for (int i = 0; i < num; i++) {
            fact = fact * (i+1);
        }
        System.out.println("\nFactorial: "+fact);
    }
    
}
