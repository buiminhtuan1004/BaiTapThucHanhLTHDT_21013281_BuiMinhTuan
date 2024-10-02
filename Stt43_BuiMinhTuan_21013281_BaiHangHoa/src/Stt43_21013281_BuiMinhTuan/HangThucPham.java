package Stt43_21013281_BuiMinhTuan;

import java.time.LocalDate;

public class HangThucPham extends HangHoa{
	private String nhaCungCap;
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;
	public String getNhaCungCap() {
		return nhaCungCap;
	}
	public void setNhaCungCap(String nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}
	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}
	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		if(ngaySanXuat.isAfter(LocalDate.now()))
			throw new IllegalArgumentException("Phai truoc ngay san xuat");
		this.ngaySanXuat = ngaySanXuat;
	}
	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}
	public void setNgayHetHan(LocalDate ngayHetHan) {
		if(ngayHetHan.isAfter(ngaySanXuat))
			throw new IllegalArgumentException("Phai sau ngay san xuat");
		this.ngayHetHan = ngayHetHan;
	}
	public HangThucPham(String maHang) throws IllegalAccessException  {
		super(maHang);
		this.nhaCungCap="";
		this.ngaySanXuat= LocalDate.now();
		this.ngayHetHan=ngaySanXuat;
	}
	public HangThucPham(String maHang, String tenHang, double donGia, int soLuongTon, String nhaCungCap,
			LocalDate ngaySanXuat, LocalDate ngayHetHan) throws IllegalAccessException  {
		super(maHang, tenHang, donGia, soLuongTon);
		this.nhaCungCap = nhaCungCap;
		this.ngaySanXuat = ngaySanXuat;
		this.ngayHetHan = ngayHetHan;
	}
	@Override
	public double getTienVat() {
		return donGia*0.05;
	}
	@Override
	public String getDanhGia() {
		LocalDate now=LocalDate.now();
		return (soLuongTon > 0 && ngayHetHan.isBefore(now)) ? "Kho ban" :  "" ;
	}
	
	
}
