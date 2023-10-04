
public class Product {
	


		
	// attribute | field
	// Üürüne ait verileri tutmuş olduk
	int id;
		
	String name;
	String description;
	double price;
	int stockAmount;
	// Üürün içine böyle alanlar tanımadığımızda PUBLİC OLARAK İŞARETLEMİŞ OLUYORUZ 
	// HER YERDEN ERİŞİLEBİLİYOR 
	// C# da default olan PRİİVATEDİR 
	// EĞER PRİVATE YAPARSAK sadece tanımladnığı blogda geçerlidir demek 
	// MESELA PRİVATE YAPINCA sen mainde buna ulaşamazsın diyor
	// Böyle durumlarda ENCAPSULATİON devreye giriyor 
	 String renk;
	// Encap: ürüne ait bir kod oluşturmak istiyoruz ürünün baş harfi 
	private String kod;
	
	// kod yazıcaz onu sadece okuyabilir şeklinde yazamaz şeklinde
	// Getter setter
	
	 
	 public void metot() {
		
		
	}
		
	

}
