package DemoSqlite_SinhVien;

public class Diem {
private float toan;
private float van;
public Diem(float toan, float van) {
	super();
	this.toan = toan;
	this.van = van;
}
@Override
public String toString() {
	return "Diem [toan=" + toan + ", Van=" + van + "]";
}

public float getToan( ) {
	return toan;
}

public float getVan( ) {
	return toan;
}
public String toTotalString() {
	return String.format("toan=%f, van=%f, total=%f", toan, van, toan+van);
}
}
