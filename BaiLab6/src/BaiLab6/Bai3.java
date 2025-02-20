package BaiLab6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<SinhVien> dsSinhVien = new ArrayList<SinhVien>();
		
		System.out.println("Nhập vào 5 sinh viên: ");
		for (int i = 0; i < 2; i++)
		{
			System.out.printf("Nhập vào sinh viên thứ %d: \n",i);
			SinhVien sv = new SinhVien();
			sv.nhap(sc);
			dsSinhVien.add(sv);
		}
		
		System.out.println("Danh sách sinh viên: ");
		for (SinhVien sv : dsSinhVien)
		{
			sv.xuatThongTin();
		}
		sc.close();
	}

}

class SinhVien
{
	String hoTen, email, SDT, CMND;
	
	private boolean kiemTraSDT (String sdt)
	{
		String phoneReg  ="^(0[1-9])[0-9]{8}$";
		return Pattern.matches(phoneReg, sdt);
	}
	
	private boolean kiemTraEmail (String mail)
	{
		String mailReg= "^[a-zA-Z0-9._%+-]+@+[a-zA-Z0-9.-]+\\.+[a-zA-Z]{2,6}$";
		return Pattern.matches(mailReg, mail);
	}
	
	private boolean kiemTraCMND (String cm)
	{
		String cmndReg = "^[0-9]{9}|[0-9]{12}$";
		return Pattern.matches(cmndReg, cm);
	}
	
	public void nhap(Scanner sc)
	{
		System.out.print("Nhập vào họ tên: ");
		hoTen = sc.nextLine();
		
		while (true)
		{
			System.out.print("Nhập vào Email: ");
			email = sc.nextLine();
			if (kiemTraEmail(email)) break;
			System.out.print("Nhập lại Email: ");
		}
		
		while (true)
		{
			System.out.print("Nhập vào SDT: ");
			SDT = sc.nextLine();
			if (kiemTraSDT(SDT)) break;
			System.out.print("Nhập lại SDT: ");
		}

		while (true)
		{
			System.out.print("Nhập vào CMND: ");
			CMND = sc.nextLine();
			if (kiemTraCMND(CMND)) break;
			System.out.print("Nhập lại CMND: ");
		}
	}
	public void xuatThongTin() {
        System.out.println("Họ tên: " + hoTen + " | Email: " + email + " | SĐT: " + SDT + " | CMND: " + CMND);
    }

}