/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package B10_BaiMauCURD_QuanHe.service;

import B10_BaiMauCURD_QuanHe.model.Lop;
import java.util.List;

/**
 *
 * @author hangnt
 */
public interface LopService {

    List<Lop> getAll();

    Lop getOne(int id);

}
