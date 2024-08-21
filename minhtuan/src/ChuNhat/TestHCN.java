package ChuNhat;

import java.util.Scanner;

public class TestHCN {
	public static void inTD() {
		for(int i=0; i<47; i++) {
			System.out.printf("-");
		}
		System.out.println();
		System.out.printf("| %10s| %10s| %10s| %10s|", " chieu dai", " chieu rong", " chu vi", " dien tich");
		System.out.println();
		for(int i=0; i<47; i++) {
			System.out.printf("-");
		}
		System.out.println();
	
	}
	public static TinhChuNhat nhapHam() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chieu dai: ");
		double d= sc.nextDouble();
		System.out.println("Nhap chieu rong: ");
		double r= sc.nextDouble();
		TinhChuNhat h1= new TinhChuNhat();
		h1.setChieuDai(d);
		h1.setChieuRong(r);
		return h1;
	}
	
	public static void main(String[] args) {
		TinhChuNhat h1= new TinhChuNhat();
		h1.setChieuDai(10);
		h1.setChieuRong(5);
		inTD();
		System.out.println(h1.toString());
		for(int i=0; i<47; i++) {
			System.out.printf("-");
	}
		System.out.println();
		TinhChuNhat h2= new TinhChuNhat(15, 20);
		inTD();
		System.out.println(h2.toString());
		for(int i=0; i<47; i++) {
			System.out.printf("-");
	}
		nhapHam();
		inTD();
		
	}
		
}	

