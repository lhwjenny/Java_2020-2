package javapractice1.wk3;

public class LoopStatementEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, k;
		
		for (i=0; i < 10; i++) {
			for (j=1; j<10-i; j++) {
				System.out.print(" ");
			}
			
			for (k=0; k<i*2+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
