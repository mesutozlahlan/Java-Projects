
public class Main {
    public static void main(String args[]) {

        
        try{
            
            String s = null;
            
            System.out.println(s.hashCode());
        }
        catch (NullPointerException e){
            System.out.println("Null Referans Hatasi...");
            
        }
        finally {
            
            System.out.println("Finally blogu calisiyor...");
        }
        
        
    }
}
