package javapractice1.wk4;

public class MyCalculator2_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator2 myCalc = new MyCalculator2();
		
		int[] values1 = {1, 2, 3, 4, 5};
		int result1 = myCalc.sum1(values1);
		System.out.println("result1: " + result1);
		
		int result2 = myCalc.sum1(new int[] {6, 7, 8, 9, 10});
		System.out.println("result2: " + result2);
		
		int result3 = myCalc.sum2(1, 2, 3, 4, 5);
		System.out.println("result3: " + result3);
		
		int result4 = myCalc.sum2(values1);
		System.out.println("result4: " + result4);
	}

}
