// 6. Create a class called Time with three attributes hours, minutes, and seconds. Use
// appropriate constructors to initialize instance variables. Use methods to display the time
// in hh:mm:ss format and add two time objects. Implement the class to add and display
// time objects.

package oop.time;

class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void display() {
        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    }

    public Time add(Time other) {
        int totalSeconds = this.seconds + other.seconds;
        int additionalMinutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;

        int totalMinutes = this.minutes + other.minutes + additionalMinutes;
        int additionalHours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        int hours = this.hours + other.hours + additionalHours;

        return new Time(hours, minutes, seconds);
    }
}


public class MyTime {
    public static void main(String[] args) {
        
        Time t1 = new Time(12, 30, 45);
        Time t2 = new Time(1, 15, 20);
        
        t1.display(); // prints "12:30:45"
        t2.display(); // prints "01:15:20"
        
        Time sum = t1.add(t2);
        sum.display();
    }

    
}
