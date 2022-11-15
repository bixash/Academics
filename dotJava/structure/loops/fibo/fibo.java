// 26. The number in the sequence 0 1 1 2 3 5 8 13 21 … are called Fibonacci numbers. Write a
// program to find nth Fibonacci number.[Hint: nth Fibonacci number is sum of (n-1)st and
// (n-2)nd Fibonacci numbers]

package loops.fibo;
import java.util.Scanner;
public class fibo {

    public static void main(String[] args) {
            int num;
            int a = 0;
            int b = 1;
            int fibo = 0;
        try (var scan = new Scanner(System.in)) {

            System.out.print("\nEnter a position to find nth fibonacci sequence: ");
            num = scan.nextInt();
        }
        if (num == 2) {

            System.out.println("\nSo, the "+num+"th fibonacci is 1");
            
        } else {
            for (int i = 0; i < num-2; i++) {

                fibo = a+b;
                a = b;
                b = fibo;
                 
            }
            System.out.println("\nSo, the "+num+"th fibonacci is " +fibo);
        }

          
           
        
    }
    
}
