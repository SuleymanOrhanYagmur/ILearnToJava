
public class miniProje2 {

	public static void main(String[] args) {
		//Mükemmel Sayı kendinden başka tüm pozitif bölenleri toplamı kendisi olan sayıdır
		// 6-> 1 2 3 toplam 6 eder
		int  number =5;
		int toplam =0;
		
		for(int i =1 ; i<number;i++) {
			if(number % i== 0) {
				toplam = toplam + i;
				
			}
			
		}
		if(toplam == number) {
			System.out.println( number +" Mükemmel sayı ");
		}else {
			System.out.println(number + " Mükemmel sayı değildir");
		}
		
	}

}
