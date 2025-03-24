import java.text.ParseException;
import java.util.Date;
public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;

    public PNS(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String nip) throws ParseException {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // Selector dan Mutator untuk nip
    public String getNip() { return nip; }
    public void setNip(String nip) { this.nip = nip; }
    public static int getCounterPNS() { return counterPNS; }

    @Override
    public int hitungMasakerja() {
        Date now = new Date();
        long diffInMillies = Math.abs(now.getTime() - tgl_mulai_kerja.getTime());
        int tahun = (int) (diffInMillies / (1000L * 60 * 60 * 24 * 365));
        int A = 4; // Digit ke-14 dari NIM
        return tahun + A;
    }

    @Override
    public double hitungPajak() {
        return 0.10 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
        System.out.println("Jenis: PNS");
    }
}