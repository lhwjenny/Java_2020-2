package javapractice1.wk13;

public class unialEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		unial vision = new unial();
		
		System.out.println("제약 회사: " + vision.company);
		System.out.println("모델 이름: " + vision.model);
		System.out.println("색       상: " + vision.color);
		System.out.println("농  도(%): " + vision.consentration);
		System.out.println("용 량(mL): " + vision.volume);
		
		vision.volume = 0.45;
		System.out.println("용 량(mL): " + vision.volume);

	}

}
