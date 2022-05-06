package javapractice1.wk4;

public class MyCar_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCar jCar = new MyCar();  //jCar라는 인스턴스 생성
		
		System.out.println("제작회사: " +jCar.company); //jCar를 타고 가서 company 불러오기
		System.out.println("모델이름: " +jCar.model);
		System.out.println("색      상: " +jCar.color);
		System.out.println("최고속도: " +jCar.maxSpeed);
		System.out.println("현재속도: " +jCar.currentSpeed);
		
		jCar.currentSpeed = 30;
		System.out.println("현재속도: " + jCar.currentSpeed);
	}

}
