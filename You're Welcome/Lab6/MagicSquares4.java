import java.util.ArrayList;
import java.util.Scanner;

public class MagicSquares4 {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> square = new ArrayList<ArrayList<Integer>>();
		
		Scanner in = new Scanner(System.in);
		
		int size = in.nextInt();
		
		if (size % 2 == 0) {
			
			System.out.println("Invalid size: Must be odd");		
			return;
			
		}
		ArrayList<Integer> temp = new ArrayList<Integer>();
		ArrayList<Integer> temp2 = new ArrayList<Integer>();

		int row = size - 1;
		int column = size / 2;

		for (int i = 0; i < size; i++) {
			
			temp.add(0);
				
		}
		for (int i = 0; i < size; i++) {
			
			temp2.add(0);
				
		}
		
		for (int i = 0; i < size; i++) {
			
			square.add(temp);
			
		}
		
		for (int i = 1; i <= (size * size); i++) {
			
			temp2 = (ArrayList<Integer>) square.get(row).clone();
			temp2.set(column, i);
			square.set(row, temp2);
			
			int currentRow = row;
			int currentColumn = column;
			row++;
			column++;
			
			
			if (row == size) {

				row = 0;
				
			} if (column == size) {

				column = 0;
				
			} 
			
			temp2 = (ArrayList<Integer>) square.get(row).clone();
			int compare = temp2.get(column);
			
			if (compare != 0) {
				
				row = currentRow - 1;
				column = currentColumn;
				
			}
		}
		
		System.out.println(square);

	}	
}
