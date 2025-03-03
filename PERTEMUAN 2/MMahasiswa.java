public class MMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("24060123120015", "Gama Naufal", "Informatika");

        Dosen dosen1 = new Dosen("12345", "Didik", "Informatika");
        mhs1.setDosenWali(dosen1);

        Kendaraan kendaraan1 = new Kendaraan("H 45 U", "Motor");
        mhs1.setKendaraan(kendaraan1);

        System.out.println("\n=== INFORMASI MAHASISWA (Sebelum Tambah Mata Kuliah) ===");
        mhs1.printMhs();
        System.out.println("\nDosen Wali: " + mhs1.getDosenWali().getnama());
        System.out.println("Kendaraan: " + mhs1.getKendaraan().getJenis() + " - " + mhs1.getKendaraan().getNOPlat());

        MataKuliah matkul1 = new MataKuliah("IF101",  3);
        MataKuliah matkul2 = new MataKuliah("IF102", 4);
        MataKuliah matkul3 = new MataKuliah("IF103", 3);

        mhs1.addMatKul(matkul1);
        mhs1.addMatKul(matkul2);
        mhs1.addMatKul(matkul3);

        System.out.println("\n=== DATA MATA KULIAH ===");
        System.out.println("Jumlah Mata Kuliah: " + mhs1.getJumlahMatKul());
        System.out.println("Total SKS: " + mhs1.getJumlahSKS());

        System.out.println("\n=== INFORMASI DETAIL MAHASISWA ===");
        mhs1.printMhs();
    }
}
