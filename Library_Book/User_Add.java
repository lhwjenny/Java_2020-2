package Libray_Book;
import java.util.Scanner;
public class User_Add {
	public static User user_arr[] = new User[10];
	Scanner input = new Scanner(System.in);
	public void Add(){
		for(int i=0;i<10;i++) {
			System.out.printf("\n%d번쨰\n회원이름을 입력하시오.\n",i+1);
			String name = input.next();
			System.out.printf("번호을 입력하시오.");
			int n = input.nextInt();
			System.out.printf("\n주소을 입력하시오.\n");
			String ad = input.next();
			user_arr[i] = new User(name,n,(i+1),ad);
			System.out.printf("\n이유저의 회원번호는 %d입니다.\n",i+1);
		}
	}
}
