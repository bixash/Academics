// 4. Write a class Distance containing private variables feet of type int and inches of type
// float, suitable constructors, and two methods addDistance and compareDistance for
// adding and comparing two distance objects. Write a separate class MyDistance
// containing main method to create use distance objects. 

package oop.distance;


class Distance {
    private int feet;
    private float inches;

    public Distance () {

    }

    public Distance (int feet, float inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public int getFeet() {
        return feet;
    }
    public float getInches() {
        return inches;
    }

    public void addDistance(Distance d) {
        Distance dd = new Distance();
        dd.feet = feet + d.feet;
        dd.inches = inches + d.inches;
        if(dd.inches >= 12)
        {
            dd.feet += 1;
            dd.inches -= 12;  
        }
        System.out.println(dd.feet+"' "+dd.inches+"\" ");
    }


    public void compareDistance(Distance d) {
        if(feet > d.feet)
            System.out.println("Greater: "+ feet+"' "+  inches+"\" ");
        else if(feet < d.feet)
            System.out.println("Greater: "+ d.feet+"' "+  d.inches+"\" ");
        else {
            if(inches > d.inches)
                System.out.println("Greater: "+ feet+"' "+  inches+"\" ");
            else if(inches > d.inches)
                System.out.println("Greater: "+ d.feet+"' "+  d.inches+"\" ");
            else
                System.out.println("Both are equal! ");
        }
        
    }

}




public class MyDistance {
    public static void main(String[] args) {
        
        Distance d1 = new Distance(2,4);
        Distance d2 = new Distance(3,5);
        // Distance d3 = new Distance();

       
        System.out.print("Added: ");
        d2.addDistance(d1);
    
        d1.compareDistance(d2);

        
    } 
}
