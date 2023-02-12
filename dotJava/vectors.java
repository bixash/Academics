import java.util.Vector;

public class vectors {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<Integer>();
        // add element
        for (int i = 10; i <= 20; i++) {
            v1.add(i);
        }
        // display
        System.out.println(v1);
        System.out.println("Item at index 6=" + v1.get(6));

        // remove
        v1.remove(5);
        System.out.println("After removing Item at index 5");
        System.out.println(v1);

        // size
        System.out.println("size of vector=" + v1.size());

        v1.clear();
        System.out.println("After clearing vector object");
        System.out.println(v1);
    }
}