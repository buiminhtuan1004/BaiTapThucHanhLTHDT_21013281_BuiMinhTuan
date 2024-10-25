package stt_21013281_BuiMinhTuan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListGD {
	List<GiaoDich> ls;
	public void dsGiaoDich() {
		ls = new ArrayList<GiaoDich>();
	}
	public void themGD(GiaoDich g) {
		ls.add(g);
	}
	
	public void xuatDS() {
		for(GiaoDich gd : ls) {
			System.out.println(gd);
		}
	}
	public int tongSoLuongGDVang() {
		int tong = 0;
		for (GiaoDich gd : ls) {
			if( gd instanceof GiaoDichVang) {
				tong+= gd.getSoLuong();
			}
		}
		return tong;
	}
	public int tongSoLuongGDTienTe() {
		int tong = 0;
		for (GiaoDich gd : ls) {
			if( gd instanceof GiaoDichTienTe) {
				tong+= gd.getSoLuong();
			}
		}
		return tong;
	}
}
