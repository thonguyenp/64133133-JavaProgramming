package BaiLab1;

import java.util.Scanner;

public class Lab1_Bai4_Delta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào số a: ");
		double a = sc.nextDouble();
		System.out.print("Nhập vào số b: ");
		double b = sc.nextDouble();
		System.out.print("Nhập vào số c: ");
		double c = sc.nextDouble();
		double delta = (b * b) - (4 * a * c);
		System.out.println("Căn delta: " + Math.sqrt(delta));
	}

}
