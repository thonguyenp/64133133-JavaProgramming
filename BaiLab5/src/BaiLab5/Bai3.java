package BaiLab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bai3 {
	private static ArrayList<Product> productList = new ArrayList<Product>();
	private static Scanner sc = new Scanner(System.in);
	
	public static void nhap ()
	{
		System.out.print("Nhập vào số lượng sản phẩm");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++)
		{
			System.out.printf("Nhập tên sản phẩm thứ %d: ",i);
			String name = sc.nextLine();
			System.out.printf("Nhập giá sản phẩm thứ %d: ",i);
			double price = sc.nextDouble();
			sc.nextLine();
			productList.add(new Product(name, price));
		}
	}
	public static void sapXepTheoGia ()
	{
		Comparator<Product> comp = new Comparator<Product>() {
			
			@Override
			public int compare(Product o1, Product o2) {
				// TODO Auto-generated method stub
                return Double.compare(o2.price, o1.price);
			}
		};
		Collections.sort(productList,comp);	
		System.out.println("Danh sách sản phẩm giảm theo giá:");	
	}
	
	public static void xuat()
	{
		for (Product p : productList)
			System.out.println(p);
	}
	
	public static void xoa()
	{
		System.out.print("Nhập vào tên sản phẩm cần xóa: ");
		String delName = sc.nextLine();
//		Product p = new Product(delName, 0.0);
		
		for (int i = 0; i < productList.size(); i++)
		{
			Product pro = productList.get(i);
			if (pro.name.equals(delName))
			{
				productList.remove(i);	//remove() giờ đây xóa 1 obj
		        System.out.println("Đã xóa thành công");
		        break;
			}
			else
		        System.out.println("Không tìm thấy !");

		}
	}
	
	public static void averagePrice()
	{
		double s = 0;
		for (Product p : productList)
			s += p.price;
		System.out.println("Giá trung bình: "+s/productList.size());
		
	}
	
	public static void menu ()
	{
		int choice;
		do
		{
			System.out.println("\nMenu:");
            System.out.println("1. Nhập danh sách sản phẩm");
            System.out.println("2. Sắp xếp giảm dần theo giá");
            System.out.println("3. Tìm và xóa tên nhập từ bàn phím:");
            System.out.println("4. Xuất giá trung bình:");
            System.out.println("5. Thoát chương trình:");
    		choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {
            case 1:
                nhap();
                break;
            case 2:
                sapXepTheoGia();
                xuat();
                break;
            case 3:
                xoa();
                break;
            case 4:
            	averagePrice();
            	break;
            case 5:
                System.out.println("Chương trình kết thúc.");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");

            }

		}
		while (choice != 5);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
	}

}
	
class Product
{
	String name;
	double price;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
	
}
