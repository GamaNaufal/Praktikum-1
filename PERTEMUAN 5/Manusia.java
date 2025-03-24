import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Manusia {
    protected String nama;
    protected Date tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    public Manusia(String nama, String tgl_mulai_kerja, String alamat, double pendapatan) throws ParseException {
        this.nama = nama;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        this.tgl_mulai_kerja = sdf.parse(tgl_mulai_kerja);
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // Selector methods
    public String getNama() { return nama; }
    public Date getTgl_mulai_kerja() { return tgl_mulai_kerja; }
    public String getAlamat() { return alamat; }
    public double getPendapatan() { return pendapatan; }
    public static int getCounterMns() { return counterMns; }

    // Mutator methods
    public void setNama(String nama) { this.nama = nama; }
    public void setAlamat(String alamat) { this.alamat = alamat; }
    public void setPendapatan(double pendapatan) { this.pendapatan = pendapatan; }
    public void setTgl_mulai_kerja(String tgl_mulai_kerja) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        this.tgl_mulai_kerja = sdf.parse(tgl_mulai_kerja);
    }

    // Abstract method
    public abstract int hitungMasakerja();

    // Method untuk mencetak info
    public void cetakInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + sdf.format(tgl_mulai_kerja));
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }
}