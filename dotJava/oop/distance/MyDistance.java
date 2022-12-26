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

    public Distance addDistance(Distance d) {
        Distance dd = new Distance();
        dd.feet = feet + d.feet;
        dd.inches = inches + d.inches;
        if(dd.inches >= 12)
        {
            dd.feet += 1;
            dd.inches -= 12;  
        }
        return dd;
    }
    public void compareDistance(Distance d) {
        if(feet > d.feet)
        else if(feet < d.feet)
        
        return (feet + inches);
    }

}
public class MyDistance {
    
}
