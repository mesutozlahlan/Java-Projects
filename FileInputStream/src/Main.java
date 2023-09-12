
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String args[]) {
        
        FileInputStream fis = null;
        
        try {
            fis = new FileInputStream("dosya.txt");
            
            int deger;
            
            String s = "";
            
            int say = 0;
            
            fis.skip(5);
            
            while((deger = fis.read())!= -1) {
                
                s += (char) deger;
                
                say++;
                
                if(say == 10){
                    break;
                }
                
            }
            System.out.println("Dosyanin 5.yerinden itibaren 10 karakter : " + s);
            
            /*while((deger = fis.read())!= -1){
                
                s += (char) deger;
                
            }
            
            System.out.println("Dosya icerigi : " + s);*/
            
            //fis.skip(5);
            
             //System.out.println("Okunan karakter : "+ (char)(fis.read()));
             //System.out.println("Okunan karakter : "+ (char)(fis.read()));
              
            /*System.out.println("Birinci karakter : "+ (char)(fis.read()));
            System.out.println("Ikinci karakter : "+ (char)(fis.read()));
            System.out.println("Ucuncu karakter : "+ (char)(fis.read()));
            */
            
        }
        catch (FileNotFoundException ex) {
            System.out.println("File bulunamadi...");
        } catch (IOException ex) {
            System.out.println("Dosya okunurken hata olustu...");
        }
        finally {
            try {
                if(fis != null){
                     fis.close();
                    
                }
            }
           
            catch (IOException ex) {
                System.out.println("Dosya kapatilirken bir hata olustu...");
            }
            
        }
    }
}

