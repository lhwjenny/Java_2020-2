package javapractice1.wk5_1;

public class MobilePhone {
	
	String model;
	String color;
	
	void powerOn() {System.out.println("전원을 켭니다.");}
	void powerOff() {System.out.println("전원을 끕니다.");}
	void call(String sbd) {System.out.println(sbd + "에게 전화를 합니다.");}
	void sendVoice(String message) {System.out.println("나: " + message);}
	void receiveVoice(String message) {System.out.println("상대방: " + message);}
	void hangUp() {System.out.println("전화를 끊습니다.");}

}
