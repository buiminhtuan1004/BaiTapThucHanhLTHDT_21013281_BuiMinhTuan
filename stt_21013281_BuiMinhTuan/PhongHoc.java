package stt_21013281_BuiMinhTuan;

import java.util.Objects;

public abstract class PhongHoc {
	public abstract boolean datChuan();
	protected String maPhong, dayNha;
	protected double dienTich;
	protected int soBongDen;
	
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) throws IllegalAccessException {
		if (maPhong != null) {
			this.maPhong = maPhong;
		} else {
			throw new IllegalAccessException("Ma phong khong duoc de trong");
		}
	}
	public String getDayNha() {
		return dayNha;
	}
	public void setDayNha(String dayNha) throws IllegalAccessException {
		if (dayNha != null) {
			this.dayNha = dayNha;
		} else {
			throw new IllegalAccessException("Day nha khong duoc de trong");
		}
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	public int getSoBongDen() {
		return soBongDen;
	}
	public void setSoBongDen(int soBongDen) throws IllegalAccessException {
		if (soBongDen>0) {
			this.soBongDen = soBongDen;
		} else {
			throw new IllegalAccessException("Loi");
		}
		
	}
	public boolean duSang() {
		return (getDienTich()/getSoBongDen()/10);
	}
	public PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen) {
		super();
		this.maPhong = maPhong;
		this.dayNha = dayNha;
		this.dienTich = dienTich;
		this.soBongDen = soBongDen;
	}
	
	@Override
	public String toString() {
		String s="";
		s+=s.format("|%10s|%10s|%10s|%10s|", getMaPhong(),getDayNha(), getDienTich(), getSoBongDen() );
		return s;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maPhong);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhongHoc other = (PhongHoc) obj;
		return Objects.equals(maPhong, other.maPhong);
	}
	
}
