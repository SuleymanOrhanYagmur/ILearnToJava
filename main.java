
public class main {

	public static void main(String[] args) {
		int numberofstudents = 10;
		String message ="Number of students: ";
		
		
		// TODO Auto-generated method stub
		System.out.println("Hello java (My first java code) ");
		System.out.println("Ogrenci sayim: "+numberofstudents);
		System.out.println(message + numberofstudents);
		
		classs classs = new classs();
		
		classs.Add();
		classs.Remove();
		classs.Update();
		
		classs classsyeni = new classs();
		classsyeni.Add();
		
		classs = classsyeni;
		
		//value BURDA YAPILAN HERŞEY STACK de gerçekleşiyor heap de değil
		int sayi1 =10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);
		
		
		
		
		int[] sayilar1 = new int[] {1,2,3};
		int[] sayilar2 = new int[] {4,5,6};
		sayilar2 = sayilar1;
		
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);
		// Arrayler referans mantığında olduğundan full sayilar1 mantığında gidiyor
		// ve sayilar1 ne olursa sayilar2 o oluyor
		
		//CCLASS HESAP MAKİNESİ İÇİN
		
		ClassHesapMakinesi classHesapMakinesi = new ClassHesapMakinesi();
		int sonuc = classHesapMakinesi.Topla(3,4);
		System.out.println(sonuc);
		
		// ENCAPSULATİON İŞLEMLERİ
		
		Product product = new Product();
		
		// product.name = "Laptop"; BU KULLANIIM PRİVATE OLANLARDA ÇALIŞMAZ ONUN YERİNE ALTTAKİ FORMATTA OLUR
		product.setId("LAPTOP");
		product.setId(1);
		//product.description = "Asus laptop"; YORUM HALİNİ İPTAL ET
		//product.stockAmount = 3; YORUM HALİNİ İPTAL ET
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product); // yukarda elimizde olan veriyi yazdık
		// sonradan veri eklememiz gerekseydi ürün fiyatı veri tabanına aktarırken minimum 0 olmasını istiyoruz
		// kural koymak falan istiyoruz - olamaz falan gibi
		// BUNUN İÇİNDE ENCAPSULATİONDAN YARARLANIYORUZ 
		
		
		
		
		

	}

}
