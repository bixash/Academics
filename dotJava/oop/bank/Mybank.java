// 8. Design a class to represent a bank account. Include the following members:
// Data members:
// Name of the depositor
// Account number
// Type of account
// Balance amount in the account

// Methods:
// To assign initial values (constructor or method)
// To deposit an amount
// To withdraw an amount after checking balance
// To display the name and balance


package oop.bank;



class Account {
    private String name;
    private String acc_no;
    private String type;
    private float balance;

    

    public Account() {

    }
    public Account(String name, String acc_no, String type, float balance) {
        this.name = name;
        this.acc_no = acc_no;
        this.type = type;
        this.balance = balance;
        
    }
    // float inital = balance;
    public void displayInfo() {
        
        System.out.print("\nName: "+ name);
        System.out.print("\nAccount no: "+ acc_no);
        System.out.print("\nType: "+ type);
        // System.out.print("\nInitial Balance: "+ inital);
        System.out.println("\nBalance: "+ balance);
    }

    public void deposit(float amount) {

        balance += amount;
        System.out.print("\nDeposited Amount: "+ amount);
    }

    public float checkBalance() {

        return balance;
    }

    public void withdraw(float amount) {

        if (checkBalance() < amount) 
            System.out.print("\nSorry, Not enough balance!!");
        else {
            balance -= amount;
            System.out.print("\nWithdrawn Amount: "+ amount);
        }
    }

}


public class Mybank {
    
    public static void main(String[] args) {
        
        Account ac = new Account("Bikash","129120120","Savings",25000);

        ac.displayInfo();
        ac.deposit(50000);
        ac.withdraw(10000);
        System.out.println("\nCurrent Balance: "+ac.checkBalance());
        ac.displayInfo();
    }
}
