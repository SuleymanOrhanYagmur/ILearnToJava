
public class string {

	public static void main(String[] args) {

		String mesaj ="Bugün hava çok güzel";
		
		System.out.println(mesaj);
		
		System.out.println("Eleman sayısı: " + mesaj.length());
		System.out.println("5. ELEMAN: " +mesaj.charAt(4));
		// charAt önemli burda
		System.out.println(mesaj.concat(" Yasasın !"));
		//concat birleştirmek demek
		System.out.println(mesaj);// concat orjinali değiştirmez 
		System.out.println(mesaj.startsWith("b")); // A ile başlıyor mi diye soruyorsun
		System.out.println(mesaj.endsWith("."));// Sonu . ile biter mi dye soruyor
 		char[] karakterler = new char[5];
 		mesaj.getChars(0, 5, karakterler, 0); 
 		// bu bir şey döndürmüyor ilk 5 karakter almak istiyoruz 0 da başla 4 ile bitir
 		// char arraye göndermek istiyosun karakterlere ata anlamında
 		// 4 DAHİL ETMEZ O YÜZDEN 5 DEDİK İLK 5 KARAKTERİ (CHAR 4 Ü ALMAK İSTEDİĞİNDE)
 		System.out.println(karakterler);
		// ---------------
 		
 		System.out.println(mesaj.indexOf('a'));
 		// Bu karakterin kaçıncı eleman olduğunu bulmaya yarar
 		
 		System.out.println(mesaj.lastIndexOf('a'));
 		// bu sefer soldan saymaya başlar ama yine normal index sırasına göre gider
 	
 		System.out.println(mesaj.replace(' ', '-'));
 		//karakter değiştirmek amacıyla kullanılan bir yöntem ama orjinali değiştirmez bi deği 
 		
 		System.out.println(mesaj);
 		
 		
 		System.out.println(mesaj.substring(2,4));
 		//Bir metnin içinden parça almaktır 2. endeksinden itibaren G den itibaren 4. dahil etmedi
 		
 		
 		for (String kelime : mesaj.split(" ")) {
 			System.out.println(kelime);
 		}
 		// gruplara ayırmamıza yarar bunun içinde tabi for döngüsü gerekir
 		
 		
 		System.out.println(mesaj.toLowerCase());
 		// mesajı küçük harflere çevirmemize yarar
 		// bunu veri tabanında ARAMA İFADESİ duyarlıysa o yüzden kullanırız  
 		System.out.println(mesaj.toUpperCase());
 		
 		String yenii = "      Bu gün hava çok güzel.     ";
 		
 		System.out.println(yenii.trim());
 		// başında ve sonundaki kaynak uyuşmazlığı olmaması için boşlukları atıyoruz
 		System.out.println(yenii);// ama orjinalini değiştirmiyor görüldüğü üzere
	
	
	
	
	}
	

}


