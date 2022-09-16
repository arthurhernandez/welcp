import java.math.BigInteger;

public class Homework1 {
	
	public static void main(String[] args) {
		
		int fibNum = 10;
		int index = 0;
		BigInteger firstNum = new BigInteger("0");
		BigInteger secondNum = new BigInteger("1");
		BigInteger next = new BigInteger("0");
		
	   	while (index < (int) fibNum) {
	   		
	   		if (index <= 1) { next.equals(index);}
	   		else { 
	   			next = firstNum.add(secondNum);
	   			firstNum = secondNum;
	   			secondNum = next;
	   		}
	   		index = index + 1;

	   	}
	   	
	   	System.out.println(next);
	}
}
