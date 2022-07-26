/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B7_JDBC.repository;

import B7_JDBC.model.GiangVien;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author hangnt
 */
public class GiangVienRepository {

    public List<GiangVien> getAll() {
        // B1: Viet query 
        String query = "SELECT * FROM giang_vien gv";

        // B2: Mo connection
        // Connection: La 1 inteface cung cap tat ca cac method dung de giao tiep vs DB
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            // Statement: La 1 inteface cho phep gui cac cau len SQL toi DB
            // B3: Tao Result Set: Hung ket qua tra ra cua query
            ResultSet rs = ps.executeQuery();
            // ResultSet: Dai dien de hung ket qua tra ra cua cau query
            // B4: Tao 1 list de convert tu result => list
            List<GiangVien> listGiangViens = new ArrayList<>();
            while (rs.next()) {
                GiangVien gv = new GiangVien(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getBoolean(6));
                listGiangViens.add(gv);
            }
            return listGiangViens;
        } catch (SQLException e) { // SQLExpection: Loi lien quan toi ket noi DB
            e.printStackTrace(System.out);
        }
        return null;
    }

    public GiangVien getOne(String maGV) {
        String query = "SELECT * FROM giang_vien gv  WHERE ma_gv = ?   ";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, maGV);
            // Statement: La 1 inteface cho phep gui cac cau len SQL toi DB
            // B3: Tao Result Set: Hung ket qua tra ra cua query
            ResultSet rs = ps.executeQuery();
            // ResultSet: Dai dien de hung ket qua tra ra cua cau query
            if (rs.next()) {
                GiangVien gv = new GiangVien(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getBoolean(6));
                return gv;
            }
        } catch (SQLException e) { // SQLExpection: Loi lien quan toi ket noi DB
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(GiangVien gv) {
        String query = "INSERT INTO B7_TrenLop.dbo.giang_vien\n"
                + "(ma_gv, ten_gv, tuoi, bac, loai, gioi_tinh)\n"
                + "VALUES(?,?,?,?,?,?)";
        int check = 0;
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, gv.getMaGV());
            ps.setObject(2, gv.getTenGV());
            ps.setObject(3, gv.getTuoi());
            ps.setObject(4, gv.getBac());
            ps.setObject(5, gv.getLoai());
            ps.setObject(6, gv.isGioiTinh());
            check = ps.executeUpdate();
        } catch (SQLException e) { // SQLExpection: Loi lien quan toi ket noi DB
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean delete(String maGV) {
        String query = "DELETE FROM giang_vien \n"
                + "WHERE ma_gv = ? ";
        int check = 0;
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, maGV);
            check = ps.executeUpdate();
        } catch (SQLException e) { // SQLExpection: Loi lien quan toi ket noi DB
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean update(GiangVien gv, String maGV) {
        String query = "UPDATE B7_TrenLop.dbo.giang_vien\n"
                + "SET ten_gv= ? , tuoi=?, bac=?, loai=?, gioi_tinh=?\n"
                + "WHERE ma_gv= ? ";
        int check = 0;
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, gv.getTenGV());
            ps.setObject(2, gv.getTuoi());
            ps.setObject(3, gv.getBac());
            ps.setObject(4, gv.getLoai());
            ps.setObject(5, gv.isGioiTinh());
            ps.setObject(6, maGV);
            check = ps.executeUpdate();
        } catch (SQLException e) { // SQLExpection: Loi lien quan toi ket noi DB
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public static void main(String[] args) {
        GiangVien gv = new GiangVien("ma1", "ten1", 10, "5", "full_time", true);
        boolean add = new GiangVienRepository().delete("ma1");
        System.out.println(add);
    }
}
