import java.util.Arrays;

public class RandomNumbers {

	public static void main(String[] args) {
		
		int[] randNums = new int[10];
		int[] randNumsNoDupes = new int[10];
		int number;
		
		for (int i = 0; i < 10; i++) {
			
			
			randNums[i] = (int) ((Math.random() * 100) + 1);
			
		}
		
		System.out.println(Arrays.toString(randNums));
		
		for (int i = 0; i < 10; i++) {
			
			
			number = (int) ((Math.random() * 100) + 1);
			System.out.println(number);
			
			for (int j = 0; j < randNumsNoDupes.length; j++) {
				
				if (randNumsNoDupes[j] == number) {
					
					number = -1;
				}
				
			}
			if (number == -1) {
				i--;
			} else {
				randNumsNoDupes[i] = number;
			}
			
		}
		
		System.out.println(Arrays.toString(randNumsNoDupes));
		

	}

}
