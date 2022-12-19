// 36. Write a program to read 4 × 4 matrix and find sum of each row.

package array.matSumRow;
import java.util.Scanner;
public class sumRow {

    public static void main(String[]args) {

        try(Scanner scan = new Scanner(System.in)){

            int m = 4, n= 4;
           int a[][] = new int[m][n];
           int i,j, sum = 0;
           
       

           System.out.print("\nEnter elements for matrix 4X4: \n");
            for(i=0; i<m; i++) {

                for(j=0; j<n; j++) {
                   a[i][j]= scan.nextInt();
                   
                }
            }


           System.out.print("\nSo, the 4x4 matrix is: \n");
            for(i=0; i<m; i++) {

                for(j=0; j<n; j++) 

                   System.out.print(a[i][j]+"\t");
               
                System.out.print("\n");
            }
           
        //    sum of 1st row = 00 01 02 03
            for(i=0; i<m; i++) {
                sum = 0;
                for(j=0; j<n; j++) 
                    sum = sum + a[i][j];
    
                System.out.println("\nSum of "+ (i+1) +" row : "+sum);
              
            }
        
       }

       
   }
    
}
