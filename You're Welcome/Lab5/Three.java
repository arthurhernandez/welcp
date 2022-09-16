import java.util.Arrays;
import java.util.Scanner;


public class Three {
	
	public static String toString(String[] input) {
		
		String output = "[";
		for (int i=0; i < input.length; i++) {
			
			output += input[i] + ", ";
			
		}
		
		return output + "]";
	}
	
	public static String[] copyOf(String[] input, int length) {
		
		String[] output = new String[length];
		
		for (int i = 0; i < length; i++) {
			
			if (i < input.length) {
				
				output[i] = input[i];
				
			} else {
				
				output[i] = "0";
				
			}
			
		}
		return output;
		
	}
	
	public static String[] sort(String[] input) {
		
		int[] sorted = new int[input.length - 1];
		
		for (int i = 0; i < input.length-1; i++) {
			for (int j = i + 1; j < input.length; j++) {
				
				if (Integer.parseInt(input[i]) > Integer.parseInt(input[j])) {
				
					
					String temp = input[i];
					input[i] = input[j];
					input[j] = temp;
					
				}
				
			}

		}

		return input;
	}
	public static String[] add(String[] input, String insert) {
		
		if (input.length == 0) {
			
			String[] output = {insert};
			return output; 
			
		}
		
		
		String[] output = new String[input.length + 1];
		output[input.length] = insert;
		
		
		for (int i = 0; i < input.length; i++) {
			
			output[i] = input[i];
//			System.out.println(output[i] + " " + input[i]);
			
		}
		return output;
	}
	public static int getAverage(String[] input) {
		
		int total = 0;
		for (int i = 0; i < input.length; i++) {
			
			total += Integer.parseInt(input[i]);
			
		}
		return total/input.length;
		
	}
	public static int getSmallest(String[] input) {
		
		String[] output = sort(input);
		
		return Integer.parseInt(output[0]);
		
	}
	public static int getLargest(String[] input) {
		
		String[] output = sort(input);
		
		return Integer.parseInt(output[input.length - 1]);
		
	}
	public static int getRange(String[] input) { 
		
		return getLargest(input) - getSmallest(input);
		
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String[] input = {};
		String bye = in.next();
		
		while (!bye.equals("bye")) {
			
			input = add(input, bye);
			bye = in.next();
			
		} 
		
		System.out.println(toString(sort(input)));
		System.out.println(toString(copyOf(input, input.length + 1)));
		System.out.println("Average: " + getAverage(input));
		System.out.println("Smallest: " + getSmallest(input));
		System.out.println("Largest: " + getLargest(input));
		System.out.println("Range: " + getRange(input));
		

	}

}
