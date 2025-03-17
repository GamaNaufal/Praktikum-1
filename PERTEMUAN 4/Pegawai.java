import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Pegawai {
    protected String nip;
    protected String nama;
    protected Date tanggalLahir;
    protected Date tmt;
    protected double gajiPokok;

    public Pegawai(String nip, String nama, Date tanggalLahir, Date tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public int hitungMasaKerja() {
        Calendar sekarang = Calendar.getInstance();
        Calendar tmtCalendar = Calendar.getInstance();
        tmtCalendar.setTime(tmt);

        int tahun = sekarang.get(Calendar.YEAR) - tmtCalendar.get(Calendar.YEAR);
        int bulan = sekarang.get(Calendar.MONTH) - tmtCalendar.get(Calendar.MONTH);

        if (bulan < 0) {
            tahun--;
            bulan += 12;
        }

        return tahun;
    }

    public String formatTanggal(Date tanggal) {
        SimpleDateFormat formatter = new SimpleDateFormat("d MMMM yyyy");
        return formatter.format(tanggal);
    }

    public void printInfo() {
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + formatTanggal(tanggalLahir));
        System.out.println("TMT: " + formatTanggal(tmt));
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}