package Libray_Book;
import java.util.Scanner;
public class Gui {
	int order;
	Book_Add add = new Book_Add();
	Book_Search bserch = new Book_Search();
	User_Search userch = new User_Search();
	Book_Borrow borrow = new Book_Borrow();
	Book_Print print = new Book_Print();
	User_Add uadd = new User_Add();
	public int Main_Gui(){
		uadd.Add();
		while(true) {
			Scanner input = new Scanner(System.in);
			 System.out.printf("1.책 추가\n");
			 System.out.printf("2.회원번호 검색\n");
			 System.out.printf("3.책수\n");
			 System.out.printf("4.책 대출\n");
			 System.out.printf("5.책 검색\n");
			 System.out.printf("6.프로그램 종료\n");
			 System.out.printf("책 번호는 1부터 시작합니다.유저번호도 1부터 시작합니다.\n");
			 order = input.nextInt();
			 switch (order){
			 	case 1:
			 		add.BookAdd();
			 		break;
			 	case 2:
			 		userch.search();
			 		break;
			 	case 3:
			 		print.Print();
			 		break;
			 	case 4:
			 		borrow.Borrow();
			 		break;
			 	case 5:
			 		bserch.Search();
			 		break;
			 	case 6:
			 		return 0;
			 	default:
			 		System.out.printf("잘못입력\n");
			 }
		}
	}
}
