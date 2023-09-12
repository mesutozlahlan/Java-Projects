
public class Main {
    public static void main(String[] args){
        
//        int[] a = {1,2,3,4,5};
//        System.out.println(a[4]);
//       System.out.println("Burasi calisiyor...");
         
        try {
            //int a = 30 / 0;
            int [] a = {1,2,3,4,5};
            System.out.println(a[6]);
            
            int b = 30 / 0;
            
        }
        catch(ArithmeticException e){
            System.out.println("Bir sayi 0'a bolunemez...");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Arrayin boyunu astiniz...");
        }
        catch(Exception e){
            System.out.println("Bir hata olustu...");
            e.printStackTrace();
            
        }
  
        System.out.println("Burasi Calisiyor...");

    }
    
}
