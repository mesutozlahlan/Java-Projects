
import java.util.Scanner;


public class Main {

    
    
    public static void main(String args[]) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calisanlar Programina Hosgeldiniz...");
        
        String islemler = "Islemler...\n"
                        + "1.Yazilimci Islemleri\n"
                        + "2.Yonetici Islemleri\n"
                        + "Cikis icin q'ya basin\n";
        
        System.out.println("****************************");
        System.out.println(islemler);
        System.out.println("****************************");
        
        while(true){
            
            System.out.print("Islemi Seciniz :");
            String islem = scanner.nextLine();
            
            if(islem.equals("q")){
                
                System.out.println("Programdan Cikiliyor...");
                break;
            }
            
            else if (islem.equals("1")) {
                Yazilimci yazilimci = new Yazilimci("Mesut", "Ozlahlan", 18290051, "Python,Java,C#");
                String yazilimci_islem = "1. Format At\n"
                                        +"2. Bilgileri Goster\n"
                                        +"Cikis icin q'ya basin\n";
                System.out.print(yazilimci_islem);
                
                while(true){
                    System.out.print("Islemi Seciniz :");
                    String  y_islem = scanner.nextLine();
                    
                    if(y_islem.equals("q")){
                        System.out.println("Yazilimci Islemlerinden Cikiliyor...");
                        break;
                    }
                    else if(y_islem.equals("1")){
                        
                        System.out.print("Isletim Sistemi :");
                        String isletim_sistemi = scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                    
                    }
                    else if(y_islem.equals("2")){
                        
                        yazilimci.bilgileriGoster();
                        
                    }
                    else {
                        
                        System.out.println("Gecersiz Yazilimci Islemi...");
                    }
                }
                
            }
            else if (islem.equals("2")) {
                Yönetici yönetici = new Yönetici("Serhat", "Say", 123, 10);
                
                String yönetici_islem = "Yonetici Islemleri}\n"
                                       +"1.Zam Yap\n"
                                       +"2.Bilgileri Goster\n"
                                       +"Cikis icin q'ya basin\n";
                System.out.print(yönetici_islem);
                
                while(true){
                    System.out.print("Islemi Seciniz : ");
                    String y_islem = scanner.nextLine();
                    
                    if(y_islem.equals("q")){
                        System.out.println("Yonetici Islemlerinden Cikiliyor...");
                        break;
                        
                    }
                    else if(y_islem.equals("1")){
                        System.out.print("Yoneticinin ne kadar zam yapmasini istiyorsunuz : ");
                        int zamMiktari = scanner.nextInt();
                        scanner.nextLine();
                        yönetici.zamYap(zamMiktari);
                        
                    }
                    else if(y_islem.equals("2")){
                        yönetici.bilgileriGoster();
                        
                    }
                    else {
                        System.out.println("Gecersiz Yonetici Islemi...");
                    }
                    
                    
                }
                
            }
            else {
                System.out.println("Gecersiz Islem...");
            }
                    
        }
        
        
    }
}
