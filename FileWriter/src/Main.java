
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String args[]) {
        
        FileWriter writer = null;
        
        try {
            writer = new FileWriter("dosya.txt",true);
            
            //writer.write("Mesut Ozlahlan\n");
            //writer.write("Murat Ozlahlan\n");
            writer.write("Oguz Artiran\n");
            
        } catch (IOException ex) {
            System.out.println("Dosya olusurken IOException olustu...");
        }
        finally{
            
            if(writer != null){
                try {
                    writer.close();
                    
                }
                catch(IOException ex){
                    System.out.println("Dosya Kapatilirken bir hata olustu...");
                    
                }
            }
        }
        
    }
}
