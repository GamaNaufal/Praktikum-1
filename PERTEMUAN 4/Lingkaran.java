public class Lingkaran extends BangunDatar {
    private double jariJari;

    // Konstruktor default
    public Lingkaran() {
        super(0, "Hitam", "Solid"); // Lingkaran tidak memiliki sisi
    }

    // Konstruktor dengan parameter
    public Lingkaran(double jariJari, String warna, String border) {
        super(0, warna, border); // Lingkaran tidak memiliki sisi
        this.jariJari = jariJari;
    }

    // Getter dan Setter
    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    // Method untuk menghitung luas
    public double getLuas() {
        return Math.PI * jariJari * jariJari;
    }

    // Method untuk menghitung keliling
    public double getKeliling() {
        return 2 * Math.PI * jariJari;
    }

    // Overriding method printInfo
    @Override
    public void printInfo() {
        super.printInfo(); // Memanggil method printInfo dari superclass
        System.out.println("Jari-jari: " + jariJari);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}