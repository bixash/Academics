import java.util.*;

class iterator {
    public static void main(String args[]) {
        // Creating and adding elements
        TreeSet<String> al = new TreeSet<String>();
        al.add("Aanai");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        // Traversing elements
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
