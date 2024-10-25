package stt_21013281_BuiMinhTuan;

import java.time.LocalDate;

public class HangSanhSu extends HangHoa{
	private String nhaSanXuat;
	private LocalDate ngayNhapKho;
	public String getNhaSanXuat() {
		return nhaSanXuat;
	}
	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}
	public LocalDate getNgayNhapKho() {
		return ngayNhapKho;
	}
	public void setNgayNhapKho(LocalDate ngayNhapKho) {
		this.ngayNhapKho = ngayNhapKho;
	}
	public HangSanhSu(String maHang, String tenHang, double donGia, int soLuongTon, String nhaSanXuat, LocalDate ngayNhapKho)
			throws IllegalAccessException {
		super(maHang,tenHang, donGia, soLuongTon);
		this.nhaSanXuat = nhaSanXuat;
		this.ngayNhapKho = ngayNhapKho;
	}
	public HangSanhSu(String maHang, String tenHang, double donGia, int soLuongTon) throws IllegalAccessException {
		super(maHang,tenHang, donGia, soLuongTon);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double getTienVat() {
		return donGia * 0.10;
	}
	@Override
	public String getDanhGia() {
		LocalDate today = LocalDate.now();
		if(soLuongTon> 50 && today.isAfter(ngayNhapKho.plusDays(10)))
			return "Ban cham";
		return "Khong danh gia";
	}
	@Override
	public String toString() {
		return super.toString()+ String.format("%10s|%10s|%10s|%10s",getNhaSanXuat(), getNgayNhapKho(),getTienVat(), getDanhGia() );
	}
}
