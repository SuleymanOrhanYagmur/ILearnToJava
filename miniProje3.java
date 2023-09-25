
public class miniProje3 {

	public static void main(String[] args) {
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
