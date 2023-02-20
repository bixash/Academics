// // 1. Write a program using two threads so that one thread prints even numbers between 0
// // and 10 and another thread prints odd numbers between 0 and 10.

// package multithread;
class dumbThread implements Runnable
{
    public Thread t;
    public dumbThread(String name)
    {
        t = new Thread(this, name);
        System.out.println("Child thread: " + t);
    }
    public void run()
    {
        try
        {
            for(int i = 9; i >=0; i = i - 2)
            {
                System.out.println("Child thread " + i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Child interrupted");
        }  
        System.out.println("Child thread exiting");
    }
}
public class threading {

    public static void main(String args[])
    {        
        Thread t = Thread.currentThread();
        System.out.println("Main thread: " + t);
        dumbThread nt = new dumbThread("child");
        nt.t.start();
        try
        {
            for(int i = 10; i >= 1; i = i - 2)
            {
                System.out.println("Main thread: " + i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}


