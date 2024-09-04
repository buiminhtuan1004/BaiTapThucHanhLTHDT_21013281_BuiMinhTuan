package Baituan03;



public class PhanSo {
	private double t;
	private double m;
	public double getT() {
		return t;
	}
	public void setT(double t) throws Exception {
		if(t>0) {
			this.t = t;
		}else {
			throw new Exception("Khong co so");
		}
	}
	public double getM() {
		return m;
	}
	public void setM(double m) throws Exception  {
		if(m>0) {
			this.m = m;
		}else {
			throw new Exception("Khong co so");
		}
	}
	public PhanSo() {}
	public PhanSo(double t, double m) {
		this.t = t;
		this.m = m;
	}
	 public double timUSCLN(double a, double b) {
	        while (a != b) {
	            if (a > b) {
	                a -= b;
	            } else {
	                b -= a;
	            }
	        }
	        return a;
	    }
	     
	    public void toiGianPhanSo() throws Exception {
	        double i = timUSCLN(this.getT(), this.getM());
	        this.setT(this.getT() / i);
	        this.setM(this.getM() / i);
	    }
	public double getPhanSo() {
		return getT()/getM();
	}
	public double getTong() {
		return getPhanSo()+getPhanSo();
	}
	public double getHieu() {
		return getPhanSo()-getPhanSo();
	}
	public double getTich() {
		return getPhanSo()*getPhanSo();
	}
	public double getThuong() {
		return getPhanSo()/getPhanSo();
	}
	@Override
	public String toString(){
		String ps="";
		ps=ps+ps.format("Tu la %2s|Mau la %2s|Tong hai phan so %2s|Hieu hai phan so %2s|Tich hai phan so %2s|Thuong hai phan so %2s", getT(), getM(), getTong(), getHieu(), getTich(), getThuong());
		return ps;
	}
	public static void main(String args[]) throws Exception {
		PhanSo h1= new PhanSo(2,4);
		System.out.println(h1);

	}
}
