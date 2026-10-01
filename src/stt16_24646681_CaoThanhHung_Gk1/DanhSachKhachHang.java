package stt16_24646681_CaoThanhHung_Gk1;

import java.util.ArrayList;

public class DanhSachKhachHang {
	private ArrayList<KhachHang> list;
	
	public DanhSachKhachHang() {
		list = new ArrayList<KhachHang>();
	}
	
	public boolean them(KhachHang kh) {
		if(list.contains(kh)) {
			return false;
		}
		else {
			list.add(kh);
			return true;
			
		}
	}
	
	public boolean xoa(String maKH) {
		return list.remove(new KhachHang(maKH));
	}
	
	public KhachHang timKiem(String maKH) {
		int viTri = list.indexOf(new KhachHang(maKH));
		if(viTri ==-1) {
			return null;
		}
		return list.get(viTri);
	}
	
	public ArrayList<KhachHang> getList(){
		return list;
	}
	
}
