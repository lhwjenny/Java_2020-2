package javapractice1.wk5_1;

public class KumhoTyre extends Tyre {
	public KumhoTyre(String location, int maxRotation) {
		super(location, maxRotation);
	}
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "KumhoTyre 수명: " + 
		          (maxRotation-accumulatedRotation) + "회");
			return true;
		}
		else {
			System.out.println("## " + location + "KumhoTyre 교체요망 ##");
			return false;
		}
	}

}
