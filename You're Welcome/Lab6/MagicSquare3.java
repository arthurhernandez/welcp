import java.util.Arrays;
import java.util.Scanner;

public class MagicSquare3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int size = in.nextInt();
		
		if (size % 2 == 0) {
			
			System.out.println("Invalid size: Must be odd");		
			return;
			
		}
			
		int row = size - 1;
		int column = size / 2;
		
		int[][] square = new int[size][size];
		
		for (int j = 0; j < square.length; j++) {
			for (int k = 0; k < square[j].length; k++) {
				square[j][k] = 0;
			}
		}
		
		for (int i = 1; i <= (size * size); i++) {
			
			square[row][column] = i;
			
			int currentRow = row;
			int currentColumn = column;
			row++;
			column++;
			
			if (row >= square.length) {
				
				row = 0;
				
			} if (column >= square[0].length) {
				
				column = 0;
				
			} if (square[row][column] != 0) {
				
				row = currentRow - 1;
				column = currentColumn;
				
			}
		}
		for (int j = 0; j < square.length; j++) {
			for (int k = 0; k < square[j].length; k++) {
				
				System.out.printf(square[j][k] + " ");
				
			}
			System.out.println();
		}
		in.close();
	}
}
