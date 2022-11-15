// 24. Write a program that computes the sum of the digits of the given integer number

package loops.digits;
import java.util.Scanner;

public class digits {

    public static void main(String[] args) {
        int num, rem;
        int digit = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\nEnter integer to find the sum of its digit: ");
            num = sc.nextInt();
        }

        while(num > 0) {

            rem = num % 10;
            num = (num-rem)/10;
            digit = digit + rem;
            
        }

        System.out.print("\nThe sum of its digit: "+digit);
    }
    
}
