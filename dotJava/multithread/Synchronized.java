

class CallMe {

    public synchronized void call(String msg) // Also run the program without synchronized
    {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) 
        {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}

 class Caller implements Runnable {
    public String msg;

    public CallMe target;
    public Thread t;

    public Caller(CallMe targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
    }

    public void run() {
        target.call(msg);
    }

}

public class Synchronized {
 public static void main(String args[])
    {
        CallMe target = new CallMe();
        Caller ob1 = new Caller(target, "Hello");
        Caller ob2 = new Caller(target, "Synchronized");
        Caller ob3 = new Caller(target, "World");
        ob1.t.start();
        ob2.t.start();
        ob3.t.start();
        try
        {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }
        catch (InterruptedException e)
        {
            System.out.println("Interrupted");
        }
    
    }
}
