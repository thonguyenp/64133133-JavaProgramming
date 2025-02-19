package BaiLab6;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập họ và tên: ");
		String fullName = sc.nextLine();
		
		int khoangTrangDau = fullName.indexOf(" ");
		int khoangTrangCuoi = fullName.lastIndexOf(" ");
		
		if (khoangTrangDau == -1)	//không có khoảng trắng
		{
			System.out.println("Họ: " + fullName.toUpperCase());
            System.out.println("Tên đệm: Không có");
            System.out.println("Tên: " + fullName.toUpperCase());
		}
		else
		{
			String ho = fullName.substring(0, khoangTrangDau).toUpperCase();
			String ten = fullName.substring(khoangTrangCuoi + 1).toUpperCase();
			if (khoangTrangCuoi == khoangTrangDau)
			{
				System.out.println("Tên đệm: Không có");
			}
			else
			{
				String tenDem = fullName.substring(khoangTrangDau + 1, khoangTrangCuoi);
				System.out.println("Họ: " + ho);
	            System.out.println("Tên đệm: " + tenDem);
	            System.out.println("Tên: " + ten);
			}
			

		}
		sc.close();
	}
	
}
