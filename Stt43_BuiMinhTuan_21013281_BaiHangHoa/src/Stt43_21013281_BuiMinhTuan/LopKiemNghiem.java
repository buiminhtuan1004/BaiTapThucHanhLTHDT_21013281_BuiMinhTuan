package Stt43_21013281_BuiMinhTuan;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LopKiemNghiem {

    public static void main(String[] args) {
        DanhSachHangHoa ds = null;
        Scanner sc = null;
        boolean flag = true;
        int n = 0;

        try {
            sc = new Scanner(System.in);
            while (flag) {
                try {
                    System.out.println("Nhap so phan tu mang: ");
                    n = sc.nextInt();
                    if (n <= 0) {
                        throw new IllegalArgumentException("So phan tu phai lon hon 0.");
                    }
                    ds = new DanhSachHangHoa(n);
                    flag = false;
                } catch (InputMismatchException e) {
                    System.out.println("Vui long nhap mot so nguyen.");
                    sc.next(); // clear invalid input
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
            khoiTaoDS(ds);
            System.out.println("Danh sach hang hoa sau khi sap xep theo ten hang: ");
            HangHoa[] dsMoi = ds.sapXepHHTheoTen();
            for (HangHoa h : dsMoi) {
                System.out.println(h);
            }

            System.out.println("Danh sach hang thuc pham: ");
            HangHoa[] dsHangThucPham = ds.getLayDSHHTheoLoaiHang("HangThucPham");
            for (HangHoa h : dsHangThucPham) {
                System.out.println(h);
            }

            System.out.println("Danh sach hang hoa: ");
            HangHoa[] dsHH = ds.getDS();
            for (HangHoa h : dsHH) {
                System.out.println(h);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }

    public static void khoiTaoDS(DanhSachHangHoa ds) throws IllegalAccessException {
        ds.them(new HangThucPham("12345", "Sua", 8000.0, 10, "Vinamilk", LocalDate.of(2023, 5, 21), LocalDate.of(2024, 10, 2)));
        ds.them(new HangDienMay("12333", "MayGiat", 5000000.0, 10, 24, 1500.0));
    }
}

