//32. Write a program to find the minimum and maximum among 10 numbers.
package array.minMax;
import java.util.Scanner;
public class minMax {

     public static void main(String[] args) {
        
        
        try(Scanner scan = new Scanner(System.in)){

         
            int a[] = new int[10];
            int i, max, min;
            System.out.println("\nEnter 10 elements: ");
            for(i=0; i<10; i++) {
 
                a[i]= scan.nextInt();
                    
            }

            System.out.print("\nElements of Array: \n");
            for(i=0; i<10; i++) {
 
                System.out.print(a[i]+"\t");
               
            }
            
            max = min = a[0];
           
            for(i=0; i<10; i++) {
               
                if (max < a[i]){
                    max = a[i];
                }
                if (min > a[i]) {
                    min = a[i];
                }
            }
            System.out.println("\nMaximum element is: "+ max);
            System.out.println("\nMininum element is: "+ min);
        }
        
    
    }
    
}
 