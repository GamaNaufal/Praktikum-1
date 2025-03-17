public class Main {
    public static void main(String[] args) {
        // Membuat objek Persegi
        Persegi persegi = new Persegi(5.0, "Merah", "Dotted");
        System.out.println("Informasi Persegi:");
        persegi.printInfo();
        System.out.println();

        // Membuat objek Lingkaran
        Lingkaran lingkaran = new Lingkaran(7.0, "Biru", "Solid");
        System.out.println("Informasi Lingkaran:");
        lingkaran.printInfo();
        System.out.println();

        // Menampilkan jumlah objek BangunDatar yang telah dibuat
        BangunDatar.printCounterBangunDatar();
    }
}