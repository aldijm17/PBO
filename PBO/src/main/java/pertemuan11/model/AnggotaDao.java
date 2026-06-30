package pertemuan11.model;

import java.util.ArrayList;
import java.util.List;

public class AnggotaDao {
    private List<Anggota> data = new ArrayList<>();

    public AnggotaDao() {
        // Mengisi data dummy Anggota
        data.add(new Anggota("A001", "Aldi Julse", "Padang", "Laki-laki"));
        data.add(new Anggota("A002", "Rian Hidayat", "Bukittinggi", "Laki-laki"));
        data.add(new Anggota("A003", "Siti Aminah", "Solok", "Perempuan"));
    }
    
    public void insert(Anggota m) { data.add(m); }
    public void update(int index, Anggota m) { data.set(index, m); }
    public void delete(int index) { data.remove(index); }
    public Anggota getAnggota(int index) { return data.get(index); }
    public List<Anggota> getAllAnggota() { return data; }
}