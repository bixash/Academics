// 34. Write a program to add two matrices.

package array.matrixAdd;
// import java.util.Scanner;
public class add {

    public static void main(String[]args) {

        int i,j;
        int m = 2;
        int n = 2;

        int a[][] = {{5,6},{7,8}};
        int b[][] = {{1,2},{3,4}};

        int c[][] = new int[m][n];
        
        

        System.out.print("\nElements of matrix A: \n");
        for(i=0; i<m; i++) {

            for(j=0; j<n; j++) {

                System.out.print(a[i][j]+"\t");
                
            }
            System.out.print("\n");
        }

        System.out.print("\nElements of matrix B: \n");
        for(i=0; i<m; i++) {

            for(j=0; j<n; j++) {

                System.out.print(b[i][j]+"\t");
                
            }
            System.out.print("\n");
        }

        // Addition


        System.out.print("\nSum of Matrix (A+B): \n");
        for(i=0; i<m; i++) {

            for(j=0; j<n; j++) {

                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j]+"\t");

            }
            System.out.print("\n");
        }


        

        
    }
    
}
