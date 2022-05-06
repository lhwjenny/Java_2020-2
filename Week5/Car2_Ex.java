package javapractice1.wk5_1;

public class Car2_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 car = new Car2();
		
		for(int i=1 ; i<5 ; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽: HankookTyre로 교체");
				car.frontLeftTyre = new HankookTyre("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽: KumhoTyre로 교체");
				car.frontRightTyre = new HankookTyre("앞오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤왼쪽: HankookTyre로 교체");
				car.rearLeftTyre = new HankookTyre("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤오른쪽: KumhoTyre로 교체");
				car.rearRightTyre = new HankookTyre("뒤오른쪽", 17);
				break;
			}
			System.out.println("-------------------------------------");
		}
	}
}
