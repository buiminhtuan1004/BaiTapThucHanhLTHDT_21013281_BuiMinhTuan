package Baituan03;

public class TuvaMau {
	private String ten;
	private double tu;
	private double mau;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) throws Exception {
		if(ten!=null) {
			this.ten = ten;
		}else {
			throw new Exception("Loi");
		}
		this.ten = ten;
	}
	public double getTu() {
		return tu;
	}
	public void setTu(double tu) {
		this.tu = tu;
	}
	public double getMau() {
		return mau;
	}
	public void setMau(double mau) {
		this.mau = mau;
	}
	public TuvaMau() {}
	public TuvaMau(String ten, double tu, double mau) throws Exception{
		if(ten!=null) {
			this.ten = ten;
		}else {
			throw new Exception("Loi");
		}
		this.tu = tu;
		this.mau = mau;
	}
	@Override
	public String toString() {
		String s="";
		s=s+s.format("Phan so %5s|a la %2s|B la %2s", getTen(), getTu(), getMau() );
		return s;
	}
	public static void main(String args[]) throws Exception{
			TuvaMau p= new TuvaMau("a/b", 3,4);
			System.out.println(p);
	}
}
