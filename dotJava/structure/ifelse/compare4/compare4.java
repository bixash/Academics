// 7. Write a program to find the largest number among four numbers

package ifelse.compare4;
import java.util.Scanner;
public class compare4 {
    public static void main(String[] args) {
         
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("\nEnter any four integer: \n");
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d = scan.nextInt();


            if (a>b && b>c && c>d) {
                System.out.println(+a+" is largest number!");
            }
             else if (b>a && a>c) {
                System.out.println(+b+" is largest number!");
            }
             else if (c>a && a>d) {
                System.out.println(+c+" is largest number!");
            }
             else if (d>a) {
                System.out.println(+d+" is largest number!");
            }
            else {
                System.out.println("\nAll are equal!");
            }
        }
            
    }
}
