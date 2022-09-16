import java.util.Scanner;

public class MagicSquare1 {
	
	public static boolean rowsEqual(int[][] input) {
		
		int sum = input[0][0] + input[1][0] + input[2][0] + input[3][0];
		int currentSum = 0;
		
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
			
				currentSum += input [i][j];
				
			}
			if (currentSum != sum)  {
				return false;
			}
			currentSum = 0;
		}
		return true;
		
	}
	
	public static boolean columnsEqual(int[][] input) {
		
		int sum = input[0][0] + input[1][0] + input[2][0] + input[3][0];
		int currentSum = 0;
		
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
			
				currentSum += input[j][i];
				
			}
			if (currentSum != sum)  {
				return false;
			}
			currentSum = 0;
		}
		return true;
		
	}
	public static boolean diagonalEqual(int[][] input) {
		
		int sum = input[0][0] + input[1][0] + input[2][0] + input[3][0];
		int currentSum = 0;
		
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
			
				if (i == j) {
					currentSum += input[i][j];
				}
			}
		}
		return currentSum == sum;
		
	}
	
	public static void main(String[] args)  {
		
		Scanner in = new Scanner(System.in);
		int[][] square = {{16,  3,  2, 13}, 
						  { 5, 10, 11,  8},
						  { 9,  6,  7,  12},
						  { 4, 15, 14,   1}};
		
		int[] numbers = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
								
		int current;
		
		for (int i = 0; i < 16; i++) {
			
			current = in.nextInt();
			
			if (current < 1 || current > 16) {
				
				System.out.println("Invalid Entry");
				return;
				
			} else {
				
				for (int j = 0; j < 4; j++) {
					
					if (numbers[j] == current) {
						
						System.out.println("Invalid Entry");
						return;				
					}
				}
			}
			numbers[i] = current;	
		}
		System.out.println(rowsEqual(square));
		System.out.println(columnsEqual(square));
		System.out.println(diagonalEqual(square));
		
	}
}
