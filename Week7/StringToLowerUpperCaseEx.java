package javapractice1.wk7;

public class StringToLowerUpperCaseEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello Everybody";
		String str2 = ("HELLO Everybody");
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
		System.out.println(str1.equalsIgnoreCase(str2));
	}

}
