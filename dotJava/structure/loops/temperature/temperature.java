// 17. Write a program that displays the temperatures from 0 degrees Celsius to 100 degrees
// Celsius and its Fahrenheit equivalent. [Hint: F = C * 9/5 + 32]


package loops.temperature;

public class temperature {
    public static void main(String[] args) {


        int celsius;
        float fahrenheit;
       

        System.out.println("\nThe temperatures from 0 degrees Celsius to 100 degrees and its Fahrenheit equivalent: ");

        for (int i = 0; i <= 100; i++) {

            celsius = i;
            fahrenheit = i *(9/5 + 32);
            System.out.println(+celsius+"C = "+fahrenheit+"F");


        }
       

        
    }
}
