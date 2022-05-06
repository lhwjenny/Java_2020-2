package javapractice1.wk4;

public class MyCalculator_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator myCalc = new MyCalculator(); //myCalc가 MyCalculator 참조하도록 함
		myCalc.powerOn(); //전원킴
		
		int result1 = myCalc.plus(5,6);
		System.out.println("result1: " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2: " + result2);

	}

}
