package serializable;

import java.io.*;

public class deserial {
    public static void main(String args[]) {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("serial.txt"));

            student s = (student) in.readObject();
            System.out.println(s.id + " " + s.name);
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}