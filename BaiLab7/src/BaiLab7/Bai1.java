package BaiLab7;

public class Bai1 {
	public static void main(String[] args) {
		HinhChuNhat hcn1 = new HinhChuNhat(8.0,5.0);
		HinhVuong hv1 = new HinhVuong(3);
		hcn1.xuat();
		hv1.xuat();
	}
}

class HinhChuNhat
{
	double dai, rong;
	
	public HinhChuNhat(double dai, double rong) {
		this.dai = dai;
		this.rong = rong;
	}

	public double getChuVi() {
		return (dai + rong) * 2;
	}

	public double getDienTich() {
		return rong * dai;
	}
	
	public void xuat ()
	{
		System.out.println("Chiều dài: "+ dai);
		System.out.println("Chiều rộng: "+ rong);
		System.out.println("Chu vi: "+ getChuVi());
		System.out.println("Diện tích: "+ getDienTich());
	}
}

class HinhVuong extends HinhChuNhat
{
	double canh;

	public HinhVuong( double canh) {
		super(canh,canh);
	}

	@Override
	public void xuat() {
		// TODO Auto-generated method stub
		System.out.println("Chiều dài cạnh: "+ dai);
		System.out.println("Chu vi: "+ getChuVi());
		System.out.println("Diện tích: "+ getDienTich());

	}

	
	
	
}