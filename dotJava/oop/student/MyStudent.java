// 5. Write a class Student with name, roll number, and marks in five subjects. Add two
// methods to calculate total and percentage of marks obtained. Use suitable constructors.
// Use this class to find percentage and division of five students.

package oop.student;

class Student {
    public String name;
    public int roll;
    public int[]marks = new int[5]; 

    public Student () {

    }

    public Student (String name, int roll, int[] marks) {

        this.name = name;
        this.roll = roll;
        this.marks = marks;
        
    }
    public int addTotal() {
        int sum = 0;
        for(int i=0; i < marks.length; i++) {
            
            sum = sum + marks[i];
        }
        return sum;
    }
    public int findPercentage() {
        
        return (int)(addTotal()/5);
    }
}

public class MyStudent {
    public static void main(String[] args) {
        
        // Student s1 = new Student('b', 10, [10] );
    }
}

