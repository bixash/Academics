package array.oneD.oddInd;
import java.util.Scanner;
public class oddInd {

    public static void main(String[]args) {

        try(Scanner scan = new Scanner(System.in)){

         
           int a[] = new int[20];
           int i;
           
           
            
           System.out.println("\nEnter size of array: ");
           int m = scan.nextInt();
          


           System.out.println("\nEnter elements for Array: ");
           for(i=0; i<m; i++) {

                a[i]= scan.nextInt();
                   
           }


           System.out.print("\nElements of Array: \n");
           for(i=0; i<m; i++) {

               System.out.print(a[i]+"\t");
              
              
           }


           System.out.print("\n");
           System.out.print("\nOdd indices elements are: \n");

           for(i=0; i<m; i++) {
              
                if(i%2 != 0)
                    System.out.print(a[i]+"\t");
                
           }
           System.out.print("\n");
        
       }

       
   }
    
}
