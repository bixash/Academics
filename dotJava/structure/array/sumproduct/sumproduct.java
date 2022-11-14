//30. Write a program find sum, product, and 
//average of 10 floating point numbers stored in
//an array.

package array.sumproduct;
// import java.util.Scanner;
public class sumproduct {
    public static void main(String[] args) {
        
        float sum=0, average, product =1;

        float tenElt[]= {1.1F, 2.0F, 3, 4, 5.5F, 6, 7, 8, 9.6F, 0};

        for (int i = 0; i < tenElt.length; i++) {
            
            sum = sum + tenElt[i];
            product = product * tenElt[i];
        }

        average = (sum / 10);


        System.out.println("\nSum: "+sum+"\nAverage: "+average+"\nProduct: "+product);
    } 
}

