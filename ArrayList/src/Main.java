
import java.util.ArrayList;


public class Main {
    public static void yazdir(ArrayList<String> a){
        
        for(int i = 0; i < a.size();i++){
            
            System.out.println("Element " + (i+1) + ": " + a.get(i));
        }
    }

    public static void main(String args[]) {
     
        ArrayList<String> arraylist = new ArrayList<String>();
        
        
        
        arraylist.add("Metallica");
        arraylist.add("Guns' n Roses");
        arraylist.add("Black Sabbath");
        arraylist.add("Iron Madien");
        arraylist.add("Metallica");
        
        //arraylist.remove(1);
        
        //System.out.println(arraylist.indexOf("Metallica"));
        
        
       /* for(int i = 0 ;i < arraylist.size(); i++){
            System.out.println(arraylist.get(i));
        }*/
        
       
       arraylist.set(4, "Megadeth");
       
        yazdir(arraylist);
      
        
        
    }
}
