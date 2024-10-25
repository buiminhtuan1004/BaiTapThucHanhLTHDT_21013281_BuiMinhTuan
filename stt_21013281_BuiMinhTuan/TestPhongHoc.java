package stt_21013281_BuiMinhTuan;

import java.util.List;

public class TestPhongHoc {

	public static void main(String[] args) {
		ListPhongHoc ph = new ListPhongHoc();
		ph.themPhongHoc (new PhongLT("A02", "Day A", 110, 30, true));
		ph.themPhongHoc (new PhongMT("H05", "Day H", 100, 20, 60));
		ph.themPhongHoc (new PhongTN("V08", "Day V", 70, 40, "Hoa Hoc", 40,true));
		ph.themPhongHoc (new PhongLT("B03", "Day B", 100, 0, false));
		
		System.out.println(ph);

	}

}
