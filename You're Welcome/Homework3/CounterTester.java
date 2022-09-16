
public class CounterTester {
	
	public static void main(String[] args) {
		

		Counter tally = new Counter();
		tally.click();
		tally.click();
		tally.click();
		tally.click();
		tally.click();
		tally.click();
		tally.click();
		tally.click();
		
		System.out.println("Expected Count: 8");
		System.out.println("Actual Count: " + tally.getValue());
		
	}

}
