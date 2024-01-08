package module;

import java.util.ArrayList;

public class QLSVModel {
    private ArrayList<SinhVien> dsSinhVien;
    private String luaChon;
    

    public QLSVModel() {
        this.dsSinhVien = new ArrayList<>();
        this.luaChon = "";
    }

    public QLSVModel(ArrayList<SinhVien> dsSinhVien) {
        this.dsSinhVien = dsSinhVien;
    }

    public ArrayList<SinhVien> getDsSinhVien() {
        return dsSinhVien;
    }

    public void setDsSinhVienSinh(ArrayList<SinhVien> dsSinhVien) {
        this.dsSinhVien = dsSinhVien;
    }

    public void insert(SinhVien sinhVien) {
        this.dsSinhVien.add(sinhVien);
    }

    public void delete(SinhVien sinhVien) {
        this.dsSinhVien.remove(sinhVien);
    }

    public void update(SinhVien sinhVien) {
        this.dsSinhVien.remove(sinhVien);
        this.dsSinhVien.add(sinhVien);
    }

	public String getLuaChon() {
		return luaChon;
	}

	public void setLuaChon(String luaChon) {
		this.luaChon = luaChon;
	}

	public void setDsSinhVien(ArrayList<SinhVien> dsSinhVien) {
		this.dsSinhVien = dsSinhVien;
	}

	public boolean kiemTraTonTai(SinhVien sv) {
		for (SinhVien sinhVien : dsSinhVien) {
			if(sinhVien.getMaSinhVien() == sv.getMaSinhVien())
				return true;
		}
		return false;
	}
    
    
}
