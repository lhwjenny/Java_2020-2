package javapractice1.wk7;

public class StringReplaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String oldStr = ("�ڹٴ� �������� ���α׷��� ����Դϴ�. �ڹٴ� ����� API�� �����մϴ�.");
		String newStr1 = oldStr.replace("��������", "��ü����");
		String newStr2 = newStr1.replace("�����", "ǳ����");
		
		System.out.println(oldStr);
		System.out.println(newStr1);
		System.out.println(newStr2);

	}

}
