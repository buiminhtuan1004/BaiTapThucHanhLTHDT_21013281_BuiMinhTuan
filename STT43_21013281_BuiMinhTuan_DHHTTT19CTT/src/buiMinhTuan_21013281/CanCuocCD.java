package buiMinhTuan_21013281;

import java.time.LocalDate;

public class CanCuocCD {
	private String soCCCD;
	private String hoTen;
	private LocalDate ngaySinh;
	private LocalDate ngayCap;
	private String choHienTai;

	public String getSoCCCD() {
		return soCCCD;
	}
	public void setSoCCCD(String soCCCD) throws Exception {
		if (soCCCD!=null) {
			this.soCCCD = soCCCD;
		} else {
			throw new Exception("Khong trung soCCCD");
		}
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) throws Exception {
		if (hoTen!=null) {
			this.hoTen = hoTen;
		} else {
			throw new Exception("Khong duoc trung ten");
		}
		
	}
	public LocalDate getNgaySinh() {
		return ngaySinh;
	}
	 public void setNgaySinh(LocalDate ngaySinh) {
	        if (ngaySinh == null || ngaySinh.isAfter(LocalDate.now().minusYears(15))) {
	            throw new IllegalArgumentException("Ngày sinh không hợp lệ.");
	        }
	        this.ngaySinh = ngaySinh;
	    }
	public LocalDate getNgayCap() {
		return ngayCap;
	}
	public void setNgayCap(LocalDate ngayCap) {
        if (ngayCap.isBefore(ngaySinh.plusYears(15))) {
            throw new IllegalArgumentException("Ngày cấp không hợp lệ.");
        }
        this.ngayCap = ngayCap;
    }
	public String getChoHienTai() {
		return choHienTai;
	}
	public void setChoHienTai(String choHienTai) {
		this.choHienTai = choHienTai;
	}
	
	public boolean isNgayNhanHopLe(LocalDate ngayNhan) {
        return ngayNhan.isAfter(ngayCap.plusDays(30));
    }
	
	public CanCuocCD(String soCCCD, String hoTen, LocalDate ngaySinh, LocalDate ngayCap, String choHienTai) {
		this.soCCCD = soCCCD;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.ngayCap = ngayCap;
		this.choHienTai = choHienTai;
	}
	@Override
	public String toString() {
		String s="";
		s+=s.format("%10s|%10s%10s%10s|%10s", getSoCCCD(),getHoTen(),getNgaySinh(),getNgayCap(),getChoHienTai());
		return s;
	}
}
