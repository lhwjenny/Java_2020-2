package Libray_Book;
import java.util.Scanner;
public class User_Add {
	public static User user_arr[] = new User[10];
	Scanner input = new Scanner(System.in);
	public void Add(){
		for(int i=0;i<10;i++) {
			System.out.printf("\n%d����\nȸ���̸��� �Է��Ͻÿ�.\n",i+1);
			String name = input.next();
			System.out.printf("��ȣ�� �Է��Ͻÿ�.");
			int n = input.nextInt();
			System.out.printf("\n�ּ��� �Է��Ͻÿ�.\n");
			String ad = input.next();
			user_arr[i] = new User(name,n,(i+1),ad);
			System.out.printf("\n�������� ȸ����ȣ�� %d�Դϴ�.\n",i+1);
		}
	}
}
