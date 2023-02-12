import java.util.*;

public class sort {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Kathmandu");
        list.add("Dharan");
        list.add("Pokhara");
        list.add("Mugling");
        list.add("Hetauda");
        list.add("Patan");

        System.out.println("Before sort:");
        System.out.println(list);

        System.out.println("After sorting:");
        Collections.sort(list);

        System.out.println(list);
    }

}
