import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjeyiOku {
    public static void main(String[] args){
        
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenci.bin"))){
            
            Ogrenci ogrenci = (Ogrenci)in.readObject();
            System.out.println(ogrenci);
            System.out.println("Ogrenci Sayisi : " + Ogrenci.getOgrenci_sayisi());
        } catch (FileNotFoundException ex) {

            System.out.println("Dosya bulunamadi...");
        } catch (IOException ex) {
            
            System.out.println("Dosya acilirken IOException Olustu...");
        } catch (ClassNotFoundException ex) {
            
            System.out.println("Sinif Bulunamadi...");
        }
          
    }
}
