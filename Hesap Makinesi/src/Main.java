import java.util.Scanner;
public class Main {

    public static int cikarma(int a,int b){
        return (a-b);
    }
    public static double bolme(int a,int b){
        return (double)(a/b);
    }
    public static int toplama (int a,int b){
        return (a+b);
        
    }
    public static int toplama (int a,int b,int c){
        return (a+b+c);
    }
    public static int carpma(int a,int b){
        return (a*b);
        
    }
    public static int carpma(int a, int b,int c) {
        return (a*b*c);
        
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        
        String islemler = "1. Toplama Islemi\n"
                         +"2. Cikarma Islemi\n"
                         +"3. Carpma Islemi\n"
                         +"4. Bolme Islemi\n"
                         +"Cikis icin q'ya basin.";
        
        System.out.println("*******************************");
        System.out.println(islemler);
        System.out.println("*******************************");
        
        while(true){
            System.out.print("Islemi Seciniz : ");
            String islem =scanner.nextLine();
            
            if(islem.equals("q")){
                System.out.println("Programdan Cikiliyor...");
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Kac deger toplayacaksiniz ? (2 veya 3):");
                
                int kacsayi =scanner.nextInt();
                if(kacsayi == 2){
                    System.out.print("a:");
                    int a =scanner.nextInt();
                    System.out.print("b:");
                    int b =scanner.nextInt();
                    
                    System.out.println("Girilen sayilarin toplamlari :" + toplama(a, b));
                    
                }
                else if(kacsayi==3){
                    System.out.print("a:");
                    int a =scanner.nextInt();
                    System.out.print("b:");
                    int b =scanner.nextInt();
                    System.out.print("c:");
                    int c =scanner.nextInt();
                    
                    System.out.println("Girilen sayilarin toplamlari : " + toplama(a, b, c));
                   
                }
                else 
                    System.out.println("Bunun icin uygun method bulunmuyor...");
            }
            else if (islem.equals("2")){
                    System.out.print("a:");
                    int a =scanner.nextInt();
                    System.out.print("b:");
                    int b =scanner.nextInt();
                     System.out.println("Girilen sayilarin farklari :" + cikarma(a, b));
            }
            else if (islem.equals("3")){
                System.out.println("Kac deger carpacaksiniz ? (2 veya 3):");
                
                int kacsayi =scanner.nextInt();
                if(kacsayi==2){
                    System.out.print("a:");
                    int a =scanner.nextInt();
                    System.out.print("b:");
                    int b =scanner.nextInt();
                    
                    System.out.println("Girilen sayilarin carpimi :" + carpma(a, b));
                    
                }
                else if(kacsayi==3){
                    System.out.print("a:");
                    int a =scanner.nextInt();
                    System.out.print("b:");
                    int b =scanner.nextInt();
                    System.out.print("c:");
                    int c =scanner.nextInt();
                    
                    System.out.println("Girilen sayilarin carpimlari : " + carpma(a, b, c));
                   
                }    
                
                else if(islem.equals("4")){
                     
                    System.out.print("a:");
                    int a =scanner.nextInt();
                    System.out.print("b:");
                    int b =scanner.nextInt();
                    
                    System.out.println("Girilen sayilarin bolumu :" + bolme(a, b));
                    
                }
                else 
                    System.out.println("Bunun icin uygun method bulunmuyor...");
                
        }
        
    }

 } 
}