
public class miniProje {

	public static void main(String[] args) {
		
		int number = 2;
		int remainder = number % 2; // kalan
		
		//System.out.println(remainder);
		
		boolean isPrime = true; // asal kabul ediyoruz
		
		if(number == 1 ) {
			System.out.println("Sayı Asal Değildir");
			return;
		}
		if(number < 2) {
			System.out.println("Geçersiz sayı");
			return;
		}
		
		for(int i=2; i<number;i++) {
			
			
			
			if(number % i == 0) {
				isPrime = false;
				
			}
			
			
		}
		
		if(isPrime) {
			System.out.println("Sistem asaldır");
		}else {
			System.out.println("Sistem Asal değildir");
		}
		
		
	}

}
