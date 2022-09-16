
public class CarTester {

	public static void main(String[] args) {
		
		Car jeep = new Car(10);
		jeep.addGas(12);
		jeep.drive(20);
		jeep.addGas(10);
		jeep.drive(30);
		
		System.out.println("Expected amount: 7 gallons remain.");
		System.out.println("Actual amount: " + jeep.getGasAmount() + " gallons remain.");
		

	}

}
