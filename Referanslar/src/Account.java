public class Account {
    

    public Account(){
       /* this.hesapNo = "Bilgi Yok";
        this.bakiye = 0.0;
        this.isim = "Bilgi Yok";
        this.email = "Bilgi Yok";
        this.telefonNo = "Bilgi Yok";
        */
       this("Bilgi Yok",0.0 , "Bilgi Yok","Bilgi Yok", "Bilgi Yok");
    }
    public Account(String isim,String email,String telefonNo){
        /*
        this.isim = isim;
        this.email = email;
        this.telefonNo = telefonNo;
        
        this.bakiye = 0.0;
        this.hesapNo = "Bilgi Yok";
        */
        this("Bilgi Yok",0.0,isim,email,telefonNo);
        
    }
    public Account(String hesapNo, double bakiye, String isim, String email, String telefonNo) {
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.isim = isim;
        this.email = email;
        this.telefonNo = telefonNo;
    }
    public void paraYatir(double miktar){
        
        bakiye +=miktar;
        System.out.println("Yeni Bakiye = " + bakiye);
    }
    
    public void bilgilerigoster(){
        
        System.out.println("Hesap No : " + this.hesapNo);
        System.out.println("Bakiye : " + this.bakiye);
        System.out.println("Isim : " + this.isim);
        System.out.println("Email : " + this.email);
        System.out.println("Telefon No : " + this.telefonNo);
    }
    
    public void paraCekme(double miktar){
        
        if(miktar>1500){
            System.out.println("Bir gunde 1500 tlden fazla para cekemezsiniz...");
            
        }
        else {
            
            bakiye -= miktar;
            System.out.println("Yeni bakiye = " + bakiye );
            
        }
    }
    
    /**
     * @return the hesapNo
     */
    public String getHesapNo() {
        return hesapNo;
    }

    /**
     * @param hesapNo the hesapNo to set
     */
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefonNo
     */
    public String getTelefonNo() {
        return telefonNo;
    }

    /**
     * @param telefonNo the telefonNo to set
     */
    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
    private  
     String hesapNo;
     double bakiye;
     String isim;
     String email;
     String telefonNo;
    
}
