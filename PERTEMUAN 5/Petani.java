import java.text.ParseException;
import java.util.Date;

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;

    public Petani(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) throws ParseException {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    // Selector dan Mutator untuk asal_kota
    public String getAsal_kota() { return asal_kota; }
    public void setAsal_kota(String asal_kota) { this.asal_kota = asal_kota; }
    public static int getCounterPetani() { return counterPetani; }

    @Override
    public int hitungMasakerja() {
        Date now = new Date();
        long diffInMillies = Math.abs(now.getTime() - tgl_mulai_kerja.getTime());
        int tahun = (int) (diffInMillies / (1000L * 60 * 60 * 24 * 365));
        int C = 1; // Digit ke-12 dari NIM
        return tahun + C;
    }

    @Override
    public double hitungPajak() {
        return 0; // Petani tidak membayar pajak
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + asal_kota);
        System.out.println("Jenis: Petani");
    }
}