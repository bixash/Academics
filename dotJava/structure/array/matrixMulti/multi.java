// 38. Write a program to multiply two matrices and display the resultant matrix.

package array.matrixMulti;
// import java.util.Scanner;
public class multi {

    public static void main(String[]args) {

        // char charArray2D[][] = {{'a', 'b', 'c'},{'d', 'e', 'f'}};
        int a[][] ={{1, 3 ,4}, {5, 6, 6}};
        int r1 = 2;
        int c1 = 3;

        int b[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int r2 = 3;
        int c2 = 3;
       
        int c[][] = new int[r1][c2];

        int i,j,k;
        

        // System.out.print("\nEnter row and column for matrix first: \n");
        

        // System.out.print("\nEnter row and column for matrix second: \n");

           

        if(c1 == r2) {

            // System.out.print("\nEnter elements for matrix first: \n");
            // for(i=0; i<r1; i++) 
            //     for(j=0; j<c1; j++) 
            //         a[i][j]= scan.nextInt();
                    
            // System.out.print("\nEnter elements for matrix second: \n");
            // for(i=0; i<r2; i++) 
            //     for(j=0; j<c2; j++) 
            //         b[i][j]= scan.nextInt();

            System.out.print("\nElements of matrix A: \n");
            for(i=0; i<r1; i++) {

                for(j=0; j<c1; j++) 
                    System.out.print(a[i][j]+"\t");

                System.out.print("\n");
            }

            System.out.print("\nElements of matrix B: \n");
            for(i=0; i<r2; i++) {

                for(j=0; j<c2; j++)
                    System.out.print(b[i][j]+"\t");
                    
                System.out.print("\n");
            }

            System.out.print("\nMatrix multiplication AXB: \n");
            for(i=0; i<r1; i++) {
                for(j=0; j<c2; j++) {
                    
                    c[i][j]=0;

                    for(k=0; k<c1; k++)
                        c[i][j]+= a[i][k]*b[k][j];  
                    System.out.print(c[i][j]+"\t");
                    
                }
                System.out.println();
            }

        }
        else 
            System.out.print("\nMatrices cannot be multiplied.\n");
   }
    
}
