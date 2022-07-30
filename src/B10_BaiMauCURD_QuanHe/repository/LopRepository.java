/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_BaiMauCURD_QuanHe.repository;

import B10_BaiMauCURD_QuanHe.model.Lop;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author hangnt
 */
public class LopRepository {

    public List<Lop> getAll() {
        String query = "SELECT ma_lop, ten_lop\n"
                + "FROM Buoi9_LuyenTapTrenLop.dbo.lop;";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<Lop> lists = new ArrayList<>();
            while (rs.next()) {
                lists.add(new Lop(rs.getInt(1), rs.getString(2)));
            }
            return lists;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Lop getOne(int id) {
        String query = "SELECT ma_lop, ten_lop\n"
                + "FROM Buoi9_LuyenTapTrenLop.dbo.lop WHERE ma_lop = ?;";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();
            List<Lop> lists = new ArrayList<>();
            if (rs.next()) {
                return new Lop(rs.getInt(1), rs.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public static void main(String[] args) {
        new LopRepository().getAll().forEach(s -> System.out.println(s.toString()));
        System.out.println(new LopRepository().getOne(1).toString());
    }
}
