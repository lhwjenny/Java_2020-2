package javapractice1.wk4;

public class MyCar2 {
	//�ʵ�
	int currentSpeed;
	
	//������
	public MyCar2() {
	}
	
	//�޼ҵ��
	int getSpeed() {
		return currentSpeed;
	}
	
	void switchOn() {
		System.out.println("�õ��� �̴ϴ�.");
	}
	
	void accelerate(int setSpeed) {
		if (currentSpeed < setSpeed) {
			for(int i = currentSpeed ; i<=setSpeed ; i++)
			{
				currentSpeed = i;
				System.out.println("�����մϴ�. (����ӵ�: " + currentSpeed + "km/h)");
			}
		}
		else {
			System.out.println("���� �ӵ��� �����ϴ�.");
		}
	}

}
