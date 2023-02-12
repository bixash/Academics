// runs only when using code runner, java debugger doesn't work 

// import java.util.*;
class NewThread implements Runnable {
    public Thread th;

    public NewThread(String name) {
        th = new Thread(this, name);
        System.out.println("Child thread: " + th);
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child thread " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted");
        }
        System.out.println("Child thread exiting");
    }

    public void start() {
    }
}

public class Runnables {
    public static void main(String args[]) {
        Thread t = Thread.currentThread();
        System.out.println("Main thread: " + t);
        NewThread nt = new NewThread("child"); // You can also create multiple objects
        // NewThread nt2 = new NewThread("sec child"); // You can also create multiple objects
        nt.th.start();
        // nt2.th.start();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}
