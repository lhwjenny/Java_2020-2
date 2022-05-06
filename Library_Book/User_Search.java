package Libray_Book;
import java.util.Scanner;
public class User_Search {
	Scanner input = new Scanner(System.in);
	public int search() {
	System.out.printf("회원번호를 입력하시오\n");
	int num =input.nextInt();
	if(num<11&&num>0) {
		num += -1;
		if(User_Add.user_arr[num].borrow_num == 0) {
			System.out.printf("빌린책이 없습니다.\n");
		}
		for(int i = 0;i<User_Add.user_arr[num].borrow_num;i++) {
		switch  (User_Add.user_arr[num].borrow_path_class[i]) {
			case 0:
				System.out.printf("책이름:%s,대출중 반납일:%d년%d/%d\n",Book_Add.art[User_Add.user_arr[num].borrow_path[i]-1].name,Book_Borrow.data[num][i].return_day("ar"),Book_Borrow.data[num][i].return_day(1),Book_Borrow.data[num][i].return_day());
				break;
			case 1:
				System.out.printf("책이름:%s,대출중 반납일:%d년%d/%d\n",Book_Add.story[User_Add.user_arr[num].borrow_path[i]-1].name,Book_Borrow.data[num][i].return_day("ar"),Book_Borrow.data[num][i].return_day(1),Book_Borrow.data[num][i].return_day());
				break;
			case 2:
				System.out.printf("책이름:%s,대출중 반납일:%d년%d/%d\n",Book_Add.sience[User_Add.user_arr[num].borrow_path[i]-1].name,Book_Borrow.data[num][i].return_day("ar"),Book_Borrow.data[num][i].return_day(1),Book_Borrow.data[num][i].return_day());
				break;
			case 3:
				System.out.printf("책이름:%s,대출중 반납일:%d년%d/%d\n",Book_Add.history[User_Add.user_arr[num].borrow_path[i]-1].name,Book_Borrow.data[num][i].return_day("ar"),Book_Borrow.data[num][i].return_day(1),Book_Borrow.data[num][i].return_day());
				break;
		}
	}
		return 0;
}
	System.out.printf("올바른 회원번호가 아닙니다.\n");
	return 0;
}
}