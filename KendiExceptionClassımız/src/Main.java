
import java.util.Scanner;


public class Main {
    public static void mekan_kontrol(int yas) throws InvalidAgeException{
        
        if(yas < 18){
            
            throw new InvalidAgeException("Invalid Age");
        }
        else {
            System.out.println("Mekana Hosgeldiniz...");
        }
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen yasinizi girin : ");
        int yas = scanner.nextInt();
        try {
            mekan_kontrol(yas);

        } catch (InvalidAgeException e) {
            
            e.printStackTrace();
        }
        
    }
}
