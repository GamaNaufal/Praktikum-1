/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KETIGA;

/**
 *
 * @author Pongo
 */
public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    public void bunyi() {
        System.out.println(nama + " suaranya Miawwww");
    }

    public void gerak() {
        System.out.println(nama + " melangkah.");
    }
}