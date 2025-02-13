package BaiLab1;

import java.util.Scanner;

public class Lab1_Bai3_TheTich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào chiều dài cạnh: ");
		double canh = sc.nextDouble();
		double theTich = Math.pow(canh, 3);
		System.out.println("Thể tích của hình là: " + theTich);
	}

}
