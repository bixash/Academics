// 19. A palindrome is a sequence of characters that reads the same backward as forward. For
// example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554
// and 11611. Write an application that reads in a five-digit integer and determines
// whether it is a palindrome. If the num is not five digits long, display an error
// message and allow the user to enter a new value

package loops.palindrome;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        
        int num, rem, rev=0;
        int temp;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\nInput 5 digit integer: ");
            num = sc.nextInt();


            // while (num > 99999 || num < 9999) {
            //     System.out.print("\nInvalid Integer!!\nPlease enter 5 digit integer: ");
            //     num = sc.nextInt();
            // }
            // temp = num;
            // while (num > 0) {
    
            //     rem = num % 10;
            //     rev = rev * 10 + rem;
            //     num = num / 10;
                
            // }
            // if (temp == rev) {
            //     System.out.println("\n"+temp+" is parlindrome!");
            // } 
            // else {
            //     System.out.println("\n"+temp+" is not parlindrome!");
            // }
            while (true) {
                if(num > 9999 && num < 99999)
                {
                    temp = num;
                    while (num > 0) {
            
                        rem = num % 10;
                        rev = rev * 10 + rem;
                        num = num / 10;
                        
                    }
                    if (temp == rev) 
                        System.out.println(temp+" is parlindrome!");
                    else 
                        System.out.println(temp+" is not parlindrome!");
                    
                    System.exit(0);
                }
                else {
                    System.out.print("Invalid Integer!!\n\nPlease enter 5 digit integer: ");
                    num = sc.nextInt();
                }
                
            }
           
        }

    }
}
