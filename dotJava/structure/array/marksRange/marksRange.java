//31. Given a list of marks of 20 students ranging from 0 to 100, write a program to compute
// and print the number of students who have obtained marks
// a. in the range 81 to 100
// b. in the range 61 to 80
// c. in the range 41 to 60, and
// d. in the range 0 to 4

package array.marksRange;
import java.util.Scanner;
public class marksRange {
    

    public static void main(String[] args) {
        
        int excel= 0, great=0, good=0, meh=0;
        int i;
        int marks[]= new int[20];
        try (Scanner sc = new Scanner(System.in)){

            int temp;
            System.out.println("Enter obtained marks of 20 student:");
            //marks input of 20 students

            for(i=0; i<20; i++)
            {
                temp = sc.nextInt();

                while(temp > 100 || temp < 0) {

                    System.out.println("Invalid marks! Enter Again!");
                    temp = sc.nextInt();
                }
                
                marks[i]= temp;
            }
                
        }
            
            //display
            System.out.println("Marks are:");
            for( i=0; i<20; i++) {
               
                System.out.print(marks[i]+" ");

            }

             //check the conditions
            for( i=0; i<20; i++) {
                if(marks[i]>= 81 && marks[i]<=100)
                    excel++;
                else if (marks[i]>= 61 && marks[i]<= 80)
                    great++;
                else if (marks[i]>= 41 && marks[i]<= 60)
                    good++;
                else 
                    meh++;
                
            }

            System.out.println("\nNo. of students who have obtained marks:\n[81 to 100]: "+excel+"\n[61 to 80]: "+great+"\n[41 to 60]: "+good+"\n[0 to 40]: "+meh);
   
    }
}

