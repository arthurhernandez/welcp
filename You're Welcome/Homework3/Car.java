
public class Car {
	
	private int gasAmount, efficiency;
	
	public Car (int efficiencyNum) {
		
		gasAmount = 0;
		efficiency = efficiencyNum;
		
	}
	
	public void addGas(int gas) {
		
		gasAmount = gas;
		
	}
	
	public int getGasAmount() {
		
		return gasAmount;
		
	}
	
	public void drive(int miles) { 
		
		gasAmount -= miles/efficiency;
		
	}


}
