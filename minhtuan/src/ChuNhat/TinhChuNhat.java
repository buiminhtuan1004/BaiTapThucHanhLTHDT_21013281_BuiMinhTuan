package ChuNhat;

public class TinhChuNhat {
	private double chieuDai;
	private double chieuRong;
	public double getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(double d) {
		if(d>0) {
		this.chieuDai = d;
		}else {
			System.out.println(" Loi d");
		}
	}
	public double getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(double r) {
		if(r>0) {
			this.chieuRong = r;
		}else {
			System.out.println(" Loi r");
			}
	}
	public TinhChuNhat() {}
	public TinhChuNhat(double d, double r) {
		if(d>0) {
			this.chieuDai = d;
			}else {
				System.out.println(" Loi d");
			}
		if(r>0) {
			this.chieuRong = r;
		}else {
			System.out.println(" Loi r");
			}
	}
	
	public double getCV() {
		return (getChieuDai()+getChieuRong())*2;
	}
	public double getDienTich() {
		return (getChieuDai()*getChieuRong());
	}
	
	public String toString() {
		String s= "";
		s=s+s.format("|%10s| %10s| %10s| %10s|", getChieuDai(), getChieuRong(), getCV(), getDienTich());
		return s;
	}
}
