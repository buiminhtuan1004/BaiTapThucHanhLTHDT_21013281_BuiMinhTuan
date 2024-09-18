package d_BuiMinhTuan_21013281;

import java.time.LocalDate;

public class SachThamKhao extends Sach{
	public static final double THUE=0.25;
	private String xuatXu;
	
	@Override
	public double getThanhTien() {
		if (getXuatXu()=="NgoaiNhap") {
			return getSoLuong()*getDonGia()+THUE;
		} else {
			return getSoLuong()*getDonGia();
		}
	}

	public String getXuatXu() {
		return xuatXu;
	}

	public void setXuatXu(String xuatXu) {
		this.xuatXu = xuatXu;
	}

	public SachThamKhao(String maSach, String nhaXB, LocalDate ngayNhap, double donGia, int soLuong, String xuatXu) {
		super(maSach, nhaXB, ngayNhap, donGia, soLuong);
		this.xuatXu = xuatXu;
	}
	public SachThamKhao() {}
	@Override
	public String toString() {
		String s2="";
		s2+=s2.format("%10s|%10s", getXuatXu(), getThanhTien());
		return super.toString();
	}
}
