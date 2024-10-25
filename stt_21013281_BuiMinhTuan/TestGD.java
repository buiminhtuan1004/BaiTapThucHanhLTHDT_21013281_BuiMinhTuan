package stt_21013281_BuiMinhTuan;

import java.time.LocalDate;

public class TestGD {
	public static void main(String[] args) throws IllegalAccessException {
		ListGD gd = new ListGD();
		gd.themGD(new GiaoDichVang("2121212", LocalDate.of(2023, 10, 20), 100000, 20, "vang"));
		gd.themGD(new GiaoDichVang("2124442", LocalDate.of(2023, 01, 03), 300000, 50, "vang"));
		gd.themGD(new GiaoDichVang("2121212", LocalDate.of(2023, 06, 10), 200000, 60, "vang"));
	}
}
