package BaiLab3;

import java.util.Scanner;

public class Bai4 {	
    public static String getGrade(double score) {
        if (score < 5) return "Yếu";
        else if (score < 6.5) return "Trung bình";
        else if (score < 7.5) return "Khá";
        else if (score < 9) return "Giỏi";
        else return "Xuất sắc";
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào số lượng sinh viên: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] names = new String[n];
		double[] dtb = new double[n];
		
		for (int i = 0; i < n; i++)
		{
			System.out.printf("Nhập vào họ tên thứ %d: ",i);
			names[i] = sc.nextLine();
			
			System.out.printf("Nhập vào dtb của sinh viên thứ %d: ",i);
			dtb[i] = sc.nextDouble();

			sc.nextLine();
			
		}
		
        System.out.println("Danh sách sinh viên:");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " - Điểm: " + dtb[i] + " - Học lực: " + getGrade(dtb[i]));
        }
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (dtb[i] > dtb[j]) {
                    // Hoán đổi điểm
                    double tempScore = dtb[i];
                    dtb[i] = dtb[j];
                    dtb[j] = tempScore;
                    
                    // Hoán đổi tên
                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }
        System.out.println("Danh sách sinh viên sau khi sắp xếp:");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " - Điểm: " + dtb[i] + " - Học lực: " + getGrade(dtb[i]));
        }

        sc.close();
	}

}
