package d_BuiMinhTuan_21013281;

import java.time.LocalDate;

public class SachGiaoKhoa extends Sach {
	private boolean tinhTrang;
	public double getThanhTien() {
		if (isTinhTrang()==true) {
			return getDonGia()*getSoLuong();
		} else {
			return getDonGia()*getSoLuong()/2;
		}
	}
	public boolean isTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	public SachGiaoKhoa(String maSach, String nhaXB, LocalDate ngayNhap, double donGia, int soLuong,
			boolean tinhTrang) {
		super(maSach, nhaXB, ngayNhap, donGia, soLuong);
		this.tinhTrang = tinhTrang;
	}
	public SachGiaoKhoa() {}
	public String getTrangSachChuoi() {
		if (isTinhTrang()) {
			return "Moi";
		} else {
			return "Cu";
		}
	}
	@Override
	public String toString() {
		String s1="";
		s1+=s1.format("%10s|%10s", getTrangSachChuoi(), getThanhTien());
		return super.toString()+s1;
	}
}
