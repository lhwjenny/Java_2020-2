package javapractice1.wk5_1;

public class Car_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		myCar.setSpeed(-50);
		System.out.println("���� �ӵ�: " + myCar.getSpeed());
		
		myCar.setSpeed(30);
		System.out.println("���� �ӵ�: " + myCar.getSpeed());
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("���� �ӵ�: " + myCar.getSpeed());
	}
}
