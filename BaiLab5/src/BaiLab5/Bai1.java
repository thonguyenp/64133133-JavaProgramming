package BaiLab5;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> dsSoThuc = new ArrayList<Double>();
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		System.out.println("Nhập vào danh sách số thực: ");
		while (true)
		{
            System.out.print("Nhập số thực (hoặc 'N' để dừng): ");
            String input = sc.nextLine(); // Đọc toàn bộ dòng nhập vào

            
            if (input.equalsIgnoreCase("N")) { // Nếu nhập "N", thoát vòng lặp
                break;
            }
            double x = Double.parseDouble(input); // Chuyển chuỗi sang số thực
            dsSoThuc.add(x);
            sum += x;

		}

		for(double x : dsSoThuc)
		{
			System.out.println(x);
		}
		System.out.println("Tổng các phần tử là: " + sum);
	}

}
