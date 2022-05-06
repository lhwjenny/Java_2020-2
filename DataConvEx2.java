package javapractice1.ch3;

public class DataConvEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
//강제 자료형 변환 예제
		//작은 크기 자료형 = (작은 크기 자료형)큰 크기 자료형
		//ex) int 타입 -> char 타입
	}

}
