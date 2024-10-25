package stt_21013281_BuiMinhTuan;

import java.time.LocalDate;

public class GiaoDichTienTe extends GiaoDich {
	private double tiGia;
	private String loaiTienTe;
	public double getTiGia() {
		return tiGia;
	}
	public void setTiGia(double tiGia) {
		this.tiGia = tiGia;
	}
	public String getLoaiTienTe() {
		return loaiTienTe;
	}
	public void setLoaiTienTe(String loaiTienTe) {
		this.loaiTienTe = loaiTienTe;
	}
	public GiaoDichTienTe(String maGD, LocalDate ngayGD, double donGia, int soLuong, double tiGia, String loaiTienTe)
			throws IllegalAccessException {
		super(maGD, ngayGD, donGia, soLuong);
		this.tiGia = tiGia;
		this.loaiTienTe = loaiTienTe;
	}
	@Override
	public double getThanhTien() {
		if (loaiTienTe.equalsIgnoreCase("USD") || loaiTienTe.equalsIgnoreCase("Euro") ) {
			return soLuong * donGia * tiGia;
		} else {
			return soLuong * donGia; //loai tien Viet Nam
		}
	}
	@Override
	public String toString() {
		return super.toString()+ String.format("%10s|%10s", getLoaiTienTe(), getThanhTien());
	}
	
}
