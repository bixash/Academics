package ifelse.grade;
import java.util.Scanner;

public class grade {

    public static void main(String[] args) {

        System.out.print("Enter your grade in scale of [A-E]: ");
        char ch;

        try (Scanner scan = new Scanner(System.in)) {
           ch = scan.next().charAt(0);
        }


        switch (ch) {
            case 'A':
                System.out.print("Excellent");
                break;
            case 'B':
                System.out.print("Very Good");
                break;
            case 'C':
                System.out.print("Good");
                break;
            case 'D':
                System.out.print("Satisfactory");
                break;
            case 'E':
                System.out.print("Fail");
                break;
            default:
                break;
        }
    }
    
}
