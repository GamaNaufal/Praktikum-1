import java.text.ParseException;
import java.util.Date;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String npwp) throws ParseException {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // Selector dan Mutator untuk npwp
    public String getNpwp() { return npwp; }
    public void setNpwp(String npwp) { this.npwp = npwp; }
    public static int getCounterPengusaha() { return counterPengusaha; }

    @Override
    public int hitungMasakerja() {
        Date now = new Date();
        long diffInMillies = Math.abs(now.getTime() - tgl_mulai_kerja.getTime());
        int tahun = (int) (diffInMillies / (1000L * 60 * 60 * 24 * 365));
        int B = 3; // Digit ke-13 dari NIM
        return tahun + B;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
        System.out.println("Jenis: Pengusaha");
    }
}