package javapractice1.ch3;

public class DataType_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Kim", "Ali", "Richardson"};
		
		int[] scores_mid;
		scores_mid = new int[] {87, 92, 77};
		
		int[] scores_proj = new int[3];
		scores_proj[0] = 90;
		scores_proj[1] = 86;
		scores_proj[2] = 98;
		
		System.out.println(names[0] + ": (mid)" + scores_mid[0] + ", (proj)" + scores_proj[0]);
		System.out.println(names[1] + ": (mid)" + scores_mid[1] + ", (proj)" + scores_proj[1]);
		System.out.println(names[2] + ": (mid)" + scores_mid[2] + ", (proj)" + scores_proj[2]);
		
		int avg_mid = 0;
		int avg_proj = 0;
		for (int i = 0; i<3 ; i++) {
			avg_mid = avg_mid + scores_mid[i];
			avg_proj = avg_proj + scores_proj[i];
		}
		avg_mid = avg_mid / 3;
		avg_proj = avg_proj / 3;
		System.out.println("MidTerm Æò±Õ Á¡¼ö: " + avg_mid);
		System.out.println("Project Æò±Õ Á¡¼ö: " + avg_proj);
	}
}
