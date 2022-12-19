// 35. Write a program that accepts the elements of 3 × 3 matrix and calculate the sum of all
// elements of the matrix.

package array.matrixSumElt;
import java.util.Scanner;

public class sumElem {
    public static void main(String[]args) {

         try(Scanner scan = new Scanner(System.in)){

            int m = 3, n= 3;
            int a[][] = new int[3][3];
            int i,j, sum = 0;

            System.out.print("\nEnter elements for matrix 3X3: \n");
            for(i=0; i<m; i++) {

                for(j=0; j<n; j++) {

                    a[i][j]= scan.nextInt();
                    
                }
            }


            System.out.print("\nSo, the 3X3 matrix is: \n");
            for(i=0; i<m; i++) {
                for(j=0; j<n; j++) {
                    System.out.print(a[i][j]+"\t");
                    sum = sum + a[i][j];
                }
                System.out.print("\n");
            }
                    
            System.out.print("\nSum of all elements: "+ sum +"\n");
         
        }

        
    }
    
}


