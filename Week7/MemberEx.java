package javapractice1.wk7;

public class MemberEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1 = new Member("blue");
		Member m2 = new Member("blue");
		Member m3 = new Member("red");
		
		if(m1.equals(m2)) {
			System.out.println("m1과 m2는 동일합니다.");
		} else {
			System.out.println("m1과 m2는 동일하지 않습니다.");
		}
		
		if(m1.equals(m3)) {
			System.out.println("m1과 m3는 동일합니다.");
		} else {
			System.out.println("m1과 m3는 동일하지 않습니다.");
		}
	}
}
