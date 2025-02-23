package BaiLab8;

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

	public static void main(String[] args) {
		double resSum = sum(10,20,40);
		double resMin = min(10,20,40);
		double resMax = max(10,20,40);
		
		System.out.println("Tổng: " + resSum);
		System.out.println("Nhỏ nhất: " + resMin);
		System.out.println("Lớn nhất: " + resMax);


	}
}
