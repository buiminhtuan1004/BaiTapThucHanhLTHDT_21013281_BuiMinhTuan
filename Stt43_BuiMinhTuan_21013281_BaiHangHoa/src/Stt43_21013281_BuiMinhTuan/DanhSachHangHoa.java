package Stt43_21013281_BuiMinhTuan;

import java.util.Arrays;

public class DanhSachHangHoa {
	private HangHoa [] ds;
	int dem=0;
	public DanhSachHangHoa() {
		ds = new HangHoa[10];
	}
	public DanhSachHangHoa(int n) {
		if(n<=0)
			throw new RuntimeException("So luong hang hoa phai lon hon 0");
		ds = new HangHoa[n];
	}
	public boolean them(HangHoa h) {
		if(dem==ds.length)
			return false;
		for(int i=0; i<dem;i++)
			if(ds[i].getMaHang().equalsIgnoreCase(h.getMaHang()))
		return false;
		ds[dem++]=h;
		return true;
	}
	public HangHoa[] sapXepHHTheoTen(){
		HangHoa[] dsMoi= ds.clone();
		for(int i=0; i<dem-1 ; i++)
			for(int j=i+1; j<dem;j++)
				if(ds[i].getTenHang().compareToIgnoreCase(ds[j].getTenHang())>0) {
					HangHoa temp= dsMoi[i];
					dsMoi[i]=dsMoi[j];
					ds[j]=temp;
				}
		return Arrays.copyOf(dsMoi, dem);
	}
	public HangHoa[] layDanhSachHangThucPhamKhoBan() {
		HangHoa[] dsMoi= new HangHoa[dem];
		int k=0;
		for(int i = 0;i< dem; i++) {
			if(ds[i] instanceof HangThucPham && ((HangThucPham) ds[i]).getDanhGia().equalsIgnoreCase("Kho ban"));
				dsMoi[k++]=ds[i];
		}
		return Arrays.copyOf(dsMoi, k);
	}
	public HangHoa[] getLayDSHHTheoLoaiHang(String loaiHang) {
		HangHoa[] dsMoi= new HangHoa[dem];
		int k=0;
		for(int i=0; i<dem; i++) {
			if(ds[i].getClass().getSimpleName().equalsIgnoreCase(loaiHang))
				dsMoi[k++]=ds[i];
		}
		return Arrays.copyOf(dsMoi, k);
	}
	public HangHoa[] getDS() {
		return Arrays.copyOf(ds, dem);
	}
}
