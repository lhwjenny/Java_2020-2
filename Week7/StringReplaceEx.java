package javapractice1.wk7;

public class StringReplaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String oldStr = ("자바는 절차지향 프로그래밍 언어입니다. 자바는 빈약한 API를 제공합니다.");
		String newStr1 = oldStr.replace("절차지향", "객체지향");
		String newStr2 = newStr1.replace("빈약한", "풍부한");
		
		System.out.println(oldStr);
		System.out.println(newStr1);
		System.out.println(newStr2);

	}

}
