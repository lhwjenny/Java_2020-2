package javapractice1.wk3;

import java.util.Scanner;

public class CondStatementEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("++ ���̵� �Է��ϼ���: ");
		
		String user = scan.next();
		
		if(user.equals("kkiimm")) {
			System.out.print("++ ��й�ȣ�� �Է��ϼ���: ");
			
			String pwd = scan.next();
			
			if(pwd.equals("qwerty")) {
				System.out.println("��й�ȣ ���� Ȯ��!! -> �α��� ����");
			}
			else
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}
		else
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");

	}

}
