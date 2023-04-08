package MyDate;
import MyDate.MyDate;
public class main {
	public static void main(String[] args) {
		MyDate date = new MyDate(2023, 3,17);
		System.out.println("ngày hiện tại: " + date.toString());
		date.nextDay();
		System.out.println("ngày tiếp theo: "+date.toString());
		date.previousDay();
		System.out.println("ngày tiếp theo: "+date.toString());
		
		// check year
		if(date.isLeapYear(2042)) System.out.println("là năm nhuận");
		else System.out.println("không phải năm nhuận");
		
		
		// validate
		if(date.isValidDate(2023,3,17)) System.out.println("hợp lệ");
		else System.out.println("không hợp lệ");
	}
}
