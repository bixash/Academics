package areaCircle;

public class areaCircle {
    public static void main(String[] args) {
         float radius = Integer.parseInt(args[0]);
         double PI = 3.14;
         double area = radius*radius*PI;
         double circumference = 2*PI*radius;

         System.out.println("Area is "+area);
         System.out.println("Circumference  is "+circumference );

    }
}
