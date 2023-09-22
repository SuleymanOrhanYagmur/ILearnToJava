
public class arrays {

	public static void main(String[] args) {
		
		String ogrenci1 = "Engin";
		String ogrenci2 = "Ahmet";
		// yerine array kullanılır
		
		String[] ogrenciler = new String[3];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Ahmet";
		ogrenciler[2] = "Suleyman";
		for(int i=0;i < ogrenciler.length; i++) {
			
			System.out.println(ogrenciler[i]);		}
		for (String ogrenci:ogrenciler ) {
			// string veri tipi ogrencilerdeki her bir elemanı gez diyor 
			// yani OGRENCİ takma ad başka bir şey daha yazabilirsin 
			//
			
			System.out.println(ogrenci);// yukardaki for a göre daha farklı yöntem oldu 
		}
		
		// AŞAĞIDA Array yazma yeni yöntemi var
		
		double[] myList = {1.2,1.3,4.3,5.6};
		double total = 0;
		
		double max = myList[0];
		
		for(double number: myList) {
			total = total + number;
			System.out.println(number);
		}
		
		
		for(double number:myList) {
			if(max < number) {
				max = number;
				
				
			}
			total = total + number;
			System.out.println(number);
			
		}
		System.out.println("Toplam = "+ total);
		System.out.println("En büyük = "+ max);
		


	}
	
	

}
