import java.util.Date;

public class Dosen extends Pegawai {
    protected String nidn;
    protected String fakultas;

    public Dosen(String nip, String nama, Date tanggalLahir, Date tmt, double gajiPokok, String nidn, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.nidn = nidn;
        this.fakultas = fakultas;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDN: " + nidn);
        System.out.println("Fakultas: " + fakultas);
    }
}