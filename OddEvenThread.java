// 18. Write a Java program to show even & odd numbers by thread.
public class OddEvenThread {
    
    public static void main(String[] args) {
        // Create instances of EvenThread and OddThread
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();
        
        // Start both threads
        evenThread.start();
        oddThread.start();
    }
}

class EvenThread extends Thread {
    
    public void run() {
        for (int i = 0; i <= 10; i += 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class OddThread extends Thread {
    
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } 
        }
    }
}

