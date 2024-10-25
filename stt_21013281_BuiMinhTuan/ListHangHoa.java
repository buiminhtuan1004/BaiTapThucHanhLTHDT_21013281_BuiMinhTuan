package stt_21013281_BuiMinhTuan;

import java.util.ArrayList;
import java.util.List;

public class ListHangHoa {
	List<HangHoa> ls;
	public void dsHangHoa() {
		ls = new ArrayList<HangHoa>();
	}
	public boolean themHangHoa(HangHoa h) {
		for (HangHoa hang : ls) {
			if(hang.getMaHang().equals(h.getMaHang()))
				return false;
		}
		ls.add(h);
		return true;
	}
	
	public void ttHangHoa() {
		for (HangHoa hang : ls) {
			System.out.println(hang);
		}
	}
	
	public HangHoa timKiemHangHoa(String maHang) {
		for (HangHoa hang : ls) {
			if(hang.getMaHang().equals(maHang)) {
				return hang;
			}
		}
		return null;
	}
}
