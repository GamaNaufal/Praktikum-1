/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KETIGA;

/**
 *
 * @author Pongo
 */
import java.util.Random;

public class MainAnabul {
    public static void main(String[] args) {
        Koleksi<Anabul> koleksiAnabul = new Koleksi<>();

        String[] namaHewan = {"Agus", "Budi", "Dendi", "Sumanto", "Silvi", "Sari", "Sinta", "Nesa", "Jarwo", "Siti"};
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int jenis = rand.nextInt(3);
            String nama = namaHewan[i];

            switch (jenis) {
                case 0 -> koleksiAnabul.add(new Kucing(nama));
                case 1 -> koleksiAnabul.add(new Anjing(nama));
                case 2 -> koleksiAnabul.add(new Burung(nama));
            }
        }

        koleksiAnabul.showAll();

        for (int i = 0; i < koleksiAnabul.getSize(); i++) {
            Anabul a = koleksiAnabul.getIsi(i);
            a.bunyi();
            a.gerak();
            System.out.println();
        }
    }
}