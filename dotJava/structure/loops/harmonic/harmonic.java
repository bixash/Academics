// 20. Write the program to determine the sum of the following harmonic series for a given
// value of n (input from command line).
// 1 + 1/2 + 1/3 + 1/4 + … + 1/n.

package loops.harmonic;

public class harmonic {
    public static void main(String[] args) {
        // int b=0;
        float sum =0;
        int a = Integer.parseInt(args[0]);
        for (int i = 1; i <= a; i++) {

            sum = sum + (1.0f/i);
           
            
        }
 
        System.out.println("\nSum of Harmonic series upto "+a+": "+sum);

    }
}
