package javapractice1.wk5_1;

public class KumhoTyre extends Tyre {
	public KumhoTyre(String location, int maxRotation) {
		super(location, maxRotation);
	}
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "KumhoTyre ����: " + 
		          (maxRotation-accumulatedRotation) + "ȸ");
			return true;
		}
		else {
			System.out.println("## " + location + "KumhoTyre ��ü��� ##");
			return false;
		}
	}

}
