/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package B2_BaiMauCURD.model;

/**
 *
 * @author hangnt
 */
public class DongVat {

    private String maDV;
    private String tenDV;
    private int canNang;
    private String diaChi;
    private boolean gioiTinh;

    public DongVat() {
    }

    public DongVat(String maDV, String tenDV, int canNang, boolean gioiTinh, String diaChi) {
        this.maDV = maDV;
        this.tenDV = tenDV;
        this.canNang = canNang;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public String getMaDV() {
        return maDV;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    public int getCanNang() {
        return canNang;
    }

    public void setCanNang(int canNang) {
        this.canNang = canNang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    // Chuyen hoa data => row table
    public Object[]toDataRow(){
        return new Object[]{maDV,tenDV,canNang,gioiTinh,diaChi};
    }
}
