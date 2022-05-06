package javapractice1.wk4;

public class MyRectangle {
	public MyRectangle() {
		System.out.println("사각형이 생성되었습니다.");
	}	
	//정사각형의 넓이
	double rectArea(double width) {
		return width * width;
	}	
	//직사각형의 넓이
	double rectArea(double width, double height) {
		return width * height;
	}
}
