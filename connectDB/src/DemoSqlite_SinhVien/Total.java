package DemoSqlite_SinhVien;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Total {
	private String ten;
	private float toan;
	private float van;
	public Total(String ten, int iD, int maLop, float toan, float van) {
		super();
		this.ten = ten;
		this.toan = toan;
		this.van = van;
	}
	
	public String toTotalString() {
		return String.format("ten=%s, toan=%.1f, van=%.1f, total=%.1f\n",ten, toan, van, (toan+van)/2);
	}
	
	

	
	//lấy ra các sinh viên có tổng điểm trên 8.5
	public static List<Total> getListSV_Diem() throws ClassNotFoundException, SQLException {
		Connection con = ConnectDB.getConnectDB();
		String sql = "SELECT S.Ten, S.ID, D.Toan, D.Van,\n"
		+ "S.MaLop FROM SinhVien as S inner join Diem as D on S.ID = D.ID where (D.Van + D.Toan)/2 >= 8.5";
		Statement res = con.createStatement();
		ResultSet result = res.executeQuery(sql);
		List<Total> ls = new ArrayList<>();
		while(result.next()) {
			 String ten = result.getString("Ten");
			 int ID = result.getInt("ID");
			 int MaLop =  result.getInt("MaLop");
			 float Toan = result.getFloat("Toan");
			 float Van = result.getFloat("Van");
			 ls.add(new Total(ten, ID, MaLop, Toan, Van));
		}
		con.close();
		return ls;
	}
}
