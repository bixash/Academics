//11. Jet Company gives 5% commission to its salesman if their monthly sales are less than
// Rs. 10,000 and a 10% commission if it is equal to or greater than Rs. 10,000. Write a
// program to calculate commission at the end of the month.

package ifelse.commission;

import java.util.Scanner;

public class commission {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            double commission = 0;
            System.out.print("\nEnter a sales price: ");
            float sales = scan.nextFloat();

            if (sales >= 10000) 
                commission = sales * 0.1;
            else 
                commission = sales * 0.05;


            System.out.print("Commission: " + commission);

        }
    }
}
