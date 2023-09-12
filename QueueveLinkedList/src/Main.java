
import java.util.LinkedList;
import java.util.Queue;


public class Main {
    public static void main(String args[]) {
        
        Queue<String> queue = new LinkedList<String>();
        System.out.println(queue.isEmpty());
        queue.offer("Java");
        queue.offer("Python");
        queue.offer("Php");
        queue.offer("C++");
        
        
        //System.out.println(queue.peek());
        
        for(String s: queue){
            System.out.println(s);
        }
        
        System.out.println("*****************");
        //System.out.println("Eleman cikariliyor : " + queue.poll());
        
        for(String s: queue){
            System.out.println(s);
        }
        System.out.println(queue.isEmpty());
        
        while (!queue.isEmpty()){
            System.out.println("Eleman cikariliyor : " + queue.poll());
        }
        
        
        
        
        
    }
}
