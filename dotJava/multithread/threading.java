// 1. Write a program using two threads so that one thread prints even numbers between 0
// and 10 and another thread prints odd numbers between 0 and 10.

package multithread;

class NewThread extends Thread {
    public NewThread(String name) {
        super(name);
        System.out.println("Child thread: " + this);
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {

                if(i%1 != 0 ) {
                    System.out.println("Child thread " + i);
                    
                }
                Thread.sleep(1000);
                // System.out.println("Child thread " + i);
               
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted");
        }
        // System.out.println("Child thread exiting");
    }
}

public class threading {
    public static void main(String args[]) {
        Thread t = Thread.currentThread();
        System.out.println("Main thread: " + t);
        NewThread nt = new NewThread("child"); // You can also create multiple objects
        nt.start();
        try {
            for (int i = 0; i < 10; i++) {

                if(i%2 == 0 ) {
                    System.out.println("Main thread: " + i);
                }
                
                Thread.sleep(1000);
            }
        }

        catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        // System.out.println("Main thread exiting.");
    }
}

