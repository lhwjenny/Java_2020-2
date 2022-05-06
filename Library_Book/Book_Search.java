package Libray_Book;

public class Book_Search extends Book_Borrow{
	int i;
	public Book_Search() {
		super();
		i = 0;
	}
	public int Borrow(){
		return 0;
	}
	public int Search() {
		System.out.printf("책분류번호 입력\n 0:예술  1:문학 2:과학 3:예술\n");
		int class_book = input.nextInt();
		if (class_book > 3||class_book <0) {
			System.out.printf("올바른 책 분류번호가 아닙니다.\n");
			return 0;
		}
		String name1=new String();
		System.out.printf("책 이름 입력\n");
 		name1 =input.next();
 		switch (class_book) {
 		case 0:
 			for(int index:super.borrow_art_arr) {
 				index--;
 				 if(i == super.borrow_art) {
 					 break;
 				 }
 				 i++;
 				  if((Book_Add.art[index].name.equals(name1))) {
 					 this.Getborrowday(0, index);
 					return 0;
 				 }
 			 }
 			break;
 		case 1:
 			for(int index:super.borrow_story_arr) {
 				index--;
 				 if(i == super.borrow_story) {
 					 break;
 				 }
 				 i++;
 				  if(Book_Add.story[index].name.equals(name1)) {
 					 this.Getborrowday(1, index);
 					return 0;
 				 }
 			 }
 			break;
 		case 2:
 			for(int index:super.borrow_sience_arr) {
 				index--;
 				 if(i == super.borrow_sience) {
 					 break;
 				 }
 				 i++;
 				  if(Book_Add.sience[index].name.equals(name1)) {
 					 this.Getborrowday(2, index);
 					return 0;
 				 }
 			 }
 			break;
 		case 3:
		 for(int index:super.borrow_history_arr) {
			 index--;
			 if(i == super.borrow_history) {
				 break;
			 }
			 i++;
			  if(Book_Add.history[index].name.equals(name1)) {
				 this.Getborrowday(3, index);
				 return 0;
			 } 
		 }
	}
 		System.out.printf("대출중이 아닙니다.(또는 입력이 잘못되었습니다.)\n");
 		return 0;
	}
	public void Getborrowday(int class_n,int index) {
		System.out.printf("대출중 %d년%d/%d\n",super.data_really_path[class_n][index+1].return_day("a"),super.data_really_path[class_n][index+1].return_day(1),super.data_really_path[class_n][index+1].return_day());
	}
}