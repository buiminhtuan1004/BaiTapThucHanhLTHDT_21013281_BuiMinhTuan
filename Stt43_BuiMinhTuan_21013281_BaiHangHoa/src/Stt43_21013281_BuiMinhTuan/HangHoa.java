package Stt43_21013281_BuiMinhTuan;

import java.text.DecimalFormat;

public abstract class HangHoa {
	public abstract double getTienVat();
	public abstract String getDanhGia();
	protected final String maHang = "";
	protected String tenHang;
	protected double donGia;
	protected int soLuongTon;
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) throws IllegalAccessException {
		if(tenHang!=null) {
			this.tenHang = tenHang;
		}else {
			throw new IllegalAccessException("Khong duoc de rong, phai mac dinh la xxx");
		}
		
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) throws IllegalAccessException {
		if(donGia<0)
			throw new IllegalAccessException("Don gia phai lon hon 0.");
		this.donGia = donGia;
	}
	public int getSoLuongTon() {
		return soLuongTon;
	}
	public void setSoLuongTon(int soLuongTon) throws IllegalAccessException {
		if(soLuongTon<0)
		    throw new IllegalAccessException("So luong phai lon hon 0. ");
			this.soLuongTon = soLuongTon;
	}
	public String getMaHang() {
		return maHang;
	}
	public HangHoa(String maHang) throws IllegalAccessException {
		this(maHang, "xxx",0.0,0);
	}
	public HangHoa(String maHang, String tenHang, double donGia, int soLuongTon) throws IllegalAccessException {
		if(maHang == null || maHang.trim().length()==0)
			throw new IllegalAccessException("Khong duoc de rong, phai mac dinh la xxx");
		this.tenHang = tenHang;
		this.donGia = donGia;
		this.soLuongTon = soLuongTon;
	}
	@Override
	public String toString() {
		DecimalFormat df= new DecimalFormat("#,##0.#");
		return String.format("%10s - %20s - %10s - %10d - %20s - %10s", maHang, tenHang, donGia, soLuongTon, getTienVat(), getDanhGia());
	}
}
