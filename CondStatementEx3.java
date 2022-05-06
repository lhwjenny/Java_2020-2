package javapractice1.wk3;

import java.util.Scanner;

public class CondStatementEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in); //키보드로 입력

		System.out.println("숫자를 입력해주세요: ");		
		String input = scan.next();  //입력한 값을 문자열로 저장
		int number = Integer.parseInt(input); //문자열을 정수로 바꾸는 법
		
		if(number % 2 == 0) {
			System.out.println("입력하신 숫자는 짝수입니다.");
		}
		else {
			System.out.println("입력하신 숫자는 홀수입니다.");
		}

	}

}
