package javapractice1.wk3;

import java.util.Scanner;

public class LoopStatementEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String input;
		
		do {
			System.out.print("�Է� (exit�� �Է��ϸ� ����): ");
			input = scan.nextLine();
			System.out.println(input + "�� �Է��Ͻ�.");
		} while(!input.equals("exit"));
		
		System.out.println("\n���α׷��� �����մϴ�.");

	}

}
