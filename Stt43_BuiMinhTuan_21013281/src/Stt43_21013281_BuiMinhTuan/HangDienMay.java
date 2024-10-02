package Stt43_21013281_BuiMinhTuan;

import java.time.LocalDate;

public class HangDienMay extends HangHoa {
	private int thoiGianBH;
	private double congSuat;
	public int getThoiGianBH() {
		return thoiGianBH;
	}
	public void setThoiGianBH(int thoiGianBH) throws IllegalAccessException {
		if(thoiGianBH<0)
			throw new IllegalAccessException("Thoi gian phai lon hon 0");
		this.thoiGianBH = thoiGianBH;
	}
	public double getCongSuat() {
		return congSuat;
	}
	public void setCongSuat(double congSuat) throws IllegalAccessException {
		if(congSuat<0)
			throw new IllegalAccessException("Cong suat phai lon hon 0");
		this.congSuat = congSuat;
	}
	@Override
	public double getTienVat() {
		return donGia*0.1;
	}
	@Override
	public String getDanhGia() {
		LocalDate now=LocalDate.now();
		return (soLuongTon<3) ? "Ban duoc" :"";
	}
	public HangDienMay(String maHang, String tenHang, double donGia, int soLuongTon, int thoiGianBH, double congSuat)
			throws IllegalAccessException {
		super(maHang, tenHang, donGia, soLuongTon);
		this.thoiGianBH = thoiGianBH;
		this.congSuat = congSuat;
	}

	
}
