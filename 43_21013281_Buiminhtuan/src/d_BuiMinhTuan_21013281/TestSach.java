package d_BuiMinhTuan_21013281;

import java.time.LocalDate;

public class TestSach {

	public static void main(String[] args) {
		ListSach ls = new ListSach();
		Sach s1= new SachGiaoKhoa("123456", "To Huu", LocalDate.of(2003, 4, 27), 30, 400, false);
		ls.themSach(s1);
		Sach s2= new SachGiaoKhoa("546385", "Kim Dong", LocalDate.of(2005, 6, 12), 35, 200, false);
		ls.themSach(s2);

	}

}
