package javapractice1.wk5_1;

public class HankookTyre extends Tyre {
	public HankookTyre(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "HankookTyre 수명: " + (maxRotation-accumulatedRotation) + "회");
			return true;
		}
		else {
			System.out.println("## " + location + "HankookTyre 교체요망 ##");
			return false;
		}
	}

}
