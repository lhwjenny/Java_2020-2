package javapractice1.wk3;

public class OperatorEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int charCode = 'A';
		if((charCode >= 65) & (charCode <= 90))  {
			System.out.println("�빮�� �����Դϴ�. ");
		}
		if((charCode >= 97) & (charCode <= 122)) {
			System.out.println("�ҹ��� �����Դϴ�. ");
		}
		
		int value = 6;
		
		if((value%2==0) || (value%3==0)) {
			System.out.println("2 �Ǵ� 3�� ����Դϴ�.");
		}
		if((value%2==0) && (value%3==0)) {
			System.out.println("2�� 3�� ����Դϴ�.");
		}

	}

}
