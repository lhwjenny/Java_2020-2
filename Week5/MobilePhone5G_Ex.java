package javapractice1.wk5_1;

public class MobilePhone5G_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobilePhone5G mob5g = new MobilePhone5G("5���� ���� ��", "��Ȳ��", 3.5);
		
		System.out.println("��: " + mob5g.model);
		System.out.println("����: " + mob5g.color);
		
		System.out.println("��� ���ļ�: " + mob5g.carrierFreq + " GHz");
		
		mob5g.powerOn();
		mob5g.call("�����");
		mob5g.sendVoice("��������.");
		mob5g.receiveVoice("������ ��ȭ�� ���� �ʾ�...");
		mob5g.sendVoice("...");
		mob5g.hangUp();
		
		mob5g.turnOn5G();
		mob5g.changeCarrierFreq(28.1);
		mob5g.changeCarrierFreq(3.5);
		mob5g.turnOff5G();
	}
}
