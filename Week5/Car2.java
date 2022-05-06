package javapractice1.wk5_1;

public class Car2 {
	Tyre frontLeftTyre = new Tyre("앞왼쪽", 6);
	Tyre frontRightTyre = new Tyre("앞오른쪽", 2);
	Tyre rearLeftTyre = new Tyre("뒤왼쪽", 3);
	Tyre rearRightTyre = new Tyre("뒤오른쪽", 4);
	
	int run() {
		System.out.println("|| 자동차가 달립니다. ||");
		if(frontLeftTyre.roll()==false) { stop(); return 1; }
		if(frontRightTyre.roll()==false) { stop(); return 2; }
		if(rearLeftTyre.roll()==false) { stop(); return 3; }
		if(rearRightTyre.roll()==false) { stop(); return 4; }
		return 0;
	}
	void stop() {
		System.out.println("XX 자동차가 멈춥니다. XX");
	}

}
