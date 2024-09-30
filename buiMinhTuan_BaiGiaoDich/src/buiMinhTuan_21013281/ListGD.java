package buiMinhTuan_21013281;

import java.util.ArrayList;
import java.util.List;

public class ListGD {
	List<GiaoDich> ls;
	public ListGD() {
		ls = new ArrayList<GiaoDich>(2);
	}
	public boolean themGD(GiaoDich g) {
		if (ls.contains(g)) {
			return false;
		} else {
			return ls.add(g);
		}
	}
	public List<GiaoDich> getAll(){
		return ls;
	}
	public GiaoDich tim(String ma) {
		for (GiaoDich giaoDich : ls) {
			if(giaoDich.getMaGD().equalsIgnoreCase(ma))
				return giaoDich;
		}
		return null;
	}
	public boolean xoaGD(String ma) {
		GiaoDich g=tim(ma);
		if(g!=null)
			ls.remove(g);
		return false;
	}
}
