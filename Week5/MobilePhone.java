package javapractice1.wk5_1;

public class MobilePhone {
	
	String model;
	String color;
	
	void powerOn() {System.out.println("������ �մϴ�.");}
	void powerOff() {System.out.println("������ ���ϴ�.");}
	void call(String sbd) {System.out.println(sbd + "���� ��ȭ�� �մϴ�.");}
	void sendVoice(String message) {System.out.println("��: " + message);}
	void receiveVoice(String message) {System.out.println("����: " + message);}
	void hangUp() {System.out.println("��ȭ�� �����ϴ�.");}

}
