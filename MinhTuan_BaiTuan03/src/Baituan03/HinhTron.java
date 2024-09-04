package Baituan03;

public class HinhTron {
	private double banKinh;
	private Tam t;
	public static final double PI=3.1416;
	
	public Tam getT() {
		return t;
	}
	public void setT(Tam t) throws Exception {
		if(t!=null) {
			this.t = t;
		}else {
			throw new Exception("Loi");
		}
	}
	public double getBanKinh() {
		return banKinh;
	}
	public void setBanKinh(double bk) throws Exception {
		if(bk>0) {
			this.banKinh = bk;
		}else {
			throw new Exception("Loi");
		}
		this.banKinh = bk;
	}
	public HinhTron() {}
	public HinhTron(double banKinh, Tam t) {
		this.banKinh = banKinh;
		this.t = t;
	}  
	public double getDienTich() {
		return getBanKinh()*getBanKinh()*PI;
	}
	public double getChuVi() {
		return getBanKinh()*2*PI;
	}
	@Override
	public String toString() {
		String r="";
		r=r+r.format("%2s| %10s| %10s", getBanKinh(), getDienTich(), getChuVi());
		return r;
	}
	public static void main(String args[]) throws Exception {
		HinhTron h1= new HinhTron(9, new Tam("O", 12,12));
		System.out.println(h1);
	}
}
