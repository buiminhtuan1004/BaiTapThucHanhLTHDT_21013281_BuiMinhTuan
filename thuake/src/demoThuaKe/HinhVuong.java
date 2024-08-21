package demoThuaKe;

public class HinhVuong extends HinhHoc {
	private double canh;
//Tính đóng gói
	public double getCanh() {
		return canh;
	}
//Tính đóng gói
	public void setCanh(double c) {
		this.canh = c;
	}
	public HinhVuong() {
	}
	public HinhVuong(String tenHinh) {
		super(tenHinh);
	}
	public HinhVuong(String tenHinh, double c) {
		super(tenHinh);
		this.tenHinh=tenHinh;
		this.canh=c;
	}

	public double getDienTich() {
		return getCanh()*getCanh();
	}
	//Tính thừa kế
		//Phương thức getDienTich được khai báo là 1 phương thức, không thể được khỡi tạo
		//Thay vào đó, nó chỉ có thể được thừa kế bởi các phương thức class HinhHoc và class HinhChuNhat
}