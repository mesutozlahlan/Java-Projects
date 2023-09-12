
import java.util.PriorityQueue;
import java.util.Queue;

class Player implements Comparable<Player>{
    private String isim;
    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public int compareTo(Player player) {

        if(this.id < player.id){
            return -1;
        }
        else if(this.id > player.id){
            return 1;
        }
        else {
            return 0;
        }
            
    }

    @Override
    public String toString() {
        return "Player{" + "isim=" + isim + ", id=" + id + '}';
    }
    
}

public class Main {
    public static void main(String args[]) {

        Queue<Player> queue = new PriorityQueue<Player>();
        
        queue.offer(new Player("Murat",5));
        queue.offer(new Player("Mehmet", 1));
        queue.offer(new Player("Oguz",100));
        
        while(!queue.isEmpty()){
            
            System.out.println("Eleman Cikariliyor : " + queue.poll());
        }
        
        /*
        queue.offer(5);
        queue.offer(1);
        queue.offer(2);
        queue.offer(100);
        
        for(Integer i: queue){
            System.out.println(i);
        }
        System.out.println(queue.peek());
        System.out.println(queue.contains(100));
        while(!queue.isEmpty()){
            System.out.println("Eleman Cikariliyor : " + queue.poll());
        }
        */
 
        
    }
}
