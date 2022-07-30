/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_BaiMauCURD_QuanHe.service.impl;

import B10_BaiMauCURD_QuanHe.model.Lop;
import B10_BaiMauCURD_QuanHe.repository.LopRepository;
import B10_BaiMauCURD_QuanHe.service.LopService;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class LopServiceImpl implements LopService {

    private LopRepository lopRepository = new LopRepository();

    @Override
    public List<Lop> getAll() {
        return lopRepository.getAll();
    }

    @Override
    public Lop getOne(int id) {
        return lopRepository.getOne(id);
    }

}
