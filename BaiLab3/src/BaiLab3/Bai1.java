package BaiLab3;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào 1 số >=0: ");
		int n = sc.nextInt();
		for (int i = 2; i * i <= n; i++)
		{
			if (n % i == 0) 
				System.out.printf("Số %d không phải là SNT", n);
		}
		System.out.printf("Số %d là SNT", n);
	}

}
