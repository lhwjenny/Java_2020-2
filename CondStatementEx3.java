package javapractice1.wk3;

import java.util.Scanner;

public class CondStatementEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in); //Ű����� �Է�

		System.out.println("���ڸ� �Է����ּ���: ");		
		String input = scan.next();  //�Է��� ���� ���ڿ��� ����
		int number = Integer.parseInt(input); //���ڿ��� ������ �ٲٴ� ��
		
		if(number % 2 == 0) {
			System.out.println("�Է��Ͻ� ���ڴ� ¦���Դϴ�.");
		}
		else {
			System.out.println("�Է��Ͻ� ���ڴ� Ȧ���Դϴ�.");
		}

	}

}
