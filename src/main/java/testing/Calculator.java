package testing;

public class Calculator {
	public int add(int number1, int number2) {
		return number1 + number2;
	}

	public float add(float number1, float number2) {
		if(number1 > 2) {
			System.out.println("some message");
		}
		return number1 + number2;
	}
	
	public float divide(int number1,int number2) {
		return (float)number1/number2;
	}
}
