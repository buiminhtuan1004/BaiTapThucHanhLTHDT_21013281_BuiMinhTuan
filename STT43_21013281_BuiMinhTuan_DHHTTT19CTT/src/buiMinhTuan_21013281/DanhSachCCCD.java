package buiMinhTuan_21013281;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class DanhSachCCCD {
	private CanCuocCD[] danhSach;
	private int count;

	   public DanhSachCCCD() {
	        danhSach = new CanCuocCD[10]; // Kích thước khởi tạo
	        count = 0;
	    }

	   public void themCanCuocCD(CanCuocCD canCuocCD) {
	        if (count >= danhSach.length) {
	            tangKichThuoc();
	        }
	        for (int i = 0; i < count; i++) {
	            if (danhSach[i].getSoCCCD().equals(canCuocCD.getSoCCCD())) {
	                System.out.println("Số CCCD đã tồn tại.");
	                return;
	            }
	        }
	        danhSach[count++] = canCuocCD;
	        System.out.println("Thêm thành công CCCD: " + canCuocCD.getSoCCCD());
	    }

	    private void tangKichThuoc() {
	        danhSach = Arrays.copyOf(danhSach, danhSach.length * 2);
	    }

	    public void sapXepTheoNgayCap() {
	        Arrays.sort(danhSach, 0, count, (cccd1, cccd2) -> {
	            return cccd2.getNgayCap().compareTo(cccd1.getNgayCap()); // Sắp xếp giảm dần
	        });
	    }

	    public int tongSoCanCuocDaCap() {
	        return count;
	    }

	    public void xuatCCCDDaNhanNam2023() {
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        System.out.println("Danh sách CCCD đã nhận trong năm 2023:");
	        for (int i = 0; i < count; i++) {
	            LocalDate ngayCap = danhSach[i].getNgayCap();
	            if (ngayCap.getYear() == 2023) {
	                System.out.println(danhSach[i].toString() + " - Ngày cấp: " + ngayCap.format(formatter));
	            }
	        }
	    }
}
