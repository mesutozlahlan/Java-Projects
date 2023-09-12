
import java.util.HashMap;
import java.util.Map;


public class HashMapMain {
    public static void main(String args[]) {
        
        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
        
        hashMap.put(10, "Java");
        hashMap.put(30, "Python");
        hashMap.put(50, "Php");
        hashMap.put(20, "Php");
        hashMap.put(50, "Javascript");
        
        /*System.out.println(hashMap);
        
        System.out.println(hashMap.get(50));
        System.out.println(hashMap.get(30));
        System.out.println(hashMap.get(100));
        */
        
        for(Map.Entry<Integer,String> entry : hashMap.entrySet()){
            
            System.out.println("Anahtar : " + entry.getKey() + " -----------> Deger : " + entry.getValue());
        }
        
        
        
    }
}
