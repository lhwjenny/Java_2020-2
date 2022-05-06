package javapractice1.wk3;

public class OperatorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 100;
		int y = 10;
		int z = 0;
		
		x++;
		++x;
		System.out.println("x is " + x);
		
		y--;
		--y;
		System.out.println("y is " + y);
		
		z = ++x + y--;
		System.out.println("z is " + z);
		System.out.println("x and y are " + x + "and" + y);

	}

}
