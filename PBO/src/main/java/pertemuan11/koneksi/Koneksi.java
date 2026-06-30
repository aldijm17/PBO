package pertemuan11.koneksi;

import java.sql.Connection;
import java.sql.DriverManager;

public class Koneksi {
    public static Connection getConnection() {
        Connection conn = null;

        try {
            String url = "jdbc:mysql://localhost/dbkampus";
            String user = "root";
            String pass = "";

            conn = DriverManager.getConnection(url, user, pass);

        } catch (Exception e) {
            System.out.println("Koneksi gagal : " + e.getMessage());
        }

        return conn;
    }
}

