package week1.day2;

public class Switch {

	public static void main(String[] args) {

		String Browser = "";
		
		switch (Browser){
		
		case "Chrome": {
			System.out.println("Chrome browser is launched");
			break;
		}
		case "Edge": {
			System.out.println("Edge browser is launched");
			break;
		}
		
		case "Safari":{
			System.out.println("Safari browser is launched");
		
		}
		default:{
			System.out.println("Unknown Browser");
		}
		}
	}

}
