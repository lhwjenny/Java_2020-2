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
		System.out.printf("å�� �з��� �Է��Ͻÿ�\n 0:����  1:���� 2:���� 3:����\n");
		class_num = input.nextInt();
		input.nextLine();
		switch(class_num) {
			case 0:
				if (art_num<30) {
					System.out.printf("å �̸��� �Է��Ͻÿ�\n");
					name = input.next();
					art[art_num++]=new Book(class_num,art_num+1,name);
				}
				else {
					System.out.printf("å�� ���̻� �Է��Ҽ� �����ϴ�\n");
				}
				break;
			case 1:
				if (story_num<30) {
					System.out.printf("å �̸��� �Է��Ͻÿ�\n");
					name = input.next();
					story[story_num++]=new Book(class_num,story_num+1,name);
				}
				else {
					System.out.printf("å�� ���̻� �Է��Ҽ� �����ϴ�\n");
				}
				break;
			case 2:
				if (sience_num<30) {
					System.out.printf("å �̸��� �Է��Ͻÿ�\n");
					name = input.next();
					sience[sience_num++]=new Book(class_num,sience_num+1,name);
				}
				else {
					System.out.printf("å�� ���̻� �Է��Ҽ� �����ϴ�\n");
				}
				break;
			case 3:
				if (history_num<30) {
					System.out.printf("å �̸��� �Է��Ͻÿ�\n");
					name = input.next();
					history[history_num++]=new Book(class_num,history_num+1,name);
				}
				else {
					System.out.printf("å�� ���̻� �Է��Ҽ� �����ϴ�\n");
				}
				break;
			default :
	            System.out.println("�� ���� ���� �Է� ����\n");
	            return 0;
		}
		return 0;
	}
}
