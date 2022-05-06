package Libray_Book;
import java.time.*;
public class Borrow_Data {
	LocalDate nowDate;
	int path;
	int class_num;
	public Borrow_Data(int p,int cn) {
		nowDate = LocalDate.now();
		nowDate = nowDate.plusDays(7);
		path = p;
		class_num = cn;
	}
	public int return_day(){
		int day = nowDate.getDayOfMonth();
		return day;
	}
	public int return_day(int i){
		int month = nowDate.getMonthValue();
		return month;
	}
	public int return_day(String i){
		int years = nowDate.getYear();
		return years;
	}
}
