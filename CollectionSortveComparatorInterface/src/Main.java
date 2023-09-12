
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


class BuyuktenKucugeString implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        
        return -o1.compareTo(o2);
        
    }
    
}


class Player implements Comparable<Player> {
    
    private String isim;
    
    private int id;
    
    public Player(String isim,int id){
        this.isim = isim;
        this.id = id;   
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "|||| ID: " + id + " Isim :" + isim + " |||";
    }

    @Override
    public int compareTo(Player o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
class KucuktenBuyugePlayer implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        if(o1.getId() < o2.getId()){
            return -1;
        }
        else if(o1.getId() > o2.getId()){
            return 1;
        }
        return 0;
    }
    
}
class BuyuktenKucugePlayer implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        if(o1.getId() < o2.getId()){
            return 1;
        }
        else if(o1.getId() > o2.getId()){
            return -1000;
        }
        return 0;
    }
    
}
class KucuktenBuyugeString implements Comparator<Player>{

    @Override
    public int compare(Player o1, Player o2) {
        return o1.getIsim().compareTo(o2.getIsim());
    }
    
}
public class Main {
    public static void main(String[] args){
        
       /* List<String> list = new ArrayList<String>();
        
        list.add("Java");
        list.add("C++");
        list.add("Python");
        list.add("Php");
        list.add("Go");
        
        Collections.sort(list,new BuyuktenKucugeString());
        
        for(String s : list){
            System.out.println(s);
        }*/
        
        List<Player> list_player = new ArrayList<Player>();
       
       list_player.add(new Player("Murat", 5));
       list_player.add(new Player("Emre", 1));
       list_player.add(new Player("Oguz", 10));
       list_player.add(new Player("Yusuf", 4));
       
       //Collections.sort(list_player,new KucuktenBuyugePlayer());
       //Collections.sort(list_player,new BuyuktenKucugePlayer());
       //Collections.sort(list_player,new KucuktenBuyugeString());
       
       Collections.sort(list_player, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return -o1.getIsim().compareTo(o2.getIsim());
            }
        });
        

       for(Player p : list_player){
            System.out.println(p);
        }
   
    }
    
}