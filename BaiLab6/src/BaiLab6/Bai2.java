package BaiLab6;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		ArrayList<SanPham> dsSanPham = new ArrayList<SanPham>();
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhập vào 5 sản phẩm: ");
		for (int i = 0; i < 5; i++)
		{
			System.out.printf("Nhập vào thông tin sp thứ %d: ",i);
			SanPham sp = new SanPham(null, i, null);
			sp.nhap(sc);
			dsSanPham.add(sp);
		}
		System.out.println("Các sản phẩm thuộc hãng nokia: ");
		for (SanPham sp : dsSanPham)
		{
			if (sp.hang.equalsIgnoreCase("Nokia"))
			{
				sp.xuat();
			}
		}
	}
}

class SanPham
{
	String tenSP;
	double donGia;
	String hang;
	
	public SanPham(String tenSP, double donGia, String hang) {
		super();
		this.tenSP = tenSP;
		this.donGia = donGia;
		this.hang = hang;
	}
	
	public void nhap(Scanner sc)
	{
		System.out.print("Nhập vào tên sản phẩm: ");
		tenSP = sc.nextLine();
		System.out.print("Nhập vào giá sản phẩm: ");
        this.donGia = Double.parseDouble(sc.nextLine());
		System.out.print("Nhập vào hãng sản phẩm: ");
		hang = sc.nextLine();
//		sc.close();
	}
	
	public void xuat()
	{
        System.out.println("Tên SP: " + tenSP + " | Giá: " + donGia + " | Hãng: " + hang);
	}
	
}