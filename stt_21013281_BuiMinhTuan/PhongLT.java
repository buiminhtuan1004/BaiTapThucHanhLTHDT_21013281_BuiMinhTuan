package stt_21013281_BuiMinhTuan;

public class PhongLT extends PhongHoc {
	private boolean coMayChieu;
	
	public boolean isCoMayChieu() {
		return coMayChieu;
	}

	public void setCoMayChieu(boolean coMayChieu) {
		this.coMayChieu = coMayChieu;
	}

	public PhongLT(String maPhong, String dayNha, double dienTich, int soBongDen, boolean coMayChieu) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.coMayChieu = coMayChieu;
	}

	public PhongLT(String maPhong, String dayNha, double dienTich, int soBongDen) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.coMayChieu = false;
	}

	@Override
	public boolean datChuan() {
		return (duSang() && coMayChieu);
	}
	@Override
	public String toString() {
		String mayChieu= coMayChieu? "Co may chieu": "Khong co may chieu";
		return super.toString()+ String.format("%s", mayChieu);
	}
}
