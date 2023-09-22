
public class multidemantionalAray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] [] sehirler = new String [3] [3];
		sehirler[0][0] = "istanbul";
		sehirler[0][1] = "Bursa"; // 0. satırın 1. elemanı gibi
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Konya";
		sehirler[1][1] = "Kayseri";
		sehirler[1][2] = "Ankara";
		sehirler[2][0] = "Şanlıurfa";
		sehirler[2][1] = "Diyarbakır";
		sehirler[2][2] = "Gaziantep";
		
		for (int i = 0; i<=2; i++) {
			System.out.println("---------------");
			for (int j =0;j <=2 ; j++) {
				System.out.println(sehirler[i][j]);
			}
		}
	}

}
