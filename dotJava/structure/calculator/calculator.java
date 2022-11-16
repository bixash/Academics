// 14. Write a program using switch statement to develop a simple calculator for +, -, *, /, and % operators.


package calculator;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {

        int a, b, choice;
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("\nEnter 1st operand: ");
            a = sc.nextInt();

            System.out.print("Enter 2nd operand: ");
            b = sc.nextInt();

            System.out.print("\nEnter a opertaions you want to perform [+, -, *, /, %]: ");
            choice = sc.next().charAt(0);
            
            switch (choice) {
                case '+':
                    int add = a + b; 
                    System.out.println("\nResult: "+add);
                    break;
                
                case '-':
                    int sub = a - b; 
                    System.out.println("\nResult: "+sub);
                    break;

                case '*':
                    int multi = a * b; 
                    System.out.println("\nResult: "+multi);
                    break;

                case '/':
                    float divide = a / b; 
                    System.out.println("\nResult: "+divide);
                    break;

                case '%' :
                    int modulo = a % b; 
                    System.out.println("\nResult: "+modulo);
                    break;

                default:
                    System.out.println("\nInvalid option");
                    break;
            }
            
        }

    }
}
