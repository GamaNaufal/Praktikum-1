import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainPerguruanTinggi {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        //Contoh Dosen Tetap
        Date tanggalLahirDosenTetap = formatter.parse("05/05/1990");
        Date tmtDosenTetap = formatter.parse("01/01/2015");
        DosenTetap dosenTetap = new DosenTetap("12345", "Prof. Didik Jumaidik", tanggalLahirDosenTetap, tmtDosenTetap, 10000000, "NIDN123", "Fakultas Teknik");
        dosenTetap.printInfo();

        //Contoh Dosen Tamu
        Date tanggalLahirDosenTamu = formatter.parse("10/10/1985");
        Date tmtDosenTamu = formatter.parse("01/01/2020");
        Date tanggalBerakhirKontrak = formatter.parse("31/12/2025");
        DosenTamu dosenTamu = new DosenTamu("67890", "Prof. Haris Jey", tanggalLahirDosenTamu, tmtDosenTamu, 8000000, "NIDK456", "Fakultas Sains dan Matematika", tanggalBerakhirKontrak);
        dosenTamu.printInfo();

        //Contoh Tendik
        Date tanggalLahirTendik = formatter.parse("15/03/1980");
        Date tmtTendik = formatter.parse("01/01/2010");
        Tendik tendik = new Tendik("54321", "Budi Tabuti", tanggalLahirTendik, tmtTendik, 5000000, "Akademik");
        tendik.printInfo();
    }
}