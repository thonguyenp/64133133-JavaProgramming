package BaiLab7;

public class Bai2va3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVienPoly sv1 = new SinhVienIT("Tho", "IT", 8, 9, 8);
		SinhVienPoly sv2 = new SinhVienBiz("Thi", "Markt", 8, 9);
		
		sv1.xuat();
		sv2.xuat();
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

class SinhVienIT extends SinhVienPoly
{
	double diemHTML, diemCSS, diemJava;

	public SinhVienIT(String hoTen, String nganh, double diemHTML, double diemCSS, double diemJava) {
		super(hoTen, nganh);
		this.diemHTML = diemHTML;
		this.diemCSS = diemCSS;
		this.diemJava = diemJava;
	}

	@Override
	public double getDiem() {
		// TODO Auto-generated method stub
		return (2 * diemJava + diemHTML + diemCSS)/4;
	}

	@Override
	public void xuat() {
		// TODO Auto-generated method stub
		super.xuat();
		System.out.println("Điểm HTML: " + diemHTML);
		System.out.println("Điểm CSS: " + diemCSS);
		System.out.println("Điểm Java: " + diemJava);
		System.out.println("DTB: "+ getDiem());

	}
}

class SinhVienBiz extends SinhVienPoly
{
	double diemSales, diemMarkt;

	public SinhVienBiz(String hoTen, String nganh, double diemSales, double diemMarkt) {
		super(hoTen, nganh);
		this.diemSales = diemSales;
		this.diemMarkt = diemMarkt;
	}

	@Override
	public double getDiem() {
		// TODO Auto-generated method stub
		return (2 * diemMarkt + diemSales) /3;
	}

	@Override
	public void xuat() {
		// TODO Auto-generated method stub
		super.xuat();
		System.out.println("Điểm sales: " +diemSales);
		System.out.println("Điểm markt: "+diemMarkt);
		System.out.println("DTB: "+ getDiem());
	}
	
	
}