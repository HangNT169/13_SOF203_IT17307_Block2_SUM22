/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_BaiMauCURD_QuanHe.repository;

import B10_BaiMauCURD_QuanHe.model.Lop;
import B10_BaiMauCURD_QuanHe.model.SinhVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class SinhVienRepository {
    
    public List<SinhVien> getAll() {
        String query = "SELECT sv.ma_sv ,l.ten_lop ,sv.ten ,sv.cmnd ,sv.email ,sv.dien_thoai ,sv.gioi_tinh \n"
                + "FROM sinh_vien sv INNER JOIN lop l \n"
                + "ON sv.ma_lop = l.ma_lop ;";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<SinhVien> lists = new ArrayList<>();
            while (rs.next()) {
                Lop lop = new Lop(rs.getString(2));
                SinhVien sinhVien = new SinhVien(rs.getInt(1), rs.getBoolean(7), lop, rs.getString(3), rs.getString(4), rs.getString(6), rs.getString(5));
                lists.add(sinhVien);
            }
            return lists;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public static void main(String[] args) {
        new SinhVienRepository().getAll().forEach(s -> System.out.println(s.toString()));
    }
}
