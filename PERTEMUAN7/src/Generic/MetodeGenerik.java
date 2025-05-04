/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generic;

/**
 *
 * @author Pongo
 */
public class MetodeGenerik {
    public static <T extends Anabul> void tampilkanPerilaku(Datum<T> datum) {
        T hewan = datum.getIsi();
        hewan.bersuara();
        hewan.bergerak();
    }

    public static <T extends Anabul> void ubahNamaHewan(Datum<T> datum, String namaBaru) {
        datum.getIsi().ubahNama(namaBaru);
    }
}