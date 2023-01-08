// 3. Assume that a bank maintains two kinds of account for its customers, one called
// savings account and the other current account. The savings account provides compound
// interest and withdrawal facilities but no cheque book facility. The current account
// provides cheque book facility but no interest. Current account holders should also
// maintain a minimum balance and if the balance falls below this level, a service charge
// is imposed.
// Create a class Account that stores customer name, account number and type of account.
// From this derive the classes Curr_acct and Sav_acct to make them more specific to
// their requirements. Include the necessary method in order to achieve the following
// tasks:
// a. Accept deposit from a customer and update the balance.
// b. Display the balance.
// c. Compute and deposit interest.
// d. Permit withdrawal and update the balance.
// e. Check for the minimum balance, impose penalty, if necessary, and update the
// balance

package inherit.bank;

class Account {

    int balance;
    int ac_num; 
    double rate = 0.05;
    String name; 
    String type;

    public Account() {
        
    }
    public Account(int balance) {
        this.balance = balance;
    }

    public void getBalance () {
        System.out.println(balance);
    }

    public int deposit(int amount) {
        balance += amount;
        System.out.println("\n Deposited amount: "+amount);
        return balance;
    }

    public void withdraw(int amount) {
        if (amount > balance) 
            System.out.print("\nWithdraw failed! Not enough balance!");
        else  {
            balance -= amount;
            System.out.print("\nWithdrawn Amount: "+ amount);
        }
            
    }

}

class Savings extends Account {
   
    // public Savings() {
        
    // }

    public Savings (int balance) {
         this.balance=balance;
    }
    public double calculateInterest() {

        int interest_amount = (int)(rate) * balance;
        
        System.out.println(interest_amount);
        return interest_amount;
    }

    public int afterInterest() {

        balance = balance + (int)calculateInterest();
        return balance;
    }

    
    
}


class Current extends Account {

  
    int min_balance; 

    // public Current () {
        
    // }

    public Current (int balance) {
        super(balance);
    }
    
    public void checkMinbalance(int min_balance) {
        int penalty = 0; 
        if (balance >= min_balance) 
            
            System.out.print("\nPenalty: "+penalty);
        else  {
            penalty += 1000;
            System.out.print("\nPenalty: "+penalty);
        }
            
    }
}


public class bank {
    
    public static void main(String[] args) {
        
        Savings s = new Savings(50000);
        Current c = new Current(7000);
        

        s.getBalance();
        s.calculateInterest();
        s.getBalance();
        c.getBalance();

    }
}
