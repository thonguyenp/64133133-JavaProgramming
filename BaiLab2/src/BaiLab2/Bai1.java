package BaiLab2;

import java.util.Scanner;

public class Bai1 {

	public static void GiaiPTBac1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào số a :");
		double a = sc.nextDouble();
		System.out.print("Nhập vào số b :");
		double b = sc.nextDouble();
		
		if (a == 0)
		{
			if (b == 0)
			{
				System.out.println("Phương trình vô số nghiệm");
			}
			else
				System.out.println("Phương trình vô nghiệm");
		}
		else
			System.out.println("Nghiệm pt: " + (-b)/a);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GiaiPTBac1();
	}

}
