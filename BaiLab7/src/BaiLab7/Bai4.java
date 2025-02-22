package BaiLab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Bai4 {
	
	static Scanner sc = new Scanner(System.in);
	static List<SinhVienPoly> dsSinhVien = new ArrayList<SinhVienPoly>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu();
	}

	public static void Menu ()
	{
		int choice;
		
		do
		{
            System.out.println("--- MENU ---");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Xuất thông tin danh sách sinh viên");
            System.out.println("3. Xuất danh sách sinh viên có học lực giỏi");
            System.out.println("4. Sắp xếp danh sách sinh viên theo điểm");
            System.out.println("5. Kết thúc");
            System.out.print("Chọn chức năng: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice)
            {
            	case 1:
            		nhap();
            		break;
            	case 2:
            		xuat();
            		break;
            	case 3:
            		XuatSVGioi();
            		break;
            	case 4:
            		SapXepTheoDiem();
            		break;
            	case 5:
            		System.out.println("Kết thúc!");
            		break;
            }
		}
		while (choice != 5);
	}
	public static void nhap()
	{
		System.out.print("Nhập vào số lượng sv: ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++)
		{
			System.out.print("Tên sinh viên: ");
			String hoTen = sc.nextLine();
			System.out.print("Ngành: ");
			String nganh = sc.nextLine();
			
			if (nganh.equalsIgnoreCase("IT"))
			{
				System.out.print("Điểm HTML: ");
                double diemHTML = sc.nextDouble();
                System.out.print("Điểm CSS: ");
                double diemCSS = sc.nextDouble();
                System.out.print("Điểm Java: ");
                double diemJava = sc.nextDouble();
                dsSinhVien.add(new SinhVienIT(hoTen, nganh, diemHTML, diemCSS, diemJava));
			}
			else if (nganh.equalsIgnoreCase("Markt")) 
			{
				System.out.print("Điểm Sales: ");
                double diemSales = sc.nextDouble();
                System.out.print("Điểm Marketing: ");
                double diemMarkt = sc.nextDouble();
                dsSinhVien.add(new SinhVienBiz(hoTen, nganh, diemSales, diemMarkt));
			}
			else
			{
				System.out.print("Ngành không hợp lệ!");
				i--;
			}
			sc.nextLine();
		}
	}
	
	public static void xuat()
	{
		System.out.println("Danh sách sinh viên");
		for (SinhVienPoly sv : dsSinhVien)
		{
			sv.xuat();
			System.out.println("Học lực: " + sv.getHocLuc());
		}
	}
	
	public static void XuatSVGioi()
	{
		System.out.println("Sinh viên có học lực giỏi: ");
		for (SinhVienPoly sv : dsSinhVien)
		{
			if (sv.getHocLuc().equalsIgnoreCase("Giỏi"))
				sv.xuat();
		}
	}
	
	public static void SapXepTheoDiem()
	{
		System.out.println("Sắp xếp sinh viên theo điểm");
		Collections.sort(dsSinhVien, new Comparator<SinhVienPoly>() {
			@Override
			public int compare(SinhVienPoly o1, SinhVienPoly o2) {
				// TODO Auto-generated method stub
				return Double.compare(o2.getDiem(), o1.getDiem());	//sắp giảm dần
			}
		});
		xuat();
	}
	
	

}
