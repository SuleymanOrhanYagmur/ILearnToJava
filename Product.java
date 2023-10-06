
public class Product {
	
	public Product() {
		System.out.println("CONSSTRUCT (YAPICI) BLOG ÇALIŞTI");
	}


		
	// attribute | field
	// Üürüne ait verileri tutmuş olduk
	int _id;
		
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	// Üürün içine böyle alanlar tanımadığımızda PUBLİC OLARAK İŞARETLEMİŞ OLUYORUZ 
	// HER YERDEN ERİŞİLEBİLİYOR 
	// C# da default olan PRİİVATEDİR 
	// EĞER PRİVATE YAPARSAK sadece tanımladnığı blogda geçerlidir demek 
	// MESELA PRİVATE YAPINCA sen mainde buna ulaşamazsın diyor
	// Böyle durumlarda ENCAPSULATİON devreye giriyor 
	 String _renk;
	// Encap: ürüne ait bir kod oluşturmak istiyoruz ürünün baş harfi 
	private String _kod;
	
	// kod yazıcaz onu sadece okuyabilir şeklinde yazamaz şeklinde
	// Getter setter
	
	 // getter
	public int getId() {
		return _id;
		
	}
		
	private String get_description() {
		return _description;
	} 

	private double get_price() {
		return _price;
	}
	
	private int get_stockAmount() {
		return _stockAmount;
	}
	

	
	//setter blogu 
	
	public void setId(int id) {
		
		_id = id;
		 
	}
	public void setId(String name) {
		_name = name;
	}

	/*private void set_description(String _description) {
		this._description = _description;
	}
	
	private void set_price(double _price) {
		this._price = _price;
	}

	
	private void set_stockAmount(int _stockAmount) {
		this._stockAmount = _stockAmount;
	}
	*/

}
