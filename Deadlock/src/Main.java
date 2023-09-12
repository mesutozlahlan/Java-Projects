
import java.lang.System.Logger;
import java.lang.System.Logger.Level;



public class Main {
    public static void main(String args[]) {
        
        DeadlockOrnegi deadlock = new DeadlockOrnegi();
        
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                deadlock.thread1Fonksiyonu();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                deadlock.thread2Fonksiyonu();
            }
        });
        
        thread1.start();
        thread2.start();
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        
        
        
        deadlock.threadOver();
        
        
        
        
        
        
    }
}
