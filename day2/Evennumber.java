package week1.day2;

public class Evennumber {

	public static void main(String[] args) {

		int num = 30;
		
		for (int i = 0; i < num; i++) {
			
			if (i%2==0){
			
			System.out.println("Number is Even:" + i);
		
		}
			for (int j=0; j<30; j++) {
				
				if (j%2!=0) {
					
					System.out.println("Number is Odd: " +j);
				}
			}
	}

}
}