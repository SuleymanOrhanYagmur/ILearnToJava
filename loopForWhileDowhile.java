
public class loopForWhileDowhile {

	public static void main(String[] args) {
		int i =0;
		//For
		for( i=0;i <10; i++) {
			System.out.println(i);
		}
		System.out.println("For döngüsü bitti");
		//While
		while(i<20) {
			System.out.println(i);
			i++;
		}
		System.out.println("While döngüsü bitti");
		
		//DoWhile
		int j =0;
		
		do {

			System.out.println(j);
			
			j++;
		}while(j<10);
		
		System.out.println("DoWhile döngüsü bitti");
	}

}
