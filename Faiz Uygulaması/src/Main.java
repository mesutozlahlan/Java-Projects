import java.util.Scanner;
public class Main {

    public static void main(String args[]) {
    
    Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamiza Hosgeldiniz. Faiz Orani %6");
        
        int anapara, vade;
        System.out.println("Yatirmak istediginiz tutar : ");
        anapara = scanner.nextInt();
        System.out.println("Paranizi kac yil yatirmak istiyorsunuz : ");
        vade = scanner.nextInt();
        
        double toplampara = anapara;
        double faizOrani = 0.06;
        
        for(int i = 1; i<= vade ; i++){
            
            toplampara = (double) (toplampara+ (toplampara * faizOrani));
            
            System.out.println(i +".yilinin sonunda toplam para : " + toplampara);
            
        }

    }
}
