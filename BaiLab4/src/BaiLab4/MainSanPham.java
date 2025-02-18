package BaiLab4;

public class MainSanPham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SanPham sp1 = new SanPham("San pham 1", 500, 20);	
		SanPham sp2 = new SanPham("San pham 2", 910.2, 10);	
		SanPham sp3 = new SanPham("San pham 3", 800);	

//		sp1.nhap();
//		sp2.nhap();
//		sp1.xuat();
//		sp2.xuat();
//		System.out.println(sp1.getThueNhapKhau());
		sp3.xuat();
	}

}
