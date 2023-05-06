package DemoSqlite_SinhVien;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SinhVien {
	private String ten;
	private int ID;
	private int MaLop;
	public SinhVien(String ten, int iD, int maLop) {
		super();
		this.ten = ten;
		ID = iD;
		MaLop = maLop;
	}
	@Override
	public String toString() {
		return "SinhVien [ten=" + ten + ", ID=" + ID + ", MaLop=" + MaLop + "]\n";
	}
	
// Lấy ra tất cả các Sinh Viên
	public static List<SinhVien> getListSV() throws ClassNotFoundException, SQLException{
		Connection con = ConnectDB.getConnectDB();
		String sql = "SELECT * FROM SinhVien";
		Statement res = con.createStatement();
		ResultSet result = res.executeQuery(sql);
		List<SinhVien> ls = new ArrayList<>();
		while(result.next()) {
			 String ten = result.getString("Ten");
			 int ID = result.getInt("ID");
			 int MaLop =  result.getInt("MaLop");
			 ls.add(new SinhVien(ten, ID, MaLop));
		}
		con.close();
		return ls;
	}
	
	// Lấy ra tất cả các Sinh Viên thuộc mã lớp 124
	public static List<SinhVien> getListSV_Lop() throws ClassNotFoundException, SQLException {
		Connection con = ConnectDB.getConnectDB();
		String sql = "SELECT S.Ten, S.ID, S.MaLop FROM SinhVien as S inner join Lop as L on S.MaLop = L.MaLop where L.MaLop = 1224";
		Statement res = con.createStatement();
		ResultSet result = res.executeQuery(sql);
		List<SinhVien> ls = new ArrayList<>();
		while(result.next()) {
			 String ten = result.getString("Ten");
			 int ID = result.getInt("ID");
			 int MaLop =  result.getInt("MaLop");
			 ls.add(new SinhVien(ten, ID, MaLop));
		}
		con.close();
		return ls;
	}

}
