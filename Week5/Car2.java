package javapractice1.wk5_1;

public class Car2 {
	Tyre frontLeftTyre = new Tyre("�տ���", 6);
	Tyre frontRightTyre = new Tyre("�տ�����", 2);
	Tyre rearLeftTyre = new Tyre("�ڿ���", 3);
	Tyre rearRightTyre = new Tyre("�ڿ�����", 4);
	
	int run() {
		System.out.println("|| �ڵ����� �޸��ϴ�. ||");
		if(frontLeftTyre.roll()==false) { stop(); return 1; }
		if(frontRightTyre.roll()==false) { stop(); return 2; }
		if(rearLeftTyre.roll()==false) { stop(); return 3; }
		if(rearRightTyre.roll()==false) { stop(); return 4; }
		return 0;
	}
	void stop() {
		System.out.println("XX �ڵ����� ����ϴ�. XX");
	}

}
