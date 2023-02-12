package threadextend;

class demoThread extends Thread {


    public Thread t;
    public String threadname;
    public demoThread(String name){
        threadname = name;
        // t = new Thread(this, threadname);
        System.out.println(name+" thread created");
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(threadname+" thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(threadname+" interrupted");
        }
        System.out.println(threadname+" thread exiting");
    }

    public void start(){
        
        if(t == null) {
            t = new Thread(this, threadname);
            t.start();
        }
        
    }

}


public class newExtend {

    public static void main(String[] args) {
        demoThread d1 = new demoThread("one");
        demoThread d2 = new demoThread("two");
        d1.start();
        d2.start();

    }
    
}
