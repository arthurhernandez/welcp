import java.util.Scanner;

public class Card {
	
	
	public static String getDescription(String notation) {
		
		
		String cardValue = "", cardSuit = " ";
		
		if (notation.length() == 2) {
		
			switch (notation.charAt(0)) {
		
			case 'A':
				cardValue ="Ace";
				break;
			case '1':
				cardValue ="One";				
				break;
			case '2':
				cardValue ="Two";
				break;
			case '3':
				cardValue ="Three";
				break;
			case '4':
				cardValue ="Four";
				break;
			case '5':
				cardValue ="Five";
				break;
			case '6':
				cardValue ="Six";
				break;
			case '7':
				cardValue ="Seven";
				break;
			case '8':
				cardValue ="Eight";
				break;
			case '9':
				cardValue ="Nine";
				break;
			case 'J':
				cardValue ="Jack";
				break;
			case 'Q':
				cardValue ="Queen";
				break;
			case 'K':
				cardValue ="King";
				break;
			default: 
				return "Unknown";
			
			} 
			
		}else if (notation.length() == 3 && notation.substring(0, 2).equals("10")) {
				
			cardValue = "Ten";
				
		} else {
				
			return "Unknown";
				
		}
		
		switch (notation.charAt(notation.length() - 1)) {
		
		case 'S':
			cardSuit ="Spades";
			break;
		case 'H':
			cardSuit ="Hearts";
			break;
		case 'C':
			cardSuit ="Clubs";
			break;
		case 'D':
			cardSuit ="Diamonds";
			break;
		}
	
		
		return cardValue + " of " + cardSuit;
		
		
		
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.printf("Enter the card notation: ");
		String cardNotation = in.next();
		
		System.out.println(getDescription(cardNotation));
		
		in.close();

	}

}
