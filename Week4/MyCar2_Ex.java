package javapractice1.wk4;

public class MyCar2_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCar2 bb2 = new MyCar2();
		bb2.switchOn();
		bb2.accelerate(5);
		int speed = bb2.getSpeed();
		System.out.println("현재 속도: " + speed + "km/h");

	}

}
