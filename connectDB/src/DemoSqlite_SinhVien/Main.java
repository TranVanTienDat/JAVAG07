package DemoSqlite_SinhVien;

import java.sql.SQLException;
import java.util.List;

public class Main {
	 public static void main(String[] args)throws ClassNotFoundException, SQLException {
		 // lấy ra tất cả các sinh viên
//		List<SinhVien> ls = SinhVien.getListSV();
//		for(SinhVien item : ls) {
//			System.out.print(item.toString());
//		}
		
		// lấy ra sinh viên thuộc mã lớp 124
//		List<SinhVien> svl = SinhVien.getListSV_Lop();
//		for(SinhVien item : svl) {
//			System.out.print(item.toString());
//		}
		
		//lấy ra các sinh viên có tổng điểm trên 8.5
		List<Total> svd = Total.getListSV_Diem();
		for(Total item : svd) {
			System.out.print(item.toTotalString());
		}
	 }
	 
	 
}
