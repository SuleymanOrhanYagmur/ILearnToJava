
public class method {
// camel Casing İLK HARF KÜÇÜK SONRAKİ KELİMELER BÜYÜK YAZILIR sayiBulmaca gibi 
	public static void main(String[] args) {
		sayiBulmaca();
		
		
		
		sayiBulmaca();
	}
	
	
	public static void sayiBulmaca() {
		
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 3;
		boolean varMi= false;
		
		for (int sayi : sayilar) { // DİZİNİN BÜTÜN ELEMANLARINI BU ŞEKİLDE GEZEBİLİYORDUK
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		if(varMi ) {
			System.out.println("Sayı mevcuttur");
		}else {
			System.out.println("Sayı mevcut değildir");
		}
		
		
	}

}
