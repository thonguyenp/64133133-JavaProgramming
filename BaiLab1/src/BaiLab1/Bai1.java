package BaiLab1;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào họ tên: ");
		String hoTen = sc.nextLine();
		System.out.print("Điểm TB: ");
		double DTB = sc.nextDouble();
		System.out.printf("%s: %.2f điểm",hoTen, DTB);
	}

}
