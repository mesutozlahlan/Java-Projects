
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;



public class ObjeyiYaz {
    public static void main(String[] args){
        
        Ogrenci ogrenci = new Ogrenci("Mustafa Murat",1234,"Bilgisayar Muhendisligi");
        
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))){
            
            Ogrenci.setOgrenci_sayisi(100);
            
            out.writeObject(ogrenci);
            
            
            
            
        } catch (FileNotFoundException ex) {

            System.out.println("Dosya Bulunamadi...");
        } catch (IOException ex) {

            System.out.println("Dosya Acilirken IOException Olustu...");
        }
    }
}
