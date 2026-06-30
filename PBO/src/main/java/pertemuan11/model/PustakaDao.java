/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan11.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author komputer depan
 */
public class PustakaDao {
    List<Pustaka> data = new ArrayList<Pustaka>();

    public PustakaDao() {
        AnggotaDao anggotaDao = new AnggotaDao();
        BukuDao bukuDao = new BukuDao();
        Pustaka pustaka = new Pustaka();
        data.add(new Pustaka(anggotaDao.getAnggota(0), 
                bukuDao.getBuku(0), 20261210, 20261230));
        
    }
    
    public void insert(Pustaka m){
        data.add(m);
    }
    
    public void update(int index,Pustaka m){
        data.set(index,m);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public void delete (Pustaka pustaka){
        data.remove(pustaka);
    }
    
    public List<Pustaka> getAllPustaka(){
        return data;
    }
}
