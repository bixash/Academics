package month;
import java.util.Scanner;
public class month {
    

    /**
     * @param args
     */
    public static void main(String[] args) {

        System.out.print("Enter a month number to find out days of it: ");
        int month;

        try (Scanner scan = new Scanner(System.in)) {
            month = scan.nextInt();
        }

        switch(month) {
            case 1:
            case 8:
            case 3:
            case 10:
            case 5:
            case 7:
            case 12: 
                    System.out.println("31 days");
                    break;

            case 11:
            case 9:
            case 4:
            case 6:
                    System.out.println("30 days");
                    break;

            case 2: 
                    System.out.println("28/29 days");
                    break;
            default:
                    System.out.println("Invalid number");
                    break;


        }
        

    }


}
