package javapractice1.wk5_1;

public class Animal2 {
	int hp = 5;
	int mp = 5;
	
	public void eat() {
		System.out.println("������ ���� �Խ��ϴ�. ���� ü�� : " + (++hp));
	}
	public void sleep() {
		System.out.println("������ ���� ��ϴ�. ���� ���ŷ� : " + (++mp));
	}
	public void walk() {
		System.out.println("������ ��å�մϴ�. ���� ü�� : " + (--hp));
	}
	public void tellOff() {
		System.out.println("������ ȥ�����ϴ�. ���� ���ŷ� : " + (--mp));
	}

}
