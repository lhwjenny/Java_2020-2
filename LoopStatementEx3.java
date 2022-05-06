package javapractice1.wk3;

import java.util.Scanner;

public class LoopStatementEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String input;
		
		do {
			System.out.print("입력 (exit를 입력하면 종료): ");
			input = scan.nextLine();
			System.out.println(input + "을 입력하심.");
		} while(!input.equals("exit"));
		
		System.out.println("\n프로그램을 종료합니다.");

	}

}
