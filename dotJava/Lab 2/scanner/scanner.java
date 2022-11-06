package scanner;
import java.util.Scanner;

 public class scanner {
    public static void main (String[]args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("\nEnter length of rectangle: ");
            int length = scan.nextInt();

            System.out.print("\nEnter breadth of rectangle: ");
            int breadth = scan.nextInt();

            int area = length * breadth;
            int perimeter = 2*(length + breadth);

            System.out.println("\nArea: "+area +" and" +" Perimeter: "+perimeter);
        }
            
        

    }
 }