package ViDu;

import java.util.ArrayList;

public class MainArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<SanPham> dsSanPham = new ArrayList<SanPham>();
		
//		SanPham sp1 = new SanPham(0, "Kem", "Giải khát", null);
		SanPham sp2 = new SanPham(1, "Cơm", "Đồ ăn", null);
		SanPham sp3 = new SanPham(2, "Phở", "Đồ ăn", null);

		dsSanPham.add(new SanPham(0, "Kem", "Giải khát", null));
		dsSanPham.add(sp2);
		dsSanPham.add(sp3);
		
//		for (SanPham x : dsSanPham)
//			System.out.println(x.toString());
		for (int i = 0; i < dsSanPham.size(); i++)
			System.out.println(dsSanPham.get(i).toString());
	}

}
