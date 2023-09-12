
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;



public class ObjeyiYaz {
    public static void main(String[] args){
        
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))){
            
            Ogrenci ogrenci1 = new Ogrenci("Mustafa Murat", 1234,"Bilgisayar Muhendisligi");
            Ogrenci ogrenci2 = new Ogrenci("Oguz", 678, "Finansal Matematik");
            
            out.writeObject(ogrenci1);
            out.writeObject(ogrenci2);
            
            
            
        } catch (FileNotFoundException ex) {

            System.out.println("Dosya Bulunamadi...");
        } catch (IOException ex) {

            System.out.println("Dosya Acilirken IOException Olustu...");
        }
    }
}
