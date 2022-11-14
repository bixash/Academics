// 29. Write a program to display the following menu
// a. To find area of circle
// b. To check the given number is odd or even
// c. To find the sum of N numbers
// d. Exit
// Perform above task until the user wants to exit.

package circleMenu;
import java.util.Scanner;
public class circleMenu {
    public static void main(String[] args) {
        

        int radius, sum = 0, choice;
        try (Scanner sc = new Scanner(System.in)) {
            




            while (true) {
                System.out.println("\nOptions are:");
                System.out.print("\na. To find area of circle");
                System.out.print("\nb. To check the given number is odd or even");
                System.out.print("\nc. To find the sum of N number");
                System.out.print("\nd. Exit ");
    
                
                    System.out.print("\nEnter your option: ");
                    choice = sc.next().charAt(0);

                    switch (choice) {
                        case 'a':
                            float area; 
                            System.out.print("\nEnter a radius: ");
                            radius = sc.nextInt();

                            area = (float)(Math.PI*Math.pow(radius, 2));
                            System.out.print("\nArea of circle: "+area);
                            break;
                        
                        case 'b':
                            int num;
                            System.out.print("\nEnter a number: ");
                            num = sc.nextInt();

                            if (num%2 == 0) {
                                System.out.print("\n"+num+" is even");
                            }
                            else {
                                System.out.print("\n"+num+" is odd");
                            }
                            break;

                        case 'c':
                            int sumnum;
                            System.out.print("\nEnter a number: ");
                            sumnum = sc.nextInt();
                            for (int i = 1; i <= sumnum; i++) {
                                sum = sum + i;
                            }

                            System.out.print("\nSum of "+sumnum+": "+sum);
                            break;

                        case 'd':
                            System.exit(0);
                            break;

                        default:
                            System.out.print("\nInvalid option");
                            break;
                    }
                }
        }

        
        
    }
}
