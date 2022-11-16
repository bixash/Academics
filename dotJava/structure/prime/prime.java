// 18. Write a program that displays all prime numbers from 1 to 100. 

package prime;

public class prime {
    public static void main(String[] args) {
        System.out.println("\nPrime numbers between 1 to 100 are: ");

        // int num;
        int i;
        for(int num = 1; num <= 100; num++)
        {
            for(i = 2; i <= num-1; i++){
                if (num % i == 0)
                {
                    break;
                }
            }
            if (i == num) {
                System.out.print(num+" ");
            }
        }
    }
}
