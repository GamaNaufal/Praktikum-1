import java.util.Calendar;
import java.util.Date;

public class DosenTetap extends Dosen {
    private static final int BUP = 65;

    public DosenTetap(String nip, String nama, Date tanggalLahir, Date tmt, double gajiPokok, String nidn, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, nidn, fakultas);
    }

    public double hitungTunjangan() {
        int masaKerja = hitungMasaKerja();
        return 0.02 * masaKerja * gajiPokok;
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
        System.out.println("Tunjangan: " + hitungTunjangan());
        System.out.println("BUP: " + formatTanggal(hitungBUP()));
    }
}