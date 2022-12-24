package oop.box;

public class Box {

    private int width;
    private int length;
    private int depth;
    
    public Box() {

    }
    public Box (int width, int length, int depth) {
        this.width = width;
        this.length = length;
        this.depth = depth;
    }
    public int findVolume() {
        return width * length * depth;
    }
    public int findSurfaceArea() {
        return 2 * (width * length + width*depth + depth *length);

    } 

}
