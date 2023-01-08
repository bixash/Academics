// 1. Create a base class named Bonus. The class should contain two fields salesID of type
// String and salesAmount of type double. Include a getBonus method that calculates a
// salesperson’s bonus using bonus = sales * 0.05. Create a derived class named
// PremiumBonus from Bonus. The derived class’s getPremiumBonus method should
// calculate the bonus using bonus = sales * 0.05 + (sales – 2500) * 0.01. Write a class
// with main method to create object of PremiumBonus class and use this object to find
// both bonus and premium bonus.

package inherit.bonus;

class SuperBonus {

    String salesID;
    double sales;

    public SuperBonus(String salesID, double sales) {
        this.salesID = salesID;
        this.sales = sales;
    }

    public double getBonus() {

        return sales * 0.05;
    }

}

class PremiumBonus extends SuperBonus {

  
    public PremiumBonus(String salesID, double sales) {
        super(salesID, sales);
       
    }
    public double getPremuimBonus() {

        return super.getBonus() + (sales - 2500) * 0.01;
    }
}

public class bonus {

    public static void main(String[] args) {

        int sales = 45000;
        PremiumBonus p1 = new PremiumBonus("120ASQZ", sales);
        // PremiumBonus p2 = new PremiumBonus("120ASQZ", sales);
        
        System.out.print("\nBonus: "+  p1.getBonus());
        System.out.print("\nPremuim Bonus: "+  p1.getPremuimBonus());

    }

}
