package javapractice1.ch3;

public class DataType_String {

	public static void main(String[] args) {
		String strVar1 = "���ؿ�";
		String strVar2 = "���ؿ�";
		
		if(strVar1 == strVar2)  {
			System.out.println("strVar1�� strVar2�� ������ ����.");
		} else {
			System.out.println("strVar1�� strVar2�� ������ �ٸ�.");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1�� strVar2�� ���ڿ��� ����.");
		}
		
		String strVar3 = new String("���ؿ�");
		String strVar4 = new String("���ؿ�");
		
		if(strVar3 == strVar4)  {
			System.out.println("strVar3�� strVar4�� ������ ����.");
		} else {
			System.out.println("strVar3�� strVar4�� ������ �ٸ�.");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3�� strVar4�� ���ڿ��� ����.");
		}

	}

}
