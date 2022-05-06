package Libray_Book;
import java.util.Scanner;
public class Book_Borrow {
	Scanner input = new Scanner(System.in);
	protected static int borrow_art;
	protected static int borrow_story;
	protected static int borrow_sience;
	protected static int borrow_history;
	static Borrow_Data data[][] = new Borrow_Data[10][3];
	static Borrow_Data data_really_path[][] = new Borrow_Data[4][30];
	static int borrow_art_arr[] = new int[31];
	static int borrow_story_arr[] = new int[31];
	static int borrow_sience_arr[] = new int[31];
	static int borrow_history_arr[] = new int[31];
	public Book_Borrow(){
		borrow_art = 0;
		borrow_story = 0;
		borrow_sience = 0;
		borrow_history = 0;
	}
	public int Borrow(){
		System.out.printf("회원번호 입력\n");
		int u_num = input.nextInt();
		u_num -= 1;
		if (u_num > 9||u_num < 0) {
			System.out.printf("올바른 회원번호가 아닙니다.\n");
			return 0;
		}
		System.out.printf("책분류번호 입력\n 0:예술  1:문학 2:과학 3:예술\n");
		int class_book = input.nextInt();
		if (class_book > 3||class_book <0) {
			System.out.printf("올바른 책 분류번호가 아닙니다.\n");
			return 0;
		}
		System.out.printf("책번호 입력\n");
		int path = input.nextInt();
		switch (class_book) {
			case 0:
				if (path > Book_Add.art_num||path <1) {
					System.out.printf("올바른 책 번호가 아닙니다.\n");
					return 0;
				}
				break;
			case 1:
				if (path > Book_Add.story_num||path <1) {
					System.out.printf("올바른 책 번호가 아닙니다.\n");
					return 0;
				}
				break;
			case 2:
				if (path > Book_Add.sience_num||path <1) {
					System.out.printf("올바른 책 번호가 아닙니다.\n");
					return 0;
				}
				break;
			case 3:
				if (path > Book_Add.history_num||path <1) {
					System.out.printf("올바른 책 번호가 아닙니다.\n");
					return 0;
				}
				break;
		}
			switch (class_book) {
		case 0:
			for(int i:this.borrow_art_arr) {
			if (path == i) {
				System.out.printf("이미 빌린 책 입니다.\n");
				return 0;
			}
			}
			break;
		case 1:
			for(int i:this.borrow_story_arr) {
			if (path == i) {
				System.out.printf("이미 빌린 책 입니다.\n");
				return 0;
			}
			}
			break;
		case 2:
			for(int i:this.borrow_sience_arr) {
			if (path == i) {
				System.out.printf("이미 빌린 책 입니다.\n");
				return 0;
			}
			}
			break;
		case 3:
			for(int i:this.borrow_history_arr) {
			if (path == i) {
				System.out.printf("이미 빌린 책 입니다.\n");
				return 0;
			}
			}
			break;
	    }
		if (User_Add.user_arr[u_num].borrow_num==3) {
			System.out.printf("더이상 빌릴수 없습니다\n");
			return 0;
		}
		data[u_num][User_Add.user_arr[u_num].borrow_num] = new Borrow_Data(path,class_book);
		data_really_path[class_book][path] = new Borrow_Data(path,class_book);
		User_Add.user_arr[u_num].Borrow(path, class_book);
		System.out.printf("책을 빌렸습니다.\n");
		switch (class_book) {
		case 0:
			borrow_art_arr[borrow_art] = path;
			borrow_art += 1;
			break;
		case 1:
			borrow_story_arr[borrow_story] = path;
			borrow_story += 1;
			break;
		case 2:
			borrow_sience_arr[borrow_sience] += 1;
			break;
		case 3:
			borrow_history_arr[borrow_history] = path;
			borrow_history += 1;
			break;
	}
		return 0;
	}
}
