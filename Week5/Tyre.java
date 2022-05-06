package javapractice1.wk5_1;

public class Tyre {
	
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	public Tyre(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "Tyre수명: " + (maxRotation-accumulatedRotation) + "회");
			return true;
		}
		else {
			System.out.println("## " + location + "Tyre 교체요망 ##");
			return false;
		}
	}

}
