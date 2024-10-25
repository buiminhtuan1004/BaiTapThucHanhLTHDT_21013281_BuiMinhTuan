package stt_21013281_BuiMinhTuan;

import java.time.LocalDate;

public class GiaoDichVang extends GiaoDich{
	private String loaiVang;
	
	
	public String getLoaiVang() {
		return loaiVang;
	}
	public void setLoaiVang(String loaiVang) {
		this.loaiVang = loaiVang;
	}
	
	public GiaoDichVang(String maGD, LocalDate ngayGD, double donGia, int soLuong, String loaiVang)
			throws IllegalAccessException {
		super(maGD, ngayGD , donGia, soLuong);
		this.loaiVang = loaiVang;
	}
	@Override
	public double getThanhTien() {
		return soLuong *donGia;
	}
	@Override
	public String toString() {
		return super.toString()+ String.format("%10s|%10s", getLoaiVang(), getThanhTien());
	}
}
