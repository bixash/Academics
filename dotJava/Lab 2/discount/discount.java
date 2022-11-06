package discount;
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