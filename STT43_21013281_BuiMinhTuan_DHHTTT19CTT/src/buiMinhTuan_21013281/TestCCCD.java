package buiMinhTuan_21013281;

import java.time.LocalDate;

public class TestCCCD {

	public static void main(String[] args) {
		DanhSachCCCD danhSachCCCD = new DanhSachCCCD();

        // Khởi tạo 3 đối tượng CanCuocCD
        CanCuocCD cccd1 = new CanCuocCD("123456789", "Nguyen Van A ", LocalDate.of(2005, 1, 1), LocalDate.of(2023, 1, 15), "Hanoi");
        CanCuocCD cccd2 = new CanCuocCD("987654321", "Tran Thi B ", LocalDate.of(2003, 5, 10), LocalDate.of(2023, 3, 22), "Hanoi");
        CanCuocCD cccd3 = new CanCuocCD("123123123", "Le Van C ", LocalDate.of(2004, 2, 20), LocalDate.of(2023, 6, 5), "Hanoi");

        // Thêm các đối tượng vào danh sách
        danhSachCCCD.themCanCuocCD(cccd1);
        danhSachCCCD.themCanCuocCD(cccd2);
        danhSachCCCD.themCanCuocCD(cccd3);

        // Sắp xếp theo ngày cấp
        danhSachCCCD.sapXepTheoNgayCap();

        // Xuất danh sách CCCD đã nhận trong năm 2023
        danhSachCCCD.xuatCCCDDaNhanNam2023();

        // Tính tổng số căn cước đã cấp
        System.out.println("Tổng số căn cước công dân đã cấp: " + danhSachCCCD.tongSoCanCuocDaCap());

	}

}
