// 5. Write a class Student with name, roll number, and marks in five subjects. Add two
// methods to calculate total and percentage of marks obtained. Use suitable constructors.
// Use this class to find percentage and division of five students.

package oop.student;
import java.util.Scanner;
class Student {
    public String name;
    public int roll;
    public int[]marks; 

    static int sub = 5;
    Scanner sc = new Scanner(System.in);

    public Student () {

    }

    public Student (String name, int roll, int[]marks) {

        this.name = name;
        this.roll = roll;
        this.marks = marks;
        // getMarks();
        
    }

    // public void getMarks () {
    //     for(int i = 0; i<sub; i++) {
    //         marks[i]= sc.nextInt();
    //     }

    // }
    public int total() {
        int sum = 0;
        for(int i=0; i < marks.length; i++) {
            
            sum = sum + marks[i];
        }
        return sum;
    }

    public  int findPercent() {
        
        return total()/sub;
    }
}

public class MyStudent {
    public static void main(String[] args) {
        
        int m[]={61,12,64,55,6};
        Student s = new Student("Bikash", 1, m);
        
        int m1[]={11,52,44,55,6};
        Student s1 = new Student("Aarati", 2, m1);

        int m2[]={15,52,74,5,56};
        Student s2 = new Student("Pooja", 3, m2);

        int m3[]={13,20,54,5,6};
        Student s3 = new Student("Aaradhana", 4, m3);

        int m4[]={21,24,34,5,6};
        Student s4 = new Student("Prasamsha", 5, m4);

        System.out.println("\nName: "+s.name+ "| Roll no: "+s.roll+"| Total: "+s.total()+"| Percent: "+s.findPercent());
        System.out.println("\nName: "+s1.name+ "| Roll: "+s1.roll+"| Total: "+s1.total()+"| Percent: "+s1.findPercent());
        System.out.println("\nName: "+s2.name+ "| Roll: "+s2.roll+"| Total: "+s2.total()+"| Percent: "+s2.findPercent());
        System.out.println("\nName: "+s3.name+ "| Roll: "+s3.roll+"| Total: "+s3.total()+"| Percent: "+s3.findPercent());
        System.out.println("\nName: "+s4.name+ "| Roll: "+s4.roll+"| Total: "+s4.total()+"| Percent: "+s4.findPercent());
          
            
        
        
    }
}

