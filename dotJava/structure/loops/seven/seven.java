// 22. Write a program to find the number of and sum of all integers greater than 100 and less
// than 200 that are divisible by 7

package loops.seven;
public class seven {
    public static void main(String[] args) {
        
        int sum = 0, count = 0;


        for(int i=100; i<=200; i++){
            if( i%7 == 0 ){
                count++;
                sum = sum + i;
            }

            
            
        }
            System.out.println("\nIntegers greater than [100 - 200] that are divisible by 7 are:");
            System.out.print("\nTotal no. of integers: "+count);
            System.out.println("\nSum of integers: "+sum);

    }
}
