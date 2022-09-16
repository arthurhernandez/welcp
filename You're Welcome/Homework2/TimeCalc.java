import java.util.Scanner;

public class TimeCalc {
	
	public static void main(String[] args) {
		
		
		String firstTime, secondTime;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter first time: ");
		firstTime = in.next();
		
		System.out.print("Enter second time: ");
		secondTime = in.next();
		
		int firstInMinutes = (Integer.parseInt(firstTime.substring(0, 2)) * 60) + Integer.parseInt(firstTime.substring(3, 5));
		int secondInMinutes = (Integer.parseInt(secondTime.substring(0, 2)) * 60) + Integer.parseInt(secondTime.substring(3, 5));
		
		int difference = Math.abs(firstInMinutes - secondInMinutes);
		
		int differenceMinutes = difference % 60;
		int differenceHours = difference / 60;
		
		System.out.println("Difference is: " + differenceHours + " hours and " + differenceMinutes + " minutes.");
		
	}
 
}
