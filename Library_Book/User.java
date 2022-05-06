package Libray_Book;

public class User{
	String user_name;
	int num;
	int user_num;
	String adress;
	int borrow_num;
	int borrow_path_class[] = new int[3];
	int borrow_path[] = new int[3];
	public User(String name,int n,String ad) {
		user_name = name;
		num = n;
		adress = ad;
		borrow_num = 0;
		for(int i = 0;i<3;i++) {
			borrow_path_class[i] = -100;
			borrow_path[i] = -100;
		}
	}
	public User(String name,int n,int un,String ad) {
		this(name,n,ad);
		user_num =  un;
	}
	public void Borrow(int path,int class_book) {
		borrow_num += 1;
		borrow_path[borrow_num-1] = path;
		borrow_path_class[borrow_num-1] = class_book;
	}
}