
public class Yönetici extends Calisan{
    private int sorumlu_kisi_sayisi;

    public Yönetici(String ad, String soyad, int id,int sorumlu_kisi_sayisi) {
        super(ad, soyad, id);
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
    
    
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Yoneticinin Sorumlu Oldugu Kisi Sayisi : " + sorumlu_kisi_sayisi);
        
    
    }
    public void zamYap(int zam_miktari){
        System.out.println(getAd() + " Calisanlara " + zam_miktari + " kadar zam yapiyor...");
    }
}
