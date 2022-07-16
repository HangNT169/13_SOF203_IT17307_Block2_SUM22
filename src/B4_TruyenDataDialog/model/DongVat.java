/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B4_TruyenDataDialog.model;

import java.io.Serializable;

/**
 *
 * @author hangnt
 */
public class DongVat implements Serializable{

    private String maDV;
    private String tenDongVat;
    private int namSinh;
    private boolean gioiTinh;

    public DongVat() {
    }

    public DongVat(String maDV, String tenDongVat, int namSinh, boolean gioiTinh) {
        this.maDV = maDV;
        this.tenDongVat = tenDongVat;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public String getMaDV() {
        return maDV;
    }

    public String getTenDongVat() {
        return tenDongVat;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public void setTenDongVat(String tenDongVat) {
        this.tenDongVat = tenDongVat;
    }

    public Object[] toDataRow() {
        return new Object[]{maDV, tenDongVat, namSinh, gioiTinh == true ? "Duc" : "Cai"};
    }
}
