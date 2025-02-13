package BaiLab1;

import java.util.Scanner;

public class Lab1_Bai2_ChuviDT {

	public static String TimCanhNho(double c1, double c2) {
		return (c1 < c2) ? "Cạnh 1 nhỏ hơn" : "Cạnh 2 nhỏ hơn";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào chiều dài cạnh 1: ");
		double canh1 = sc.nextDouble();
		System.out.print("Nhập vào chiều dài cạnh 2: ");
		double canh2 = sc.nextDouble();
		double dienTich = canh1 * canh2;
		double chuVi = 2*(canh1 + canh2);
		System.out.printf("Chu vi: %.2f Diện tích: %.2f\n",chuVi,dienTich);
		System.out.println(TimCanhNho(canh1, canh2));

	}

}
