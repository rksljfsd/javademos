package abstraction;

public class Test {
	
	public static void main(String[] args) {
//		BMW bmw = new BMW();
		
		BMW3Series threes = new BMW3Series();
		threes.accelarate();
		threes.commonFunctionality();
		
		BMW5Series fives = new BMW5Series();
		fives.accelarate();
		fives.commonFunctionality();
	}

}
