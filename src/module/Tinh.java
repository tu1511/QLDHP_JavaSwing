package module;

import java.util.ArrayList;
import java.util.Objects;

public class Tinh {
	private int maTinh;
	private String tenTinh;
	
	public Tinh(int maTinh, String tenTinh) {
		this.maTinh = maTinh;
		this.tenTinh = tenTinh;
	}

	public int getMaTinh() {
		return maTinh;
	}

	public void setMaTinh(int maTinh) {
		this.maTinh = maTinh;
	}

	public String getTenTinh() {
		return tenTinh;
	}

	public void setTenTinh(String tenTinh) {
		this.tenTinh = tenTinh;
	}

	@Override
	public String toString() {
		return "Tinh [maTinh=" + maTinh + ", tenTinh=" + tenTinh + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(maTinh, tenTinh);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tinh other = (Tinh) obj;
		return maTinh == other.maTinh && Objects.equals(tenTinh, other.tenTinh);
	}
	
	public static ArrayList<Tinh> getDSTinh() {
		String[] arr_Tinh = {"An Giang",
				"Bà Rịa – Vũng Tàu",
				"Bạc Liêu",
				"Bắc Giang",
				"Bắc Kạn",
				"Bắc Ninh",
				"Bến Tre",
				"Bình Dương",
				"Bình Định",
				"Bình Phước",
				"Bình Thuận",
				"Cà Mau",
				"Cao Bằng",
				"Cần Thơ",
				"Đà Nẵng",
				"Đắk Lắk",
				"Đắk Nông",
				"Điện Biên",
				"Đồng Nai",
				"Đồng Tháp",
				"Gia Lai",
				"Hà Giang",
				"Hà Nam",
				"Hà Nội",
				"Hà Tĩnh",
				"Hải Dương",
				"Hải Phòng",
				"Hậu Giang",
				"Hòa Bình",
				"Hưng Yên",
				"Kiên Giang",
				"Kon Tum",
				"Khánh Hòa",
				"Lai Châu",
				"Lạng Sơn",
				"Lào Cai",
				"Lâm Đồng",
				"Long An",
				"Nam Định",
				"Ninh Bình",
				"Ninh Thuận",
				"Nghệ An",
				"Phú Thọ",
				"Phú Yên",
				"Quảng Bình",
				"Quảng Nam",
				"Quảng Ninh",
				"Quảng Ngãi",
				"Quảng Trị",
				"Sóc Trăng",
				"Sơn La",
				"Tây Ninh",
				"Tiền Giang",
				"Tuyên Quang",
				"Thái Bình",
				"Thái Nguyên",
				"Thanh Hóa",
				"Thành phố Hồ Chí Minh",
				"Thừa Thiên Huế",
				"Trà Vinh",
				"Vĩnh Long",
				"Vĩnh Phúc",
				"Yên Bái"};
		ArrayList<Tinh> listTinh = new ArrayList<Tinh>();
		int i = 0;
		for (String tenTinh: arr_Tinh) {
			Tinh t = new Tinh(i, tenTinh);
			listTinh.add(t);
		}
		return listTinh;
	}

	public static Tinh getTinhById(int queQuan) {
		return Tinh.getDSTinh().get(queQuan);
	}

	public static Tinh getTinhByName(String tenTinh) {
		ArrayList<Tinh> listTinh = Tinh.getDSTinh();
		for (Tinh tinh : listTinh) {
			if (tinh.tenTinh.equals(tenTinh))
				return tinh;
		}
		return null;
	}
}
