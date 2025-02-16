package BaiLab3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {

	public static int TimMin (int[] arr)
	{
		int min = arr[0];
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] < min)
				min = arr[i];
		}
		return min;
	}
	
	public static double TBCChiaHetCho3 (int[] arr)
	{
		double sum = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] % 3 == 0)
			{
				count++;
				sum += arr[i];
			}
		}
		return sum / count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập vào số lượng phần tử: ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++)
		{
			System.out.printf("arr[%d]: ", i);
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));
        System.out.println("Giá trị min trong mảng: " + TimMin(arr));
        System.out.println("Trung bình cộng các ptu chia hết cho 3: " + TBCChiaHetCho3(arr));
	}

}
