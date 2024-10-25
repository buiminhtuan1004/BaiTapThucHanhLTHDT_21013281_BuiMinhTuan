package stt_21013281_BuiMinhTuan;

public class PhongMT extends PhongHoc {
	private int soMayTinh;

	public int getSoMayTinh() {
		return soMayTinh;
	}

	public void setSoMayTinh(int soMayTinh) {
		this.soMayTinh = soMayTinh;
	}

	public PhongMT(String maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.soMayTinh = soMayTinh;
	}

	public PhongMT(String maPhong, String dayNha, double dienTich, int soBongDen) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.soMayTinh = 0;
	}

	@Override
	public boolean datChuan() {
		return (duSang() && getDienTich()/getSoMayTinh()<=1.5);
	}
	 @Override
	public String toString() {
		return super.toString()+ String.format("So may tinh: %s", getSoMayTinh());
	}
	
}
