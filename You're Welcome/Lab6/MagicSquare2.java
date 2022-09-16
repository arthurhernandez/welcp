import java.util.ArrayList;
import java.util.Scanner;

public class MagicSquare2 {
	
	public static boolean rowsEqual(ArrayList<ArrayList<Integer>> input) {
		
		int sum = input.get(0).get(0) + input.get(0).get(1) + input.get(0).get(2) + input.get(0).get(3);
		int currentSum = 0;
		
		for (int i = 0; i < input.size(); i++) {
			for (int j = 0; j < input.get(0).size(); j++) {
				
				currentSum += input.get(i).get(j);
				
			}
			if (currentSum != sum)  {
				return false;
			}
			currentSum = 0;
		}
		return true;
	}
	
	public static boolean columnsEqual(ArrayList<ArrayList<Integer>> input) {
		
		int sum = input.get(0).get(0) + input.get(0).get(1) + input.get(0).get(2) + input.get(0).get(3);
		int currentSum = 0;
		
		for (int i = 0; i < input.size(); i++) {
			for (int j = 0; j < input.get(0).size(); j++) {
				
				currentSum += input.get(j).get(i);
				
			}
			if (currentSum != sum)  {
				return false;
			}
			currentSum = 0;
		}
		return true;
	}
	
	public static boolean diagonalEqual(ArrayList<ArrayList<Integer>> input) {
		
		int sum = input.get(0).get(0) + input.get(0).get(1) + input.get(0).get(2) + input.get(0).get(3);
		int currentSum = 0;
		
		for (int i = 0; i < input.size(); i++) {
			for (int j = 0; j < input.get(0).size(); j++) {
			
				if (i == j) {
					currentSum += input.get(i).get(j);
				}
			}
		}
		return currentSum == sum;
		
	}
	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> square = new ArrayList<ArrayList<Integer>>();
		
		ArrayList<Integer> col1 = new ArrayList<Integer>();
		ArrayList<Integer> col2 = new ArrayList<Integer>();
		ArrayList<Integer> col3 = new ArrayList<Integer>();
		ArrayList<Integer> col4 = new ArrayList<Integer>();
		
		col1.add(16);
		col1.add(5);
		col1.add(9);
		col1.add(4);
		
		col2.add(3);
		col2.add(10);
		col2.add(6);
		col2.add(15);
		
		col3.add(2);
		col3.add(11);
		col3.add(7);
		col3.add(14);
		
		col4.add(13);
		col4.add(8);
		col4.add(12);
		col4.add(1);
		
		square.add(col1);
		square.add(col2);
		square.add(col3);
		square.add(col4);
		
		Scanner in = new Scanner(System.in);
		
		int current;
		int[] numbers = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
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
