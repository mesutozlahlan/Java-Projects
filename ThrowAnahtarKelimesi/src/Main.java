
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void mekan_kontrol(int yas) throws IOException{
        
        if(yas < 18) {
            throw new IOException();
        }
        else {
            System.out.println("Mekana hosgeldiniz...");
        }
    }
    public static void main(String args[]) throws IOException  {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen Yasinizi Giriniz:");
        int yas = scanner.nextInt();
        
        
            mekan_kontrol(yas);
            

                
    }
}
