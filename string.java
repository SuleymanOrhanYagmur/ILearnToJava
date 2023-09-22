
public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
 				
		
	}

}


