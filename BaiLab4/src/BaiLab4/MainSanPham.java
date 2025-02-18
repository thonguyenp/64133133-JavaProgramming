package BaiLab4;

public class MainSanPham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SanPham sp1 = new SanPham();	
		SanPham sp2 = new SanPham();	

		sp1.nhap();
		sp2.nhap();
		sp1.xuat();
		sp2.xuat();
		System.out.println(sp1.getThueNhapKhau());

	}

}
