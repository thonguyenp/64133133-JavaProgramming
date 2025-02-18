package BaiLab5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Bai2 {
	//static: bien toan cuc
	private static ArrayList<String> nameList = new ArrayList<String>();
	private static Scanner sc = new Scanner(System.in);	//bien toan cuc
	
	private static void nhap()
	{
		System.out.print("Nhập số lượng họ tên: ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++)
		{
			System.out.printf("Nhập họ tên thứ %d: ",i);
			nameList.add(sc.nextLine());
		}
	}
	
	private static void xuat()
	{
		System.out.println("Danh sách họ tên: ");
		for (String name : nameList)
			System.out.println(name);
	}
	
	private static void ngaunhien ()
	{
		ArrayList<String> randomList = new ArrayList<>(nameList);	//sao chep cac phan tu tu nameList vào randomList
		Collections.shuffle(randomList, new Random());
		System.out.println("Danh sách ngẫu nhiên");
		for (String name : randomList)
			System.out.println(name);

	}
	
	private static void xoa()
	{
		System.out.print("Nhập vào họ tên cần xóa: ");
		String delName = sc.nextLine();
		if (nameList.remove(delName))
		{
			System.out.println("Đã xóa thành công");
		}
		else
		{
			System.out.println("Không tìm thấy tên nhập vào");
		}
	}
	
	private static void sapXep()
	{
		ArrayList<String> sorted = new ArrayList<String>(nameList);
		Collections.sort(sorted);
		System.out.println("Danh sách tăng dần theo bảng chữ cái: ");
		for (String name : sorted)
			System.out.println(name);
		Collections.reverse(sorted);
		System.out.println("Danh sách giảm dần theo bảng chữ cái: ");
		for (String name : sorted)
			System.out.println(name);


	}
	
	public static void menu ()
	{
		int choice;
		do 
		{
            System.out.println("\nMenu:");
            System.out.println("1. Nhập danh sách họ và tên");
            System.out.println("2. Xuất danh sách vừa nhập");
            System.out.println("3. Xuất danh sách ngẫu nhiên");
            System.out.println("4. Sắp xếp giảm dần và xuất danh sách");
            System.out.println("5. Tìm và xóa họ tên nhập từ bàn phím");
            System.out.println("6. Kết thúc");
            System.out.print("Chọn chức năng: ");
            choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {
            case 1:
                nhap();
                break;
            case 2:
                xuat();
                break;
            case 3:
                ngaunhien();
                break;
            case 4:
            	sapXep();
            	break;

            case 5:
            	xoa();
            	break;

            case 6:
                System.out.println("Chương trình kết thúc.");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
            }
		}
		while (choice != 6);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
	}

}

class NameManager {
	
}
