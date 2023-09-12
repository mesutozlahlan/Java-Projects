
import java.util.ArrayList;


public class Main {

    public static void main(String args[]) {
       
        ArrayList<String> arraylist = new ArrayList<String>();
        
        //Arraylist<double> arraylist2 = new ArrayList<double>();
        
        ArrayList<Integer> arraylist2 = new ArrayList<Integer>();
        
       
        for(int i = 0; i < 10; i++){
            
            arraylist2.add(Integer.valueOf(i*4));//Autoboxing
        }
        for(int i = 0; i< arraylist2.size();i++){
            System.out.println(arraylist2.get(i).intValue());//Unboxing
        
        }
        
    }
}
