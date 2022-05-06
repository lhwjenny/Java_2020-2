package Libray_Book;

public class Book_Print extends Book_Borrow{
	public Book_Print() {
		super();
	}
	public int Borrow(){
		return 0;
	}
	public void Print(){
		System.out.printf("art 남은 책수:%d,책 빌려진 책수:%d\n", (Book_Add.art_num-Book_Borrow.borrow_art),Book_Borrow.borrow_art);
		System.out.printf("story 남은 책수:%d,책 빌려진 책수:%d\n", (Book_Add.story_num-Book_Borrow.borrow_story),Book_Borrow.borrow_story);
		System.out.printf("sience 남은 책수:%d,책 빌려진 책수:%d\n", (Book_Add.sience_num-Book_Borrow.borrow_sience),Book_Borrow.borrow_sience);
		System.out.printf("history 남은 책수:%d,책 빌려진 책수:%d\n", (Book_Add.history_num-Book_Borrow.borrow_history),Book_Borrow.borrow_history);
	}
}
