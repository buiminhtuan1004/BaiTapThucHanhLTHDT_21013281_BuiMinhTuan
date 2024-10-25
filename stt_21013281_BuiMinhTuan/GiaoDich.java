package stt_21013281_BuiMinhTuan;

import java.time.LocalDate;

public abstract class GiaoDich {
	public abstract double getThanhTien();
	protected String maGD;
	protected LocalDate ngayGD;
	protected double donGia;
	protected int soLuong;
	public String getMaGD() {
		return maGD;
	}
	public void setMaGD(String maGD) throws IllegalAccessException {
		if (maGD!=null) {
			this.maGD = maGD;
		} else {
			throw new IllegalAccessException("Loi");
		}
		
	}
	public LocalDate getNgayGD() {
		return ngayGD;
	}
	public void setNgayGD(LocalDate ngayGD) {
		this.ngayGD = ngayGD;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) throws IllegalAccessException {
		if (soLuong>0) {
			this.soLuong = soLuong;
		} else {
			throw new IllegalAccessException("Loi");
		}
		
	}
	public GiaoDich(String maGD, LocalDate ngayGD, double donGia, int soLuong) throws IllegalAccessException {
		if (maGD!=null) {
			this.maGD = maGD;
		} else {
			throw new IllegalAccessException("Loi");
		}
		this.ngayGD = ngayGD;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}
	
	@Override
	public String toString() {
		String s="";
		s+=s.format("|%10s|%10s|%10s|%10s|", getMaGD(), getNgayGD(), getDonGia(), getSoLuong());
		return super.toString();
	}
}
