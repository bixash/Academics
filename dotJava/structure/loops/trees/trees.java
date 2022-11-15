// 27. Write a program to print the following outputs using for loops
// 1        $ $ $ $ $          1          1
// 2 2        $ $ $ $         2 2         0 1
// 3 3 3        $ $ $        3 3 3        1 0 1
// 4 4 4 4        $ $       4 4 4 4       0 1 0 1
// 5 5 5 5 5        $      5 5 5 5 5      1 0 1 0 1

package loops.trees;
public class trees {

    public static void main(String[] args) {

        System.out.println("\n========== Ladder =========\n");
        for (int i = 1; i <= 5; i++) {

            for(int j=1; j <= i; j++) {

                System.out.print(" "+i);
            }
            System.out.print("\n");
        }

        System.out.println("\n========== Dollar =========\n");
        int temp = 2;
        for (int i = 5; i >= 1; i--) {
            
            for(int j=1; j <= i; j++) {

                System.out.print(" $");
            }
            System.out.print("\n");

           for (int index = 0; index < temp; index++) {
                System.out.print(" ");

            }
            temp = temp+2;
        }

        System.out.println("\n========== Pyramid =========\n");
        int egypt = 5;
        for (int i = 1; i <= 5; i++) {

            for (int index = 0; index < egypt; index++) {
                System.out.print(" ");
            }
                egypt--;

            for(int j=1; j <= i; j++) {

                System.out.print(" "+i);
            }
            System.out.print("\n");
            
            
        }

        System.out.println("\n========== Binary =========\n");

        int count;
        for (int i = 1; i <= 5; i++) {
            
            for(int j=1; j <= i; j++) {
                
                count=(i+j)%2;
                if(count == 1)
                    System.out.print("0 ");
                else
                    System.out.print("1 ");
                
                // count++;
            }
            // System.out.print("y");
            System.out.print("\n");
           
        }
       


    //=================== this my way of doing=========== //
        // for (int i = 1; i <= 5; i++) {
            
        //     for(int j=1; j <= i; j++) {
            
                
        //         if (i%2 == 0) {
        //             count = (j+1)%2;
        //             System.out.print(count+" ");
        //         }
        //         else{
        //             count = j%2;
        //             System.out.print(count+" ");
        //         }
                
        //         // count++;
        //     }
        //     System.out.print("\n");
        // }

    }
    
}
