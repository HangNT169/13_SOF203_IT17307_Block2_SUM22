/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package B2_BaiMauCURD.service;

import B2_BaiMauCURD.model.DongVat;
import java.util.List;

/**
 *
 * @author hangnt
 */
public interface DongVatService {

    List<DongVat> searchByName(List<DongVat> lists, String name);
    
    void sortByName(List<DongVat>lists);
    
}
