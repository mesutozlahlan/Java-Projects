
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
    
    �o�u zaman programlar�m�zda bir �ok veritaban� i�lemini ard arda yapar�z.
    �rne�in elimizde birbiriyle ba�lant�l� 3 tane tablo g�ncelleme i�lemimiz var(delete,update). 
    Bu i�lemleri ve sorgular� ard arda �al��t�rd���m�z� d���nelim.
    
    statement.executeUpdate(sorgu1);
    statement.executeUpdate(sorgu2); // Burada herhangi bir hata oldu ve program�m�z sona erdi.
    statement.executeUpdate(sorgu3);
    
    
    B�yle bir durumda 2.sorgumuzda herhangi bir hata oluyor. 
    Ancak 1.sorguda hata olmad��� i�in bu sorgumuz veritaban�m�z� g�ncelledi.
    Ancak bu sorgular birbiriyle ba�lant�l� ise 1.sorgunun da �al��mamas� gerekiyor.
    ��te biz b�yle durumlar�n �n�ne ge�mek i�in Transactionlar� kullan�yoruz.
    
    (ATM �rne�i)
    
    Transaction mant���n� kullanmak i�in bu sorgular�n sadece hi�bir sorun olu�mad���nda 
    toplu �al��mas�n� istiyoruz. 
    
    Java bu sorgular� yazd���m�z andan itibaren otomatik olarak sorgular� sorgusuz sualsiz 
    �al��t�r�r. Onun i�in ilk olarak con.setAutoCommit(false) �eklinde bir �ey yaparak bu durumu 
    engelliyoruz.
    
    commit() : B�t�n sorgular� �al��t�r. Sorun olmad��� zaman hepsini �al��t�rmak i�in kullan�yoruz.
    rollback(): B�t�n sorgular� iptal et. Sorun oldu�u zaman hi�birini �al��t�rmamak i�in kullan�yoruz.
    
    
    Yani bu sefer programlar�m�z� biraz daha g�venli yazm�� oluyoruz.
    
    Not : setAutoCommit(false) yazsak bile Veritaban�n� g�ncellemeyen bir sorgumuz varsa,
    herhangi bir g�venlik s�k�nt� olmayaca��ndan �al��t�r�l�r.
    */
    
    public CommitveRollback() {
        
        // "jbdc:mysql://localhost:3306/demo" 
        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamad�....");
        }
        
        
        try {
            con = DriverManager.getConnection(url, kullanici_adi, parola);
            System.out.println("Ba�lant� Ba�ar�l�...");
            
            
        } catch (SQLException ex) {
            System.out.println("Ba�lant� Ba�ar�s�z...");
            //ex.printStackTrace();
        }
        
    }
    public void commitverollback() {
        Scanner scanner = new Scanner(System.in);
        
        try {
            con.setAutoCommit(false);
            
            String sorgu1 = "Delete From calisanlar where id = 3";
            String sorgu2 = "Update calisanlar set email = 'mesutcan1573@gmail.com' where id = 1";
            
            System.out.println("G�ncellenmeden �nce");
            calisanlariGetir();
            
            Statement statement = con.createStatement();
            
            statement.executeUpdate(sorgu1);
            
            statement.executeUpdate(sorgu2);
            
            System.out.println("��lemleriniz kaydedilsin mi? (yes/no)");
            String cevap = scanner.nextLine();
            
            if (cevap.equals("yes")){
                con.commit();
                calisanlariGetir();
                System.out.println("Veritaban� g�ncellendi...");
                
            }
            else {
                con.rollback();
                System.out.println("Veritaban� g�ncellenmesi iptal edildi...");
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
