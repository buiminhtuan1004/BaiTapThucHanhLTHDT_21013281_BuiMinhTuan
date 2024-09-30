package buiMinhTuan_21013281;

import java.time.LocalDate;
import java.util.Scanner;

public class TestGD {
    public static GiaoDich nhap() throws IllegalAccessException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma giao dich: ");
        String ma = sc.nextLine();

        LocalDate ngayTo = null; // Khai báo ở đây
        boolean validDate = false;

        while (!validDate) { // Vòng lặp để yêu cầu nhập lại nếu ngày không hợp lệ
            try {
                System.out.println("Nhap ngay giao dich (yyyy-MM-dd): ");
                String ngay = sc.nextLine();
                ngayTo = LocalDate.parse(ngay); // Định dạng đúng là yyyy-MM-dd
                validDate = true; // Ngày hợp lệ
            } catch (Exception e) {
                System.out.println("Ngay khong hop le, vui long nhap lai.");
            }
        }

        System.out.println("Nhap dien tich: ");
        double dienTich = sc.nextDouble();
        System.out.println("Nhap don gia: ");
        double donGia = sc.nextDouble();
        sc.nextLine(); // Tiêu thụ dòng trống
        System.out.println("Loai dat (A, B): ");
        String ld = sc.nextLine();

        // Giả sử GiaoDichDat là lớp con của GiaoDich
        GiaoDich g = new GiaoDichDat(ma, ngayTo, dienTich, donGia, ld);
        return g;
    }

    public static void main(String[] args) throws IllegalAccessException {
        GiaoDich g = new GiaoDichDat("1345455", LocalDate.now(), 10, 1000, "A");
        System.out.println(g);
        
        GiaoDich gNhap = nhap(); // Nhập giao dịch mới
        System.out.println(gNhap); // In ra giao dịch đã nhập
    }
}

