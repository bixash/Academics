// 5. Write a class Student with name, roll number, and marks in five subjects. Add two
// methods to calculate total and percentage of marks obtained. Use suitable constructors.
// Use this class to find percentage and division of five students.

package oop.student;

class Student {
    public String name;
    public int roll;
    public int[]marks; 

    static int sub = 5;

    public Student (String name, int roll, int[]marks) {

        this.name = name;
        this.roll = roll;
        this.marks = marks;
        // getMarks();
        
    }

    
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

    public void display() {
        System.out.println("Name: "+name+"||Roll no: "+roll+"||Total: "+total()+"||Percent: "+findPercent());

    }
    // public void display() {
    //     System.out.println("\n"+name+ "| "+roll+"| "+total()+"| "+findPercent());

    // }
}

public class MyStudent {
    public static void main(String[] args) {
        
        int m[]={61,12,64,55,6};
        Student s = new Student("Bikash   ", 1, m);
        
        int m1[]={11,52,44,55,6};
        Student s1 = new Student("Aarati   ", 2, m1);

        int m2[]={15,52,74,5,56};
        Student s2 = new Student("Pooja    ", 3, m2);

        int m3[]={13,20,54,55,6};
        Student s3 = new Student("Aaradhana", 4, m3);

        int m4[]={21,24,34,75,6};
        Student s4 = new Student("Prasamsha", 5, m4);

        // System.out.println("\nName| Roll no| Total| Percent ");
        System.out.print("\n");
        s.display();
        s1.display();
        s2.display();
        s3.display();
        s4.display();
          
            
        
        
    }
}

