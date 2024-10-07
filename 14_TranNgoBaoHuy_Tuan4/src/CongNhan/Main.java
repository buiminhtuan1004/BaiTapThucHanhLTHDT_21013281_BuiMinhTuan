package CongNhan;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DanhSachCongNhan ds = new DanhSachCongNhan(5);
		
		System.out.println("Nhập số lượng công nhân muốn thêm:");
        
		int soLuong = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhập thông tin công nhân thứ " + (i + 1) + ":");
            System.out.print("Mã công nhân: ");
            String maCN = sc.nextLine();
            System.out.print("Họ tên: ");
            String hoTen = sc.nextLine();
            System.out.print("Số sản phẩm: ");
            int soSP = sc.nextInt();
            sc.nextLine(); 

            CongNhan cn = new CongNhan(soSP, hoTen, hoTen);
               ds.them(cn);
               
        }


        System.out.println("\nToàn bộ thông tin công nhân:");
        ds.xuatThongTin();
        System.out.println("\nSố lượng công nhân viên trong danh sách: " + ds.soLuongCongNhan());
        System.out.println("\nThông tin công nhân làm trên 200 sản phẩm:");
        ds.xuatDanhSachCongNhan200SP();
        System.out.println("\nDanh sách công nhân sắp xếp theo số sản phẩm giảm dần:");
        ds.sapXepCongNhan();
        ds.xuatThongTin();
    }
		
}