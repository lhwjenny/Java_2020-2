package javapractice1.wk5_1;

public class Car2_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 car = new Car2();
		
		for(int i=1 ; i<5 ; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("�տ���: HankookTyre�� ��ü");
				car.frontLeftTyre = new HankookTyre("�տ���", 15);
				break;
			case 2:
				System.out.println("�տ�����: KumhoTyre�� ��ü");
				car.frontRightTyre = new HankookTyre("�տ�����", 13);
				break;
			case 3:
				System.out.println("�ڿ���: HankookTyre�� ��ü");
				car.rearLeftTyre = new HankookTyre("�ڿ���", 14);
				break;
			case 4:
				System.out.println("�ڿ�����: KumhoTyre�� ��ü");
				car.rearRightTyre = new HankookTyre("�ڿ�����", 17);
				break;
			}
			System.out.println("-------------------------------------");
		}
	}
}
