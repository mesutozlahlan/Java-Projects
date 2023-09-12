
import java.util.Scanner;


public class Main {

    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Matematik ve Fizik Problemleri Programina Hosgeldiniz...");
        
        String islemler = "Islemler...\n"
                         +"1. Daire Alani Hesaplama\n"
                         +"2. Ucgen Cevresi Hesaplama\n"
                         +"3. 2 Vektorun Ic Carpimini Hesaplama\n"
                         +"Cikis : q";
        
        while(true){
            System.out.println(islemler);
            System.out.print("Islemi Seciniz : ");
            String islem = scanner.nextLine();
            
            if(islem.equals("q")){
                System.out.println("Programdan Cikiliyor...");
                break;
            }
            else if(islem.equals("1")){
                
                System.out.print("Dairenin Yaricapi : ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                
                Problem.Matematik.daireAlan(yaricap);
                
            }
            else if(islem.equals("2")){
                
                System.out.print("Kenar 1: ");
                int kenar1 = scanner.nextInt();
                System.out.print("Kenar 2: ");
                int kenar2 = scanner.nextInt();
                System.out.print("Kenar 3: ");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();
                Problem.Matematik.ucgenCevresi(kenar1, kenar2, kenar3);
            
            }
            else if(islem.equals("3")){
                Vec vec1 = new Vec("Vektor1");
                Vec vec2 = new Vec("Vektor2");
                
                Problem.Fizik.icCarpim(vec1, vec2);
                                
                
            }
            else{
                System.out.println("Gecersiz Islem...");
            }

        }

    }
}
