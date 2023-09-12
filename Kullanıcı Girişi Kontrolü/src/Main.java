import java.util.Scanner;
public class Main {

    public static void main(String args[]) {
       Scanner scanner = new Scanner(System.in);
       int giris_hakki =3;
      
       String sys_kullanici_adi = "Mesut Ozlahlan";
       String sys_parola = "1573";
       
        System.out.println("************************");
        System.out.println("Kullanici Girisine Hosgeldiniz...");
        System.out.println("************************");
        
        while(true){
            System.out.print("Kullanici Adi : ");
            String kullanici = scanner.nextLine();
            System.out.println("Parola : ");
            String parola = scanner.nextLine();
            
            if(kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)){
            System.out.println("Hosgeldiniz, " + kullanici);
            break;
            }
            else if(kullanici.equals(sys_kullanici_adi) && !parola.equals(sys_parola)){
            System.out.println("Parolaniz Yanlis...");
            giris_hakki-= 1;
            }
             else if(!kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)){
            System.out.println("Kullanici Adiniz Yanlis...");
            giris_hakki-= 1;
            }           
             else {
             System.out.println("Kullanici Adiniz ve Parolaniz Yanlis");
             giris_hakki-= 1;        
            }
            if(giris_hakki==0){
                System.out.println("Giris Hakkiniz Bitti. Tekrar Bekleriz...");
                break;
            }
        }  
    }
}
