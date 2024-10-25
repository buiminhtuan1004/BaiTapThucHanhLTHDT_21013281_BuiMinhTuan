package stt_21013281_BuiMinhTuan;

public abstract class HangHoa {
	public abstract double getTienVat();
	public abstract String getDanhGia();
	protected String maHang = "";
	protected String tenHang;
	protected double donGia;
	protected int soLuongTon;
	
	public String getMaHang() {
		return maHang;
	}
	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) throws IllegalAccessException {
		if (tenHang!=null) {
			this.tenHang = tenHang;
		} else {
			throw new IllegalAccessException("Khong duoc de trong ");
		}
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) throws IllegalAccessException { 
		if (donGia>0) {
			this.donGia = donGia;
		} else {
			throw new IllegalAccessException("Don gia phai lon hon 0");
		}
	}
	public int getSoLuongTon() {
		return soLuongTon;
	}
	public void setSoLuongTon(int soLuongTon) throws IllegalAccessException {
		if (soLuongTon>0) {
			this.soLuongTon = soLuongTon;
		} else {
			throw new IllegalAccessException("Don gia phai lon hon 0");
		}
	}
	public HangHoa(String maHang, String tenHang, double donGia, int soLuongTon) throws IllegalAccessException {
		if(maHang == null || maHang.trim().length()==0)
			throw new IllegalAccessException("Khong duoc de rong");
		this.tenHang = tenHang;
		this.donGia = donGia;
		this.soLuongTon = soLuongTon;
	}
	@Override
	public String toString() {
		String s="";
		s+= s.format("|%10s|%10s|%10s|%10s|%10s|%10s|", getMaHang(), getTenHang(), getDonGia(), getSoLuongTon(), getDanhGia(),getTienVat() );
		return super.toString();
	}
}
