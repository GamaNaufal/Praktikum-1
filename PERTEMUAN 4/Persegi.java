public class Persegi extends BangunDatar {
    private double sisi;

    // Konstruktor default
    public Persegi() {
        super(4, "Hitam", "Solid"); // Default nilai untuk Persegi
    }

    // Konstruktor dengan parameter
    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border); // Memanggil konstruktor superclass
        this.sisi = sisi;
    }

    // Getter dan Setter
    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // Method untuk menghitung luas
    public double getLuas() {
        return sisi * sisi;
    }

    // Method untuk menghitung keliling
    public double getKeliling() {
        return 4 * sisi;
    }

    // Method untuk menghitung diagonal
    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    // Overriding method printInfo
    @Override
    public void printInfo() {
        super.printInfo(); // Memanggil method printInfo dari superclass
        System.out.println("Sisi: " + sisi);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
        System.out.println("Diagonal: " + getDiagonal());
    }
}