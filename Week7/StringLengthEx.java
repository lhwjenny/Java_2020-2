package javapractice1.wk7;

public class StringLengthEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "1010103040055";
		
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민등록번호가 맞습니다.");
		} else {
			System.out.println("주민등록번호가 아닙니다.");
		}

	}

}
