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
			 System.out.printf("1.å �߰�\n");
			 System.out.printf("2.ȸ����ȣ �˻�\n");
			 System.out.printf("3.å��\n");
			 System.out.printf("4.å ����\n");
			 System.out.printf("5.å �˻�\n");
			 System.out.printf("6.���α׷� ����\n");
			 System.out.printf("å ��ȣ�� 1���� �����մϴ�.������ȣ�� 1���� �����մϴ�.\n");
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
			 		System.out.printf("�߸��Է�\n");
			 }
		}
	}
}
