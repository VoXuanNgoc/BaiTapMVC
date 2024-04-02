package btapTrenlop1;

import java.util.Scanner;

public class NhanVien {
	private int maNV;
	private String hoTen;
	private float luong;
	
	public NhanVien(int maNV, String hoTen, float luong) {
		this.maNV=maNV;
		this.hoTen=hoTen;
		this.luong=luong;
	}
	@Override
	public String toString() {
		return "NhanVien [maNV=" + maNV + ", hoTen=" + hoTen + ", luong=" + luong + "]";
	}
	public int getMaNV() {
		return maNV;
	}
	public void setMaNV(int maNV) {
		this.maNV = maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public float getLuong() {
		return luong;
	}
	public void setLuong(float luong) {
		this.luong = luong;
	}
	
//	public void Nhap(int A[],int n,int maNV, String hoTen, float luong) {
//		for(int i=0;i<=n;i++) {
//			
//		}
//	}
	public static void main(String[] args) {
		int n; int A[];
		Scanner sC = new Scanner(System.in);
		System.out.println("Nhập số lượng nhân viên: ");
		n = sC.nextInt();
		for
	}
}
