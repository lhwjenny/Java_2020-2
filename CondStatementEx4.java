package javapractice1.wk3;

import java.util.Scanner;

public class CondStatementEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("++�α��� <admin Ȥ�� ����� ���̵� �Է�> ++");
		System.out.print("+���̵� �Է�: ");
		String user = scan.next();
		
		if (user.equals("admin")) {
			System.out.println("�����ڷ� �α����ϼ̽��ϴ�.");
		}
		else {
			System.out.println(user + "������ �α����ϼ̽��ϴ�.");
		}
		System.out.println("++��带 �����ϼ��� (1,2) ++");
		System.out.print("+��� ����: ");
		String mode = scan.next();
		
		if(mode.equals("1") && user.equals("admin")) {
			System.out.println("�����ڰ� 1�� ��� ����.");
		}
		else if(mode.equals("2") && user.equals("admin")) {
			System.out.println("�����ڰ� 2�� ��� ����.");
		}
		else if(mode.equals("1") && !user.equals("admin")) {
			System.out.println(user + "�� 1�� ��� ����.");
		}
		else if(mode.equals("2") && !user.equals("admin")) {
			System.out.println(user + "�� 2�� ��� ����.");
		}
		else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}

	}

}
