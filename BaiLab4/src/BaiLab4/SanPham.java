package BaiLab4;

import java.util.Scanner;

public class SanPham {
	private String tenSp;
	private double donGia, giamGia;	
	public SanPham()
	{
		
	}
	public void nhap() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào tên sản phẩm: ");
		this.tenSp = sc.nextLine();
		System.out.print("Nhập vào đơn giá: ");
		this.donGia = sc.nextDouble();
		System.out.print("Nhập vào tên giảm giá: ");
		this.giamGia = sc.nextDouble();

	}
	
	public void xuat() {
		System.out.println( "SanPham [tenSp=" + tenSp + ", donGia=" + donGia + ", giamGia=" + giamGia + ", ThueNhapKhau=" + getThueNhapKhau()+ "]");
	}
	
	public double getThueNhapKhau()
	{
		return 0.1 * donGia;
	}
	
	
}
