package javapractice1.wk5_1;

public class Animal2 {
	int hp = 5;
	int mp = 5;
	
	public void eat() {
		System.out.println("동물이 밥을 먹습니다. 현재 체력 : " + (++hp));
	}
	public void sleep() {
		System.out.println("동물이 잠을 잡니다. 현재 정신력 : " + (++mp));
	}
	public void walk() {
		System.out.println("동물이 산책합니다. 현재 체력 : " + (--hp));
	}
	public void tellOff() {
		System.out.println("동물이 혼났습니다. 현재 정신력 : " + (--mp));
	}

}
