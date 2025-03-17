import java.util.Calendar;
import java.util.Date;

public class DosenTamu extends Dosen {
    private Date tanggalBerakhirKontrak;

    public DosenTamu(String nip, String nama, Date tanggalLahir, Date tmt, double gajiPokok, String nidk, String fakultas, Date tanggalBerakhirKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, nidk, fakultas);
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }

    public double hitungTunjangan() {
        return 0.025 * gajiPokok;
    }

    public int hitungSisaKontrak() {
        Calendar sekarang = Calendar.getInstance();
        Calendar akhirKontrak = Calendar.getInstance();
        akhirKontrak.setTime(tanggalBerakhirKontrak);

        int bulan = (akhirKontrak.get(Calendar.YEAR) - sekarang.get(Calendar.YEAR)) * 12;
        bulan += akhirKontrak.get(Calendar.MONTH) - sekarang.get(Calendar.MONTH);

        return bulan;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Tunjangan: " + hitungTunjangan());
        System.out.println("Sisa Kontrak: " + hitungSisaKontrak() + " bulan");
    }
}