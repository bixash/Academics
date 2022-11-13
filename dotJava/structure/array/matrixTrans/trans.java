// 37. Write a program to find transpose of a matrix.
package array.matrixTrans;
import java.util.Scanner;
public class trans {
    public static void main(String[]args) {

        try(Scanner scan = new Scanner(System.in)){

         
           int a[][] = new int[10][10];
           int i,j;
           
            
           System.out.print("\nEnter row and column of matrix: \n");
           int m = scan.nextInt();
           int n = scan.nextInt();


           System.out.print("\nEnter elements for matrix: \n");
           for(i=0; i<m; i++) {

               for(j=0; j<n; j++) {

                   a[i][j]= scan.nextInt();
                   
               }
           }


           System.out.print("\nElements of matrix: \n");
           for(i=0; i<m; i++) {

               for(j=0; j<n; j++) {

                   System.out.print(a[i][j]+"\t");
                   
               }
               System.out.print("\n");
           }


           //Transpose of Aij== Aji
           
           System.out.print("\nTranspose of Matrix: \n");
           for(i=0; i<n; i++) {
              
                for(j=0; j<m; j++) {

            
                    System.out.print(a[j][i]+"\t");
                    
                }
            
                System.out.print("\n");
           }
        
       }

       
   }
    
}
