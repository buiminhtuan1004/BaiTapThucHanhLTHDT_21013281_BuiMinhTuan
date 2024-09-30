package buiMinhTuan_21013281;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

public abstract class GiaoDich {
    public abstract double getThanhTien();
    protected String maGD;
    protected LocalDate ngayGD;
    protected double dienTich;
    protected double donGia;
    
    public String getMaGD() {
        return maGD;
    }
    public void setMaGD(String maGD) throws IllegalAccessException {
        if (maGD != null) {
            this.maGD = maGD;
        } else {
            throw new IllegalAccessException("Loi ma");
        }
    }
    public LocalDate getNgayGD() {
        return ngayGD;
    }
    public void setNgayGD(LocalDate ngayGD) {
        this.ngayGD = ngayGD;
    }
    public double getDienTich() {
        return dienTich;
    }
    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public GiaoDich() throws IllegalAccessException {
        this("", LocalDate.now(), 0, 0);
    }
    public GiaoDich(String maGD, LocalDate ngayGD, double dienTich, double donGia) throws IllegalAccessException {
        setMaGD(maGD);
        this.ngayGD = ngayGD;
        this.dienTich = dienTich;
        this.donGia = donGia;
    }
    @Override
    public String toString() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("|%10s|%10s|%10.2f|%10.2f|", 
            getMaGD(), getNgayGD().format(df), getDienTich(), getDonGia());
    }
}
