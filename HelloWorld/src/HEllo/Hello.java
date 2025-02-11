package HEllo;

import java.util.Scanner;

public class Hello {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2;
		System.out.println("Chương trình thực hiện phép tính giữa 2 số thực:\n ");
		
		while (true) {
            System.out.print("Nhập số thứ nhất: ");
            if (sc.hasNextDouble()) {
                num1 = sc.nextDouble();
                break;
            } else {
                System.out.println("Lỗi: Vui lòng nhập một số hợp lệ.");
                sc.next(); // Xóa đầu vào không hợp lệ
            }
        }
		
		while (true) {
            System.out.print("Nhập số thứ hai: ");
            if (sc.hasNextDouble()) {
                num2 = sc.nextDouble();
                break;
            } else {
                System.out.println("Lỗi: Vui lòng nhập một số hợp lệ.");
                sc.next(); // Xóa đầu vào không hợp lệ
            }
        }

		System.out.print("Nhập vào toán tử: ");
		char op = sc.next().charAt(0);
		
		double res;
		
		switch (op)
		{
			case '+':
				res = num1 + num2;
				System.out.println("Kết quả: "+ res);
				break;
				
			case '-':
				res = num1 - num2;
				System.out.println("Kết quả: "+ res);
				break;
				
			case '*':
				res = num1 * num2;
				System.out.println("Kết quả: "+ res);
				break;
			case '/':
				if (num2 != 0)
				{
					res = num1 / num2;
					System.out.println("Kết quả: "+ res);
				}
				else
				{
					System.out.println("Lỗi không thể chia được cho 0");
				}
				break;
			default:
				System.out.println("Toán tử không hợp lệ");
				break;
		}
		sc.close();
	}

}
