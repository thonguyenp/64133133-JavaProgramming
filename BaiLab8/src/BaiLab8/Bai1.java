package BaiLab8;

public class Bai1 {
	public static void main(String[] args) {
		double res1 = sum(1.5,2.5,3);
		double res2 = sum(10,20,41,10);
		System.out.println("Tổng 1: " + res1);
		System.out.println("Tổng 2: " + res2);
	}
	
	public static double sum (double... x)
	{
		double s = 0;
		for (double num : x)
		{
			s += num;
		}
		return s;
	}
}
