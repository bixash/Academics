// package multithread;

// class NewThread implements Runnable {
//     public Thread t;

//     public NewThread(String name) {
//         t = new Thread(this, name);
//         System.out.println("Child thread: " + t);
//     }

//     public void run() {
//         try {
//             for (int i = 5; i > 0; i--) {
//                 System.out.println("Child thread " + i);
//                 Thread.sleep(500);
//             }
//         } catch (InterruptedException e) {
//             System.out.println("Child interrupted");
//         }
//         System.out.println("Child thread exiting");
//     }
// }

// public class Runnables {
//     public static void main(String args[]) {
//         Thread t = Thread.currentThread();
//         System.out.println("Main thread: " + t);
//         NewThread nt = new NewThread("child"); // You can also create multiple objects
//         nt.t.start();
//         try {
//             for (int i = 5; i > 0; i--) {
//                 System.out.println("Main thread: " + i);
//                 Thread.sleep(1000);
//             }
//         } catch (InterruptedException e) {
//             System.out.println("Main thread interrupted.");
//         }
//         System.out.println("Main thread exiting.");
//     }
// }
