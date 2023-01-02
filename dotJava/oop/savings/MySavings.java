// 7. Create class SavingsAccount. Use a static variable annualInterestRate to store the
// annual interest rate for all account holders. Each object of the class contains a private
// instance variable savingsBalance indicating the amount the saver currently has on
// deposit. Provide method calculateMonthlyInterest to calculate the monthly interest by
// multiplying the savingsBalance by annualInterestRate divided by 12. This interest
// should be added to savingsBalance. Provide a static method modifyInterestRate that
// sets the annualInterestRate to a new value. Write a program to test class
// SavingsAccount. Instantiate two savingsAccount objects, saver1 and saver2, with
// balances of $2000.00 and $3000.00, respectively. Set annualInterestRate to 4%, then
// calculate the monthly interest and print the new balances for both savers. Then set the
// annualInterestRate to 5%, calculate the next month's interest and print the new balances
// for both savers.

package oop.savings;


class Savings {
    static float InterestRate;
    private float balance;
    // private float interestAmount;
   
    public Savings() {

    }
    public Savings(float balance) {
        this.balance = balance;
    }

    public float calculateMonthlyInterest() {
        float interestAmount;

        interestAmount = (balance*InterestRate)/12;
        balance += interestAmount;
        // display();

        return interestAmount;
    }
    public void display() {
        System.out.println(balance);
    }

    public static float modifyInterestRate(float x) {
        return InterestRate = x;
    }
    

}
public class MySavings {
    public static void main(String[] args) {
        Savings.modifyInterestRate(0.04f);
        Savings s1 = new Savings(2000);
        Savings s2 = new Savings(3000);

        System.out.print("\n## Initial Balance ##");
        System.out.print("\nSaver1: ");
        s1.display();
        System.out.print("Saver2: ");
        s2.display();


        System.out.print("\n### Interest rate 4% ###");
        System.out.print("\n--- First month balance ---");

        s1.calculateMonthlyInterest();
        System.out.print("\nSaver1: ");
        s1.display();
        
        s2.calculateMonthlyInterest();
        System.out.print("Saver2: ");
        s2.display();


        Savings.modifyInterestRate(0.05f);

        System.out.print("\n### Interest rate 5% ###");
        System.out.print("\n--- Second month balance ---");

        s1.calculateMonthlyInterest();
        System.out.print("\nSaver1: ");
        s1.display();
        
        s2.calculateMonthlyInterest();
        System.out.print("Saver2: ");
        s2.display();


        

        
    }
}
