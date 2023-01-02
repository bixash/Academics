// 6. Create a class called Time with three attributes hours, minutes, and seconds. Use
// appropriate constructors to initialize instance variables. Use methods to display the time
// in hh:mm:ss format and add two time objects. Implement the class to add and display
// time objects.

package oop.time;

class Time {

        private int hours;
        private int minutes;
        private int seconds;

        public Time() {
            
        }
        public Time(int hours, int minutes, int seconds) {
           this.hours = hours;
           this.minutes = minutes;
           this.seconds = seconds;

        }

        public void displayTime() {

            System.out.println(hours+":"+minutes+":"+seconds);
        }
        
        public Time addTime(Time t) {
            Time tt = new Time();
            tt.hours = hours + t.hours;
            tt.minutes = minutes + t.minutes;
            tt.seconds = seconds + t.seconds;

            if(tt.hours > 12) {
                tt.hours -= 12;
            }
            if(tt.minutes >= 60)
            {
                tt.hours += 1;
                tt.minutes -= 60; 

                if(tt.hours > 12) {
                    tt.hours = tt.hours-12;
                } 
            }
            if(tt.seconds >= 60)
            {
                tt.minutes += 1;
                tt.seconds -= 60;  
                if(tt.minutes >= 60)
                {
                    tt.hours += 1;
                    tt.minutes -= 60; 
                    
                    if(tt.hours > 12) {
                        tt.hours = tt.hours-12;
                    } 
                }
            }
            // System.out.println(dd.feet+"' "+dd.inches+"\" ");

            return tt;
        }
       

}       

public class MyTime {


    public static void main(String[] args) {
        
        Time t1 = new Time(2,24,5);
        Time t2 = new Time(10, 20, 30);
        Time t3 = new Time();

        System.out.print("\nT1 Time: ");
        t1.displayTime();

        System.out.print("T2 Time: ");
        t2.displayTime();

        t3 = t1.addTime(t2);
        System.out.print("\nAdded: ");
        t3.displayTime();

    }

    
}
