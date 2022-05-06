package javapractice1.wk4;

public class MyRectangle_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRectangle rect1 = new MyRectangle();
		double result1 = rect1.rectArea(10.5);
		System.out.println("정사각형의 넓이: " + result1);
		
		MyRectangle rect2 = new MyRectangle();
		double result2 = rect2.rectArea(5, 7.5);
		System.out.println("직사각형의 넓이: " + result2);

	}

}
