// 11. Write a program using recursive and iterative method to find nth Fibonacci number.
package oop.fibonacci;

public class fibonacci { 

    static int fibo(int num) {
        if (num == 1 ) 
            return 1;
        else if (num == 2)
            return 1;
        else 
            return (fibo(num-1)+ fibo(num-2));
    }
    
    public static void main(String[] args) {
        
        int num = 7;
        int a = 0, b = 1, c = 0;
    
        for (int i = 1; i < num; i++) {
            c = a + b;
            a = b;
            b = c;
           
        }
            
        System.out.print("\nIterative: "+ c);
        System.out.println("\nRecursive: "+ fibo(num));

    }
    
}
