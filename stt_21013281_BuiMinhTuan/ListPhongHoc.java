package stt_21013281_BuiMinhTuan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListPhongHoc {
	List<PhongHoc> ls;
	
	public ListPhongHoc() {
		ls = new ArrayList<PhongHoc>();
	}
	
	public boolean themPhongHoc(PhongHoc p) {
		if(ls.contains(p))
			return false;
		ls.add(p);
		return true;
	}
	
	public PhongHoc timPhong(String maPhong) {
		for (PhongHoc ph : ls) {
			if(ph.getMaPhong().equalsIgnoreCase(maPhong))
				return ph;
		}
		return null;
	}
	
	public List<PhongHoc> dsDatChuan(){
		List<PhongHoc> dsDC = new ArrayList<PhongHoc>();
		for (PhongHoc ph : ls) {
			if(ph.datChuan())
				dsDC.add(ph);
		}
		return dsDC;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (PhongHoc ph : ls) {
			sb.append(ph.toString()).append("\n");
		}
		return sb.toString();
	}
}
