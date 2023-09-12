
public class Main {
    public static void main(String args[]) {
       
        Seyirci seyirci1 = new Seyirci("Oguz Artiran");
        Seyirci seyirci2 = new Seyirci("Mesut Ozlahlan");
        
        seyirci1.oyun_seyret();
        System.out.println("Seyirci Sayisi : " + Seyirci.getSeyirciSayisi());
        System.out.println("Seyirci Sayisi : " + seyirci1.getSeyirciSayisi());
        System.out.println("Seyirci Sayisi : " + seyirci2.getSeyirciSayisi());
        
        selamla();
        System.out.println(Math.PI);
        
    }
    public static void selamla(){
        
        System.out.println("Selamlar");
    }
}
