package javapractice1.wk4;

public class MyCat_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCat onsoon = new MyCat("�¼���", "�Ѵ����� �ֺ�", "������� ��������", 5);
		MyCat nabi = new MyCat("����", "���� â��", "Ȳ�ݺ�", 1);
		
		System.out.println(onsoon.name +"�� " + onsoon.address + 
				"�� ���, " + onsoon.color + "�̸� " + onsoon.age + "�� �Դϴ�.");
		System.out.println(nabi.name +"�� " + nabi.address + 
				"�� ���, " + nabi.color + "�̸� " + nabi.age + "�� �Դϴ�.");

	}

}
