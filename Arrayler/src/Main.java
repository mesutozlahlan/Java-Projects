
import java.util.Scanner;


public class Main {
    public static void arrayi_bastir(int[] array){
        
        for(int i = 0 ; i < array.length ;i++){
            System.out.println("Element " + (i+1) + ":" +array[i]);
        }
    }
    public static double ortalamabul(int[] array){
        int toplam = 0;
        
        for(int i = 0 ; i < array.length ; i++){
            toplam += array[i];
        }
        return ((double)toplam /array.length);
    }
    public static void main(String args[]) {
        
        int[] a = new int [5];
        
        int[] b = {10,20,30,40,50,60};
        
        arrayi_bastir(b);
        System.out.println("Ortalama :" + ortalamabul(b));
        
        
        
        
        
       
        
        
        
        
       
    }
}
