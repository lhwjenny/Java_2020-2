package javapractice1.wk3;

public class OperatorEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int charCode = 'A';
		if((charCode >= 65) & (charCode <= 90))  {
			System.out.println("대문자 영어입니다. ");
		}
		if((charCode >= 97) & (charCode <= 122)) {
			System.out.println("소문자 영어입니다. ");
		}
		
		int value = 6;
		
		if((value%2==0) || (value%3==0)) {
			System.out.println("2 또는 3의 배수입니다.");
		}
		if((value%2==0) && (value%3==0)) {
			System.out.println("2와 3의 배수입니다.");
		}

	}

}
