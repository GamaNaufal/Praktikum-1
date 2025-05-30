package jdbc.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlUtility {
    private static Connection koneksi;

    // Private constructor untuk mencegah instansiasi
    private MysqlUtility() {}

    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                final String url = "jdbc:mysql://localhost:3306/dbmahasiswa?useSSL=false&serverTimezone=UTC";
                final String user = "root";
                final String password = "";

                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("✅ Koneksi ke database berhasil.");
            } catch (SQLException e) {
                System.err.println("❌ Gagal koneksi ke database: " + e.getMessage());
            }
        }
        return koneksi;
    }

    public static void closeConnection() {
        try {
            if (koneksi != null && !koneksi.isClosed()) {
                koneksi.close();
                koneksi = null;
                System.out.println("✅ Koneksi database ditutup.");
            }
        } catch (SQLException e) {
            System.err.println("❌ Gagal menutup koneksi: " + e.getMessage());
        }
    }
}
