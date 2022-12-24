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

    public float addDistance() {
        return (feet + inches);
    }
    public float compareDistance() {
        return (feet + inches);
    }

}
public class MyDistance {
    
}
