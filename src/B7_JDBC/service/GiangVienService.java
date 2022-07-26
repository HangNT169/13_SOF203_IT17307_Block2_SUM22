/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package B7_JDBC.service;

import B7_JDBC.model.GiangVien;
import java.util.List;

/**
 *
 * @author hangnt
 */
public interface GiangVienService {

    List<GiangVien> getAll();

    GiangVien getOne(String maGV);

    String add(GiangVien gv);

    String delete(String maGV);

    String update(GiangVien gv, String maGV);

}
