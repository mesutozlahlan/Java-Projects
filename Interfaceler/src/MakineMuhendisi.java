
public class MakineMuhendisi implements IMuhendis,ICalisma{
    
    private boolean askerlik;
    private boolean adli_sicil;

    public MakineMuhendisi(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }
    
    
    @Override
    public void askerlik_durumu_sorgula() {
        if(askerlik){
            
            System.out.println("Askerligimi yaptim.");
        }
        else {
            System.out.println("Askerligimi yapmadim.");
        }
    }

    @Override
    public String mezuniyet_ortalamasi(double derece) {
         
        return "Ortalamam: " + derece;
    }

    @Override
    public void adli_sicil_sorgula() {
        if(adli_sicil){
            System.out.println("Adli Sicil Kaydim Bulunuyor.");
        }
        else {
            System.out.println("Herhangi bir adli sicil kaydim bulunmuyor.");
        }
    }

    @Override
    public void is_tecrubesi(String[] array) {
        
        if(array.length == 0){
            System.out.println("Herhangi bir is tecrubem bulunmuyor...");
        }
        else {
            System.out.println("Makine Muhendisi olarak su sirketlerde calistim.");
            for(int i = 0;i < array.length;i++){
                System.out.println(array[i]);
            }
       
        }
        
    }
    public void referans_getir(String [] array){
        
        if(array.length == 0){
            System.out.println("Herhangi bir referansim bulunmuyor...");
        }
        else {
            System.out.println("Referanslarim...");
            for(int i = 0; i < array.length;i++){
                System.out.println(array[i]);
            
            }
        
        }
    }

    @Override
    public void calis() {
        System.out.println("Makine Muhendisi Calisiyor...");
    }
    
}
