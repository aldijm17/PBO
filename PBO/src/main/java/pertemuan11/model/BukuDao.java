package pertemuan11.model;

import java.util.ArrayList;
import java.util.List;

public class BukuDao {
    private List<Buku> data = new ArrayList<Buku>();

    public BukuDao() {
        data.add(new Buku("121212","Java","Penerbit : Agus Wicaksono","terbit :2000"));
        data.add(new Buku("232323","PHP","Penerbit : Agung Mulia","terbit :2001"));
        data.add(new Buku("343434","Dart","Penerbit : Wahyu Ilahi","terbit :2002"));
        data.add(new Buku("454545","JavaScript","Penerbit : Putra Karya","terbit:2003"));
    }
    
    public void insert(Buku m){
        data.add(m);
    }
    
    public void update(int index, Buku m){
        data.set(index, m);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Buku getBuku(int index){
        return data.get(index);
    }
    
    // TAMBAHKAN METHOD INI YANG SEBELUMNYA HILANG
    public List<Buku> getAllBuku() {
        return data;
    }
}