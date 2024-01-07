package module;
import java.util.Date;
import java.util.Objects;
public class SinhVien {
    private int maSinhVien;
    private String tenSinhVien;
    private Tinh queQuan;
    private Date ngaySinh;
    private boolean gioiTinh;
    private float diemMon1, diemMon2, diemMon3;

    public SinhVien() {
        super();
    }

    public SinhVien(int maSinhVien, String tenSinhVien, Tinh queQuan, Date ngaySinh, boolean gioiTinh, float diemMon1, float diemMon2, float diemMon3) {
        super();
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diemMon1 = diemMon1;
        this.diemMon2 = diemMon2;
        this.diemMon3 = diemMon3;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public Tinh getQueQuan() {
        return queQuan;
    }
    public void setQueQuan(Tinh queQuan) {
        this.queQuan = queQuan;
    }
    public Date getNgaySinh() {
        return ngaySinh;
    }
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public boolean isGioiTinh() {
        return gioiTinh;
    }
    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public float getDiemMon1() {
        return diemMon1;
    }
    public void setDiemMon1(float diemMon1) {
        this.diemMon1 = diemMon1;
    }
    public float getDiemMon2() {
        return diemMon2;
    }
    public void setDiemMon2(float diemMon2) {
        this.diemMon2 = diemMon2;
    }
    public float getDiemMon3() {
        return diemMon3;
    }
    public void setDiemMon3(float diemMon3) {
        this.diemMon3 = diemMon3;
    }
    @Override
    public String toString() {
        return "ThiSinh [maThiSinh=" + maSinhVien + ", tenThiSinh=" + tenSinhVien + ", queQuan=" + queQuan + ", gioiTinh="
                + gioiTinh + ", diemMon1=" + diemMon1 + ", diemMon2=" + diemMon2 + ", diemMon3=" + diemMon3 + "]";
    }
    @Override
    public int hashCode() {
        return Objects.hash(diemMon1, diemMon2, diemMon3, gioiTinh, maSinhVien, queQuan, tenSinhVien);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SinhVien other = (SinhVien) obj;
        return Float.floatToIntBits(diemMon1) == Float.floatToIntBits(other.diemMon1)
                && Float.floatToIntBits(diemMon2) == Float.floatToIntBits(other.diemMon2)
                && Float.floatToIntBits(diemMon3) == Float.floatToIntBits(other.diemMon3) && gioiTinh == other.gioiTinh
                && maSinhVien == other.maSinhVien && Objects.equals(queQuan, other.queQuan)
                && Objects.equals(tenSinhVien, other.tenSinhVien);
    }
}
