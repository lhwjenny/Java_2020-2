package javapractice1.wk7;

public class StringindexOfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String subject = "��ü ���� ���α׷���";
		
		int location = subject.indexOf("���α׷���");
		System.out.println("The first index of \"���α׷���\" : " + location);
		
		if(subject.indexOf("��ü ����") != -1) {
			System.out.println("��ü ���� ���α׷��ְ� ���õ� �����Դϴ�.");
		} else {
			System.out.println("��ü ���� ���α׷��ְ� ���þ��� �����Դϴ�.");
		}

	}

}
