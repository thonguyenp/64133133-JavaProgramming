package BaiLab7;

public class Bai2va3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("abc");
	}

}

abstract class SinhVienPoly
{
	private String hoTen;
	private String nganh;
	public SinhVienPoly(String hoTen, String nganh) {
		super();
		this.hoTen = hoTen;
		this.nganh = nganh;
	}
	public abstract double getDiem();
	
	public String getHocLuc()
	{
		if (getDiem() >= 9) return "Xuất sắc";
		else if (getDiem() >=7.5) return "Giỏi";
		else if (getDiem() >=6.5) return "Khá";
		else if (getDiem() >=5) return "Trung bình";
		else return "Yếu";
	}
	
	public void xuat()
	{
		System.out.println("Họ tên:" + hoTen);
		System.out.println("Ngành: "+ nganh);
	}
	
}