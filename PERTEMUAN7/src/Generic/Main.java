/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generic;

/**
 *
 * @author Pongo
 */
public class Main {
    public static void main(String[] args) {
        Datum<Kucing> datumKucing = new Datum<>();
        datumKucing.setIsi(new Kucing("Khidir Karawita"));

        Datum<Anjing> datumAnjing = new Datum<>();
        datumAnjing.setIsi(new Anjing("Heli"));

        Datum<Burung> datumBurung = new Datum<>();
        datumBurung.setIsi(new Burung("Manuk"));

        System.out.println("Simulasi Kucing:");
        MetodeGenerik.tampilkanPerilaku(datumKucing);

        System.out.println("\nSimulasi Anjing:");
        MetodeGenerik.tampilkanPerilaku(datumAnjing);

        System.out.println("\nSimulasi Burung:");
        MetodeGenerik.tampilkanPerilaku(datumBurung);

        //Ubah nama menggunakan metode mutator
        System.out.println("\nMengubah nama-nama hewan:");
        MetodeGenerik.ubahNamaHewan(datumKucing, "Pussy");
        MetodeGenerik.ubahNamaHewan(datumAnjing, "Elu");
        MetodeGenerik.ubahNamaHewan(datumBurung, "Emprit");

        //Tampilkan Semua
        System.out.println("\nSetelah nama diubah:");
        MetodeGenerik.tampilkanPerilaku(datumKucing);
        MetodeGenerik.tampilkanPerilaku(datumAnjing);
        MetodeGenerik.tampilkanPerilaku(datumBurung);
    }
}