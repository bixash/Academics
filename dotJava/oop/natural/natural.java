// 10. Write a program using recursive and iterative method to find sum of first n natural
// numbers.

package oop.natural;

public class natural {

    static int sumOfNatural(int num) {
        if (num == 1 ) 
            return 1;
        else 
            return num + sumOfNatural(num-1);
    }
    
    public static void main(String[] args) {
        
        int num = 7;
        int sum = 0;
    
        for (int i = 1; i <= num; i++)    
            sum = sum + i;
            
        System.out.print("\nIterative: "+sum);
        System.out.println("\nRecursive: "+sumOfNatural(num));

    }
    
}
