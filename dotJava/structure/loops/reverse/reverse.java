package loops.reverse;

import java.util.Scanner;

public class reverse {

    public static void main(String[] args) {


        int rem, rev = 0, num;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\nEnter a whole number to reverse the digit: ");
            num = sc.nextInt();
        }

        while (num > 0) {

            rem = num % 10;
            rev = rev*10 + rem;
            num = num / 10;
        }

        // for(int i = num; i> 0 ; i--) {
        //     rem = num % 10;
        //     rev = rev*10 + rem;
        //     // System.out.print("\nThe reversed number: "+rev);
        //     num = num / 10;
        // }
        System.out.print("\nThe reversed number: "+rev);
    }

    
}
