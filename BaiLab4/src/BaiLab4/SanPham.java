package BaiLab4;

import java.util.Scanner;

public class SanPham {
	private String tenSp;
	private double donGia, giamGia;	
	
	public SanPham(String tenSp, double donGia, double giamGia) {
		this.tenSp = tenSp;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}

	public SanPham(String tenSp, double donGia) {
		this(tenSp,donGia,0);
	}

	public String getTenSp() {
		return tenSp;
	}

	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public double getGiamGia() {
		return giamGia;
	}

	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
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
	
	private double getThueNhapKhau()
	{
		return 0.1 * donGia;
	}
	
	
}
