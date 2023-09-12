package intro;

public class Main {

	public static void main(String[] args) {
		String internetSubeButonu ="internet Şubeye gir";
		double dolarDun = 8.15;
		double dolarBugun = 8.18;
		int vade = 36;
		boolean dustuMu = false;
		
		
		System.out.println(internetSubeButonu);
		
		/*if(dolarBugun<dolarDun) {
			System.out.println("Dolar düştü resmi");			
		}else if {
			System.out.println("Dolar yükseldi resmi");
			
		}
		else 
			System.out.println("Dolar eşittir resmi");
	}*/
	
	String kredi1 = "Hızlı kredi";
	String kredi2 = "Mutlu emekli kredisi";
	String kredi3 = "Konut kredisi";
	String kredi4 = "Çiftçi kredisi";
	String kredi5 = "Msb kredisi";
	String kredi6 = "Meb kredisi";
	
	System.out.println(kredi1);
	System.out.println(kredi2);
	System.out.println(kredi3);
	System.out.println(kredi4);
	System.out.println(kredi5);
	System.out.println(kredi6);
	
	
	String[] krediler =
		{	
			"Hızlı kredi",
			"Mutlu emekli kredisi",
			"Konut kredisi",
			"Çiftçi kredisi",
			"Msb kredisi",
			"Meb kredisi"
		};
	for(String kredi : krediler) {
		System.out.println(kredi);
	}
	for(int i = 0; i<krediler.length;i++) {
		System.out.println(krediler[i]);
	}
	int sayi1 = 10;
	int sayi2 = 20;
	sayi1=sayi2;
	sayi2=100;
	System.out.println(sayi1);
	
}
}
