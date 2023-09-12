
public class Yönetici extends Calisan{ //subclass 
    
    private int sorumlu_kisi;
    
    public Yönetici(String isim,int maas,String departman,int sorumlu_kisi){
        /*this.isim = isim;
        this.maas = maas;
        this.departman = departman; */
        
        super(isim, maas, departman);
        
        this.sorumlu_kisi = sorumlu_kisi;
       
    }
    public void zam_yap(int zam_miktarı){
        System.out.println("Calisanlara " + zam_miktarı +"TL zam yapildi");
        
    }
    @Override
    public void bilgilerigoster(){
      /*  System.out.println("Isim :" + getIsim());
        System.out.println("Maas :"+ getMaas());
        System.out.println("Departman :"+ getDepartman());
        */
        super.bilgilerigoster();
        System.out.println("Sorumlu Kisi Sayisi :" +this.sorumlu_kisi);
        
        
}
    
    
}
