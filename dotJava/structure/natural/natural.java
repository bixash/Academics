// 16. Write a program to display first n natural numbers. Also display their sum, product, and
// average.

package natural;
import java.util.Scanner;
public class natural {

    public static void main(String[] args) {
        

        int num;
        int sum = 0, product= 1;
        float average;
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("\nEnter a natural number: ");
            num = sc.nextInt();
        }

        System.out.print("\nNatural number upto "+num+"th term: ");

        for (int i = 1; i <= num ; i++) {

            
            System.out.print(i+" ");

            sum = sum + i;
            product = product * i;
        }
        average = sum/num;
        System.out.print("\n\nSum upto "+num+"th term: "+sum);
        System.out.print("\nProduct upto "+num+"th term: "+product);
        System.out.println("\nAverage upto "+num+"th term: "+average);

    }
    
}
