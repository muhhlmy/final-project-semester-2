package Koneksi;

import java.sql.*;
import javax.swing.JOptionPane;

public class KonektorDB {

    Connection Konektor;

    // Metode untuk membuka koneksi ke database
    public static Connection BukaKoneksi() {

        try {
            // Memuat driver JDBC MySQL
            Class.forName("com.mysql.jdbc.Driver");

            // Membuat koneksi ke database
            Connection Konektor = DriverManager.getConnection("jdbc:mysql://localhost/projectuas", "root", "");
            return Konektor;
        } catch (Exception e) {
            // Menampilkan dialog pesan kesalahan jika koneksi gagal
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
