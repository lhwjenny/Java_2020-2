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
			System.out.println(location + "Tyre����: " + (maxRotation-accumulatedRotation) + "ȸ");
			return true;
		}
		else {
			System.out.println("## " + location + "Tyre ��ü��� ##");
			return false;
		}
	}

}
