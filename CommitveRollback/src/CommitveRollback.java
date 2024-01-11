
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CommitveRollback {
    private String kullanici_adi = "root";
    private String parola = "";
    
    private String db_ismi = "demo";
    
    private String host =  "localhost";
    
    private int port = 3306;
    
    private Connection con = null;
    
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    /*Database Transaction
    
    Çoðu zaman programlarýmýzda bir çok veritabaný iþlemini ard arda yaparýz.
    Örneðin elimizde birbiriyle baðlantýlý 3 tane tablo güncelleme iþlemimiz var(delete,update). 
    Bu iþlemleri ve sorgularý ard arda çalýþtýrdýðýmýzý düþünelim.
    
    statement.executeUpdate(sorgu1);
    statement.executeUpdate(sorgu2); // Burada herhangi bir hata oldu ve programýmýz sona erdi.
    statement.executeUpdate(sorgu3);
    
    
    Böyle bir durumda 2.sorgumuzda herhangi bir hata oluyor. 
    Ancak 1.sorguda hata olmadýðý için bu sorgumuz veritabanýmýzý güncelledi.
    Ancak bu sorgular birbiriyle baðlantýlý ise 1.sorgunun da çalýþmamasý gerekiyor.
    Ýþte biz böyle durumlarýn önüne geçmek için Transactionlarý kullanýyoruz.
    
    (ATM Örneði)
    
    Transaction mantýðýný kullanmak için bu sorgularýn sadece hiçbir sorun oluþmadýðýnda 
    toplu çalýþmasýný istiyoruz. 
    
    Java bu sorgularý yazdýðýmýz andan itibaren otomatik olarak sorgularý sorgusuz sualsiz 
    çalýþtýrýr. Onun için ilk olarak con.setAutoCommit(false) þeklinde bir þey yaparak bu durumu 
    engelliyoruz.
    
    commit() : Bütün sorgularý çalýþtýr. Sorun olmadýðý zaman hepsini çalýþtýrmak için kullanýyoruz.
    rollback(): Bütün sorgularý iptal et. Sorun olduðu zaman hiçbirini çalýþtýrmamak için kullanýyoruz.
    
    
    Yani bu sefer programlarýmýzý biraz daha güvenli yazmýþ oluyoruz.
    
    Not : setAutoCommit(false) yazsak bile Veritabanýný güncellemeyen bir sorgumuz varsa,
    herhangi bir güvenlik sýkýntý olmayacaðýndan çalýþtýrýlýr.
    */
    
    public CommitveRollback() {
        
        // "jbdc:mysql://localhost:3306/demo" 
        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadý....");
        }
        
        
        try {
            con = DriverManager.getConnection(url, kullanici_adi, parola);
            System.out.println("Baðlantý Baþarýlý...");
            
            
        } catch (SQLException ex) {
            System.out.println("Baðlantý Baþarýsýz...");
            //ex.printStackTrace();
        }
        
    }
    public void commitverollback() {
        Scanner scanner = new Scanner(System.in);
        
        try {
            con.setAutoCommit(false);
            
            String sorgu1 = "Delete From calisanlar where id = 3";
            String sorgu2 = "Update calisanlar set email = 'mesutcan1573@gmail.com' where id = 1";
            
            System.out.println("Güncellenmeden Önce");
            calisanlariGetir();
            
            Statement statement = con.createStatement();
            
            statement.executeUpdate(sorgu1);
            
            statement.executeUpdate(sorgu2);
            
            System.out.println("Ýþlemleriniz kaydedilsin mi? (yes/no)");
            String cevap = scanner.nextLine();
            
            if (cevap.equals("yes")){
                con.commit();
                calisanlariGetir();
                System.out.println("Veritabaný güncellendi...");
                
            }
            else {
                con.rollback();
                System.out.println("Veritabaný güncellenmesi iptal edildi...");
                calisanlariGetir();
                
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CommitveRollback.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }
    
    public void calisanlariGetir() {
        
        String sorgu = "Select * From calisanlar";
      
        try {
            statement = con.createStatement();
            
            ResultSet rs = statement.executeQuery(sorgu);
            
            while (rs.next()) {
                
                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String email = rs.getString("email");
                
                System.out.println("Id : " + id + " Ad: " + ad + " Soyad : " + soyad + " Email : " + email);
                
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CommitveRollback.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    public static void main(String[] args) {
        CommitveRollback comroll = new CommitveRollback();
        //baglanti.calisanlariGetir();
        
        comroll.commitverollback();
        
        
        
    }
}
