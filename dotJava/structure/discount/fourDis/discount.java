// 4. Write a program to calculate discount on the basis of following assumption:
// a) If purchased amount is greater than or equal to 5000, discount is 10%
// b) If purchased amount is greater than or equal to 4000 and less than 5000, discount is 7%
// c) If purchased amount is greater than or equal to 3000 and less than 4000, discount is 5%
// d) If purchased amount is greater than or equal to 2000 and less than 3000, discount is 3%
// e) If purchased amount is less than 2000, discount is 2%


package discount.fourDis;
import java.util.Scanner;
public class discount {

    public static void main(String[]args) {

        
       try(Scanner scan = new Scanner(System.in))
       {
        double discount = 0;
        System.out.print("\nEnter a marked price: ");
        float markedPrice = scan.nextFloat();

        if( markedPrice >= 5000) {
            discount = markedPrice * 0.1;
        } 
        else if(markedPrice >= 4000){
            discount = markedPrice * 0.07;
        }
        else if(markedPrice >= 3000){
            discount = markedPrice * 0.05;
        }
        else if(markedPrice >= 2000){
            discount = markedPrice * 0.03;
        }
        else {
            discount = markedPrice * 0.02;
        }

        System.out.print("Discount Price: "+ discount);

       }


    }

}