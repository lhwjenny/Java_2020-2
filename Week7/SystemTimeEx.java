package javapractice1.wk7;

public class SystemTimeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time1 = System.nanoTime();
		
		int sum = 0;
		for (int i = 1; i <= 1_000_000 ; i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime();
		
		System.out.println("1~1,000,000까지의 합 : " + sum);
		System.out.println("위 계산에 총 " + (time2-time1) + " 나노초가 소요되었습니다.");
	}
}
