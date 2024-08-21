package demoThuaKe;

public class HinhChuNhat extends HinhHoc {
	//Tính thừa kế
	//Class HinhHoc là class cơ sở
	//Class HinhChuNhat la class dan xuat
	private double chieuDai;
	private double chieuRong;
	public double getChieuDai() {
		return chieuDai;
	}
	//Tính đóng gói
	public void setChieuDai(double d) {
		if(d>0) {
			this.chieuDai = d;
		}
		else {
			System.out.println("Loi d");
		}
	}
	//Tính đóng gói
	public double getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(double r) {
		if(r>0) {
			this.chieuRong = r;
		}
		else {
			System.out.println("Loi r");
		}
	}
	
	public HinhChuNhat(String tenHinh,double d, double r) {
		super(tenHinh);
		this.chieuDai = d;
		this.chieuRong = r;
	}
	
	public double getDienTich() {
		return (getChieuDai()*getChieuRong());
	}
	//Tính thừa kế
		//Phương thức getDienTich được khai báo là 1 phương thức, không thể được khỡi tạo
		//Thay vào đó, nó chỉ có thể được thừa kế bởi các phương thức class HinhVuong và class HinhHoc
	
}
