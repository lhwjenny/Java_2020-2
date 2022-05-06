package javapractice1.wk3;

import java.util.Scanner;

public class CondStatementEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("++ 아이디를 입력하세요: ");
		
		String user = scan.next();
		
		if(user.equals("kkiimm")) {
			System.out.print("++ 비밀번호를 입력하세요: ");
			
			String pwd = scan.next();
			
			if(pwd.equals("qwerty")) {
				System.out.println("비밀번호 인증 확인!! -> 로그인 성공");
			}
			else
				System.out.println("비밀번호가 틀렸습니다.");
		}
		else
			System.out.println("아이디가 틀렸습니다.");

	}

}
