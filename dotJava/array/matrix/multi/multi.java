package array.matrix.multi;
import java.util.Scanner;
public class multi {

    public static void main(String[]args) {

        try(Scanner scan = new Scanner(System.in)){

           int b[][] = new int[10][10];
           int a[][] = new int[10][10];
           int c[][] = new int[10][10];
           int i,j,k;
           

           System.out.print("\nEnter row and column for matrix first: \n");
           int r1 = scan.nextInt();
           int c1 = scan.nextInt();

           System.out.print("\nEnter row and column for matrix second: \n");

           int r2 = scan.nextInt();
           int c2 = scan.nextInt();


           if(c1 == r2) {
                    System.out.print("\nEnter elements for matrix first: \n");
                    for(i=0; i<r1; i++) {

                        for(j=0; j<c1; j++) {

                            a[i][j]= scan.nextInt();
                            
                        }
                    }


                    System.out.print("\nEnter elements for matrix second: \n");
                    for(i=0; i<r2; i++) {

                        for(j=0; j<c2; j++) {

                            b[i][j]= scan.nextInt();
                            
                        }
                    }

                    System.out.print("\nElements of matrix first: \n");
                    for(i=0; i<r1; i++) {

                        for(j=0; j<c1; j++) {

                            System.out.print(a[i][j]+"\t");
                            
                        }
                        System.out.print("\n");
                    }

                    System.out.print("\nElements of matrix second: \n");
                    for(i=0; i<r2; i++) {

                        for(j=0; j<c2; j++) {

                            System.out.print(b[i][j]+"\t");
                            
                        }
                        System.out.print("\n");
                    }


                    System.out.print("\nMatrix multiplication: \n");
                    for(i=0; i<r1; i++) {

                        for(j=0; j<c2; j++) {
                            
                            c[i][j]=0;

                            for(k=0; k<c1; k++){

                                c[i][j]+= a[i][k]*b[k][j];  
                            }

                            System.out.print(c[i][j]+"\t");
                            
                        }

                        System.out.println();
                        
                    }

                    

                }

            else {

                System.out.print("\nMatrices cannot be multiplied.\n");

                   
            }
       

          
        }
       
   }
    
}
