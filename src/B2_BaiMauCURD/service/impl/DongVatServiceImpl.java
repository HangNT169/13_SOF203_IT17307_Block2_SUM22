/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2_BaiMauCURD.service.impl;

import B2_BaiMauCURD.model.DongVat;
import B2_BaiMauCURD.service.DongVatService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class DongVatServiceImpl implements DongVatService {
    
    @Override
    public List<DongVat> searchByName(List<DongVat> lists, String name) {
        List<DongVat> listSearch = new ArrayList<>();
        // code
        for (DongVat dv : lists) {
            if (dv.getTenDV().contains(name)) {
                // add vao list
                listSearch.add(dv);
            }
        }
        return listSearch;
    }

    @Override
    public void sortByName(List<DongVat> lists) {
        lists.sort((o1, o2) -> {
            return o1.getTenDV().compareTo(o2.getTenDV()); 
        });
    }
    
}
