package javapractice1.wk7;

public class MemberEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1 = new Member("blue");
		Member m2 = new Member("blue");
		Member m3 = new Member("red");
		
		if(m1.equals(m2)) {
			System.out.println("m1�� m2�� �����մϴ�.");
		} else {
			System.out.println("m1�� m2�� �������� �ʽ��ϴ�.");
		}
		
		if(m1.equals(m3)) {
			System.out.println("m1�� m3�� �����մϴ�.");
		} else {
			System.out.println("m1�� m3�� �������� �ʽ��ϴ�.");
		}
	}
}
