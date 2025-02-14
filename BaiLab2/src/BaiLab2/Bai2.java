package BaiLab2;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào hệ số a: ");
		double a = sc.nextDouble();
		System.out.print("Nhập vào hệ số b: ");
		double b = sc.nextDouble();
		System.out.print("Nhập vào hệ số c: ");
		double c = sc.nextDouble();
		
		if (a == 0)
		{
			if (b == 0)
			{
				if (c == 0)
					System.out.print("Phương trình có vô số nghiệm");
				else
					System.out.print("Phương trình vô nghiệm");
			}
			else
				System.out.print("Phương trình có 1 nghiệm duy nhất: " + -c/b);
		}
		else
		{
			double delta = (b*b) - (4*a*c);
			if (delta < 0)
				System.out.print("Phương trình vô nghiệm");
			else if (delta == 0)
				System.out.print("Phương trình có nghiệm kép: " + -b/(2*a));
			else 
				System.out.printf("Phương trình có 2 nghiệm phân biệt: %.2f %.2f", (-b + Math.sqrt(delta))/((2*a)),(-b - Math.sqrt(delta))/((2*a)) );
		}
	}

}
