package javapractice1.wk3;

import java.util.Scanner;

public class CondStatementEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("++ �ڰ� ���� ++");
		System.out.println("[1]: ������, [2]: �Ǹ���");
		System.out.println("�ڰ��� �������ּ���: ");
		
		String input = scan.next();
		
		if(input.equals("1")) {
			System.out.println("ȯ���մϴ�. �����ڷ� �α����ϼ̽��ϴ�.");
		}
		else {
			System.out.println("ȯ���մϴ�. �Ǹ��ڷ� �α����ϼ̽��ϴ�.");
		}

	}

}
