package javapractice1.wk3;

public class OperatorEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		double y = 0.0;
		
		double z1 = x / y;
		double z2 = x % y;
		
		System.out.println("Is z1 infinite? " + Double.isInfinite(z1));
		System.out.println("Is z2 NaN? " + Double.isNaN(z2));
		
		z1 = z1 + 2.0;
		z2 = z2 + 2.0;
		
		System.out.println("Is z1 still infinite? " + Double.isInfinite(z1));
		System.out.println("Is z2 still NaN? " + Double.isNaN(z2));

	}

}
