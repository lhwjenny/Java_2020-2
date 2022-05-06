package javapractice1.wk3;

public class OperatorEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 10;
		double num3 = 10.0;
		double num4 = 0.3;
		float num5 = 0.3f;
		
		System.out.println("num1 == num2 ? " + (num1 == num2));
		System.out.println("num1 != num2 ? " + (num1 != num2));
		System.out.println("num1 <= num2 ? " + (num1 <= num2));
		System.out.println("num1 == num3 ? " + (num1 == num3));
		System.out.println("num4 == num5 ? " + (num4 == num5));
		
		char char1 = 'a';
		char char2 = 'b';
		System.out.println("char1 < char2 ? " + (char1 < char2));
		
		String str1 = "자바자바";
		String str2 = "자바자바";
		String str3 = new String("자바자바");
		System.out.println("str1 == str2 ? " + (str1 == str2));
		System.out.println("str1 == str3 ? " + (str1 == str3));
	}

}
