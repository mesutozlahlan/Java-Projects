
import java.util.Scanner;


public class Main {

    public static void main(String args[]) {
   
        Scanner scanner = new Scanner(System.in);
        
        String islemler = "Islemler...\n"
                         +"1.Kare Alan Hesapla\n"
                         +"2.Ucgen Alan Hesapla\n"
                         +"3.Daire Alan Hesapla\n"
                         +"Cikis : q";
        
        while(true){
            System.out.println(islemler);
            System.out.print("Hangi Seklin Alanini Hesaplamak Istiyorsunuz : ");
            String sekil_turu = scanner.nextLine();
            Sekil sekil = null;
            if(sekil_turu.equals("q")){
                System.out.println("Programdan Cikiliyor...");
                break;
            }
            else if(sekil_turu.equals("1")){
                System.out.print("Karenin Kenari : ");
                int kenar = scanner.nextInt();
                scanner.nextLine();
                
                sekil = new Kare("Kare1",kenar);
                sekil.alan_hesapla();
            
            }
            else if(sekil_turu.equals("2")){
                System.out.print("Kenar 1 : ");
                int kenar1 =scanner.nextInt();
                System.out.print("Kenar 2 : ");
                int kenar2 = scanner.nextInt();
                System.out.print("Kenar 3 : ");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();
                
                sekil = new Ucgen("Ucgen 1", kenar1, kenar2, kenar3);
                
                sekil.alan_hesapla();
            }
            else if(sekil_turu.equals("3")){
                System.out.print("Dairenin Yaricapi : ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                sekil = new Daire("Daire 1", yaricap);
                
                sekil.alan_hesapla();
                        
            }
            else {
                System.out.println("Gecersiz Islem...");
            }
       
        }
    }
}
