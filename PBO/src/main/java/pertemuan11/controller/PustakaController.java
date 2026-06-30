/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan11.controller;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pertemuan11.model.Anggota;
import pertemuan11.model.AnggotaDao;
import pertemuan11.model.Buku;
import pertemuan11.model.BukuDao;
import pertemuan11.model.Pustaka;
import pertemuan11.model.PustakaDao;
import pertemuan11.view.FormPustaka;

/**
 *
 * @author komputer depan
 */
public class PustakaController {
    FormPustaka view;
    Pustaka pustaka;
    AnggotaDao anggotaDao;
    BukuDao bukuDao;
    PustakaDao pustakaDao;
    int index;

    public PustakaController(FormPustaka view) {
        this.view = view;
        anggotaDao = new AnggotaDao();
        bukuDao = new BukuDao();
        pustakaDao = new PustakaDao();
    }
    
    public void clearView(){
        view.getTxtTglPinjam().setText("");
        view.getTxtKembali().setText("");
    }
    
    public void isiCbxAnggota(){
        List<Anggota> list = anggotaDao.getAllAnggota();
        view.getCbxAnggota().removeAllItems();
        for(Anggota anggota : list){
            view.getCbxAnggota().addItem(anggota.getKodeAnggota() 
                    + " - " + anggota.getNamaAnggota());
        }
    }
    
    public void isiCbxBuku(){
        List<Buku> list = bukuDao.getAllBuku();
        view.getCbxBuku().removeAllItems();
        for(Buku buku : list){
            view.getCbxBuku().addItem(buku.getKodeBuku()
                    + " - " + buku.getJudulBuku());
        }
    }
    
    public void insert(){
        pustaka = new Pustaka();
        Anggota anggota = anggotaDao.getAnggota(view.getCbxAnggota()
                .getSelectedIndex());
        Buku buku = bukuDao.getBuku(view.getCbxBuku()
                .getSelectedIndex());
        pustaka.setAnggota(anggota);
        pustaka.setBuku(buku);
        pustaka.setTglPinjam(Integer.parseInt(view
                .getTxtTglPinjam().getText()));
        pustaka.setTglKembali(Integer.parseInt(view
                .getTxtKembali().getText()));
        pustakaDao.insert(pustaka);
        JOptionPane.showMessageDialog(view, "Entri Data Ok");
    }
    
    public void update(){
        int index = view.getTblPustaka().getSelectedRow();
        pustaka = new Pustaka();
        Anggota anggota = anggotaDao.getAnggota(view.getCbxAnggota()
                .getSelectedIndex());
        Buku buku = bukuDao.getBuku(view.getCbxBuku()
                .getSelectedIndex());
        pustaka.setAnggota(anggota);
        pustaka.setBuku(buku);
        pustaka.setTglPinjam(Integer.parseInt(view
                .getTxtTglPinjam().getText()));
        pustaka.setTglKembali(Integer.parseInt(view
                .getTxtKembali().getText()));
        pustakaDao.update(index, pustaka);
        JOptionPane.showMessageDialog(view, "Update Data Ok");
    }
    
    public void delete(){
        int index = view.getTblPustaka().getSelectedRow();
        pustakaDao.delete(index);
        JOptionPane.showMessageDialog(view, "Delete Data Ok");
    }
    
    public void viewData(){
        DefaultTableModel model = (DefaultTableModel)view.getTblPustaka().getModel();
        model.setRowCount(0);
        List<Pustaka> list = pustakaDao.getAllPustaka();
        for(Pustaka pustaka : list){
            Object[] data = {
                pustaka.getAnggota().getNamaAnggota(),
                pustaka.getBuku().getJudulBuku(),
                pustaka.getTglPinjam(),
                pustaka.getTglKembali(),
                pustaka.getTerlambat(),
                pustaka.getDenda()
            };
            model.addRow(data);
        }
    }
    
    public void getPustaka(){
        int index = view.getTblPustaka().getSelectedRow();
        if(pustaka != null){
            view.getCbxAnggota().setSelectedItem(
                pustaka.getAnggota().getKodeAnggota()+" - "+pustaka.getAnggota().getNamaAnggota());
            view.getCbxBuku().setSelectedItem(
                pustaka.getBuku().getKodeBuku()+" - "+pustaka.getBuku().getJudulBuku());
            view.getTxtTglPinjam().setText("" + pustaka.getTglPinjam());
            view.getTxtKembali().setText("" + pustaka.getTglKembali());
        }
    }


    
}
