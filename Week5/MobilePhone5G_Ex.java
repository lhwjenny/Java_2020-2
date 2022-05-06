package javapractice1.wk5_1;

public class MobilePhone5G_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobilePhone5G mob5g = new MobilePhone5G("5지게 빠른 폰", "주황색", 3.5);
		
		System.out.println("모델: " + mob5g.model);
		System.out.println("색상: " + mob5g.color);
		
		System.out.println("통신 주파수: " + mob5g.carrierFreq + " GHz");
		
		mob5g.powerOn();
		mob5g.call("총장님");
		mob5g.sendVoice("여보세요.");
		mob5g.receiveVoice("고객님이 전화를 받지 않아...");
		mob5g.sendVoice("...");
		mob5g.hangUp();
		
		mob5g.turnOn5G();
		mob5g.changeCarrierFreq(28.1);
		mob5g.changeCarrierFreq(3.5);
		mob5g.turnOff5G();
	}
}
