package pertemuan11.controller;

import pertemuan11.model.Anggota;
import pertemuan11.model.AnggotaDao;
import pertemuan11.view.FormAnggota;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class AnggotaController {
    private FormAnggota view;
    private Anggota model;
    private AnggotaDao dao;
    private int index = -1;
    
    public AnggotaController(FormAnggota view){
        this.view = view;
        this.dao = new AnggotaDao();
    }
    
    public void clearView(){
        view.getTxtkodeAnggota().setText("");
        view.getTxtnamaAnggota().setText("");
        view.getTxtalamat().setText("");
        // PERBAIKAN: JComboBox menggunakan setSelectedIndex, bukan setText
        view.getTxtjenisKelamin().setSelectedIndex(0);                      
    } 
    
    public void insert(){
        model = new Anggota();
        model.setKodeAnggota(view.getTxtkodeAnggota().getText());
        model.setNamaAnggota(view.getTxtnamaAnggota().getText());
        model.setAlamat(view.getTxtalamat().getText());
        // PERBAIKAN: Mengambil nilai String dari JComboBox
        model.setJenisKelamin(view.getTxtjenisKelamin().getSelectedItem().toString());
        
        dao.insert(model);
        JOptionPane.showMessageDialog(view, "Entri Data Ok");
    }
    
    public void viewData(){
        // PERBAIKAN: Menggunakan getTblAnggota() sesuai dengan View yang baru
        DefaultTableModel tableModel = (DefaultTableModel) view.getTblAnggota().getModel();
        tableModel.setRowCount(0);
        
        // PERBAIKAN: Menggunakan List<Anggota> dan getAllAnggota()
        List<Anggota> list = dao.getAllAnggota();
        for(Anggota anggota : list){
            Object[] data = {
                anggota.getKodeAnggota(),
                anggota.getNamaAnggota(),
                anggota.getAlamat(),
                anggota.getJenisKelamin()
            };
            tableModel.addRow(data);
        }
    }
    
    public void actionClickTabel(){
        index = view.getTblAnggota().getSelectedRow();
        if (index == -1) return;
        
        // PERBAIKAN: Memetakan model Anggota ke komponen Form yang benar
        model = dao.getAnggota(index);
        view.getTxtkodeAnggota().setText(model.getKodeAnggota());
        view.getTxtnamaAnggota().setText(model.getNamaAnggota());
        view.getTxtalamat().setText(model.getAlamat());
        view.getTxtjenisKelamin().setSelectedItem(model.getJenisKelamin());
    }
    
    public void update(){
        if (index == -1) {
            JOptionPane.showMessageDialog(view, "Pilih data pada tabel terlebih dahulu!");
            return;
        }
        
        model = dao.getAnggota(index);
        model.setKodeAnggota(view.getTxtkodeAnggota().getText());
        model.setNamaAnggota(view.getTxtnamaAnggota().getText());
        model.setAlamat(view.getTxtalamat().getText());
        model.setJenisKelamin(view.getTxtjenisKelamin().getSelectedItem().toString());
        
        dao.update(index, model);
        JOptionPane.showMessageDialog(view, "Update Data Ok");
    }
    
    public void delete(){
        if (index == -1) {
            JOptionPane.showMessageDialog(view, "Pilih data pada tabel terlebih dahulu!");
            return;
        }
        
        dao.delete(index);
        index = -1; // Reset pilihan indeks
        JOptionPane.showMessageDialog(view, "Delete Data Ok");
    }
}