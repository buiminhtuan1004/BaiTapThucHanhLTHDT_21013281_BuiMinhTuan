package stt_21013281_BuiMinhTuan;

import java.time.LocalDate;

public class HangThucPham extends HangHoa {
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
		this.ngaySanXuat = ngaySanXuat;
	}
	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}
	public void setNgayHetHan(LocalDate ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}
	@Override
	public double getTienVat() {
		return donGia * 0.05;
	}
	@Override
	public String getDanhGia() {
		LocalDate today= LocalDate.now();
		if (soLuongTon > 0 && today.isAfter(ngayHetHan))
			return "Kho ban";
		return "Khong danh gia";
	}
	public HangThucPham(String maHang, String tenHang, double donGia, int soLuongTon, String nhaCungCap, LocalDate ngaySanXuat,
			LocalDate ngayHetHan) throws IllegalAccessException {
		super(maHang, tenHang, donGia, soLuongTon);
		this.nhaCungCap = nhaCungCap;
		this.ngaySanXuat = ngaySanXuat;
		this.ngayHetHan = ngayHetHan;
	}
	@Override
	public String toString() {
	return super.toString()+ String.format("%10s|%10s|%10s|%10s|%10s", getNhaCungCap(), getNgaySanXuat(), getNgayHetHan(), getTienVat(), getDanhGia() );
}
	
}
