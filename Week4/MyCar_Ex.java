package javapractice1.wk4;

public class MyCar_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCar jCar = new MyCar();  //jCar��� �ν��Ͻ� ����
		
		System.out.println("����ȸ��: " +jCar.company); //jCar�� Ÿ�� ���� company �ҷ�����
		System.out.println("���̸�: " +jCar.model);
		System.out.println("��      ��: " +jCar.color);
		System.out.println("�ְ�ӵ�: " +jCar.maxSpeed);
		System.out.println("����ӵ�: " +jCar.currentSpeed);
		
		jCar.currentSpeed = 30;
		System.out.println("����ӵ�: " + jCar.currentSpeed);
	}

}
