package Libray_Book;

public class Book_Print extends Book_Borrow{
	public Book_Print() {
		super();
	}
	public int Borrow(){
		return 0;
	}
	public void Print(){
		System.out.printf("art ���� å��:%d,å ������ å��:%d\n", (Book_Add.art_num-Book_Borrow.borrow_art),Book_Borrow.borrow_art);
		System.out.printf("story ���� å��:%d,å ������ å��:%d\n", (Book_Add.story_num-Book_Borrow.borrow_story),Book_Borrow.borrow_story);
		System.out.printf("sience ���� å��:%d,å ������ å��:%d\n", (Book_Add.sience_num-Book_Borrow.borrow_sience),Book_Borrow.borrow_sience);
		System.out.printf("history ���� å��:%d,å ������ å��:%d\n", (Book_Add.history_num-Book_Borrow.borrow_history),Book_Borrow.borrow_history);
	}
}
