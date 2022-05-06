package javapractice1.wk6;

public class SmartTV1 extends Product {
	String resolution;
	
	public SmartTV1(String pname, int price, String resolution) {
		this.pname = pname;
		this.price = price;
		this.resolution = resolution;
	}

	@Override
	public void printExtra() {
		// TODO Auto-generated method stub
		System.out.println("ÇØ»óµµ: " + resolution);

	}

}
