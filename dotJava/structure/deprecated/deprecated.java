// 21. The straight-line method of computing the early depreciation of the value of an item is
// given by
// Depreciation = (purchase price – salvage value)/years of service.
// Write a program to determine the salvage value of an item when the purchase price,
// years of service, and the annual depreciation are given.


package deprecated;
import java.util.Scanner;
public class deprecated {
    public static void main(String[] args) {

        
        float price, year, deprecated, salvage; 
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\nEnter purchase price: ");
            price = sc.nextFloat();

            System.out.print("Enter year of service: ");
            year = sc.nextFloat();

            System.out.print("Enter annual depreciation: ");
            deprecated = sc.nextFloat();
        }

        salvage = (float)(price- (deprecated * year));
        System.out.println("\nHence, salvage value of an item is: "+salvage);
    }
    
    
}
