// 2. Write a class Rectangle containing a private variables length and breadth of type int,
// suitable constructors, and two methods findArea and findPerimeter to find area and
// perimeter of rectangles respectively. Write a separate class MyRectangle containing
// main method to create and use rectangle objects.


package oop.rectangle;

class Rectangle {
    private int length;
    private int breadth;


    public Rectangle(int length, int breadth ) {
        this.length = length;
        this.breadth = breadth;
    }

    public int findArea() {
        return length * breadth;
    }
    public int findPerimeter() {
        return 2*(length + breadth);
    }
}


public class MyRectangle {

    public static void main(String[] args) {
        
        Rectangle r1 = new Rectangle(5,5);

        System.out.println("Area: "+ r1.findArea());
        System.out.println("Perimeter: "+ r1.findPerimeter());

    }
    
}
