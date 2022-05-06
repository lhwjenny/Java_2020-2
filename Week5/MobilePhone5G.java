package javapractice1.wk5_1;

public class MobilePhone5G extends MobilePhone{
	double carrierFreq;
	
	MobilePhone5G(String model, String color, double carrierFreq) {
		this.model = model;
		this.color = color;
		this.carrierFreq = carrierFreq;
	}
	
	void turnOn5G() {
		if (carrierFreq < 6)
			System.out.println("5G 네트워크에 접속합니다. 주파수: " + carrierFreq + " GHz (최대 속도: 1 Gb/s)");
		else 
			System.out.println("5G 네트워크에 접속합니다. 주파수: \" + carrierFreq + \" GHz (최대 속도: 10 Gb/s)");
	}
	
	void changeCarrierFreq(double carrierFreq) {
		this.carrierFreq = carrierFreq;
		System.out.println("통신 주파수를 " + this.carrierFreq + " 로 바꿉니다.");
		if (carrierFreq < 6)
			System.out.println("    - 최대 속도: 1 Gb/s");
		else
			System.out.println("    - 최대 속도: 10 Gb/s");
	}
	void turnOff5G() {
		System.out.println("5G 통신을 종료합니다.");
	}

}
