/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B7_JDBC.model;

/**
 *
 * @author hangnt
 */
public class GiangVien {

    private String maGV;
    private String tenGV;
    private int tuoi;
    private String bac;
    private String loai;
    private boolean gioiTinh;

    public GiangVien() {
    }

    public GiangVien(String maGV, String tenGV, int tuoi, String bac, String loai, boolean gioiTinh) {
        this.maGV = maGV;
        this.tenGV = tenGV;
        this.tuoi = tuoi;
        this.bac = bac;
        this.loai = loai;
        this.gioiTinh = gioiTinh;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getBac() {
        return bac;
    }

    public void setBac(String bac) {
        this.bac = bac;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "GiangVien{" + "maGV=" + maGV + ", tenGV=" + tenGV + ", tuoi=" + tuoi + ", bac=" + bac + ", loai=" + loai + ", gioiTinh=" + gioiTinh + '}';
    }

}
