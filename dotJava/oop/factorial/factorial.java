// 9. Write a program using recursive and iterative method to find factorial of a number

package oop.factorial;
// import java.util.Scanner;
public class factorial {


    static int factor(int num) {
        if (num == 1 ) 
            return 1;
        else 
            return num * factor(num-1);
    }
    
    public static void main(String[] args) {
        
        
        int num = 7;
        int fact = 1;
    
        for (int i = 1; i <= num; i++)    
            fact = fact * i;
            
        System.out.print("\nIterative: "+fact);
        System.out.println("\nRecursive: "+factor(num));

    }
    


    
}
