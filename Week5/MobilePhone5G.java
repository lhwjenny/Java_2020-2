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
			System.out.println("5G ��Ʈ��ũ�� �����մϴ�. ���ļ�: " + carrierFreq + " GHz (�ִ� �ӵ�: 1 Gb/s)");
		else 
			System.out.println("5G ��Ʈ��ũ�� �����մϴ�. ���ļ�: \" + carrierFreq + \" GHz (�ִ� �ӵ�: 10 Gb/s)");
	}
	
	void changeCarrierFreq(double carrierFreq) {
		this.carrierFreq = carrierFreq;
		System.out.println("��� ���ļ��� " + this.carrierFreq + " �� �ٲߴϴ�.");
		if (carrierFreq < 6)
			System.out.println("    - �ִ� �ӵ�: 1 Gb/s");
		else
			System.out.println("    - �ִ� �ӵ�: 10 Gb/s");
	}
	void turnOff5G() {
		System.out.println("5G ����� �����մϴ�.");
	}

}
