package javapractice1.wk3;

import java.util.Scanner;

public class CondStatementEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("++ 자격 선택 ++");
		System.out.println("[1]: 구매자, [2]: 판매자");
		System.out.println("자격을 선택해주세요: ");
		
		String input = scan.next();
		
		if(input.equals("1")) {
			System.out.println("환영합니다. 구매자로 로그인하셨습니다.");
		}
		else {
			System.out.println("환영합니다. 판매자로 로그인하셨습니다.");
		}

	}

}
