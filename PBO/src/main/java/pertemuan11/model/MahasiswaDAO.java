package pertemuan11.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import pertemuan11.koneksi.Koneksi;

public class MahasiswaDAO {
    Connection conn = Koneksi.getConnection();

    public void simpan(Mahasiswa mhs) {

        try {

            String sql =
                "INSERT INTO mahasiswa VALUES(?,?,?)";

            PreparedStatement pst =
                conn.prepareStatement(sql);

            pst.setString(1, mhs.getNim());
            pst.setString(2, mhs.getNama());
            pst.setString(3, mhs.getJurusan());

            pst.executeUpdate();

            System.out.println("Data berhasil disimpan");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public ResultSet tampilData() {

        ResultSet rs = null;

        try {

            String sql = "SELECT * FROM mahasiswa";

            PreparedStatement pst =
                    conn.prepareStatement(sql);

            rs = pst.executeQuery();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return rs;
    }
}
