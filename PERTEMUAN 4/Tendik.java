import java.util.Calendar;
import java.util.Date;

public class Tendik extends Pegawai {
    private static final int BUP = 55;
    private String bidang;
    public Tendik(String nip, String nama, Date tanggalLahir, Date tmt, double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }
    public double hitungTunjangan() {
        int masaKerja = hitungMasaKerja();
        return 0.01 * masaKerja * gajiPokok;
    }
    public Date hitungBUP() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(tanggalLahir);
        cal.add(Calendar.YEAR, BUP);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.add(Calendar.MONTH, 1);
        return cal.getTime();
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Bidang: " + bidang);
        System.out.println("Tunjangan: " + hitungTunjangan());
        System.out.println("BUP: " + formatTanggal(hitungBUP()));
    }
}