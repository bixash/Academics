// 1. Write a class Circle containing private variable radius of type float, suitable
// constructors, and two methods findArea and findCricumference to find area and
// circumference of circles respectively. Write a separate class MyCircle containing main
// method to create and use circle objects.

package oop.circle;

class Circle {
    private float radius;

    public Circle() {

    }

    public Circle(float radius) {
        this.radius = radius;
    }

    public float findArea() {
        return (float) (radius * radius * Math.PI);
    }
    // public static float findArea(float radius) {
    // return (float)(radius *radius* Math.PI);
    // }
    // public static float findCricumference(float radius) {
    // return (float)(radius *radius* Math.PI);
    // }

    public float findCircumference() {
        return (float) (2 * radius * Math.PI);
    }
}


public class MyCircle {

    public static void main(String[] args) {

        Circle c1 = new Circle(5);

        System.out.println("Area: " + c1.findArea());
        System.out.println("Circumference: " + c1.findCircumference());

    }

}

