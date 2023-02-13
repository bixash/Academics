package serializable;

import java.io.*;

public class serialization {
    public static void main(String[] args) {
        try {
            student s1 = new student(211, "Ram");
            FileOutputStream fout = new FileOutputStream("serial.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}