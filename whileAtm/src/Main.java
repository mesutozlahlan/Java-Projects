import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        
    Scanner scanner = new Scanner(System.in);
        int bakiye = 1000;
        String islemler = """
                          1. islem : Bakiye Ogrenme
                          2. islem : Para Cekme
                          3. islem : Para yatirma
                          Cikis icin q'a basin""";
                          
    System.out.println("*****************************");
    System.out.println(islemler);
    System.out.println("*****************************");
    
    while(true){
        
        System.out.print("Islemi seciniz: ");
        String islem = scanner.nextLine();
        
        if(islem.equals("q")){
            System.out.println("Programdan cikiliyor");
            break;
        }
        else if(islem.equals("1")){
            System.out.println("Bakiyeniz : " +bakiye);
        }
         else if(islem.equals("2")){
            System.out.println("Cekmek istediginiz tutar : ");
            int tutar = scanner.nextInt();
            scanner.nextLine();
            if(bakiye-tutar<0){
                System.out.println("Yeterli bakiye yok.Bakiyeniz : " +bakiye);
            }
            else {
             bakiye -= tutar;
             System.out.println("Yeni bakiyeniz : " +bakiye);
                  }
         }
         else if(islem.equals("3")){
            System.out.println("Yatırmak istediginiz tutar : ");
            int tutar = scanner.nextInt();
            scanner.nextLine();
            
            bakiye += tutar;
            
            System.out.println("Yeni bakiyeniz : " +bakiye);
        }
         else 
             System.out.println("Gecersiz islem");
         
            
            
        
        
    }
        
    }
}
