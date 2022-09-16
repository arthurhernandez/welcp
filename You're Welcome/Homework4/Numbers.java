import java.util.Scanner;

public class Numbers {
	
	public static String trim(String input) {
		
		String trimmed = " ";
		for (int i = 0; i < input.length(); i++) {
			
			if (input.charAt(i) == '.') {
			
				if (input.length() > i + 3) {
					
					trimmed = input.substring(0, i + 3);
					
				} else {
					
					trimmed = input;
					
				}
			}
			
		} 
		
		if (trimmed.equals(" ")) {
			
			trimmed = input;
		}
		return trimmed;
	}

	public static void main(String[] args) {
		
		
		double firstNum, secondNum;
		String first, second;
		Scanner in = new Scanner(System.in);
		
		first = in.next();
		second = in.next();
		
		firstNum = Double.parseDouble(trim(first));
		secondNum = Double.parseDouble(trim(second));
		
		if (Math.abs(firstNum - secondNum) < 0.011) {
			
			System.out.println("They are the same up to two decimal places");
			
		} else {
			
			System.out.println("They are different");
			
		}
		
		
		

	}

}
