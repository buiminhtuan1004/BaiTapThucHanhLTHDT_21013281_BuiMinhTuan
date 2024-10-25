package stt_21013281_BuiMinhTuan;

public class TestHangHoa {

	public static void main(String[] args) throws IllegalAccessException {
		ListHangHoa hh = new ListHangHoa();
		hh.themHangHoa(new HangSanhSu("33333222", "bot giat OMO", 100000, 20));
		hh.themHangHoa(new HangThucPham("43215667", "Trung ga Ba Huan", 20000, 20, null, null, null ));
		hh.themHangHoa(new HangSanhSu("33547222", "Xa bong", 10000, 120));
		
		System.out.println(hh);

	}

}
