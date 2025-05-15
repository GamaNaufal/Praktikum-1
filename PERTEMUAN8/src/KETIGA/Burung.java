/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KETIGA;

/**
 *
 * @author Pongo
 */
public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    public void bunyi() {
        System.out.println(nama + " suaranya Cukurukuk");
    }

    public void gerak() {
        System.out.println(nama + " terbang.");
    }
}