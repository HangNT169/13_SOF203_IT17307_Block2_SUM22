/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_BaiMauCURD_QuanHe.service.impl;

import B10_BaiMauCURD_QuanHe.model.SinhVien;
import B10_BaiMauCURD_QuanHe.repository.SinhVienRepository;
import B10_BaiMauCURD_QuanHe.service.SinhVienService;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class SinhVienServiceImpl implements SinhVienService {

    private SinhVienRepository sinhVienRepository = new SinhVienRepository();

    @Override
    public List<SinhVien> getAll() {
        return sinhVienRepository.getAll();
    }

}
