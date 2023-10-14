package Week_1;

public class nhanVien {
		private String  tenNhanVien = "Hoang";
		private double luongCoBan= 1.4;
		private double heSoLuong;
		public  final double LUONG_MAX = 10000000;
		public  boolean tangLuong(double a) {
			if(luongCoBan*a > LUONG_MAX ) {
				System.out.println("So luong vble a) {uot muc cho phep");
				return false;
			}else {
				heSoLuong = a;
				return true;
			}
		}
		public double tinhLuong() {
			return luongCoBan*heSoLuong;
		}
		public void inTTin() {
			System.out.println("Nhan vien"+tenNhanVien+".Luong: "+tinhLuong());
		}
	public static void main(String[] args) {
		System.out.println("Hello ae");
	}
}
