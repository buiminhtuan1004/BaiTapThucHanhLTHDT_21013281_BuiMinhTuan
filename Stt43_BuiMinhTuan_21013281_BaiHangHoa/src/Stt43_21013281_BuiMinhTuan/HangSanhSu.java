package Stt43_21013281_BuiMinhTuan;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class HangSanhSu extends HangHoa {
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
		if(ngayNhapKho.isAfter(LocalDate.now()))
			throw new IllegalArgumentException("Phai truoc ngay hien tai ");
		this.ngayNhapKho = ngayNhapKho;
	}
	@Override
	public double getTienVat() {
		return donGia*0.1;
	}
	@Override
	public String getDanhGia() {
		LocalDate now=LocalDate.now();
		long ngayLuuKho= Math.abs(ChronoUnit.DAYS.between(ngayNhapKho, now));
		return (soLuongTon>50 && ngayLuuKho>10)? "Ban cham" : "";
	}
	public HangSanhSu(String maHang, String tenHang, double donGia, int soLuongTon, String nhaSanXuat,
			LocalDate ngayNhapKho) throws IllegalAccessException {
		super(maHang, tenHang, donGia, soLuongTon);
		this.nhaSanXuat = nhaSanXuat;
		this.ngayNhapKho = ngayNhapKho;
	}
	
}
