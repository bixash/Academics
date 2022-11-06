package array.matrix.sumElem;
import java.util.Scanner;

public class sumElem {
    public static void main(String[]args) {

         try(Scanner scan = new Scanner(System.in)){

          
            int a[][] = new int[10][10];
            int i,j, sum = 0;
            int m = 3, n= 3;
        

            System.out.print("\nEnter elements for matrix 3X3: \n");
            for(i=0; i<m; i++) {

                for(j=0; j<n; j++) {

                    a[i][j]= scan.nextInt();
                    
                }
            }


            System.out.print("\nElements of matrix first: \n");
            for(i=0; i<m; i++) {

                for(j=0; j<n; j++) {

                    System.out.print(a[i][j]+"\t");
                    
                }
                System.out.print("\n");
            }
            

            for(i=0; i<m; i++) {

                for(j=0; j<n; j++) {

                    sum = sum + a[i][j];
                    
                }
               
            }

            System.out.print("\nSum of all elements: "+ sum +"\n");
         
        }

        
    }
    
}


