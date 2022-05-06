package Libray_Book;
import java.util.Scanner;

public class Book_Add {
	public static Book art[]=  new Book[30];
	public static Book story[]=  new Book[30];
	public static Book sience[]=  new Book[30];
	public static Book history[]=  new Book[30];
	public static int art_num;
	public static int story_num;
	public static int sience_num;
	public static int history_num;
	int class_num; 
	String name = new String();
	public static void main(String args[]) {
		Gui main_g = new Gui();
		main_g.Main_Gui();
	}
	public Book_Add() {
		art_num = 0;
		story_num = 0;
		sience_num = 0;
		history_num = 0;
	}
	Scanner input = new Scanner(System.in);
	 public int BookAdd() {
		System.out.printf("책의 분류를 입력하시오\n 0:예술  1:문학 2:과학 3:예술\n");
		class_num = input.nextInt();
		input.nextLine();
		switch(class_num) {
			case 0:
				if (art_num<30) {
					System.out.printf("책 이름를 입력하시오\n");
					name = input.next();
					art[art_num++]=new Book(class_num,art_num+1,name);
				}
				else {
					System.out.printf("책을 더이상 입력할수 없습니다\n");
				}
				break;
			case 1:
				if (story_num<30) {
					System.out.printf("책 이름를 입력하시오\n");
					name = input.next();
					story[story_num++]=new Book(class_num,story_num+1,name);
				}
				else {
					System.out.printf("책을 더이상 입력할수 없습니다\n");
				}
				break;
			case 2:
				if (sience_num<30) {
					System.out.printf("책 이름를 입력하시오\n");
					name = input.next();
					sience[sience_num++]=new Book(class_num,sience_num+1,name);
				}
				else {
					System.out.printf("책을 더이상 입력할수 없습니다\n");
				}
				break;
			case 3:
				if (history_num<30) {
					System.out.printf("책 이름를 입력하시오\n");
					name = input.next();
					history[history_num++]=new Book(class_num,history_num+1,name);
				}
				else {
					System.out.printf("책을 더이상 입력할수 없습니다\n");
				}
				break;
			default :
	            System.out.println("그 외의 숫자 입력 오류\n");
	            return 0;
		}
		return 0;
	}
}
