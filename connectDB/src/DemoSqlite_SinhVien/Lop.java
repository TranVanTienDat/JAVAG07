package DemoSqlite_SinhVien;

public class Lop {
private int MaLop;
private String TenLop;
private int MaKhoa;
public Lop(int maLop, String tenLop, int maKhoa) {
	super();
	MaLop = maLop;
	TenLop = tenLop;
	MaKhoa = maKhoa;
}
@Override
public String toString() {
	return "Lop [MaLop=" + MaLop + ", TenLop=" + TenLop + ", MaKhoa=" + MaKhoa + "]";
}


}
