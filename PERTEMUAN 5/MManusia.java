import java.text.ParseException;

public class MManusia {
    public static void main(String[] args) throws ParseException {
        PNS p1 = new PNS("Sigit Rendang", "01-04-2006", "Jl. Jalan aja", 15000000, "198302032006041002");
        Pengusaha pe1 = new Pengusaha("Rendi Martabak", "01-01-2000", "Jl.In aja dulu", 55000000, "000-556-773-212-000-5");
        Petani pt1 = new Petani("Budi Roti Maryam", "09-01-1977", "Jl. Kenangan", 5000000, "wonogiri");
        PNS p2 = new PNS("Adit Lumpia Basah", "01-04-2010", "Desa Bunga", 10000000, "198004212010041002");
        
        p2.setAlamat("Jl. Menuju Roma");

        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());

        System.out.println("\nPajak:");
        System.out.println("Pajak PNS p1 = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());

        System.out.println("\nMasa Kerja:");
        System.out.println("Masa Kerja p1 = " + p1.hitungMasakerja() + " tahun");
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasakerja() + " tahun");
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasakerja() + " tahun");

        System.out.println("\nInformasi Detail:");
        System.out.println("\nInformasi P1:");
        p1.cetakInfo();
        System.out.println("\nInformasi Pe1:");
        pe1.cetakInfo();
        System.out.println("\nInformasi Pt1:");
        pt1.cetakInfo();
    }
}