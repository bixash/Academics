package array.matrix.sumRow;
import java.util.Scanner;
public class sumRow {

    public static void main(String[]args) {

        try(Scanner scan = new Scanner(System.in)){

         
           int a[][] = new int[10][10];
           int i,j, sum = 0;
           int m = 4, n= 4;
       

           System.out.print("\nEnter elements for matrix 4X4: \n");
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
           
        //    sum of 1st row = 00 01 02 03
           for(i=0; i<m; i++) {
                sum = 0;
               for(j=0; j<n; j++) {

                   sum = sum + a[i][j];
                   
                    
               }
               System.out.println("\nSum of "+ (i+1) +" row : "+sum);
              
           }

        //    System.out.print("\nSum of all elements: "+ sum +"\n");
        
       }

       
   }
    
}
