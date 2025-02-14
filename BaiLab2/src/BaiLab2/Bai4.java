package BaiLab2;
import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			System.out.print("\n-------------\n");
			System.out.print("1. Giải phương trình bậc nhất\n");
			System.out.print("2. Giải phương trình bậc 2\n");
			System.out.print("3. Tính tiền điện\n");
			System.out.print("4. Kết thúc\n");
			System.out.print("-------------\n");
			int chucNang;
            while (true) {
                System.out.print("Chọn chức năng: ");
                if (sc.hasNextInt()) {  
                    chucNang = sc.nextInt();
                    if (chucNang >= 1 && chucNang <= 4) {
                        break; // Nếu hợp lệ thì thoát vòng lặp nhập lại
                    }
                } else {
                    sc.next(); // Xóa ký tự nhập sai khỏi bộ nhớ đệm
                }
                System.out.println("Lỗi! Vui lòng nhập một số từ 1 đến 4.");
            }
			switch(chucNang)
			{
				case 1:
					Bai1.GiaiPTBac1();
					break;
				case 2:
					Bai2.GiaiPTBac2();
					break;
				case 3:
					Bai3.TinhTienDien();
					break;
				case 4:
					return;
				default:
					System.out.print("Chọn 1 trong 4 chức năng trên: ");
					break;
			}
		}
	}

}
