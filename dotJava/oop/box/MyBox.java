// 3. Write a class Box with private variables width, height and depth and methods to find
// volume and surface area. Use suitable constructors. Implement the class to find volume
// and surface area of two boxes

package oop.box;
// import oop.box.Box;
public class MyBox {

    public static void main(String[] args) {
        
        Box b1 = new Box(4,5,5);
        
        System.out.println("Box 1: ");
        System.out.println("Volume: "+b1.findVolume());
        System.out.println("Surface Area: "+b1.findSurfaceArea());

        System.out.println("\nBox 2: ");
        Box b2 = new Box(5,6,8);
        System.out.println("Volume: "+b2.findVolume());
        System.out.println("Surface Area: "+b2.findSurfaceArea());
        
    }
    
}
