package javapractice1.wk4;

public class MyCar2 {
	//필드
	int currentSpeed;
	
	//생성자
	public MyCar2() {
	}
	
	//메소드들
	int getSpeed() {
		return currentSpeed;
	}
	
	void switchOn() {
		System.out.println("시동을 겁니다.");
	}
	
	void accelerate(int setSpeed) {
		if (currentSpeed < setSpeed) {
			for(int i = currentSpeed ; i<=setSpeed ; i++)
			{
				currentSpeed = i;
				System.out.println("가속합니다. (현재속도: " + currentSpeed + "km/h)");
			}
		}
		else {
			System.out.println("현재 속도와 같습니다.");
		}
	}

}
