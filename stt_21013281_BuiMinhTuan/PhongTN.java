package stt_21013281_BuiMinhTuan;

public class PhongTN extends PhongHoc {
	private String chuyenNganh;
	private int sucChua;
	private boolean bonRua;
	
	public String getChuyenNganh() {
		return chuyenNganh;
	}

	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}

	public int getSucChua() {
		return sucChua;
	}

	public void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}

	public boolean isBonRua() {
		return bonRua;
	}

	public void setBonRua(boolean bonRua) {
		this.bonRua = bonRua;
	}

	public PhongTN(String maPhong, String dayNha, double dienTich, int soBongDen, String chuyenNganh, int sucChua,
			boolean bonRua) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.chuyenNganh = chuyenNganh;
		this.sucChua = sucChua;
		this.bonRua = bonRua;
	}

	public PhongTN(String maPhong, String dayNha, double dienTich, int soBongDen) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.chuyenNganh = "";
		this.sucChua = 0;
		this.bonRua = false;
	}

	@Override
	public boolean datChuan() {
		return (duSang() && bonRua);
	}
	
	@Override
	public String toString() {
		String br = bonRua? "Co bon rua": "Khong co bon rua";
		return super.toString()+ String.format("Chuyen nganh: %s, Suc chua: %s nguoi, %s", getChuyenNganh(), getSucChua(), br);
	}
	
}
