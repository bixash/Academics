// 15. Write a program to display your name 10 times.

package loops.name;
import java.util.Scanner;
public class name {
    public static void main(String[] args) {

        String name;
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("\nEnter your name: ");
            name = sc.nextLine();
        }


        for (int i = 0; i < 10; i++) {

            System.out.print("\nI am "+name+".");
        }
    }
}
