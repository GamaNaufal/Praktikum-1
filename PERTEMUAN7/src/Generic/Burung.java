/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generic;

/**
 *
 * @author Pongo
 */
public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " Bersuara: Cukurukuk");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " Bergerak: Terbang");
    }
}