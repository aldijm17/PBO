package pertemuan11.controller;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pertemuan11.model.Mahasiswa;
import pertemuan11.model.MahasiswaDAO;
import pertemuan11.view.FrmMahasiswa;

public class MahasiswaController {
    private FrmMahasiswa form;
    private MahasiswaDAO dao;

    public MahasiswaController(FrmMahasiswa form) {
        this.form = form;
        dao = new MahasiswaDAO();
    }

    public void simpanData() {

        Mahasiswa mhs = new Mahasiswa();

        mhs.setNim(form.getTxtNim().getText());
        mhs.setNama(form.getTxtNama().getText());
        mhs.setJurusan(form.getTxtJurusan().getText());

        dao.simpan(mhs);
        JOptionPane.showMessageDialog(form, "Entri data ok");
        tampilData();
    }
    
    public void tampilData() {

        DefaultTableModel model =
                (DefaultTableModel) form.getTblMahasiswa().getModel();

        model.setRowCount(0);

        try {

            ResultSet rs = dao.tampilData();

            while (rs.next()) {

                Object[] data = {
                    rs.getString("nim"),
                    rs.getString("nama"),
                    rs.getString("jurusan")
                };

                model.addRow(data);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
