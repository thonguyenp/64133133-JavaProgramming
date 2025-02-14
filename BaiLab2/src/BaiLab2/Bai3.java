package BaiLab2;

import java.util.Scanner;

public class Bai3 {

	public static void TinhTienDien ()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào số điện đã sử dụng: ");
		int soDien = sc.nextInt();
		
		if (soDien <= 50 && soDien >= 0)
		{
			int soTien = soDien * 1000;
			System.out.print("Số tiền phải trả: "+ soTien);
		}	
		else if (soDien > 50)
		{
			int soTien = 50 * 1000 + (soDien-50) * 1200;
			System.out.print("Số tiền phải trả: "+ soTien);
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TinhTienDien();
	}

}
