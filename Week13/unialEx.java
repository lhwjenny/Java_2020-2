package javapractice1.wk13;

public class unialEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		unial vision = new unial();
		
		System.out.println("���� ȸ��: " + vision.company);
		System.out.println("�� �̸�: " + vision.model);
		System.out.println("��       ��: " + vision.color);
		System.out.println("��  ��(%): " + vision.consentration);
		System.out.println("�� ��(mL): " + vision.volume);
		
		vision.volume = 0.45;
		System.out.println("�� ��(mL): " + vision.volume);

	}

}
