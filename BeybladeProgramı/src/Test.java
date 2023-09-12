
import java.util.Scanner;


public class Test {

    public static void main(String args[]) {
     
        System.out.println("Beyblade Programina Hosgeldiniz...");
        System.out.println("Cikis icin q'ya basin.");
        
        
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Hangi Beyblade'i uretmek istiyorsunuz ?");
            String islem = scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan Cikiliyor...");
                break;
            
            }
            else {
                BeybladeFabrikası fabrika = new BeybladeFabrikası();
                
                Beyblade beyblade = fabrika.beybladeÜret(islem);
                
                if(beyblade == null){
                    System.out.println("Lutfen gecerli bir beyblade  ismi girin...");
                }
                else {
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();
               }
                
            }
            
            
        }
    }
}
