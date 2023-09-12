
import java.util.Scanner;


public class Main {
    public static void main(String args[]) {
        System.out.println("Kumanda Programina Hosgeldiniz...");
        Scanner scanner = new Scanner(System.in);
        
        String islemler = "Islemler...\n"
                         +"1. Kanallari Goster\n"
                         +"2. Kanal Ekle\n"
                         +"3. Kanal Sil\n"
                         +"4. Kanal Sayisi Ogren\n"
                         +"Cikis icin q'ya basin...";
        
        Kumanda kumanda = new Kumanda();
        
        while(true){
            System.out.println(islemler);
            System.out.print("Islemi Giriniz :");
            String islem = scanner.nextLine();
            
            if(islem.equals("q")){
                System.out.println("Programdan Cikiliyor...");
                break;
            }
            else if(islem.equals("1")){
                kanallariGoster(kumanda);
                
            }
            else if(islem.equals("2")){
                System.out.print("Eklenecek Kanal : ");
                String kanal_ismi = scanner.nextLine();
                kumanda.kanalEkle(kanal_ismi);
                
            }
            else if(islem.equals("3")){
                System.out.print("Silinecek Kanal : ");
                String kanal_ismi = scanner.nextLine();
                
                kumanda.kanalSil(kanal_ismi);
                
            }
            else if(islem.equals("4")){
                System.out.println("Kanal Sayisi : " + kumanda.kanalSayisi());
                
            }
            else {
                System.out.println("Gecersiz Islem...");
            }
        }
        

        
    }
    public static void kanallariGoster(Kumanda kumanda){
        
        if(kumanda.kanalSayisi() == 0){
            System.out.println("Su anda hicbir kanal bulunmuyor...");
        }
        else {
            for(String kanal : kumanda){
                System.out.println("Kanal : "+ kanal);
            }
        }
    }
}
