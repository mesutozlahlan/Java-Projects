
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;




public class Main {

    public static void main(String args[]) {
        
        List<Integer> list = new LinkedList<Integer>();
        
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread calisiyor...");
                
                for(int i = 0 ; i < 1000000 ; i++){
                    
                    if(Thread.currentThread().isInterrupted()){
                        
                        System.out.println("Kesintiye ugradi...");
                        return;
                        
                    }
                    
                    list.add(i);
  
                }
                System.out.println("Thread kesintiye ugramadan isini bitirdi...");
                
                
                /*for(int i = 1 ; i <= 10 ; i++){
                    System.out.println("Thread Yaziyor : " + i);
                    System.out.println("Uykumun " + i + ". saniyesindeyim...");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        System.out.println("Uyku bolundu...");
                    }
                    
                }
            }*/
            }      
        });
       
        t.start();
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        t.interrupt();
        






    }
}
