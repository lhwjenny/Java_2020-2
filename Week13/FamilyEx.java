package javapractice1.wk13;

public class FamilyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Family mom = new Family("신은선", "반도유보라", "010-4578-3261", 50);
		Family dad = new Family("이우익", "반도유보라", "010-2889-3261", 56);
		
		System.out.println(mom.name + "은 " + mom.address + "에 살고, 전화번호는 " + 
		mom.number + "이며 " + mom.age + "살 입니다." );
		System.out.println(dad.name + "은 " + dad.address + "에 살고, 전화번호는 " + 
				dad.number + "이며 " + dad.age + "살 입니다." );
	}
}
