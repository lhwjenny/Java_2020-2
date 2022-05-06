package javapractice1.wk5_1;

public class HankookTyre extends Tyre {
	public HankookTyre(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "HankookTyre ����: " + (maxRotation-accumulatedRotation) + "ȸ");
			return true;
		}
		else {
			System.out.println("## " + location + "HankookTyre ��ü��� ##");
			return false;
		}
	}

}
