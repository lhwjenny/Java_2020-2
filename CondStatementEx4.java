package javapractice1.wk3;

import java.util.Scanner;

public class CondStatementEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("++로그인 <admin 혹은 사용자 아이디 입력> ++");
		System.out.print("+아이디 입력: ");
		String user = scan.next();
		
		if (user.equals("admin")) {
			System.out.println("관리자로 로그인하셨습니다.");
		}
		else {
			System.out.println(user + "님으로 로그인하셨습니다.");
		}
		System.out.println("++모드를 선택하세요 (1,2) ++");
		System.out.print("+모드 선택: ");
		String mode = scan.next();
		
		if(mode.equals("1") && user.equals("admin")) {
			System.out.println("관리자가 1번 모드 선택.");
		}
		else if(mode.equals("2") && user.equals("admin")) {
			System.out.println("관리자가 2번 모드 선택.");
		}
		else if(mode.equals("1") && !user.equals("admin")) {
			System.out.println(user + "가 1번 모드 선택.");
		}
		else if(mode.equals("2") && !user.equals("admin")) {
			System.out.println(user + "가 2번 모드 선택.");
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}

	}

}
