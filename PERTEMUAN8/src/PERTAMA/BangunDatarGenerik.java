package PERTAMA;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pongo
 */
public class BangunDatarGenerik<T extends BangunDatar> {
    private T bangun;

    public BangunDatarGenerik(T bangun) {
        this.bangun = bangun;
    }

    public void tampilkanInfo() {
        System.out.println("Luas: " + bangun.hitungLuas());
        System.out.println("Keliling: " + bangun.hitungKeliling());
    }
}
