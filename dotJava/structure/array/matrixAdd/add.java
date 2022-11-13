
// 34. Write a program to add two matrices.

package array.matrixAdd;
import java.util.Scanner;
public class add {

    public static void main(String[]args) {

         try(Scanner scan = new Scanner(System.in)){

            int b[][] = new int[10][10];
            int a[][] = new int[10][10];
            int c[][] = new int[10][10];
            int i,j;
            

            System.out.print("\nEnter row and column of matrices: \n");
            int m = scan.nextInt();
            int n = scan.nextInt();

            // System.out.print("\nEnter row and column for matrix first: \n");

            // int o = scan.nextInt();
            // int p = scan.nextInt();

        

            System.out.print("\nEnter elements for matrix first: \n");
            for(i=0; i<m; i++) {

                for(j=0; j<n; j++) {

                    a[i][j]= scan.nextInt();
                    
                }
            }


            System.out.print("\nEnter elements for matrix second: \n");
            for(i=0; i<m; i++) {

                for(j=0; j<n; j++) {

                    b[i][j]= scan.nextInt();
                    
                }
            }

            System.out.print("\nElements for matrix first: \n");
            for(i=0; i<m; i++) {

                for(j=0; j<n; j++) {

                    System.out.print(a[i][j]+"\t");
                    
                }
                System.out.print("\n");
            }

            System.out.print("\nElements for matrix second: \n");
            for(i=0; i<m; i++) {

                for(j=0; j<n; j++) {

                    System.out.print(b[i][j]+"\t");
                    
                }
                System.out.print("\n");
            }


            for(i=0; i<m; i++) {

                for(j=0; j<n; j++) {

                    c[i][j] = a[i][j] + b[i][j];
                    
                }
               
            }

            System.out.print("\nMatrix Addition: \n");
            for(i=0; i<m; i++) {

                for(j=0; j<n; j++) {

                    System.out.print(c[i][j]+"\t");
                    
                }

                 System.out.print("\n");
            }


        }

        
    }
    
}
