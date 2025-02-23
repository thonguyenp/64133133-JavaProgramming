package BaiLab8;

import java.util.Scanner;

public class XPoly {
	public static double sum (double... x)
	{
		double s = 0;
		for (double num : x)
		{
			s += num;
		}
		return s;
	}
	
	public static double min (double... x)
	{
		double minimum = x[0];
		for (double num : x)
		{
			if(num < minimum)
				minimum = num;
		}
		return minimum;	
	}
	
	public static double max (double... x)
	{
		double max = x[0];
		for (double num : x)
		{
			if(num > max)
				max = num;
		}
		return max;
	}

	public static String toUpperFirstChar (String s)
	{
		String[] words = s.trim().split(" ");
		for (int i = 0; i < words.length; i++)
		{
			if (!words[i].isEmpty())
			{
				char firstChar = words[i].charAt(0);
				String upperFirst = String.valueOf(firstChar).toUpperCase();
                words[i] = upperFirst + words[i].substring(1);

			}
		}
		return String.join(" ", words);
	}
	
	public static void XuLySo ()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập vào số lượng phần tử");
		int n = sc.nextInt();
		double [] numbers = new double[n];
		
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.println("Nhập vào số thứ " + i + ": ");
			numbers[i] = sc.nextInt();
		}
		System.out.println("Kết quả tính toán");
		System.out.println("Tổng: " + sum(numbers));
		System.out.println("Nhỏ nhất: " + min(numbers));
		System.out.println("Lớn nhất: " + max(numbers));
		
	}
	
	public static void ChuyenDoiUpper()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào tên: ");
		String name = sc.nextLine();
		
		System.out.println("Tên sau khi upper: "+toUpperFirstChar(name));
	}
	
	public static void main(String[] args) {
		XuLySo();
		ChuyenDoiUpper();
	}
}
