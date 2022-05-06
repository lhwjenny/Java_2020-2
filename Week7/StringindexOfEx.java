package javapractice1.wk7;

public class StringindexOfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String subject = "객체 지향 프로그램밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println("The first index of \"프로그래밍\" : " + location);
		
		if(subject.indexOf("객체 지향") != -1) {
			System.out.println("객체 지향 프로그래밍과 관련된 과목입니다.");
		} else {
			System.out.println("객체 지향 프로그래밍과 관련없는 과목입니다.");
		}

	}

}
