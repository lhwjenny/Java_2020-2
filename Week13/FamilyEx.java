package javapractice1.wk13;

public class FamilyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Family mom = new Family("������", "�ݵ�������", "010-4578-3261", 50);
		Family dad = new Family("�̿���", "�ݵ�������", "010-2889-3261", 56);
		
		System.out.println(mom.name + "�� " + mom.address + "�� ���, ��ȭ��ȣ�� " + 
		mom.number + "�̸� " + mom.age + "�� �Դϴ�." );
		System.out.println(dad.name + "�� " + dad.address + "�� ���, ��ȭ��ȣ�� " + 
				dad.number + "�̸� " + dad.age + "�� �Դϴ�." );
	}
}
