package stt16_24646681_CaoThanhHung_Gk1;

import java.io.Serializable;
import java.util.Objects;

public class KhachHang implements Serializable{
	private static final long serialVersionUID = 1L;
	private String maKH;
	private String tenKH;
	private int soThang;
	private String diaChi;
	private String doiTuong;
	public KhachHang(String maKH, String tenKH, int soThang, String diaChi, String doiTuong) {
		
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.soThang = soThang;
		this.diaChi = diaChi;
		this.doiTuong = doiTuong;
	}
	public KhachHang(String maKH) {
		this(maKH, "",0, "", "");
	}
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public int getSoThang() {
		return soThang;
	}
	public void setSoThang(int soThang) {
		this.soThang = soThang;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getDoiTuong() {
		return doiTuong;
	}
	public void setDoiTuong(String doiTuong) {
		this.doiTuong = doiTuong;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maKH);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KhachHang other = (KhachHang) obj;
		return Objects.equals(maKH, other.maKH);
	}
	@Override
	public String toString() {
		return "KhachHang [maKH=" + maKH + ", tenKH=" + tenKH + ", soThang=" + soThang + ", diaChi=" + diaChi
				+ ", doiTuong=" + doiTuong + "]";
	}
	
	
	
	
	
}
