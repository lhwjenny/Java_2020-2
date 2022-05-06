package javapractice1.wk7;

public class StringTrimEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mpNum1 = "   010";
		String mpNum2 = "9099       ";
		String mpNum3 = "   1011    ";
		
		String mpNum = mpNum1.trim() + "-" + mpNum2.trim() + "-" + mpNum3.trim();
		System.out.println(mpNum);

	}

}
