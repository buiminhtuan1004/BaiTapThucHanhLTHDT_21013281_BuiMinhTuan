package demoThuaKe;

public abstract class HinhHoc {
	//Tính thừa kế
	//Class HinhHoc được khai báo là 1 lớp trừu tượng, không thể được khỡi tạo
	//Thay vào đó, nó chỉ có thể được thừa kế bởi các class HinhVuong, HinhChuNhat
	protected String tenHinh;
	//Tính đóng gói
	public String getTenHinh() {
		return tenHinh;
	}
	//Tính đóng gói
	public void setTenHinh(String ten) {

		this.tenHinh = ten;
	}
	//Tính ràng buộc
	//tenHinh ràng buộc cho class HinhChuNhat và class HinhVuong
	public HinhHoc(String tenHinh) {
		this.tenHinh= tenHinh;
	}
	public abstract double getDienTich();
	//Tính thừa kế
	//Phương thức getDienTich được khai báo là 1 phương thức, không thể được khỡi tạo
	//Thay vào đó, nó chỉ có thể được thừa kế bởi các phương thức class HinhVuong và class HinhChuNhat
	public HinhHoc() {}
	@Override
	public String toString() {
		return super.toString();
	}
}
