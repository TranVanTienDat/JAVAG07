package buoi1;

import OOP.Point;

import OOP.Circle;
import OOP.Customer;
import OOP.Rectangle;
import OOP.Date;
import OOP.Time;
//import OOP.Circle;
import OOP.Invoice;
/*
 * import java.util.Scanner;
 * 
 * public class main { public static void main(String[] args) { Scanner sc = new
 * Scanner(System.in); while(true) { System.out.println("menu");
 * System.out.println("1: tìm nghiệm pt bậc 2");
 * System.out.println("2: tính giai thừa");
 * System.out.println("3: tìm dãy fibonaci"); System.out.println("4: tìm UCLN");
 * System.out.println("5: liệt kê số NT nhỏ hơn số nhập vào");
 * System.out.println("6: liệt kê n số NT đầu tiên");
 * System.out.println("7: liệt kê các số NT có 5 chữ số");
 * System.out.println("8: tổng chữ số của 1 số");
 * System.out.println("9: số thuận nghịch");
 * System.out.println("10: liệt kê số fibonaci nhỏ hơn n là số NT");
 * System.out.println("0: thoát chương trình");
 * System.out.println("nhập chương trình: "); int n = sc.nextInt(); switch (n) {
 * case 1: System.out.println("nhập số: "); double a,b,c; a = sc.nextDouble(); b
 * = sc.nextDouble(); c = sc.nextDouble(); System.out.println("kết quả: ");
 * ptb2(a,b,c); break; case 2: System.out.println("nhập số: "); int d
 * =sc.nextInt(); System.out.println("kết quả\n"+giaithua(d)); break; case 3:
 * System.out.println("nhập số: "); int e =sc.nextInt();
 * System.out.println("kết quả\n"+fibonacci(e)); break; case 4:
 * System.out.println("nhập số: "); int so1 =sc.nextInt(); int so2
 * =sc.nextInt(); System.out.println("kết quả: "); UocChungLonNhat(so1,so2);
 * break; case 5: System.out.println("nhập số: "); int nt =sc.nextInt();
 * System.out.println("kết quả: "); nguyento(nt); break; case 6:
 * System.out.println("nhập số: "); int nt1 =sc.nextInt();
 * System.out.println("kết quả: "); nguyento1(nt1); break; case 7:
 * System.out.println("các số nguyên tố có 5 chữ số: "); nguyenTo5So();
 * System.out.println("kết quả: "); break; case 8:
 * System.out.println("nhập số: "); int tongSo =sc.nextInt();
 * System.out.println("kết quả: "); tongChuSo(tongSo); break; case 9:
 * System.out.println("kết quả: "); thuanNghich(); break; case 10:
 * System.out.println("nhập số: "); int ng3 =sc.nextInt();
 * System.out.println("kết quả: "); fibonaciNhoHonN(ng3); break; case 0:
 * System.exit(0); default: System.out.println("ko có trong menu"); } } }
 * 
 * //Tính pt bậc 2 public static void ptb2(double a,double b,double c) {
 * 
 * double denta = b*b - 4*a*c;
 * 
 * if (denta > 0) { double x1 = (-b + Math.sqrt(denta))/(2*a); double x2 = (-b -
 * Math.sqrt(denta))/(2*a); System.out.println("2 nghiem la: "+ x1 + " and " +
 * x2); }
 * 
 * else if (denta == 0) { double x = -b / (2*a);
 * System.out.println("nghiem kep la: "+ x); }
 * 
 * else { System.out.println("pt vo nghiem"); }
 * 
 * }
 * 
 * //tính giai thừa public static long giaithua(int n) { { if (n == 0) return 1;
 * 
 * return n * giaithua(n - 1); } }
 * 
 * 
 * 
 * //tính fibonaci public static int fibonacci(int n) { if (n == 0) return 0;
 * else if (n == 1) return 1;
 * 
 * return fibonacci(n - 1) + fibonacci(n - 2); }
 * 
 * 
 * 
 * //Tìm ước chung lớn nhất public static void UocChungLonNhat(int so1,int so2)
 * { int gcd = 1; for(int i = 1; i <= so1 && i <= so2; i++) { if(so1%i==0 &&
 * so2%i==0) gcd = i; }
 * System.out.printf("Ước chung lớn nhất của %d và %d là: %d\n", so2, so2, gcd);
 * }
 * 
 * 
 * 
 * //liệt kê số nguyên tố public static void nguyento(int n) {
 * System.out.printf("Tất cả các số nguyên tố nhỏ hơn %d là: \n", n); if (n >=
 * 2) { System.out.print(2); } for (int i = 3; i < n; i++) { if (check(i)) {
 * System.out.print(" " + i); } } }
 * 
 * 
 * //kiem tra 1 số có phải số nguyên tố public static boolean check(int n) { if
 * (n < 2) { return false; } int sq = (int) Math.sqrt(n); for (int i = 2; i <=
 * sq; i++) { if (n % i == 0) { return false; } } return true; }
 * 
 * 
 * //liệt kê số nguyên tố đầu tiên public static void nguyento1(int n) {
 * System.out.printf("\nTất cả các số nguyên tố nhỏ hơn %d là: \n", n); if (n >=
 * 2) { System.out.print(2); } int temp = 1; int nt = 3; while(true) { if(temp <
 * n) { if (check(nt)) { temp++; System.out.print(" " + nt); } } else break;
 * nt++; } }
 * 
 * 
 * 
 * //liệt kê các số nguyên tố có 5 chữ số public static void nguyenTo5So() {
 * System.out.printf("\nTất cả các số nguyên tố có 5 chữ số là: \n"); for (int i
 * = 10000; i <= 99999; i++) { if (check(i)) { System.out.print(" " + i); } } }
 * 
 * 
 * 
 * //tính tổng chữ số public static void tongChuSo(int n) {
 * System.out.printf("\ntổng chữ số là: \n"); int sum= 0; while(n>0) { int
 * balance = n % 10; sum += balance; n /= 10;
 * 
 * } System.out.println("Tổng các chữ số = " + sum); }
 * 
 * 
 * 
 * //số thuận nghịch public static void thuanNghich() {
 * System.out.printf("các sô thuận nghịch có 6 chữ số: \n"); int number, temp,
 * total = 0, rem;
 * 
 * for (number = 100000; number < 1000000; number++) { temp = number; while
 * (temp != 0) { rem = temp % 10; total = total + (rem * rem * rem); temp = temp
 * / 10; } if (total == number){ System.out.println(number +
 * " is an Armstrong number"); } total = 0; } }
 * 
 * 
 * 
 * // in ra số fibonaci nhỏ hơn n là số nguyên tố public static void
 * fibonaciNhoHonN(int n) { int n1=0,n2=1; System.out.print(n1+" "+n2+" ");
 * 
 * for(int i=2;i<n;i++) { int n3=n1+n2; if(n3<n) { System.out.print(n3+" ");
 * n1=n2; n2=n3; } }
 * 
 * } }
 */



 public class main {
//	 private static final double Point = 0;

public static void main(String[] args) {
//	 float a[] = {1,2,4,5,8,13};
//	 float b[];
//	 b = new float[3];
//	 b[0] =1;
//	 b[1] =3;
//	 b[2] =5;
//	 float sA = btMang.Tong(a);
//	 float sB = btMang.Tong(b);
//	 System.out.printf("\n%f", sA);
//	 System.out.printf("\n%f", sB);
//	 
//	 float[] res = btMang.MinMax(a);
//	 System.out.printf("\nmin = %f max = %f", res[0],res[1]);
//	 
//	 float s = btMang.Tong(a);
//	 System.out.printf("\nmin= %f", s);
	
//	 OOP();
//	 circle();
//	 Rectangle();
//	 Date();
//	 Time();
	Invoice();
 }
 
 static void OOP() {
	 Point p = new Point(1,1);
	 System.out.print("toa do: " + p.toString());
	 Point p2 = new Point(5,10);
	 System.out.print("toa do p2: " + p2.toString());
	 
//	 double pp2 = p.Distance(p2);
 }
 
 static void circle() {
	 Circle a = new Circle(3);
	 System.out.print(a.toString());
 }
 
 static void Rectangle() {
	 Rectangle r =new  Rectangle(4.0f, 5.0f);
	 System.out.print("dien tich: "+r.getArea());
 }
	
 static void Time() {
	 Time t = new Time(4,5,6);
	 System.out.print("time: "+t.toString());
	 }
 static void Date() {
	 Date d = new Date(7,8,9);
	 System.out.print("date: "+d.toString());
 }
 
 static void Invoice() {
	 Customer a = new Customer(4, "dat", 5);
	 Invoice in = new Invoice(30, a , 4) ;
	 System.out.print("res: "+ in.toString());
 }
}