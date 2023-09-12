
import java.util.PriorityQueue;
import java.util.Queue;


public class Main {
    public static void main(String args[]) {
    
        Queue<Hasta> acilservis = new PriorityQueue<Hasta>();
        
        acilservis.offer(new Hasta("Murat Bey","Yanik"));
        acilservis.offer(new Hasta("Okan Bey","Bas Agrisi"));
        acilservis.offer(new Hasta("Elif Hanim","Apandisit"));
        acilservis.offer(new Hasta("Oguz Bey","Yanik"));
        acilservis.offer(new Hasta("Merve Hanim","Yanik"));
        acilservis.offer(new Hasta("Gizem Hanim","Apandisit"));
        acilservis.offer(new Hasta("Esma Hanim","Migren"));
        
        int i = 1;
        
        while(acilservis.isEmpty() != true){
            System.out.println("**********************");
            System.out.println(i + ".sirada");
            System.out.println("**********************");
            System.out.println(acilservis.poll());
            System.out.println("**********************");
            i++;
 
            
        }
        
        
        
        
        
        
        
        
        
        
        
    }
}
