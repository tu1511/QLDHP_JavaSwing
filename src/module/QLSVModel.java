package module;

import java.util.ArrayList;

public class QLSVModel {
    private ArrayList<SinhVien> dsSinhVien;

    public QLSVModel() {
        this.dsSinhVien = new ArrayList<>();
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
}
